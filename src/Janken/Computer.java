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
import java.util.Random;

public class Computer extends Player{
    
    /**上位クラスのメソッドを利用したコンストラクタ*/
    public Computer(String ComputerName){
        super(ComputerName);
    }
    /**手のポーズをランダムに生成する:引数 手のポーズの数*/
    public int createHand(int num){
        Random rand = new Random();
        return rand.nextInt(num)+1;
        
    }
    
}
