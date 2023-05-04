package clonecoding.photogram.config.auth;

import clonecoding.photogram.domain.user.User;
import clonecoding.photogram.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service //IoC
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userEntity = userRepository.findByUsername(username);


        //username을 찾으면 userEntity를 PrincipalDetails에 넣어줘서 세션값을 얻음
        if(userEntity == null){
            return null;
        }
        else{
            return new PrincipalDetails(userEntity);
        }

    }
}
