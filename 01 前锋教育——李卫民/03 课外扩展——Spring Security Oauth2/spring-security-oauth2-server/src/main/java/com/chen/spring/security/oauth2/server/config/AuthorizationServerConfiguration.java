package com.chen.spring.security.oauth2.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 14:13 2020/5/24 0024
 * @Modified By:
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // @Override
    // public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    //     clients
    //             .inMemory()
    //             .withClient("client0")
    //             .secret(passwordEncoder.encode("secret0"))      // client_id 和 secrity_id 需要指定，只有输入了正确的才能访问授权服务器
    //             .authorizedGrantTypes("authorization_code")
    //             .scopes("app")
    //             .redirectUris("http://www.funtl.com");  // 获得授权码以后，将会跳转到哪里
    // }

    /**
     * 加载数据源
     * @return
     */
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        // 配置数据源（注意，我使用的是 HikariCP 连接池），以上注解是指定数据源，否则会有冲突
        return DataSourceBuilder.create().build();
    }

    /**
     * 令牌保存到数据库中
     * @return
     */
    @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSource());
    }

    /**
     * 需要事先在数据库中配置客户信息
     * @return
     */
    @Bean
    public ClientDetailsService jdbcClientDetails() {
        return new JdbcClientDetailsService(dataSource());
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // 设置令牌
        endpoints.tokenStore(tokenStore());
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 读取客户端配置
        clients.withClientDetails(jdbcClientDetails());
    }
}
