package swaraj;

public class Food {
	int orderNumber;
	int costOFOrder;
	float weight;
	String taste;

	public Food(int orderNumber, int costOFOrder, float weight, String taste) {
		super();
		System.out.println("Calling food constructor");
		this.orderNumber = orderNumber;
		this.costOFOrder = costOFOrder;
		this.weight = weight;
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Food [orderNumber=" + orderNumber + ", costOFOrder=" + costOFOrder + ", weight=" + weight + ", taste="
				+ taste + ", toString()=" + super.toString() + "]";
	}

	void available() {
		System.out.println("Welcome!! The Food is available");
	}

	void order(String foodName) {
		System.out.println("I want to order.." + foodName);
	}

	float bill() {
		float c = costOFOrder * weight;
		return c;
	}

	int feedback() {
		System.out.println("kindly Give Feedback between 1 to 10");
		return 5;

	}

	public static void main(String[] args) {

		Food f1 = new Food(101, 5, 10, "sweet");
		f1.available();
		System.out.println(f1.toString());
		f1.order("Tea");
		System.out.println("Your Bill for this order is:" + f1.bill());
		System.out.println("Thanks for your response:" + f1.feedback());
		System.out.println("-------------------------------------------");
		Nonveg nv = new Nonveg(102, 50, 5, "Spicy", "Mutton");
		System.out.println(nv.toString());
		nv.order("Mutton biriyani");
		System.out.println("Your Bill for this order is:" + nv.bill());
		System.out.println("Thanks for your response:" + nv.feedback());
		System.out.println("-------------------------------------------");

		Seafood sf = new Seafood(103, 500, 3, "Sour", "Lobster", "Thai");
		System.out.println(sf.toString());
		sf.order("Lobster soup");
		System.out.println("Your Bill for this order is:" + sf.bill());
		System.out.println("Thanks for your response:" + sf.feedback());
		System.out.println("-------------------------------------------");

	}

}

class Nonveg extends Food {
	private String type;

	public Nonveg(int orderNumber, int costOFOrder, float weight, String taste, String type) {
		super(orderNumber, costOFOrder, weight, taste);
		this.type = type;
		System.out.println("Calling Nonvegfood constructor");
	}

	@Override
	public String toString() {
		return "Nonveg [type=" + type + ", toString()=" + super.toString() + "]";
	}
}

class Seafood extends Nonveg {
	private String cuisine;

	public Seafood(int orderNumber, int costOFOrder, float weight, String taste, String type, String cuisine) {
		super(orderNumber, costOFOrder, weight, taste, type);
		this.cuisine = cuisine;
		System.out.println("Calling seafood constructor");
	}

	@Override
	public String toString() {
		return "Seafood [cuisine=" + cuisine + ", toString()=" + super.toString() + "]";
	}
}