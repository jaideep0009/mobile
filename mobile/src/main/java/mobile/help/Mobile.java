package mobile.help;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String brand;
	private String model;
	private int price;
	private String processor;
	
	public Mobile() {};
	
	public Mobile(int mobileId,String brand,String model,int price,String processor)
	{
		this.mobileId=mobileId;
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.processor=processor;
		
	}
	
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	@Override
	public String toString()
	{
		return("Mobile ["+" mobileId "+mobileId+" brand "+brand+" model "+model+" price "+price+" processor "+processor+"]");
	}

	
}
