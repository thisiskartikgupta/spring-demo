package com.example.demo;

import org.springframework.stereotype.Component;

@Component
class MarioGame implements Game {
    @Override
    public void upAction() {
        System.out.println("Mario UP");
    }

    @Override
    public void downAction() {
        System.out.println("Mario DOWN");
    }

    @Override
    public void leftAction() {
        System.out.println("Mario LEFT");
    }

    @Override
    public void rightAction() {
        System.out.println("Mario RIGHT");
    }
}
