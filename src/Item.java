//Azhar k
//azharazvtp@gmail.com


public class Item {
	private String type;
	private String name;
	private int price;
	private int count;
	private int id;
	
	//constructer to initialize details of each item
	public Item(int id,String type,String name, int price, int count) {
		super();
		this.name=name;
		this.id=id;
		this.type = type;
		this.price = price;
		this.count = count;
	}
	
	
	//getters and setters for each attribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
