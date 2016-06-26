package frsf.cidici.faia.chatBot.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import frsf.cidici.faia.chatBot.ChatbotInicial;
import frsf.cidisi.exercise.diagrama.search.Agente;
import frsf.cidisi.exercise.diagrama.search.Ambiente;
import frsf.cidisi.exercise.diagrama.search.EstadoAgente;
import frsf.cidisi.exercise.diagrama.search.EstadoAmbiente;
import frsf.cidisi.exercise.diagrama.search.SearchExtendido;
import frsf.cidisi.faia.solver.search.BreathFirstSearch;

public class Messenger {
	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private final static JTextArea escribe = new JTextArea();
	final static JLabel info = new JLabel();

	private static void createAndShowGUI() {
		// Create and set up the window.
		final JFrame frame = new JFrame("Messenger");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();

		// Avatar
		BufferedImage avatarRobot = null;
		try {
			avatarRobot = ImageIO.read(new File("C:\\walle.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Avatar
		BufferedImage avatarUser = null;
		try {
			avatarUser = ImageIO.read(new File("C:\\user.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 115x116
		JLabel avatarPanel = new JLabel(new ImageIcon(avatarRobot));
		JLabel avatarPanel2 = new JLabel(new ImageIcon(avatarUser));

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;

		frame.getContentPane().add(avatarPanel, c);

		c.gridx = 0;
		c.gridy = 2;
		frame.getContentPane().add(avatarPanel2, c);

		// Informacion inutil
		// final JLabel info = new JLabel();
		info.setText(
				"<html><h2>Agente IA (Disponible)</h2><h4><br />&ldquo;If a machine is expected to be infallible, it cannot also be intelligent.&rdquo; </h4></html>");

		c.gridx = 1;
		c.gridy = 0;

		frame.getContentPane().add(info, c);

		// Lo que escribe el chatbot
		// escribe = new JTextArea();
		escribe.setEditable(false);
		escribe.setLineWrap(true);
		// escribe.setAutoscrolls(true);s
		escribe.setText("");
		escribe.setSize(500, 50);

		JScrollPane scroll = new JScrollPane(escribe);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		c.ipady = 250;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 1;

		frame.getContentPane().add(scroll, c);

		// Donde escribo
		final JTextField escribo = new JTextField();
		c.ipady = 50;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 2;

		frame.getContentPane().add(escribo, c);

		// Boton enviar
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String respuesta = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":"
							+ Calendar.getInstance().get(Calendar.MINUTE) + ": " + "Usuario dice: \n"
							+ escribo.getText();

					escribe.setText(escribe.getText() + "\n" + respuesta);

					frame.repaint();

					ChatbotInicial.inicio(escribo.getText());

					escribo.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 2;

		enviar.setBackground(new Color(204, 204, 255));

		frame.getContentPane().add(enviar, c);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		// ChatbotInicial ct = new ChatbotInicial();
		// try {
		// ct.inicio("hola");
		// } catch (Exception e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public static void respuesta(String respuesta) {

		// try {
		// Thread.sleep(1500);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		respuesta = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":" + Calendar.getInstance().get(Calendar.MINUTE)
				+ ": " + "Wall-e dice: \n" + respuesta;
		escribe.setText(escribe.getText() + "\n" + respuesta);
	}

	public static void conexionViejo(String fin) {
		Agente agent = new Agente();
		Ambiente environment = new Ambiente();
		SearchExtendido simulator = new SearchExtendido(environment, agent);
		
		((EstadoAgente) agent.getAgentState()).setNodoDestinoNombre(fin.trim());
		((EstadoAmbiente) ((Ambiente) environment).getEnvironmentState()).setPosicionAgenteNombre("Mastil");

		agent.setEstrategia(new BreathFirstSearch());
		simulator.start();

		String test = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":"
				+ Calendar.getInstance().get(Calendar.MINUTE) + ": " + "Wall-e dice: \n"
				+ SearchExtendido.getInstrucciones();

		escribe.setText(test);
	}
}
