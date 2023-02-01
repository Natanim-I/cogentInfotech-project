package question2;
/**
 * @author : Natanim
 *
 * @date : Feb 1, 2023
 * 
 * @Description : A class that implements a user-defined Interface and the Multithreading
 *  			Runnable interface to achieve the concept of multithreading. 
 */

public class CLang implements Language, Runnable{

	@Override
	public void showMessage() { // method implementation of user defined interface abstract method
		System.out.println("C program is running");
	}

	@Override
	public void run() {
		showMessage();
	}

}
