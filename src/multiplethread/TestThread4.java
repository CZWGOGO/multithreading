package multiplethread;

import charactor.Hero;

/**
 * Created by CZWGOGO on 2019/10/23 14:17
 */

//主线程
public class TestThread4 {
    public static void main(String[] args) {
        final Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616;
        garen.damage=50;

        final Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=300;
        teemo.damage=30;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //开启进程t1，重写run（）
        Thread t1=new Thread(){
            public void run(){
                while (!teemo.isDead()){
                    garen.attackHero(teemo);
                }
            }
        };
        t1.start();
        //代码执行到这里，一直是main线程在运行
        try{
            //t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Thread t2=new Thread(){
            public void run(){
                while(!bh.isDead()){
                    leesin.attackHero(bh);
                }
            }
        };
        t2.start();
    }
}
