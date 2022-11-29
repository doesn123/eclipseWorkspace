class Player {
	
	public static void main(String[] args) {
	Integer x;	

	myGeneric<Integer> myInt = new myGeneric<>(3);
	myGeneric<Double> myDouble = new myGeneric<> (5.3);
	System.out.println(myDouble.getValue());
	System.out.println(myInt.getValue());
	}

}