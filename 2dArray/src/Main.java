import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("banana");
		food.add("orange");
		
		food.set(0, "pineapple");
		food.remove(1);
		
		ArrayList<String> beverage = new ArrayList<String>();
		beverage.add("coke");
		beverage.add("pepsi");
		
		ArrayList<String> snacks = new ArrayList<String>();
		snacks.add("crisps");
		snacks.add("bombay mix");
		
		ArrayList<ArrayList<String>> todoList = new ArrayList();
		todoList.add(food);
		todoList.add(beverage);
		todoList.add(food);
		
		System.out.println(todoList);
		
	}
}
