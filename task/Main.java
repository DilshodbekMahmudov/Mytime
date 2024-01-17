package com.lesson.collection.Lesson.task;

public class Main {

    public static void main(String[] args) {

        MyTime time = new MyTime(10,30,45);
        System.out.println(time.toString());

        time.setTime(10, 30, 45);
        System.out.println(time.toString());

        time.nextSecond();
        System.out.println(time.toString());

        time.nextMinute();
        System.out.println(time.toString());

        time.nextHour();
        System.out.println(time.toString());

        time.previousSecond();
        System.out.println(time.toString());

        time.previousMinute();
        System.out.println(time.toString());

        time.previousHour();
        System.out.println(time.toString());
    }
}

