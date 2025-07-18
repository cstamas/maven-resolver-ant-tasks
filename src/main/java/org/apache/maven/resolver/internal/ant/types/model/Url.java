/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.resolver.internal.ant.types.model;

import org.apache.tools.ant.types.DataType;

/**
 * Represents a url element in the project model. The url element is used in license and repository elements.
 */
public class Url extends DataType {
    private String url;

    public Url() {}

    /**
     * Adds a url string to the url element.
     *
     * @param url the URL to add, must not be null
     */
    public void addText(String url) {
        this.url = getProject().replaceProperties(url);
    }

    /**
     * Gets the URL string from the url element.
     *
     * @return the URL as a String, never null
     */
    public String getText() {
        return url;
    }
}
