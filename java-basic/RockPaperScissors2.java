import java.util.Random;
import java.util.Scanner;

/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
class RockPaperScissors2{   

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int dice = 0;
        dice = ran.nextInt(3)+1;

        // System.out.println(dice);

        String com = "";

        if(dice == 1){
            com = "가위";
        }else if(dice == 2){
            com = "바위";
        }else{
            com = "보";
        }

        System.out.println("무엇을 낼지 입력해주세요");
        String answer = "";
        answer = scan.next();
        // System.out.println("com값" + com);
        // System.out.println("answer값" + answer);
        if(answer.equals(com)){
            System.out.println("비겼습니다");   
        }else if(answer.equals("가위")){
            if(com.equals("바위")){
                System.out.println("컴퓨터가 이겼습니다");
            }else{
                System.out.println("도전자가 이겼습니다");
            }
        }else if(answer.equals("바위")){
            if(com.equals("보")){
                System.out.println("컴퓨터가 이겼습니다");
            }else{
                System.out.println("도전자가 이겼습니다");
            }
        }else if(answer.equals("보")){
            if(com.equals("가위")){
                System.out.println("컴퓨터가 이겼습니다");
            }else{
                System.out.println("도전자가 이겼습니다");
            }
        }else{
            System.out.println("제대로 입력해주세요");
        }


    }
    
    

    
  


}