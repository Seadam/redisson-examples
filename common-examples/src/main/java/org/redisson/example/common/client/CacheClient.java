package org.redisson.example.common.client;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;

public class CacheClient {


    public static RedissonClient useRedisson() {
        Config config = new Config();
        config.setCodec(JsonJacksonCodec.INSTANCE).useClusterServers()
                .setTimeout(5000)
                .setClientName("redisson-client")
                .addNodeAddress("redis://42.194.131.84:16379")
                .addNodeAddress("redis://42.194.131.84:16380")
                .addNodeAddress("redis://42.194.131.84:16381")
                .addNodeAddress("redis://42.194.131.84:16382")
                .addNodeAddress("redis://42.194.131.84:16383")
                .addNodeAddress("redis://42.194.131.84:16384");
        return Redisson.create(config);

    }
}
