package onlysole.imaginarynumbertech.api.utils;

import org.apache.logging.log4j.Logger;

public class INTLog {
    public static Logger logger;

    public INTLog() {}

    public static void init(Logger modLogger) {
        logger = modLogger;
    }
}
