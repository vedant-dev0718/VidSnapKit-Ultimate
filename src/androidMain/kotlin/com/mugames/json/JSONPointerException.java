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

/**
 * The JSONPointerException is thrown by {@link JSONPointer} if an error occurs
 * during evaluating a pointer.
 * 
 * @author JSON.org
 * @version 2016-05-13
 */
public class JSONPointerException extends RuntimeException {
    private static final long serialVersionUID = 8872944667561856751L;

    public JSONPointerException(String message) {
        super(message);
    }

    public JSONPointerException(String message, Throwable cause) {
        super(message, cause);
    }

}