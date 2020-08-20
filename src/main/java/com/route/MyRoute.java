package com.route;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() {
        // The route is defined here - keep reading to find out more
        CamelContext context = new DefaultCamelContext();

        from("timer://simpleTimer?period=1000")
                .setBody(simple("Hello from timer at ${header.firedTime}"))
                .to("stream:out");
//        from("timer:hello?period=").routeId("hello")
////                .transform().method("myBean", "saySomething")
//                .filter(simple("${body} contains 'foo'"))
//                .to("log:foo")
//                .end()
//                .to("stream:out");
    }

}
