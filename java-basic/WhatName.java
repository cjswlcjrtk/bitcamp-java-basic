import java.util.Scanner;
class WhatName{
    public static void main(String[] args){

        
        System.out.println("이름 뭐니?");
        String name = "";
        int age = 0;
        // 값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        System.out.println("나이 뭐니?");
        age = scanner.nextInt();
        // System.out.print("이름은 " + name + "이다");
        System.out.print("이름은 " + name + ", 이고\n 나이는 " + age + "살 이다.");

        System.out.println(String.format("이름은 %s 입니다", name));

        System.out.println(String.format("이름은 %d 입니다", age));
    }
    

}