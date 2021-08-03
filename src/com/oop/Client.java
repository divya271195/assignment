package com.oop;

import java.util.ArrayList;

public class Client {
    static void initBalls() {
        ArrayList<Ball> balls = new ArrayList<>();

        Ball ballOne = Ball.builder().diameter(10).starting_y_cord(BallsAction.height / 5).starting_x_cord(0).speed_unit(1).build();
        balls.add(ballOne);

        Ball ballTwo = Ball.builder().diameter(10).starting_y_cord(BallsAction.height * 2 / 5).starting_x_cord(0).speed_unit(2).build();
        balls.add(ballTwo);

        Ball ballThree = Ball.builder().diameter(10).starting_y_cord(BallsAction.height * 3 / 5).starting_x_cord(0).speed_unit(3).build();
        balls.add(ballThree);

        Ball ballFour = Ball.builder().diameter(10).starting_y_cord(BallsAction.height * 4 / 5).starting_x_cord(0).speed_unit(4).build();
        balls.add(ballFour);
        BallsAction.balls=balls;
    }

    static void initBallAction() {
        BallsAction.width=1000;
        BallsAction.height=1000;
        initBalls();
    }

    public static void main(String[] args) {
        initBallAction();
        BallsAction.moveBalls();
    }
}
