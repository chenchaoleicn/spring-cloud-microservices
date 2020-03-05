package thunder.springcloud.zuul.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class RouteConfig {

    /**
     * 自定义路由规则
     * 为这些不同版本的微服务应用生成以版本代号作为路由前缀定义的路由规则
     * @return
     */
//    @Bean
//    public PatternServiceRouteMapper serviceRouteMapper () {
//        return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)", "${version}/${name}");
//    }
}
