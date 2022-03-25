package com.company;

import java.util.Scanner;

class formulException extends Exception{
    private double y;
    public double getY(){
        return y;
    }
    public formulException(String massage, double y){
        super(massage);
        this.y = y;
    }
}
class Result{
    public static double getResult(double x, double y) throws formulException{
        double result;
        if(y == -1) throw new formulException("Если вводится -1, то возникает деление на 0 ", y);
        result = (x + y)/(y +1);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        System.out.println("Введите значение y: ");
        int y = scanner.nextInt();

        try{
            double result = Result.getResult(x,y);
            System.out.printf("x+y/y+1 = %f",result);
        }
        catch (formulException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getY());
        }
    }
}
