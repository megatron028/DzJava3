package com.company;
/*Ввести с клавиатуры строку, вывести ее на экран. Далее ввести еще одну строку и
вывести на экран содержит ли первая строка в себе вторую, если не содержит
то вывести на экран какие символы из второй строки содержатся в первой*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(line);
        String pline = in.nextLine();
        boolean flag = line.contains(pline);
        if (flag == false){
            char[] ch =  pline.toCharArray();
            for (int i = 0 ; i < ch.length; i++){
                if (ch[i] == pline.charAt(i) ){
                    System.out.println(ch[i]);
                }
            }
        }
        else System.out.println(pline);
    }
}
