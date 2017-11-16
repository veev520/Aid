package club.veev.aid;

import java.io.IOException;

/**
 * Created by Veev on 2017/11/16
 * Tel:         18365264930
 * QQ:          384506557
 * Email:       veev520@hotmail.com
 * Function:    Test
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process p = rt.exec("msinfo32.exe");
        System.out.println(p.toString());
    }
}
