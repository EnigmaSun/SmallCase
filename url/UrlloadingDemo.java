package url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class UrlloadingDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http","localhost",8080,"/tomcat.png");
		//打开链接对象
		URLConnection conn = url.openConnection();
		//InputStream getInputStream 返回从次链接打开的输入流
		//网络——输入——程序
		InputStream is= conn.getInputStream();
//		Scanner sc = new Scanner(is);
//		while(sc.hasNextLine()){
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		Files.copy(is, Paths.get("target.png"));
	}
}
