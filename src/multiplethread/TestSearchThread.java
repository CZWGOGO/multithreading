package multiplethread;

import java.io.File;

/**
 * Created by CZWGOGO on 2019/10/23 4:07
 */
public class TestSearchThread {

    public static void search(File file,String searchStr) {
        if (file.isFile()) {
            if (file.getName().toLowerCase().endsWith(".exe")) {
                //当找到.exe文件时，就启动一个线程，进行专门的查找
                new SearchFileThread(file, searchStr).start();
            }
        }

         if(file.isDirectory()) {
             File[] fs = file.listFiles();
             for (File f : fs) {
                 search(f, searchStr);
             }
         }
    }

    public static void main(String[] args) {

        File folder=new File("F:\\Git");
        search(folder,"github");

    }
}
