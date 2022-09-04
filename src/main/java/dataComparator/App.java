package dataComparator;
import dataComparator.dataComparator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        String str1 = "[{init_date=20190909, account=2009, amount1=50},{init_date=20190909, account=2009, amount1=50}]";
        String str2 = "[{init_date=20190909, account=2008, amount1=49},{init_date=20190909, account=2009, amount1=50}]";

        dataComparator.datasCompare(str1, str2);
       try {
           File ff = new File("");
           if(!ff.exists()){
               ff.mkdirs();
           }
           FileWriter FileWriter = new FileWriter(new File(""));
           FileWriter.write("");
           FileWriter.write("\n");
           FileWriter.close();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
