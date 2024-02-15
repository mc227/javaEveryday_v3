package com.codegym.task.task23.task2305;

/*
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    /*
    Implement the getTwoSolutions method,
    which should return an array of 2 instances of the Solution class.
    For each instance of the Solution class,
    initialize the innerClasses field with two values.
    All data must be initialized only
    * */
    public static Solution[] getTwoSolutions() {
        Solution first = new Solution();
        first.innerClasses[0] = first.new InnerClass();
        first.innerClasses[1] = first.new InnerClass();

        Solution second = new Solution();
        second.innerClasses[0] = second.new InnerClass();
        second.innerClasses[1] = second.new InnerClass();

        Solution[] solutions = new Solution[2];
        solutions[0] = first;
        solutions[1] = second;
        return solutions;
    }

    public static void main(String[] args) {

    }
}
