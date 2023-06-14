public interfase Forma{
	public void dibujar(){
	}
}

public class Circulo implements Forma{
	@Override
	public void dibujar(){
	    System.out.println('Dibujando la forma');
	}
}

public class Rectangulo implements Forma{
	@Override

	public void dibujar(){

	    System.out.println('Dibujando la forma');

	}

}



public class Cuadrado implements Forma{

	@Override

	public void dibujar(){

	    System.out.println('Dibujando la forma');

	}

}



public class ShapeMaker{

	public void drawCircle(Circulo circulo){

		circulo.dibujar();

	}

	public void drawRectangle(Rectangulo rectangulo){

		rectangulo.dibujar();

	}

	public void drawSquare(Cuadrado cuadrado ){

		 cuadrado.dibujar();

	}

}



public class FacadeDemo{

	public void principal{

		ShapeMaker shapeMaker = new ShapeMaker ();

		shapeMaker.drawCircle();

		shapeMaker.drawRectangle();

		shapeMaker.drawSquare();

	}

}
