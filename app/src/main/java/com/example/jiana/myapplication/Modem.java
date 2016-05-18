package com.example.jiana.myapplication;

interface Modem {
    void dial(String pno);
    void hangup();
    void send(char c);
    void recv();
}
