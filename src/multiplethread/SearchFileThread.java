package multiplethread;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by CZWGOGO on 2019/10/23 3:51
 */
public class SearchFileThread extends Thread {
    private File file;
    private String searchStr;


    public SearchFileThread(File file,String searchStr){
        this.file=file;
        this.searchStr=searchStr;
    }

    public void run() {
        String fileContent = readFileContext(file);
        if (fileContent.contains(searchStr)) {

            System.out.printf("找到子目標字符串%s，在文件:%s%n", searchStr, file);
        }
    }
    public String readFileContext(File file){
        try {
            FileReader fr=new FileReader(file);
            char[] all=new char[(int)file.length()];
            fr.read(all);
            return new String(all);
        } catch (IOException e) {
                  e.printStackTrace();
                  return null;
        }
    }
}
