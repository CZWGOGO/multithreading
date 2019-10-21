package multiplethread;

import charactor.Hero;

/**
 * Created by CZWGOGO on 2019/10/21 21:24
 */

//使用多线程-继承线程类
public class KillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }

}
