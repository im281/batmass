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
package umich.ms.batmass.projects.core.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for registering stuff in the layer.xml file. Annotated class must
 * have a no-arguments constructor.
 * @author Dmitry Avtonomov
 * @deprecated use simple {@link LayerRegistration} annotation instead.
 */
@Deprecated
public interface LayerInstance {
    /**
     * Registers a .instance file in the layer.xml. This means you'll need to 
     * have a no-arguments constructor on the target class.
     */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target(ElementType.TYPE)
    @interface Registration {
        String[] paths();
        int position() default Integer.MAX_VALUE;
    }
}