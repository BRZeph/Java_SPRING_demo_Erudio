package brzeph.spring.java_spring_demo_erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperation extends RuntimeException {

    public UnsupportedMathOperation(String message) {
        super(message);
    }
}
