class Retangulo extends FiguraGeometrica{
	private double l1,l2;
	public void setL1(double l1){
		this.l1 = l1;
	}
	public void setL2(double l2){
		this.l2 = l2;
	}
	public double getL1(){
		return this.l1;
	}
	public double getL2(){
		return this.l2;
	}
	public double perimetro(){
		return  2*getL1() + 2*getL2();
	}
	public double area(){
		return getL1()*getL2();
	}
}
