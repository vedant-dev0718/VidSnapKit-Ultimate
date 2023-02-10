/*
 *    Copyright (c) 2023 Udhayarajan M
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.mugames.json;

/*
Public Domain.
*/

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Use this annotation on a getter method to override the Bean name
 * parser for Bean -&gt; JSONObject mapping. A value set to empty string <code>""</code>
 * will have the Bean parser fall back to the default field name processing.
 */
@Documented
@Retention(RUNTIME)
@Target({METHOD})
public @interface JSONPropertyName {
    /**
     * @return The name of the property as to be used in the JSON Object.
     */
    String value();
}
