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
		// ��ʱ���ʽ�������� YYYY-MM-dd
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fileReader = new FileReader(name + df.format(new Date()).toString());
			char[] buffer = new char[100];
			int hasread = 0;
			if ((hasread = fileReader.read(buffer)) > 0) {
				// �ֽڶ�ȡ�����Ҵ�ӡ
				System.out.println(new String(buffer, 0, hasread));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CreateFile(String str) {
		// �������ڸ�ʽ
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		
			try {
				File uf = new File(str + df.format(new Date()).toString());
				// ���file�Ƿ��Ѿ�����
				System.out.println("newFile�Ƿ���ڣ�" + uf.exists());
				// �������򴴽��ļ�
				if (uf.exists() == false) {
				uf.createNewFile();
				System.out.println("newFile�������");
				// �ٴμ���ļ�Ӧ���Ѿ�����
				System.out.println("newFile�Ƿ���ڣ�" + uf.exists());
				// ��ӡ�ļ��ľ���·��
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
		System.out.println("�����ļ����ƣ�");
		while (sc.hasNext()) {
			String line = sc.nextLine();
			// ����������򴴽����ļ�
			System.out.println("-------------1.�����ļ��Ĳ�����-------------");
			CreateFile(line);
			// ���ļ���������д��
			System.out.println("-------------2.�����ļ�����д��Ĳ����� -------------");
			FileWrite(line);
			// ��ȡ�ļ�������
			System.out.println("-------------3.��ȡ�ļ��еľ����������£� -------------");
			FileRead(line);
		}
		sc.close();
	}

}
