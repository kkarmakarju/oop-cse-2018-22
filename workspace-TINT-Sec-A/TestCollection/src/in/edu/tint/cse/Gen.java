package in.edu.tint.cse;

public class Gen<Tem> {
	Tem obj;

	public Gen(Tem obj) {
		this.obj = obj;
	}

	Tem getObject() {
		return obj;
	}

	void print() {
		System.out.println(obj.getClass().getName());
	}
}
