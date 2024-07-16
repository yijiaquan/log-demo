package cn.yjq;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @description Log4j2 - Log4j的升级版：
 * Log4j2 是 Log4j 的升级版，解决了 Log4j 1.x 存在的性能和线程安全问题。它引入了新的特性，如异步日志、插件体系结构等。
 * @author yijq
 * @create 2024-07-16 09:48
 */
public class Log4j2Example {
    private static final Logger logger = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        logger.info("Hello, Log4j2!");
        logger.warn("Hello, Log4j2!");
        logger.debug("Hello, Log4j2!");
    }
}
