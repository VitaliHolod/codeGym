package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {

    int top, left, width, height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.left = rectangle.left;
        this.top = rectangle.top;
    }


    public static void main(String[] args) {

    }
}
