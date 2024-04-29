package com.example.instafreshmart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.http.dsl.Http;
import org.springframework.integration.dsl.IntegrationFlow;


@Configuration
@EnableIntegration
public class IntegrationConfig {

    @Bean
    public IntegrationFlow topUpFlow() {
//        return IntegrationFlows.from(() -> "trigger",
//                        endpointConfigurer -> endpointConfigurer.poller(Pollers.fixedRate(10000)))
//                .handle(Http.outboundGateway("https://doc.revenuemonster.my/docs/merchant-wallet/topup-wallet")
//                        .httpMethod(HttpMethod.POST)
//                        .expectedResponseType(String.class))
//                .get();
//    }
        return null;
    }
}