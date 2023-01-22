package com.example.demo;

import org.springframework.stereotype.Component;


public class PacmanGame implements  Game {

        @Override
        public void upAction() {
            System.out.println("PacmanGame UP");
        }

        @Override
        public void downAction() {
            System.out.println("PacmanGame DOWN");
        }

        @Override
        public void leftAction() {
            System.out.println("PacmanGame LEFT");
        }

        @Override
        public void rightAction() {
            System.out.println("PacmanGame RIGHT");
        }

    }
