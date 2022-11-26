package textProcessing;

import javax.xml.crypto.Data;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str.append("a");
        }
        System.out.println(new Date());
    }
}
