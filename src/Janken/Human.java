/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janken;

/**
 *
 * @author c16311
 */
import java.util.Scanner;

public class Human extends Player{
    
    /**上位クラスのメソッドを利用したコンストラクタ*/
    public Human(String HumanName){
        super(HumanName);
    }
    /**勝敗を判定するメソッド　引数:playerクラス・playerクラスを継承したクラス*/
    public int judge(Player player){
        //int getHand()%player.getHand();
        //勝利なら1、敗けなら-1、引き分けなら0を返す。
        if((getHand()-player.getHand()+3)%3==2)
            return 1;
        else if((getHand()-player.getHand()+3)%3==1)
            return -1;
        return 0;
    }
    
    /**手のポーズを入力する*/
    public int inputHand(){
        Scanner stdin = new Scanner(System.in);
        int hand;
        do{
            System.out.print("[グー/1,チョキ/2,パー/3]:");
            hand = stdin.nextInt();
        }while(hand<1||hand>3);
        return hand;
    }
}
