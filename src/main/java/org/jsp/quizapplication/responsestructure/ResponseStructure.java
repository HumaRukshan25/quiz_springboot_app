package org.jsp.quizapplication.responsestructure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
    private int httpStatus;
    private String message;
    private T body;
//done by me below chatgp
    // Private constructor to enforce use of the builder
    private ResponseStructure(int httpStatus, String message, T body) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.body = body;
    }

    // Builder static method
    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    // Static Builder class
    public static class Builder<T> {
        private int httpStatus;
        private String message;
        private T body;

        // Setters for the builder class
        public Builder<T> httpstatus(int httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder<T> message(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> body(T body) {
            this.body = body;
            return this;
        }

        // Build method to create ResponseStructure instance
        public ResponseStructure<T> build() {
            return new ResponseStructure<>(httpStatus, message, body);
        }
    }
}
