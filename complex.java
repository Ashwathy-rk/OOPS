class complex {
	int real;
	int imaginary;
	complex (int r, int m) {
		r = real;
		m = imaginary;
	}
	void display(){
	             System.out.println(real+"+"+imaginary+"i");
               }
	public static complex add (complex n1, complex n2) {
		complex a = new complex (0,0);
		a.real= n1.real+n2.real;
		a.imaginary= n1.imaginary+n2.imaginary;
		return a;
	}
	public static void main (String args[]){
		complex c1= new complex (4,5);
		complex c2= new complex (2,3);
		complex a = add(c1, c2);
        System.out.println("\nAddition is:");
		a.display();
	}
}

