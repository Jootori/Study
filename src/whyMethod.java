//   입력값에 따라 다른 값을 내놓는 메소드 만들기 
import java.io.FileWriter;
import java.io.IOException;

public class whyMethod {

	public static void main(String[] args) throws IOException {
	
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		
	}
		public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + text + "\n";
		out = out + text + "\n";
		out = out + delimiter + "\n";
		return out;
		
	
		}
}

