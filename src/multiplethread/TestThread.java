package multiplethread;

import charactor.Hero;

/**
 * Created by CZWGOGO on 2019/10/21 21:30
 */

//使用多线程—继承线程类
//可允许同时攻击两个英雄，
public class TestThread {
    public static void main(String[] args) {
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616;
        garen.damage=50;

        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=300;
        teemo.damage=30;

        Hero bh=new Hero();
        bh.name="赏金猎人";
        bh.hp=500;
        bh.damage=65;

       Hero lessin=new Hero();
       lessin.name="盲僧";
       lessin.hp=455;
       lessin.damage=82;

       KillThread killThread1=new KillThread(garen,teemo);
       killThread1.start();
       KillThread killThread2=new KillThread(garen,lessin);
       killThread2.start();

    }
}
