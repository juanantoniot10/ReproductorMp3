package control;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Logica {
	private ImageIcon imagenReporductor;
	
	public Logica() {
		super();
		this.imagenReporductor = generarImagen();
	}

	private ImageIcon generarImagen() {
		return new ImageIcon("img/cd.png");
	}

	public ImageIcon getImagenReproductor() {
		return this.imagenReporductor;
	}

	public Icon getImagenReproductorPlay() {
		return new ImageIcon("img/cdPlay.gif");
	}

}
