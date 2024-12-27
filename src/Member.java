class Field {
	static int classVar = 10;
		   int instanceVar = 20;
		   
	int method() {
		int localVar = 30;
		return localVar;
		
	}
}

public class Member{
	public static void main(String[] args) {
		System.out.println(Field.classVar);
		System.out.println();
		
		Field f1 = new Field();
		System.out.println(f1.instanceVar);
		System.out.println(f1.method());
		
	
		
	}

}
