package cn.yjq;


import org.apache.log4j.Logger;
/**
 * @description Log4j示例，强大而古老的日志框架，搭配 log4j.properties 配置文件
 * Log4j 是Java社区中最早的日志框架之一，提供了丰富的功能，包括异步日志、插件支持等。
 * @author yijq
 * @create 2024-07-16 09:35
 */
public class Log4jExample {
    private static final Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("Hello, Log4j!");
        logger.error("Hello, Log4j!");
        logger.warn("Hello, Log4j!");
    }
}
