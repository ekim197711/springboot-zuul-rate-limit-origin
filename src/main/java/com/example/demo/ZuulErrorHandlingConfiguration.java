package com.example.demo;

import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.repository.DefaultRateLimiterErrorHandler;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.repository.RateLimiterErrorHandler;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.support.RateLimitExceededEvent;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@Slf4j
public class ZuulErrorHandlingConfiguration {

    @EventListener
    public void observe(RateLimitExceededEvent event) {
        // custom code
        log.info("limit exceeded!!!{}", event.getRemoteAddress().toString());
    }

    @Bean
    public RateLimiterErrorHandler rateLimitErrorHandler() {
        return new DefaultRateLimiterErrorHandler() {
            @Override
            public void handleSaveError(String key, Exception e) {
                // custom code
                log.info("handle save error");

            }

            @Override
            public void handleFetchError(String key, Exception e) {
                // custom code
                log.info("handle fetch error");
            }

            @Override
            public void handleError(String msg, Exception e) {
                // custom code
                log.info("handle error");
                e.printStackTrace();
            }
        };
    }
}
