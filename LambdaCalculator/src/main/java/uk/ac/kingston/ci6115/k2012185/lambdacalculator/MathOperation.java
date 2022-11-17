/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.kingston.ci6115.k2012185.lambdacalculator;

/**
 *
 * @author tugoflaherty
 */
public class MathOperation {
    public static void main(String[] args) {
        Calculator add = (num1, num2) -> num1 + num2;
        Calculator multiply = (num1, num2) -> num1 * num2;
        Calculator subtract = (num1, num2) -> num1 - num2;

        getResult(20, 67, add);
        getResult(56, 6, multiply);
        getResult(67, 89, subtract);
    }
    
    public static void getResult(int num1, int num2, Calculator operation) {
        int result = operation.integerOperation(num1, num2);
        System.out.println(result);
    }
}
