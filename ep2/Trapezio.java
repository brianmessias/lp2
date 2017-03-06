class Trapezio extends FiguraGeometrica{
	private double base1,base2,h ,l1, l2;
	public void setBase1(double base1){
		this.base1 = base1;
	}
	public void setBase2(double base2){
		this.base2 = base2;
	}
	public void setH(double h){
		this.h = h;
	}
	public double getBase1(){
		return this.base1;
	}
	public double getBase2(){
		return this.base2;
	}
	public double getH(){
		return this.h;
	}
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
		return getBase1() + getBase2() + getL1() + getL2();
	}
	public double area(){
		return ((getBase1() + getBase2())*getH())/2;
	}
}
