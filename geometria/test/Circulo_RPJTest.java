import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class Circulo_RPJTest {
private double radio;
private double area;
private double perimetro;
private String tipofigura;
//Constante pi
static final double PI = 3.1416;

public Circulo_RPJTest(double r, double a, double p, String figura){
	radio=r;
	area=a;
	perimetro=p;	
	tipofigura=figura;
	
}
@Parameters
public static Collection<Object[]> numeros(){
	
	return Arrays.asList(new Object [][]{
		{7,153.94,43.98,"Circulo"},{0,0,0,"Circulo"},{-3,28.27,18.85,"Circulo"}			
					
	});
	
}

	@Test
	public void testArea() {
		Circulo_RPJ circ=new Circulo_RPJ(radio, tipofigura);
		
		assertEquals(circ.area(), area, 0.01);
		}

	@Test
	public void testPerimetro() {
		Circulo_RPJ circ=new Circulo_RPJ(radio, tipofigura);
		
		assertEquals(circ.perimetro(), perimetro, 0.01);
		
	}

	

}
