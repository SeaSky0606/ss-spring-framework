package seasky.spring.framework.fruit;

public class Apple {
	
	private String ssid;
	private String producer;
	private double price;
	
	
	public String getSsid() {
		return ssid;
	}


	public void setSsid(String ssid) {
		this.ssid = ssid;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Apple(String ssid, String producer, double price) {
		super();
		this.ssid = ssid;
		this.producer = producer;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Apple [ssid=" + ssid + ", producer=" + producer + ", price="
				+ price + "]";
	}
	
	

}
