/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.kogito.codegen;

public class AddonsConfig {

    public static final AddonsConfig DEFAULT = new AddonsConfig()
            .withPersistence(false)
            .withTracing(false)
            .withMonitoring(false);

    private boolean usePersistence;
    private boolean useTracing;
    private boolean useMonitoring;

    public AddonsConfig withPersistence(boolean usePersistence) {
        this.usePersistence = usePersistence;
        return this;
    }

    public AddonsConfig withTracing(boolean useTracing) {
        this.useTracing = useTracing;
        return this;
    }

    public AddonsConfig withMonitoring(boolean useMonitoring) {
        this.useMonitoring = useMonitoring;
        return this;
    }

    public boolean usePersistence() {
        return usePersistence;
    }

    public boolean useTracing() {
        return useTracing;
    }

    public boolean useMonitoring() {
        return useMonitoring;
    }
}
