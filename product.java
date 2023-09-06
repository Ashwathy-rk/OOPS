class product {
	int pcode;
	String pname;
	int price;
	product(int c,String n, int p){
		pcode=c;
		pname=n;
		price=p;}
	void display(){
		System.out.println("Code"+pcode+"  Name:"+pname+"  Price:"+price);}
	public static void main(String args[]){
		product p1= new product(1,"abc",230);
		product p2= new product(2,"def",549);
		product p3= new product(3,"ghi",8716);
		p1.display();
		p2.display();
		p3.display();
		System.out.println(" ");
		if((p1.price< p2.price) && (p1.price< p3.price))
			System.out.println("Object 1 price is lowest"+p1.price);
		else if((p2.price< p1.price) && (p2.price< p3.price))
			System.out.println("Object 2 price is lowest"+p2.price);
		else
			System.out.println("Object 3 price is lowest"+p3.price);}
}

