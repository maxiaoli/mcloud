package me.javaroad.mcloud.apigw.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author heyx
 */
@ConfigurationProperties(prefix = "oauth2.keycloak")
public class KeycloakConfig {

    @Getter
    @Setter
    private Client client;

    @Getter
    @Setter
    public static class Client {

        private String accessTokenUri;
        private String clientId;
        private String clientSecret;
    }
}
