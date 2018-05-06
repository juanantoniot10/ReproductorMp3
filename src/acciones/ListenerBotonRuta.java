package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.Logica;

public class ListenerBotonRuta implements ActionListener{

	private String ruta;
	private JLabel labelImagen;
	private Logica logica;
	
	
	public ListenerBotonRuta(JLabel labelImagen,Logica logica) {
		super();
		this.labelImagen = labelImagen;
		this.logica = logica;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		this.labelImagen.removeAll();
		this.labelImagen.setIcon(this.logica.getImagenReproductorPlay());
		this.ruta = String.valueOf(((JButton)e.getSource()).getText());
		try {
			Clip sonido = AudioSystem.getClip();
			File a = new File(ruta);
			sonido.open(AudioSystem.getAudioInputStream(a));
			sonido.start();
			}
			catch (Exception tipoerror) {
			System.out.println("" + tipoerror);
			}
	}

}
