/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.fielddata;

import com.google.common.collect.ImmutableMap;
import org.elasticsearch.common.Nullable;

/**
 */
public class FieldDataType {

    private final String type;
    @Nullable
    private final String format;
    private final ImmutableMap<String, String> options;

    public FieldDataType(String type) {
        this(type, null, ImmutableMap.<String, String>of());
    }

    public FieldDataType(String type, String format) {
        this(type, format, ImmutableMap.<String, String>of());
    }

    public FieldDataType(String type, @Nullable String format, ImmutableMap<String, String> options) {
        this.type = type;
        this.format = format;
        this.options = options;
    }

    public String getType() {
        return this.type;
    }

    @Nullable
    public String getFormat() {
        return this.format;
    }

    public ImmutableMap<String, String> getOptions() {
        return this.options;
    }
}
