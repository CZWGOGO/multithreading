package charactor;

/**
 * Created by CZWGOGO on 2019/10/21 20:02
 */

//不使用多线程的情况
public class TestThread {
    public static void main(String[] args) {
        Hero garen =new Hero();
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

        Hero leesin=new Hero();
        leesin.name="盲僧";
        leesin.hp=455;
        leesin.damage=80;

        //盖伦攻击提莫
        while(!teemo.isDead()){
            garen.attackHero(teemo);
        }

        //赏金猎人攻击盲僧
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }
    }
}
