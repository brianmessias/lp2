class Circuferencia extends FiguraGeometrica{
	private double r;
	private double pi = 3.14;
	public void setR(double r){
		this.r = r;
	}
	public double getR(){
		return r;
	}
	public double perimetro(){
		return pi*getR()*2;
	}
	public double area(){
		return pi*Math.pow(r,2);
	}
}
