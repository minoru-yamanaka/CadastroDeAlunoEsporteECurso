import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Tela1 extends JFrame {
	private JLabel lblNewLabel;
	private JTextField txtNome;
	private JLabel lblEsporte;
	private JCheckBox chkFutebol;
	private JCheckBox chkBasquete;
	private JLabel txtPeriodo;
	private JRadioButton rdbMatutino;
	private final ButtonGroup btgPeriodo = new ButtonGroup();
	private JRadioButton rdbVespertino;
	private JRadioButton rdbNoturno;
	private JLabel lblCurso;
	private JComboBox cmbCurso;
	private JButton btnMostrar;
	private JButton btnLimpar;
	private TextArea txtMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		setTitle("Trabalhando com Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(27, 23, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(81, 20, 323, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		lblEsporte = new JLabel("Esporte preferido");
		lblEsporte.setForeground(new Color(0, 128, 255));
		lblEsporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEsporte.setBounds(27, 48, 119, 14);
		getContentPane().add(lblEsporte);
		
		chkFutebol = new JCheckBox("Futebol");
		chkFutebol.setForeground(Color.RED);
		chkFutebol.setFont(new Font("Tahoma", Font.BOLD, 11));
		chkFutebol.setBounds(149, 44, 83, 23);
		getContentPane().add(chkFutebol);
		
		chkBasquete = new JCheckBox("Basquete");
		chkBasquete.setForeground(Color.RED);
		chkBasquete.setFont(new Font("Tahoma", Font.BOLD, 11));
		chkBasquete.setBounds(239, 44, 97, 23);
		getContentPane().add(chkBasquete);
		
		txtPeriodo = new JLabel("Período");
		txtPeriodo.setForeground(new Color(0, 128, 255));
		txtPeriodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPeriodo.setBounds(27, 73, 119, 14);
		getContentPane().add(txtPeriodo);
		
		rdbMatutino = new JRadioButton("Matutino");
		btgPeriodo.add(rdbMatutino);
		rdbMatutino.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbMatutino.setBounds(149, 70, 83, 23);
		getContentPane().add(rdbMatutino);
		
		rdbVespertino = new JRadioButton("Vespertino");
		btgPeriodo.add(rdbVespertino);
		rdbVespertino.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbVespertino.setBounds(239, 70, 97, 23);
		getContentPane().add(rdbVespertino);
		
		rdbNoturno = new JRadioButton("Noturno");
		btgPeriodo.add(rdbNoturno);
		rdbNoturno.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbNoturno.setBounds(338, 70, 83, 23);
		getContentPane().add(rdbNoturno);
		
		lblCurso = new JLabel("Curso");
		lblCurso.setForeground(new Color(0, 128, 255));
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(27, 97, 46, 14);
		getContentPane().add(lblCurso);
		
		cmbCurso = new JComboBox();
		cmbCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Selecione o curso ", "Análise e Desenvolvimento de Sistemas ", "Gestão da Tecnologia da Informação ", "Redes de Computadores"}));
		cmbCurso.setBounds(81, 98, 323, 18);
		getContentPane().add(cmbCurso);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão Mostrar
				txtMostrar.setText(txtNome.getText()+"\n"); //setText-> escreve apenas para uma linha check so usa -> if 
				
				//CheckBox
				if(chkFutebol.isSelected())
					txtMostrar.append("Futebol\n");
				if(chkFutebol.isSelected())
					txtMostrar.append("Basquete\n");
				
				//RadioButton
				if(rdbMatutino.isSelected())
					txtMostrar.append("Matutino\n");
				else if(rdbVespertino.isSelected())
					txtMostrar.append("Vespertino\n");
				else if(rdbNoturno.isSelected())
					txtMostrar.append("Noturno\n");
				
				//comboBox
				//txtMostrar.append((String)cmbCurso.getSelectedItem()); //(String) <- converte para string 
				if (cmbCurso.getSelectedIndex()>0 )
					txtMostrar.append((String)cmbCurso.getSelectedItem());
				else 
					JOptionPane.showMessageDialog(null, "Selecione uma opção desejada");
				
				
				
			}
		});
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMostrar.setBounds(25, 126, 184, 23);
		getContentPane().add(btnMostrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.setBounds(220, 126, 184, 23);
		getContentPane().add(btnLimpar);
		
		txtMostrar = new TextArea();
		txtMostrar.setBounds(24, 155, 380, 96);
		getContentPane().add(txtMostrar);

	}
}
