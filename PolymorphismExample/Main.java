import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
	
	Colecao colect = new Colecao(10);
	Forma a[] = new Forma[10];

	a[0] = new Quadrado();
	a[0].setX(2);
	a[0].setY(2);
	((Quadrado)a[0]).setLado(3);
	colect.addElemento(a[0]);
	
	a[1] = new Circulo();
	a[1].setX(2);
	a[1].setY(2);
	((Circulo)a[1]).setRaio(2);
	colect.addElemento(a[1]);
	
	a[2] = new Quadrado();
	a[2].setX(3);
	a[2].setY(2);
	((Quadrado)a[2]).setLado(5);
	colect.addElemento(a[2]);
	
	double areaTotal=0,areaElemento=0;
	
	for(int i=0;i<10;i++){
		Forma elemento = null;
		if(colect.getElement(i) instanceof Forma)
			elemento = (Forma)(colect.getElement(i));
		if(elemento != null){
			if(elemento instanceof Quadrado)
				areaElemento = ((Quadrado)elemento).getArea();
			if(elemento instanceof Circulo)
				areaElemento = ((Circulo)elemento).getArea();
			
			areaTotal = areaTotal + areaElemento;
		}
	}
	
	System.out.println("Soma das áreas dos elementos: "+areaTotal);
	
	}
}
