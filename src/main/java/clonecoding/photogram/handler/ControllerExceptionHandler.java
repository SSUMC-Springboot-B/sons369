package clonecoding.photogram.handler;

import clonecoding.photogram.handler.ex.CustomValidationException;
import clonecoding.photogram.util.Script;
import clonecoding.photogram.web.dto.CMRespDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

//    @ExceptionHandler(CustomValidationException.class)
//    public CMRespDto<?> validationException(CustomValidationException e){
//        return new CMRespDto<Map<String, String>>(-1, e.getMessage(), e.getErrorMap());
//    }

    @ExceptionHandler(CustomValidationException.class)
    public String validationException(CustomValidationException e){
        // CMRespDto 비교
        // 1. 클라이언트에게 응답할때는 Script가 좋음
        // 2. Ajax 통신 - CMRespDto
        // 3. Android통신 - CMRespDto
        return Script.back(e.getErrorMap().toString());
    }
}
