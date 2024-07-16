package cn.yjq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @description 简单日志门面：同时引入 slf4j-simple 简单日志，仅打印在控制台，不会持久化到日志文件
 * SLF4J 是一个为Java提供简单日志的门面。它并不是一个具体的日志实现，而是提供了一个通用的API，允许开发者选择底层的日志框架。
 * @author yijq
 * @create 2024-07-16 09:36
 */
public class SLF4JExample {
    private static final Logger logger = LoggerFactory.getLogger(SLF4JExample.class);

    public static void main(String[] args) {
        logger.info("Hello, SLF4J!");
        logger.warn("Hello, SLF4J!");
        logger.error("Hello, SLF4J!");
    }
}
