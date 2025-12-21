// package com.example.demo.exception;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.MethodArgumentNotValidException;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RestControllerAdvice;

// import java.util.HashMap;
// import java.util.Map;

// @RestControllerAdvice
// public class GlobalExceptionHandler {

//     @ExceptionHandler(BadRequestException.class)
//     public ResponseEntity<Map<String, Object>> handleBadRequest(BadRequestException ex) {
//         Map<String, Object> body = new HashMap<>();
//         body.put("error", ex.getMessage());
//         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
//     }

//     @ExceptionHandler(ConflictException.class)
//     public ResponseEntity<Map<String, Object>> handleConflict(ConflictException ex) {
//         Map<String, Object> body = new HashMap<>();
//         body.put("error", ex.getMessage());
//         return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
//     }

//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<Map<String, Object>> handleValidation(MethodArgumentNotValidException ex) {
//         Map<String, Object> body = new HashMap<>();
//         body.put("error", ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
//         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
//     }

//     @ExceptionHandler(Exception.class)
//     public ResponseEntity<Map<String, Object>> handleOther(Exception ex) {
//         Map<String, Object> body = new HashMap<>();
//         body.put("error", ex.getMessage());
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
//     }
// }
