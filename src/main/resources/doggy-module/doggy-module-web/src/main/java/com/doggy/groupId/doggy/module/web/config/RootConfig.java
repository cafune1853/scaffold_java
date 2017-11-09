package com.doggy.groupId.doggy.module.web.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.doggy.groupId.doggy.module.web.annotation.MvcLoad;

/**
 * @author doggy
 * Created on 2017-08-08.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.doggy.groupId.doggy.module.web"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {
	MvcLoad.class,
	Controller.class,
	RestController.class,
	Configuration.class
})})
public class RootConfig {
}
