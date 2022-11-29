
public class Car {
 private String make;
 Car car;
 
 Car(String make, String model, int year){
	 this.make = make;
	 this.model = model;
	 this.year = year;
 }
 public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

private String model;
 private int year;
 
 
 void setMake(String make) {
	 this.make = make;
 }
 
 String getMake() {
	 return make;
 }

 public void copy(Car x) {
	 this.setMake(x.getMake());
 }
 
}
