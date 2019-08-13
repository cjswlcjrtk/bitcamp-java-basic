import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수 인것 같으면 '홀'을 선택 나머지는 '짝'을 선택
     * 한다고 할 때, 결과를 출력하세요.
     */
    public static void main(String[] args){
        
        System.out.println("홀인지 짝인지 입력해주세요~~");
                
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int dice = 0;
        dice = ran.nextInt(6)+1;

        // System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        int rest = 0;
        rest = dice%2;
        // System.out.println("dap값확인"+rest);
        String answer = "";
       
        if(rest==1){
            answer = "홀";
        }else{
            answer = "짝";
        }
        // System.out.println("answer" + answer);
        String dap = "";
        dap = scan.next();
        if(dap.equals(answer)){
            System.out.println("정답입니다.");
        }else{
            System.out.println("틀렸습니다.");

        }



        




        
    }
}