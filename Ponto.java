public class Ponto{
	private double x,y;
		public Ponto(){
			System.out.println("\nConstrutor 1 \n" + this);
		}
		public Ponto(double x, double y){
			System.out.println("\nConstrutor 2 \n");
			this.x = x;
			this.y = y;
		}
		public void setX (double x){
			this.x = x;
		}
		public double getX (){
			return x;
		}
		public void setY (double y){
			this.y = y;
		}
		public double getY (){
			return y;
		}


	public static void main(String []args){
		System.out.println("Exercício 1 - Instanciar p1 e p2");
		Ponto p1 = new Ponto();
		p1.setX(10);
		p1.setY(20);
		Ponto p2 = new Ponto();
		p2.setX(15);
		p2.setY(30);
		System.out.println("\nPonto 1 :" + p1.getX() + " - " + p1.getY());
		System.out.println("Ponto 2 :" + p2.getX() + " - " + p2.getY() + "\n");
		
		System.out.println("Exercícío 2 - p3 adquirir os valores de p1");
		Ponto p3 = new Ponto();
		p3.setX(50);
		p3.setY(70);
		p3=p1;
		System.out.println("\nPonto 3 :" + p3.getX() + " - " + p3.getY() + "\n");
		Ponto p4 = p3;
		
		System.out.println("Exercício 3 - Distância entre p1 e p2");
		double c1,c2,h;
		c1 = p1.getX() - p2.getX();
		c2 = p1.getY() - p2.getY();
		c1 = c1*c1;
		c2 = c2*c2;
		h = Math.sqrt(c1 + c2);
		System.out.println("distância = " + h + "\n");
		
		System.out.println("Exercício 4 - Reta r1");
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		p1.setX(20);
		p2.setY(40);
		System.out.println("x = " + r1.getP1().getX() + " y = " + r1.getP2().getY() + "\n");
	}

}
