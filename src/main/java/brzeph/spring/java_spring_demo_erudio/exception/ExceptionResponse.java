package brzeph.spring.java_spring_demo_erudio.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}