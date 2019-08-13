import java.util.Scanner;

class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("가위 바위 보 게임");
        System.out.println("1. 가위 2. 바위 3. 보");
        //컴퓨터가 바위를 냈어요.
        int op = 0;
        Scanner scan = new Scanner(System.in);
        
        op = scan.nextInt();

        if(op == 1){
            System.out.println("졌어요");
        }else if(op == 2){
            System.out.println("비겼어요");
        }else if(op == 3){
            System.out.println("이겼어요");
        }else{
            System.out.println("제대로 다시 내주세요.");
        }
    }

}