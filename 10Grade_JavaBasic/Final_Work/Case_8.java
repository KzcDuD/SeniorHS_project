
package selfstudy.Final_Work;

import java.util.*;

/*計算比賽分數，到5分結束比賽，A or B隊勝利*/
public class Case_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran =new Random();
        int p1 = 0;
        int p2 = 0;
        int p3 =0;
        //直到有一隊 >=6分
        do {
            System.out.printf("目前A:%d分，B:%d分，C:%d分\n",p1,p2,p3);
            System.out.println("請輸入要加分隊伍 A or B or C");
            String team = sc.next();
            int add;
            
            //加隨機亂數-3-3
            if(ran.nextBoolean()){
                add=ran.nextInt(3); 
            }else{
                add=ran.nextInt(3)*-1;
            }
                
            switch (team) {
                case "A"://選A
                case "a":
                    p1 = p1 + add;
                    break;
                case "B"://選B
                case "b":
                    p2 = p2 + add;
                    break;
                case "C"://選C
                case "c":
                    p3=p3+add;
                    break;
                default:
                    System.out.println("隊伍不存在");
            }
            if (p1 >= 6 || p2 >= 6 || p3>=6) {   //如果p1 p2 p3>6，離開迴圈
                break;
            } 
        } while (true);
        
         System.out.printf("目前A:%d分，B:%d分，C:%d分\n",p1,p2,p3);

        if (p1 > p2 && p1>p3) {
            System.out.println("比賽結束A隊勝利");
        } else if(p2>p3 &&p2>p1){
            System.out.println("比賽結束B隊勝利");
        }else if(p3>p1 ||p3>p2){
            System.out.println("比賽結束C隊勝利");
            
          
        }

    }

}
