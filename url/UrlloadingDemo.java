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
		//�����Ӷ���
		URLConnection conn = url.openConnection();
		//InputStream getInputStream ���شӴ����Ӵ򿪵�������
		//���硪�����롪������
		InputStream is= conn.getInputStream();
//		Scanner sc = new Scanner(is);
//		while(sc.hasNextLine()){
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		Files.copy(is, Paths.get("target.png"));
	}
}
