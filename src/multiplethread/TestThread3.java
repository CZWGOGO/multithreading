package multiplethread;

/**
 * Created by CZWGOGO on 2019/10/23 13:56
 */

//进程暂停
public class TestThread3 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                int seconds = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL%d秒%n",seconds++);
                }
            }
        };
        t1.start();
    }
}
