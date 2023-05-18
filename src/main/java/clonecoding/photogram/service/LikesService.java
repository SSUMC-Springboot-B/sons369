package clonecoding.photogram.service;

import clonecoding.photogram.domain.likes.LikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LikesService {

    private final LikesRepository likesRepository;

    @Transactional
    public void 좋아요(int imageId, int principalId){
        likesRepository.mLikes(imageId, principalId);
    }

    @Transactional
    public void 좋아요취소(int imageId, int principalId){
        likesRepository.mUnLikes(imageId, principalId);
    }

}