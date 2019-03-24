package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela_cadastro extends JFrame{
	JTextField txtNome = new JTextField();
	JTextField txtEND = new JTextField();
	JTextField txtCIDADE = new JTextField();
	JTextField txtBAIRRO = new JTextField();
	JTextField txtTELE = new JTextField();
	JTextField txtRG = new JTextField();
	JTextField txtCEP = new JTextField();
	JTextField txtCEL = new JTextField();
	JTextField txtCPF = new JTextField();
	
	
	JLabel lblNOME = new JLabel("NOME:");
	JLabel lblEND = new JLabel("ENDEREÇO:");
	JLabel lblCIDADE = new JLabel("CIDADE:");
	JLabel lblBAIRRO = new JLabel("BAIRRO:");
	JLabel lblTELE = new JLabel("TELEFONE:");
	JLabel lblRG = new JLabel("RG:");
	JLabel lblSEX = new JLabel("SEXO:");
	JLabel lblCEP = new JLabel("CEP:");
	JLabel lblEST = new JLabel("ESTADO:");
	JLabel lblCEL = new JLabel("CELULAR:");
	JLabel lblCPF = new JLabel("CPF");
	
	JButton btnSALV = new JButton("Salvar");
	JButton btnIMPRI = new JButton("Imprimir");
	
	
	public Tela_cadastro() {
		super("Tela cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtNome.setBounds(90, 20, 200, 30);
		paine.add(txtNome);
		
		txtEND.setBounds(90, 60, 200, 30);
		paine.add(txtEND);
		
		txtCIDADE.setBounds(90, 100, 200, 30);
		paine.add(txtCIDADE);
		
		txtBAIRRO.setBounds(90, 140, 200, 30);
		paine.add(txtBAIRRO);
		
		txtTELE.setBounds(90, 180, 200, 30);
		paine.add(txtTELE);
		
		txtRG.setBounds(90, 220, 200, 30);
		paine.add(txtRG);
		
		lblNOME.setBounds(10, 20, 200, 30);
		paine.add(lblNOME);
		
		lblEND.setBounds(10, 60, 200, 30);
		paine.add(lblEND);
		
		lblCIDADE.setBounds(10, 100, 200, 30);
		paine.add(lblCIDADE);
		
		lblBAIRRO.setBounds(10, 140, 200, 30);
		paine.add(lblBAIRRO);
		
		lblTELE.setBounds(10, 180, 200, 30);
		paine.add(lblTELE);
		
		lblRG.setBounds(10, 220, 200, 30);
		paine.add(lblRG);
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	public static void main(String args[]) {
		Tela_cadastro tela = new Tela_cadastro();
	}
}
