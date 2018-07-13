package fileeditor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.io.StringReader;
import java.io.StringWriter;

public class TestIO {
    public static void printStream() throws FileNotFoundException, IOException {
        try (
                FileOutputStream fos = new FileOutputStream("tmp.txt");
                PrintStream ps = new PrintStream(fos)) {
            ps.println("��ͨ�ַ���\n");
            //�������
            ps.println(new TestIO());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("������");
                
    }
    public static void stringNode() throws IOException {
        String str = "�����ǵػ�\n"
                + "���������\n";
        char[] buf = new char[32];
        int hasRead = 0;
        //StringReader����String�ַ���Ϊ�ڵ��ȡ����
        try (StringReader sr = new StringReader(str)) {
            while ((hasRead = sr.read(buf)) > 0) {
                System.out.print(new String(buf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //����String��һ�����ɱ��࣬��˴���StringWriterʱ��ʵ��������һ��StringBuffer��Ϊ����ڵ�
        try (StringWriter sw = new StringWriter()) {
            sw.write("��ҹ�����Һ�ɫ���۾�\n");
            sw.write("��ȴ����Ѱ�ҹ���\n");
            //toString()����sw�ڵ��ڵ�����
            System.out.println(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void keyIn() throws IOException {
        try (
                //InputStreamReader�Ǵ�byteת��char������
                InputStreamReader reader = new InputStreamReader(System.in);
                //BufferedReader(Reader in)��char��������İ�װ��
                BufferedReader br = new BufferedReader(reader);
                ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    //System.exit(1);
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void pushback() throws FileNotFoundException, IOException {
        try (PushbackReader pr = new PushbackReader(new FileReader("C:/PROJECT/JavaBasic/PROJECT_JavaBasic/src/io/TestIO.java"),64)) {
            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pr.read(buf)) > 0) {
                String content = new String(buf, 0, hasRead);
                int targetIndex = 0;
                if ((targetIndex = (lastContent + content).indexOf("targetIndex = (lastContent + content)")) > 0) {
                    pr.unread((lastContent + content).toCharArray());
                    if (targetIndex > 32) {
                        buf = new char[targetIndex];
                    }
                    pr.read(buf , 0 , targetIndex);
                    System.out.println(new String(buf, 0 , targetIndex));
                    System.exit(0);
                } else {
                    System.out.println(lastContent);
                    lastContent = content;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        printStream();
        //stringNode();
        //keyIn();
		// pushback();
	}
}
