/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.batmass.filesupport.core.spi.nodes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import umich.ms.batmass.filesupport.core.api.NodeInfoUtils;
import umich.ms.batmass.projects.core.type.BMProject;
import umich.ms.batmass.projects.core.util.BMProjectUtils;

/**
 * Defines the default paths from which actions are retrieved for Nodes.
 * The logic is as follows:
 *  - all nodes get actions for "any-project"/"any-type"/"any-category"
 *
 *  - all nodes get actions for "any-project"/"any-type"/"their-category"
 *  - all nodes get actions for "any-project"/"their-type"/"any-category"
 *  - all nodes get actions for "any-project"/"their-type"/"their-category"
 * 
 *  - all nodes get actions for "their-project"/"any-type"/"any-category"
 * 
 *  - all nodes get actions for "their-project"/"their-type"/"any-category"
 *  - all nodes get actions for "their-project"/"any-type"/"their-category"
 *  - all nodes get actions for "their-project"/"their-type"/"their-category"
 *
 * @author Dmitry Avtonomov
 */
public abstract class AbstractFileNodeInfo implements FileNodeInfo {

    @Override
    public int getActionPathsPriority() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getIconPriority() {
        return Integer.MAX_VALUE;
    }

    @Override
    public List<String> getActionPaths(Project p) {
        ArrayList<String> list;
        if (p == null) {
            list = new ArrayList<>(4);
        } else {
            list = new ArrayList<>(8);
        }

        String fileCategory = getFileTypeResolver().getCategory();
        String fileType = getFileTypeResolver().getType();

        // project specific actions
        if (p != null) {
            BMProject bmp = BMProjectUtils.toBMProject(p);
            String projectType = BMProjectUtils.getProjectType(bmp.getClass());
            list.add(NodeInfoUtils.getNodeActionsPath(projectType, null, null));
            list.add(NodeInfoUtils.getNodeActionsPath(projectType, null, fileType));
            list.add(NodeInfoUtils.getNodeActionsPath(projectType, fileCategory, null));
            list.add(NodeInfoUtils.getNodeActionsPath(projectType, fileCategory, fileType));
        }

        // type specific actions
        list.add(NodeInfoUtils.getNodeActionsPath(null, null, null));
        list.add(NodeInfoUtils.getNodeActionsPath(null, null, fileType));
        list.add(NodeInfoUtils.getNodeActionsPath(null, fileCategory, null));
        list.add(NodeInfoUtils.getNodeActionsPath(null, fileCategory, fileType));

        return list;
    }

    @Override
    public List<String> getCapabilityProviderPaths(Project p) {
        ArrayList<String> list;
        if (p == null) {
            list = new ArrayList<>(4);
        } else {
            list = new ArrayList<>(8);
        }

        String fileCategory = getFileTypeResolver().getCategory();
        String fileType = getFileTypeResolver().getType();

        // project specific capabilities
        if (p != null) {
            BMProject bmp = BMProjectUtils.toBMProject(p);
            String projectType = BMProjectUtils.getProjectType(bmp.getClass());
            list.add(NodeInfoUtils.getNodeCapabilitiesPath(projectType, null, null));
            list.add(NodeInfoUtils.getNodeCapabilitiesPath(projectType, null, fileType));
            list.add(NodeInfoUtils.getNodeCapabilitiesPath(projectType, fileCategory, null));
            list.add(NodeInfoUtils.getNodeCapabilitiesPath(projectType, fileCategory, fileType));
        }

        // type specific capabilities
        list.add(NodeInfoUtils.getNodeCapabilitiesPath(null, null, null));
        list.add(NodeInfoUtils.getNodeCapabilitiesPath(null, null, fileType));
        list.add(NodeInfoUtils.getNodeCapabilitiesPath(null, fileCategory, null));
        list.add(NodeInfoUtils.getNodeCapabilitiesPath(null, fileCategory, fileType));

        return list;
    }

    @Override
    public ImageIcon getIcon() {
        return getFileTypeResolver().getIcon();
    }


}
