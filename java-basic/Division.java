import java.util.Scanner;

class Division{
    public static void main(String[] args){
        System.out.println("값을 입력해주세요~");        

        Scanner scanner = new Scanner(System.in);
        
        int a, b, c = 0;
        a = scanner.nextInt();

        System.out.println("값을 입력해주세요~");
        b = scanner.nextInt();

        //  c = a / b;

        // System.out.println("두 수의 나눗셈값은 " + c + "입니다.");

        // System.out.print(String.format("%d / %d = %d" , a, b, c) );
        String op = "";
        System.out.println("연산종류를 선택하세요 + ,- ,* ,/ ");
        
        op = scanner.next();

        if(op.equals("+")){
            c = a + b;
            System.out.print(String.format("%d + %d = %d" , a, b, c) );
        }else if(op.equals("-")){
            c = a - b;
            System.out.print(String.format("%d - %d = %d" , a, b, c) );
        }else if(op.equals("*")){
            c = a * b;
            System.out.print(String.format("%d * %d = %d" , a, b, c) );
        }else if(op.equals("/")){
            c = a / b;
            System.out.print(String.format("%d / %d = %d" , a, b, c) );
        }else{
            
            System.out.print("1~4번 숫자만 입력해주세요");
        }
    }

}