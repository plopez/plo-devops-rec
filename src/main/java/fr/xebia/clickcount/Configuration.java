package fr.xebia.clickcount;

import javax.inject.Singleton;

@Singleton
public class Configuration {

    public final String redisHost;
    public final int redisPort;
    public final int redisConnectionTimeout;  //milliseconds

    public Configuration() {
        redisHost = System.getenv().get("redisHost");
        redisPort = System.getenv().get("redisPort");
        redisConnectionTimeout = System.getenv().get("redisConnectionTimeout");
    }
}
