import java.util.Scanner;

class Multiplication{
    public static void main(String[] args){
        System.out.println("값을 입력해주세요~");        

        Scanner scanner = new Scanner(System.in);
        
        int a = 0;
        a = scanner.nextInt();

        System.out.println("값을 입력해주세요~");
        int b = 0;
        b = scanner.nextInt();

        int c = a * b;

        System.out.println("두 수의 곱셈값은 " + c + "입니다.");

        System.out.print(String.format("%d * %d = %d" , a, b, c) );





    }
}