package in.edu.tint.cse.sample.comp;

public class Item implements Comparable<Item>{
	int id;
	String name;
	double price;

	public Item(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.price = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Item o) {
		if (id == o.id)
			return 0;
		else if (id > o.id)
			return 1;
		else
			return -1;
	}

}
