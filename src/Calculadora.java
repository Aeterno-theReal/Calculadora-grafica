import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField pantalla;
	//var declaration
	private static int num1=-1, num2=-1;
	private static boolean primero=true;
	
	JButton botonigual;
	JButton botonmas;
	JButton boton0;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setColumns(10);
		
		
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("7");
			}
		});
		
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("8");
			}
		});
		
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("9");
			}
		});
		
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("4");
			}
		});
		
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("6");
			}
		});
		
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("0");
			}
		});
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("1");
			}
		});
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("2");
			}
		});
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("3");
			}
		});
		
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsacionDigito("5");
			}
		});
		
		botonmas = new JButton("+");
		botonmas.setEnabled(false);
		botonmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON MAS");
				if(pantalla.getText().length()>0)
				{
					botonmas.setEnabled(false);
					num1=Integer.parseInt(pantalla.getText());
					primero=true;
					botonigual.setEnabled(true);
				}
			}
		});
		
		botonigual = new JButton("=");
		botonigual.setEnabled(false);
		botonigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON IGUAL");
				int resul=0;
				num2=Integer.parseInt(pantalla.getText());
				System.out.println("num1: " + num1 + "; num2: " + num2);
				resul=num1+num2;
				pantalla.setText(resul + "");
				botonigual.setEnabled(false);
				primero=true;
			}
		});

		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(91)
							.addComponent(pantalla, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(boton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addComponent(boton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								.addComponent(boton4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(boton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(boton6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(boton8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(boton9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(botonmas))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(boton0, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addComponent(boton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addComponent(boton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addGap(63)
										.addComponent(botonigual))))
							.addGap(63)))
					.addGap(64))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(pantalla, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonmas))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(boton5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(boton6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(boton4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(boton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton0, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonigual))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void pulsacionDigito(String st)
	{
		if(primero)
		{
			pantalla.setText(st);
			botonmas.setEnabled(true);
			primero=false;
		}
		else
			pantalla.setText(pantalla.getText()+st);
	}
}
