package clonecoding.photogram.service;


import clonecoding.photogram.domain.user.User;
import clonecoding.photogram.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service // 1. IOC 2. 트랜잭션 관리
public class AuthService {

    private final UserRepository userRepository;

    public User join(User user){

        return userRepository.save(user);
    }
}
