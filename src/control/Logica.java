package control;

import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

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

	public ImageIcon getImagenReproductorPlay() {
		return new ImageIcon("img/cdPlay.gif");
	}
	public ImageIcon obtenerImagenRandom() {
		return new ImageIcon("img/imagen_"+crearRandom(0, 4)+".gif");
	}
	public int crearRandom(int min,int max) {
		int numeroAleatorio=((int)(Math.random()*((max-min)+1)))+min;
		return numeroAleatorio;
	}
}
