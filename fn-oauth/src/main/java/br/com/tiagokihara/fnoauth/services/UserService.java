package br.com.tiagokihara.fnoauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.tiagokihara.fnoauth.entities.User;
import br.com.tiagokihara.fnoauth.feignclients.UserFeignClient;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	private UserFeignClient userFeignClient;

	public UserService(UserFeignClient userFeignClient) {
		this.userFeignClient = userFeignClient;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userFeignClient.getByEmail(username).getBody();
		
		if (user == null) {
			logger.error("E-mail not found: " + username);
			throw new UsernameNotFoundException("E-mail not found: " + username);
		}
		
		return user;
	}
}
