package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VistaPrincipal extends JFrame {
	protected JTextField textoNombreCancion;
	protected JPanel panelBotonesCanciones;
	protected JPanel panelImagen;
	protected JLabel lblTituloCancion;
	protected JProgressBar progressBar;
	protected JTextField textoRutaUsuario;
	protected JLabel labelImagen;
	
	public VistaPrincipal() {
		setMinimumSize(new Dimension(700, 370));
		setPreferredSize(new Dimension(499, 700));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 50));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblReproductorMp = new JLabel("REPRODUCTOR MP3");
		lblReproductorMp.setForeground(new Color(255, 255, 255));
		lblReproductorMp.setBackground(new Color(100, 149, 237));
		lblReproductorMp.setOpaque(true);
		lblReproductorMp.setHorizontalAlignment(SwingConstants.CENTER);
		lblReproductorMp.setFont(new Font("Euphemia", Font.ITALIC, 30));
		lblReproductorMp.setMinimumSize(new Dimension(99, 50));
		lblReproductorMp.setMaximumSize(new Dimension(9999, 50));
		panel.add(lblReproductorMp);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblBuscadorCancion = new JLabel("BUSCADOR CANCION");
		lblBuscadorCancion.setFont(new Font("Poor Richard", Font.BOLD, 14));
		lblBuscadorCancion.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscadorCancion.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuscadorCancion.setMaximumSize(new Dimension(500, 14));
		panel_2.add(lblBuscadorCancion);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JLabel lblIntroduceNombreDe = new JLabel("Introduce nombre de cancion");
		lblIntroduceNombreDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceNombreDe.setMaximumSize(new Dimension(500, 14));
		lblIntroduceNombreDe.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_3.add(lblIntroduceNombreDe);
		
		textoNombreCancion = new JTextField();
		textoNombreCancion.setText("despacito\r\n");
		textoNombreCancion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textoNombreCancion.setMaximumSize(new Dimension(500, 25));
		panel_3.add(textoNombreCancion);
		textoNombreCancion.setColumns(10);
		
		JLabel lblIntroduceRuta = new JLabel("Introduce ruta");
		lblIntroduceRuta.setMaximumSize(new Dimension(500, 14));
		lblIntroduceRuta.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIntroduceRuta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblIntroduceRuta);
		
		textoRutaUsuario = new JTextField();
		textoRutaUsuario.setText("c:\\\\users\\\\tuUsuario\\\\algo\\\\algo");
		textoRutaUsuario.setToolTipText("");
		textoRutaUsuario.setMaximumSize(new Dimension(500, 25));
		textoRutaUsuario.setColumns(10);
		textoRutaUsuario.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.add(textoRutaUsuario);
		
		panelBotonesCanciones = new JPanel();
		panelBotonesCanciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelBotonesCanciones.setBackground(new Color(255, 255, 255));
		panelBotonesCanciones.setAutoscrolls(true);
		panelBotonesCanciones.setMaximumSize(new Dimension(500, 4000));
		panel_3.add(panelBotonesCanciones);
		panelBotonesCanciones.setLayout(new BoxLayout(panelBotonesCanciones, BoxLayout.Y_AXIS));
		
		JPanel panelParaImagen = new JPanel();
		getContentPane().add(panelParaImagen, BorderLayout.CENTER);
		panelParaImagen.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panelParaImagen.add(panel_4, BorderLayout.NORTH);
		
		lblTituloCancion = new JLabel("titulo cancion");
		lblTituloCancion.setFont(new Font("MS PGothic", Font.BOLD, 18));
		panel_4.add(lblTituloCancion);
		
		panelImagen = new JPanel();
		panelParaImagen.add(panelImagen, BorderLayout.CENTER);
		
		labelImagen = new JLabel("");
		labelImagen.setMaximumSize(new Dimension(1000, 500));
		labelImagen.setIcon(new ImageIcon("C:\\Users\\jckdaniel\\eclipse-SegundaEvaluacionComponentesGraficos\\ReproductorMp3\\img\\cd.gif"));
		panelImagen.add(labelImagen);
		
		JPanel panelProgresBar = new JPanel();
		panelParaImagen.add(panelProgresBar, BorderLayout.SOUTH);
		panelProgresBar.setLayout(new BoxLayout(panelProgresBar, BoxLayout.X_AXIS));
		
		progressBar = new JProgressBar(0, obtenerSegundosCancion());
		progressBar.setMinimumSize(new Dimension(500, 24));
		progressBar.setMaximumSize(new Dimension(32767, 24));
		panelProgresBar.add(progressBar);
	}
	private int obtenerSegundosCancion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
