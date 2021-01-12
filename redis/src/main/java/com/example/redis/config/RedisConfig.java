package com.example.redis.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * Create by zhangz on 2021/1/11
 */
@Configuration
public class RedisConfig {
    /**
     * 如果用默认的 RedisTemplate ，那么在序列化存到redis中就会发现，key 就变成了。比如，存之前key为"test" ，
     * 进入redis看，key就变成了"\xac\xed\x00\x05t\x00\x04test" 。
     * 这与RedisTemplate默认提供的序列化协议有关。为了使其更符合我们的需求，我们需要订制序列化协议。
     * @param redisConnectionFactory
     * @return
     */

        @Bean
        public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
            RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
            redisTemplate.setConnectionFactory(redisConnectionFactory);

            // 使用Jackson2JsonRedisSerialize 替换默认序列化
            Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
            objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

            jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

            // 设置value的序列化规则和 key的序列化规则
            redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
            redisTemplate.setKeySerializer(jackson2JsonRedisSerializer);
            redisTemplate.afterPropertiesSet();
            return redisTemplate;
        }

}
