/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.security.oauth2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.annotation.Configuration;

/**
 * @author Spencer Gibb
 * @since 2.2.2
 * @deprecated All modules and starters are deprecated as of 2.2.2, in the next major
 * release, functionality will moved to specific projects (feign or gateway).
 */
@Configuration(proxyBeanMethods = false)
@Deprecated
public class SpringCloudSecurityAutoConfiguration {

	private static final Log LOG = LogFactory.getLog(SpringCloudSecurityAutoConfiguration.class);

	public SpringCloudSecurityAutoConfiguration() {
		LOG.warn("All Spring Cloud Security modules and starters are deprecated. "
				+ "They will be moved to individual projects in the next major release.");
	}

}
