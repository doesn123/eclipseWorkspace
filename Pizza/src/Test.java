
public class Test {
	
 public static void main(String[] args) {
	Pizza p = new Pizza(6,"napoletana");
	System.out.println(p.type);
 }
}
 
 class Pizza {
	 int taste;
	 String type;
	 
	 Pizza(int taste, String type){
		 this.taste = taste;
		 this.type = type;
	 
 }
}
