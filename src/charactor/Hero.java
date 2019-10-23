package charactor;

/**
 * Created by CZWGOGO on 2019/10/21 19:10
 */

//不使用多线程的情况
public class Hero {
    public String name;
    public float hp;
    public Hero(){

    }
    public Hero(String name){
        this.name=name;
    }

    public int damage;

    public void attackHero(Hero h) {
        try {
            //为了表示攻击需要时间，每次攻击需要暂停1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.hp -= damage;
        System.out.format("%s正在攻击%s,%s的血变成了%.0f%n", name, h.name, h.name, h.hp);

        if (h.isDead())
            System.out.println(h.name + "死了！");
    }
        public boolean isDead () {
            return 0 >= hp ? true : false;
        }
        int totalTime = 3;

        public void adugen () {
            while (true) {
                for (int i = 0; i < totalTime; i++) {
                    System.out.printf("波动拳第%d发%n", i + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开始为时5秒的充能");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }


    public static void main(String[] args) {
        Hero h=new Hero();
        h.name="红仔";
        h.adugen();
    }


}
