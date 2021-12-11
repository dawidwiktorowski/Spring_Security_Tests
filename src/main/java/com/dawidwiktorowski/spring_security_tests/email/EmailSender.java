package com.dawidwiktorowski.spring_security_tests.email;

public interface EmailSender {
    void send (String to, String email);
}
