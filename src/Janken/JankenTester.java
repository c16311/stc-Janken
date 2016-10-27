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
        Computer computer = new Computer("IOS");
        
        System.out.println("Human:"+human.getName());
        System.out.println("Computer:"+computer.getName());
        System.out.println("ジャンケン勝負！");
        
        do{
            System.out.println("何を出す。");
            human.setHand(human.inputHand());        //人間の手のポーズを入力
            //コンピュータの手のポーズを生成
            computer.setHand(computer.createHand(3));
            
            if(human.judge(computer)==1)
                System.out.println(human.getName()+"の勝ち");
            else if(human.judge(computer)==-1)
                System.out.println(computer.getName()+"の勝ち");
            else
                System.out.println("引き分け");

            System.out.print("Human:");     handPrint(human.getHand());
            System.out.print("Computer:");  handPrint(computer.getHand());

            System.out.print("続けますか？[Yes/0:No:1]:");
            flag = stdin.nextInt();
            //勝負はやめるまで続ける
        }while(flag==0);
    }
}
