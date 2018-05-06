package control;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;

import acciones.Actualizador;
import acciones.ListenerBotonRuta;
import acciones.ListenerBusqueda;
import vista.VistaPrincipal;

public class Puente extends VistaPrincipal{
	private Logica logica;
	private ListenerBusqueda listenerBusqueda;
	private ListenerBotonRuta listenerBotonRuta;
	private Actualizador actualizador;

	public Puente() {
		super();
		this.logica = new Logica();
		this.actualizador = new Actualizador(this.labelImagen,this.progressBar,this.panelImagen);
		this.listenerBotonRuta = new ListenerBotonRuta(this.logica,this.actualizador,this.labelImagen);
		this.listenerBusqueda = new ListenerBusqueda(panelBotonesCanciones,listenerBotonRuta,this.textoNombreCancion,this.textoRutaUsuario);
		this.panelImagen.add(new JLabel(this.logica.getImagenReproductor()));
		this.textoNombreCancion.addActionListener(listenerBusqueda);
		this.textoRutaUsuario.addActionListener(listenerBusqueda);
		aniadirAudiosIncluidos();
	}

	private void aniadirAudiosIncluidos() {
		File audios = new File("audios");
		for (int i = 0; i < audios.listFiles().length; i++) {
			JButton botonRuta = new JButton(audios.listFiles()[i].getPath());
			botonRuta.setMaximumSize(new Dimension(500, 15));
			botonRuta.addActionListener(listenerBotonRuta);
			panelBotonesCanciones.add(botonRuta);
		}
		
	}
	
}
