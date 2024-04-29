package com.example.instafreshmart.service;

import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.http.dsl.Http;

@EnableIntegration
public class ExternalAPIService {

    @MessagingGateway
    public interface ExternalAPIGateway {
        @Gateway(requestChannel = "externalAPIChannel")
        String callExternalAPI(String payload);
    }

    @ServiceActivator(inputChannel = "externalAPIChannel")
    public String handleAPICall(String payload) {
        return payload; // You can modify this method to make the actual API call
    }

    // Define the integration flow
    public IntegrationFlow integrationFlow() {
        return IntegrationFlows.from("externalAPIChannel")
                .handle(Http.outboundGateway("https://doc.revenuemonster.my/docs/merchant-wallet/topup-wallet")
                        .httpMethod(HttpMethod.POST)
                        .expectedResponseType(String.class))
                .get();
    }
}
