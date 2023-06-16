package 爬虫;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Music {
    public static void main(String[] args) throws IOException {
//        定义变量,存储网址
        String url = "https://music.163.com/#/discover/toplist";
        //定义集合,存储爬取的数据
        List<String> list = new ArrayList<>();
        //创建URL(网址对象)
        URL url1 = new URL(url);
        //连接
        URLConnection urlConnection = url1.openConnection();
        //读取数据
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //创建可变字符串存储网页
        StringBuffer stringBuffer = new StringBuffer();
        int ch;
        while ((ch=inputStreamReader.read())!=-1){
            stringBuffer.append((char)ch);
        }
        System.out.println(stringBuffer);
    }
}
