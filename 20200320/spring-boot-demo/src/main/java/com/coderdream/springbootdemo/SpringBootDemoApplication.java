package com.coderdream.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
@RequestMapping("admin/")
public class SpringBootDemoApplication {

    /**
     * [IDEA创建Spring Boot项目](https://www.cnblogs.com/tufujie/p/8950169.html)
     * 用户首页，用于登录之后给用户看一些信息
     * 信息可以从数据库中取，这边作为demo，暂时写死
     * @return
     */
    @RequestMapping("home")
    String home(HttpServletRequest request) {
        String userName = "Jef";
        int count = 100;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }
//    注解说明：
//
//    @RestController：这是一个构造型（stereotype） 注解，顾名思义，该注解是@Controller和@ResponseBody的结合体，
//    两个标注合并起来的作用。@RestController注解告诉Spring直接渲染结果字符串返回给调用者。
//    对于Spring来讲，这个类扮演了一个特殊的角色，在本案中，我们的类是一个Web @Controller，所以当处理进来的web请求时，
//    Spring会询问它。
//
//    @RequestMapping：此注解提供的是路由信息。它告诉Spring任何来自“/”路径的请求都会被映射到home方法。
//
//    @EnableAutoConfiguration：这个注解告诉Spring Boot去“猜测（guess）”需要如何配置Spring，
//    主要基于pom.xml中所添加的jar依赖。由于 spring-boot-starter-web 添加了Tomcat和Spring MVC，
//    所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
