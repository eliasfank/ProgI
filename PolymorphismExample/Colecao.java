import java.util.*;

public class Colecao{
	private Vector <Object> v;
	
	public Colecao(int a){
		v = new Vector <Object>(a);
	}
	
	public void addElemento(Object e){
		v.add(e);
	}
	
	public Object getElement(int a){
		if (a >= 0 && a < v.size())
		return v.elementAt(a);
		else
		return null;
	}
	
}
