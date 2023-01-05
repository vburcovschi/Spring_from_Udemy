package org.burcovschi.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.burcovschi.spring.aop.*")
@EnableAspectJAutoProxy
public class MyConfig {
}
