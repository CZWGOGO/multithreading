package multiplethread;

/**
 * Created by CZWGOGO on 2019/10/23 15:29
 */

//守护进程，非必要进程
public class TestThread7 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                int seconds = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                    }
                }
            };
        t1.setDaemon(true);
        t1.start();

    }
}
