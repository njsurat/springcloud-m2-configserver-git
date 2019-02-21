package pluralsight.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);

      http.authorizeRequests().antMatchers("/decrypt/**").authenticated().and().csrf().disable();
      http.authorizeRequests().antMatchers("/encrypt/**").authenticated().and().csrf().disable();

//        val path = serverProperties.getServlet().getContextPath();
//        http.authorizeRequests().antMatchers(path + "/decrypt/**").authenticated().and().csrf().disable();
//        http.authorizeRequests().antMatchers(path + "/encrypt/**").authenticated().and().csrf().disable();

//		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();

	}
}