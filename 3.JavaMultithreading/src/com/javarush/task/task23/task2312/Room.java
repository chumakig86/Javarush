package com.javarush.task.task23.task2312;

import java.util.ArrayList;

/**
 * Created by user on 11.06.2017.
 */
public class Room {

    private int width, height;
    private Snake snake;
    private Mouse mouse;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }
    public void run () {}
    public void print () {
        int[][] matrix = new int[height][width];

        //Рисуем все кусочки змеи
        ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>(snake.getSections());
        for (SnakeSection snakeSection : sections) {
            matrix[snakeSection.getY()][snakeSection.getX()] = 1;
        }
        matrix [snake.getY()] [snake.getX()] = 2;  //Рисуем все кусочки змеи
        matrix [mouse.getY()] [mouse.getX()] = 3;  //Рисуем мышь
        for (int i = 0;i < height; i++) {
            for (int j = 0;j < width; j++) {
                if (matrix[i][j] == 1) System.out.print("x");
                else if (matrix[i][j] == 2) System.out.print("X");
                else if (matrix[i][j] == 3) System.out.print("^");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
    public void createMouse () {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        mouse = new Mouse(x, y);
    }
    public void eatMouse () {
        createMouse();
    }

    public static Room game;
    public static void main(String[] args) {
        Snake snake;
        game = new Room(20, 20, new Snake(10, 20));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();

    }
    private int initialDelay = 520;
    private int delayStep = 20;
    public void sleep () {
        try {
            int level = snake.getSections().size();
            int delay = level < 15 ? (initialDelay - delayStep * level) : 200;
            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
    }
}
