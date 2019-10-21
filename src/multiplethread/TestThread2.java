package multiplethread;

import charactor.Hero;

/**
 * Created by CZWGOGO on 2019/10/22 2:04
 */

//使用匿名类继承Thread，重写run方法
public class TestThread2 {
    public static void main(String[] args) {


        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616;
        garen.damage = 50;

        Hero bh = new Hero();
        bh.name = "赏金";
        bh.hp = 500;
        bh.damage = 65;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        //匿名类
        Thread t1 = new Thread() {
            public void run() {
                //匿名类中用到外部的局部变量teemo。要加final

                //jdk7之后不用加final，也许是为了减少代码量？不懂
                while (!teemo.isDead()) {
                    garen.attackHero(teemo);
                }
            }
        };
        t1.start();

         Thread t2 = new Thread() {
            public void run() {
            while (!bh.isDead()) {
                garen.attackHero(bh);
                }
            }

          };
         t2.start();
     }
}