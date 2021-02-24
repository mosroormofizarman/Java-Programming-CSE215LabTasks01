/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE215LabTasks01;

/**
 *
 * @author ArMan
 */
import java.util.Scanner;
public class SummationOfaPlusb {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int sum = a+b;
        
        System.out.println(sum);
    }
}
