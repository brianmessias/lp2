public class Ponto{
	private double x,y;
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
		Ponto p1 = new Ponto();
		p1.setX(10);
		p1.setY(20);
		Ponto p2 = new Ponto();
		p2.setX(15);
		p2.setY(30);
		System.out.println(p1.getX() + " - " + p1.getY());
		System.out.println(p2.getX() + " - " + p2.getY());
		Ponto p3 = new Ponto();
		p3.setX(50);
		p3.setY(70);
		p3=p1;
		System.out.println(p3.getX() + " - " + p3.getY());
		Ponto p4 = p3;
		double c1,c2,h;
		c1 = p1.getX() - p2.getX();
		c2 = p1.getY() - p2.getY();
		c1 = c1*c1;
		c2 = c2*c2;
		h = Math.sqrt(c1 + c2);
		System.out.println("Distância:" + h);

		System.out.println("Brian Messias");
	}

}
