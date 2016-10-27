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
//プレイヤーの抽象クラス
public abstract class Player {
    
    /**プレイヤー名*/
    private String name;
    /**手のポーズ*/
    private int hand;
    
    /**Playerクラスのコンストラクタ*/
    public Player(String playerName){
        setName(playerName);
    }
    
    /**プレイヤー名を取得*/
    public String getName(){
        return name;
    }
    
    /**プレイヤー名をセット 引数:プレイヤー名*/
    public void setName(String name){
        this.name=name;
    }
    /**プレイヤーの手を取得*/
    public int getHand(){
        return hand;
    }
    
    /**プレイヤーの手をセット 引数:プレイヤーの手のポーズ*/
    public void setHand(int command){
        this.hand=command;
    }
}
