package fileeditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileEditor {
	public static void FileRead(String name) {

		FileReader fileReader;
		// 对时间格式进行设置 YYYY-MM-dd
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fileReader = new FileReader(name + df.format(new Date()).toString());
			char[] buffer = new char[100];
			int hasread = 0;
			if ((hasread = fileReader.read(buffer)) > 0) {
				// 字节读取，并且打印
				System.out.println(new String(buffer, 0, hasread));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CreateFile(String str) {
		// 设置日期格式
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		
			try {
				File uf = new File(str + df.format(new Date()).toString());
				// 检查file是否已经存在
				System.out.println("newFile是否存在：" + uf.exists());
				// 不存在则创建文件
				if (uf.exists() == false) {
				uf.createNewFile();
				System.out.println("newFile创建完成");
				// 再次检测文件应当已经存在
				System.out.println("newFile是否存在：" + uf.exists());
				// 打印文件的绝对路径
				System.out.println(uf.getAbsoluteFile());
				}
				else {
					System.out.println("The file is already exists. ");
					System.out.println("----End of process!\n-----");
					System.exit(0);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 

	}

	private static void FileWrite(String filename) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
			FileOutputStream fos = new FileOutputStream(filename + df.format(new Date()).toString());
			PrintStream ps = new PrintStream(fos);
			while ((line = br.readLine()) != null) {
				if (line.equals("exit")) {
					break;
				}
				ps.print(line + "\n");
				// System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输文件名称：");
		while (sc.hasNext()) {
			String line = sc.nextLine();
			// 如果不存在则创建该文件
			System.out.println("-------------1.创建文件的操作：-------------");
			CreateFile(line);
			// 对文件进行内容写入
			System.out.println("-------------2.进行文件内容写入的操作： -------------");
			FileWrite(line);
			// 读取文件中内容
			System.out.println("-------------3.读取文件中的具体内容如下： -------------");
			FileRead(line);
		}
		sc.close();
	}

}
