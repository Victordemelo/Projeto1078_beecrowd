/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1078 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        for (int i = 1; i < 11; i++) {

            if (i < 11) {
                System.out.println(i + " x " + N + " = " + N * i);
            }
        }
    }
}
