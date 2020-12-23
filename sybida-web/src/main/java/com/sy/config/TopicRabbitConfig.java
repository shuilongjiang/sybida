package com.sy.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {



    //绑定键
    public final static String MAN = "topic.man";

    @Bean
    public Queue firstQueue() {
        return new Queue("man");
    }

    @Bean
    public Queue secondQueue() {
        return new Queue("people");
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }


    //将firstQueue和topicExchange绑定,而且绑定的键值为topic.man
    //这样只要是消息携带的路由键是topic.man,才会分发到该队列
    @Bean
    Binding bindingExchangeRouteKeyOne() {
        return BindingBuilder.bind(firstQueue()).to(exchange()).with(MAN);
    }

    //将secondQueue和topicExchange绑定,而且绑定的键值为用上通配路由键规则topic.#
    // 这样只要是消息携带的路由键是以topic.开头,都会分发到该队列
    @Bean
    Binding bindingExchangeRouteKeyTwo() {
        return BindingBuilder.bind(secondQueue()).to(exchange()).with("topic.#");
    }

}
