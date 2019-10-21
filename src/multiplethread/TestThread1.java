package multiplethread;

import charactor.Hero;

/**
 * Created by CZWGOGO on 2019/10/21 22:02
 */

public class TestThread1 {
    public static void main(String[] args) {

        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616;
        garen.damage=50;

        Hero bh=new Hero();
        bh.name="赏金";
        bh.hp=500;
        bh.damage=65;

        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=300;
        teemo.damage=30;

        Battle battle1=new Battle(garen,teemo);

        new Thread(battle1).start();

        Battle battle2=new Battle(garen,bh);
        new Thread(battle2).start();

    }
}
