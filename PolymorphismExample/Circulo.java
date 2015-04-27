import java.lang.*;
public class Circulo extends Forma{
	private int raio;
	
	public void setRaio(int a){
		raio = a;
	}
	public int getRaio(){
		return raio;
	}
	public double getArea(){
		return Math.PI*(raio*raio);
	}
	
}
