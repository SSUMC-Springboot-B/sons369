package clonecoding.photogram.handler;

import clonecoding.photogram.handler.ex.CustomValidationException;
import clonecoding.photogram.web.dto.CMRespDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public CMRespDto<?> validationException(CustomValidationException e){
        return new CMRespDto<Map<String, String>>(-1, e.getMessage(), e.getErrorMap());
    }
}
