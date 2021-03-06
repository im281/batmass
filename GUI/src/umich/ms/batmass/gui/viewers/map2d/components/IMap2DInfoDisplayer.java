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
package umich.ms.batmass.gui.viewers.map2d.components;

/**
 *
 * @author Dmitry Avtonomov
 */
public interface IMap2DInfoDisplayer {
    
    public void setMzRange(Double mzStart, Double mzEnd);
    
    public void setRtRange(Double rtStart, Double rtEnd);
    
    public void setMouseCoords(Double mz, Double rt);
    
    public void setIntensityRange(Double minIntensity, Double maxIntensity);
    
    /**
     * Updates the visual state, should be called after the info is updated.
     */
    public void refresh();
}
