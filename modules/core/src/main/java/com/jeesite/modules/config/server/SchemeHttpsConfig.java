/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 * No deletion without permission, or be held responsible to law.
 */
package com.jeesite.modules.config.server;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * 将请求协议转换为 https
 * @author ThinkGem
 * @version 2020年1月21日
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(name="server.schemeHttps", havingValue="true", matchIfMissing=false)
public class SchemeHttpsConfig {

	@Bean
	public FilterRegistrationBean<Filter> schemeHttpsFilter() {
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
		bean.setName("schemeHttpsFilter");
		bean.setFilter((request, response, chain) -> {
			chain.doFilter(new HttpServletRequestWrapper((HttpServletRequest) request) {
				@Override
				public String getScheme() {
					return "https";
				}

				@Override
				public StringBuffer getRequestURL() {
					StringBuffer sb = super.getRequestURL();
					if ("http:".equals(sb.substring(0, 5))){
						return sb.replace(0, 5, "https:");
					}else{
						return sb;
					}
				}
			}, response);
		});
		bean.addUrlPatterns("/*");
		return bean;
	}

}
