package com.logging.spring_boot_logging_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

Logger logger = LoggerFactory.getLogger(LoggingController.class);

@RequestMapping("/hello")
public String sayHello() {


logger.debug("hello debug level");

return "hello";
}}
