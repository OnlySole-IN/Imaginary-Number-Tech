package onlysole.imaginarytech.api.utils;

import org.apache.logging.log4j.Logger;

public class ITLog {
    public static Logger logger;

    public ITLog() {}

    public static void init(Logger modLogger) {
        logger = modLogger;
    }
}
