/*
 * Copyright 2017 the original author or authors.
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

package com.gopivotal.manager.redis;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Set;

/**
 * Created by marcelo on 23/02/17.
 */
public interface JedisTemplate {

    Set<String> getSessions(String sessionsKey);

    void del(String sessionsKey, String key);

    Integer count(String sessionsKey);

    byte[] get(String key) throws UnsupportedEncodingException;

    void set(String key, String sessionsKey, byte[] session, int timeout) throws UnsupportedEncodingException;

    void clean(String sessionsKey);

    void close() throws IOException;
}
