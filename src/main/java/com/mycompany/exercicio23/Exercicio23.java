package com.mycompany.exercicio23;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Número inicial: ");
        int num1 = scan.nextInt();
        
        System.out.print("Número final: ");
        int num2 = scan.nextInt();
        
        int total = 0;
        
        while(num1 <= num2){
            total += num1;
            num1++;
        }
        
        System.out.println("Soma total:" + total);
    }
}
