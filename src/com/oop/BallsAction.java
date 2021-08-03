package com.oop;

import java.util.ArrayList;
import processing.core.PApplet;

public class BallsAction extends PApplet {
    static ArrayList<Ball> balls;
    static int width;
    static int height;

    public void settings() {
        size(width, height);
    }

    public void draw() {
        for (Ball ball : balls) {
            circle(ball.getStarting_x_cord(), ball.getStarting_y_cord(), ball.getDiameter());
            ball.setStarting_x_cord(ball.getStarting_x_cord() + ball.getSpeed_unit());
        }
    }

    public static void moveBalls() {
        PApplet.main("com.oop.BallsAction");
    }

}
