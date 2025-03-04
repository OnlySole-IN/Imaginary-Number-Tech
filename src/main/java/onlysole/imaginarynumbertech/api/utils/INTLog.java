package onlysole.imaginarynumbertech.api.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class INTLog {
    public static Logger logger;

    public INTLog() {}

    public static void init(Logger modLogger) {
        logger = modLogger;
    }

    public static void log(Level logLevel, Object object) {
        logger.log(logLevel, String.valueOf(object));
    }

    public static void log(Level logLevel, String format, Object... objects) {
        logger.log(logLevel, String.format(format, objects));
    }

    public static void log(Level logLevel, Throwable throwable, Object object) {
        logger.log(logLevel, String.valueOf(object), throwable);
    }

    public static void log(Level logLevel, Throwable throwable, String format, Object... objects) {
        logger.log(logLevel, String.format(format, objects), throwable);
    }

    public static void big(Level level, String format, Object... data) {
        big(level, 8, format, data);
    }

    public static void big(Level level, int lines, String format, Object... data) {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        log(level, "****************************************");
        log(level, "* " + format, data);
        for (int i = 2; i < lines && i < trace.length; i++) {
            log(level, "*  at %s%s", trace[i].toString(), i == lines - 1 ? "..." : "");
        }
        log(level, "****************************************");
    }
}
