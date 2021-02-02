package in.edu.tint.cse;

public class A extends Thread {
	String name;
	int id;
	Thread t = null;

	public A(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.t = new Thread(this, name);
		System.out.println("I am constructor of A thread. id is " + id);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("I am a thread. id=>" + id + " counter =>" + i);
		print();
	}

	public void print() {
		System.out.println("Hello " + id);
	}
}
