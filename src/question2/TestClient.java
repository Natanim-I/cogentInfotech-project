package question2;

import java.util.Scanner;

public class TestClient{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CLang c = new CLang();
		JavaLang java = new JavaLang();
		int MAX_PRIORITY = 10;
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(java);
		
		System.out.println("What is your favorite language : ");
		String favLang = sc.next();
		if(favLang.equals("Java") || favLang.equals("java")){
			t2.setPriority(MAX_PRIORITY);
		}else if(favLang.equals("c") || favLang.equals("C")) {
			t1.setPriority(MAX_PRIORITY);
		} else {}	
		
		t1.start();
		t2.start();
	}
}
