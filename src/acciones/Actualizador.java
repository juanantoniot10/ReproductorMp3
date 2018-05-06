package acciones;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import control.Logica;

public class Actualizador {
	private JLabel labelImagen;
	private JProgressBar progressBar;
	private JPanel panelImagen;
	
	

	public Actualizador(JLabel labelImagen, JProgressBar progressBar, JPanel panelImagen) {
		super();
		this.labelImagen = labelImagen;
		this.progressBar = progressBar;
		this.panelImagen = panelImagen;
	}

	public void actualizar(ImageIcon icon){
  		actualizarLabelImagen(icon);
		actualizarProgressBar();
  		SwingUtilities.updateComponentTreeUI(labelImagen.getParent());
  	}

	private void actualizarProgressBar() {
		// TODO Auto-generated method stub
		
	}

	private void actualizarLabelImagen(ImageIcon icon) {
//		this.labelImagen.setIcon(icon);
		panelImagen.removeAll();
		labelImagen = new JLabel(icon);
		labelImagen.setMaximumSize(new Dimension(1000, 500));
		panelImagen.add(labelImagen);
	}
  	


}