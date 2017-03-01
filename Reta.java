public class Reta{
	private Ponto p1,p2;
	
	public void setP1(Ponto p){
		this.p1 = p;
	}
	public Ponto getP1(){
		return this.p1;
	}
	public void setP2(Ponto p){
		this.p2 = p;
	}
	public Ponto getP2(){
		return this.p2;
	}
	public double Area(double p1x, double p1y, double p2x, double p2y){
		return ((Math.abs(p2x-p1x)*Math.abs(p1y-p2y)/2)+Math.abs(p2x-p1x)*p2y);
	}
}
