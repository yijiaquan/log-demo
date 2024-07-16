package cn.yjq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @description Logback - Log4j的继任者:
 * Logback 是由 Log4j 的创始人开发的日志框架，旨在成为 Log4j 的继任者。它具有与 Log4j 相似的功能，并被认为是更现代和性能更好的选择。
 * @author yijq
 * @create 2024-07-16 09:50
 */
public class LogbackExample {
    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.info("Hello, Logback!");
    }
}
