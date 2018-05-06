package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import control.Logica;

public class ListenerBotonRuta implements ActionListener{

	private String ruta;
	private Logica logica;
	private Actualizador actualizador;
	private Clip sonido;
	private JLabel labelImagen;
	
	
	public ListenerBotonRuta(Logica logica, Actualizador actualizador,JLabel labelImagen) {
		super();
		this.logica = logica;
		this.actualizador = actualizador;
		this.labelImagen = labelImagen;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		actualizador.actualizar(this.logica.getImagenReproductorPlay());
		this.ruta = String.valueOf(((JButton)e.getSource()).getText());
		try {
			sonido = AudioSystem.getClip();
			File a = new File(ruta);
			sonido.open(AudioSystem.getAudioInputStream(a));
			sonido.start();
			}
		catch (Exception tipoerror) {
			System.out.println("" + tipoerror);
		}
			SwingWorker<Object, Object> worker=  new SwingWorker<Object, Object>(){
			@Override
			protected Object doInBackground() throws Exception {
				while(sonido.isActive()) {
					Thread.sleep(4000);
					actualizador.actualizar(logica.obtenerImagenRandom());
				}
				return null;
			}
		};
		worker.execute();
			
	}
		
}
