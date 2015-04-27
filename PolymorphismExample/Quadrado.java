public class Quadrado extends Forma{
	private int lado;
	
	public void setLado(int a){
		lado = a;
	}
	public int getLado(){
		return lado;
	}
	
	public double getArea(){
		return lado*lado;
	}
}
