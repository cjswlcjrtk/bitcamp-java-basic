import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("너는 어디에 사니?");

        String live = "";
        Scanner scanner = new Scanner(System.in);
        live = scanner.next();

        System.out.println("a값을 입력해주세요");        
        int a = 0;
        a = scanner.nextInt();

        System.out.println("b값을 입력해주세요");
        int b = 0;        
        b = scanner.nextInt();

        int c = a + b;

        System.out.println("저는 " + live + "에 삽니다.");

        System.out.println(String.format("이름은 %s 입니다", live));

        System.out.println("두수의 합은 " + c + "입니다.");

        System.out.print(String.format("%d + %d = %d" , a, b, c) );
        System.out.println("연산종류를 선택하세요 1. + 2. - 3.* 4./");
        

    }

}