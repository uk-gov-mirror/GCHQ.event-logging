/*
 * Copyright 2018 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package event.logging.impl;

public  class TestLogReceiver implements LogReceiver {
    private static String message = "";

    @Override
    public void log(final String message) {
        this.message = message;
    }

    public static String getCurrentMessage() {
        final String currentMessage = message;
        message = "";
        return currentMessage;
    }
}