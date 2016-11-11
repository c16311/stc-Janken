/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janken;

/**
 * https://github.com/c16311/stc-Janken.git
 * @author c16311
 */
/**
 *
 * @author c16311
 */
import java.util.Scanner;
import java.util.Random;

public class JankenTester {
    /**手のポーズを表示する*/
    static void handPrint(int hand){
        switch(hand){
            case 1:System.out.println("グー");
            break;
            case 2:System.out.println("チョキ");
            break;
            case 3:System.out.println("パー");
            break;    
        }
       
    }
    /**メインプログラム*/
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        Random rand = new Random();
        int hand;   //プレイヤーの手のポーズ
        int flag;   //ループ終了用
        //人間クラスの宣言
        Human human = new Human("Zaki");
        //コンピュータクラスの宣言
        Computer computer1 = new Computer("IOS");
        Computer computer2 = new Computer("JUST");
        
        System.out.println("Human:"+human.getName());
        System.out.println("Computer1:"+computer1.getName());
        System.out.println("Computer2:"+computer2.getName());
        System.out.println("ジャンケン勝負！");
        
        do{
            System.out.println("何を出す。");
            human.setHand(human.inputHand());        //人間の手のポーズを入力
            //コンピュータの手のポーズを生成
            computer1.setHand(computer1.createHand(3));
            computer2.setHand(computer1.createHand(3));
            
            switch(human.judge(computer1,computer2)){
                case 0:System.out.println("引き分け");
                break;
                case 1:System.out.println(human.getName()+"の勝ち");
                break;
                case 2:System.out.println(computer1.getName()+"の勝ち");
                break;
                case 3:System.out.println(computer2.getName()+"の勝ち");
                break;
                case 4:System.out.println(human.getName()+"と"+computer1.getName()+"の勝ち");
                break;
                case 5:System.out.println(human.getName()+"と"+computer2.getName()+"の勝ち");
                break;
                case 6:System.out.println(computer1.getName()+"と"+computer2.getName()+"の勝ち");
                break;
            }

            System.out.print("Human:");     handPrint(human.getHand());
            System.out.print("Computer1:");  handPrint(computer1.getHand());
            System.out.print("Computer2:");  handPrint(computer2.getHand());

            System.out.print("続けますか？[Yes/0:No:Other]:");
            flag = stdin.nextInt();
            //勝負はやめるまで続ける
        }while(flag!=0);
    }
}
