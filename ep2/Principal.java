class Principal{
	public static void main (String[] args){
		System.out.println("Triangulo:");
		Triangulo A = new Triangulo();
		A.setL1(2);
		A.setL2(2);
		A.setBase(2);
		A.setH(2);
		System.out.println(" Perimetro: " + A.perimetro() + "\n Area: " + A.area());

		System.out.println("\nRetangulo:");
		Retangulo B = new Retangulo();
		B.setL1(2);
		B.setL2(4);
		System.out.println(" Perimetro: " + B.perimetro() + "\n Area: " + B.area());

		System.out.println("\nQuadrado:");
		Quadrado C = new Quadrado();
		C.setL(4);
		System.out.println(" Perimetro: " + C.perimetro() + "\n Area: " + C.area());

		System.out.println("\nCircuferência:");
		Circuferencia D = new Circuferencia();
		D.setR(2);
		System.out.println(" Perimetro: " + D.perimetro() + "\n Area: " + D.area());

		System.out.println("\nTrapézio: ");
		Trapezio E = new Trapezio();
		E.setBase1(2);
		E.setBase2(4);
		E.setH(2);
		E.setL1(4);
		E.setL2(1);
		System.out.println(" Perimetro: " + E.perimetro() + "\n Area: " + E.area());
	 
	}
}
