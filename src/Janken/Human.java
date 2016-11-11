/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janken;

import java.util.Scanner;

public class Human extends Player{
    
    /**上位クラスのメソッドを利用したコンストラクタ*/
    public Human(String HumanName){
        super(HumanName);
    }
    /**勝敗を判定するメソッド。引数:playerクラス・playerクラスを継承したクラス*/
    public int judge(Player player){
        //int getHand()%player.getHand();
        //勝利なら1、敗けなら-1、引き分けなら0を返す。
        if((getHand()-player.getHand()+3)%3==2)
            return 1;
        else if((getHand()-player.getHand()+3)%3==1)
            return -1;
        return 0;
    }
    public int judgePhoto(Player player1,Player player2){
        //int getHand()%player.getHand();
        //勝利なら1、敗けなら-1、引き分けなら0を返す。
        if((getHand()-player1.getHand()+3)%3==2){
            if(getHand()==player2.getHand()||player1.getHand()==player2.getHand()){
                return 1;
            }else
                return 0;
        }
        
        else if((getHand()-player1.getHand()+3)%3==1){
            if(getHand()==player2.getHand()||player1.getHand()==player2.getHand()){
                return -1;
            }else
                return 0;
        }
        
        if((getHand()+player1.getHand()+player2.getHand())%3==1)
            return 1;
        else if((getHand()+player1.getHand()+player2.getHand())%3==2)
            return -1;
        return 0;
    }
    public int judge(Player player1,Player player2){
        //int getHand()%player.getHand();
        /*Human           勝利 1
          player1         勝利 2
          player2         勝利 3
          Human•player1   勝利 4
          Human•player2   勝利 5
          player1•player2 勝利 6
          引き分け              0
        */
        if((getHand()-player1.getHand()+3)%3==2){
            if(getHand()==player2.getHand()||player1.getHand()==player2.getHand()){
                if(getHand()==player2.getHand())
                    return 5;
                else
                    return 1;
            }else
                return 0;
        }
        
        else if((getHand()-player1.getHand()+3)%3==1){
            if(getHand()==player2.getHand()||player1.getHand()==player2.getHand()){
                if(getHand()==player2.getHand())
                    return 2;
                else
                    return 6;
            }else
                return 0;
        }
        
        if((getHand()+player1.getHand()+player2.getHand())%3==1)
            return 4;
        else if((getHand()+player1.getHand()+player2.getHand())%3==2)
            return 3;
        return 0;
        
    }
    
    /**手のポーズを入力する。引数なし*/
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