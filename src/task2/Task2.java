/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Amer
 */
public class Task2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String ans;

            System.out.println("Enter the Value of M");
            System.out.print("M=");
            ans = sc.nextLine();
            int M;
            try {
                M = Integer.parseInt(ans);
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }

            System.out.println("Enter the Value of N");
            System.out.print("N=");
            ans = sc.nextLine();
            int N;
            try {
                N = Integer.parseInt(ans);
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }

            System.out.println(M);
            System.out.println(N);
        }
    }

}
