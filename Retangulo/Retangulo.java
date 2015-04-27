public class Retangulo{
	private int ladoA;
	private int ladoB;
	public void setLadoA(int lado){
		ladoA = lado;
	}
	public void setLadoB(int lado){
		ladoB = lado;
	}
	public int getLadoA(){
		return ladoA;
	}
	public int getLadoB(){
		return ladoB;
	}
	int perimetro (){
		return (ladoA*2 + ladoB*2);
	}
	int area (){
		return (ladoA*ladoB);
	}
}
