package view;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Tela_cadastro extends JFrame{
	
	
	MaskFormatter formTEL = null; //add mascara
	MaskFormatter formCEL = null;
	MaskFormatter formCPF = null;
	MaskFormatter formCEP = null;
	MaskFormatter formRG = null;
	
	
	JTextField txtNome = new JTextField();
	JTextField txtEND = new JTextField();
	JTextField txtCIDADE = new JTextField();
	JTextField txtBAIRRO = new JTextField();
	JTextField txtTELE = new JTextField();
	JTextField txtRG = new JTextField();
	JRadioButton[] rdbSEX = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{
	rdbSEX[0] = new JRadioButton("Feminino");
	rdbSEX[1] = new JRadioButton("Masculino");}
	JTextField txtCEP = new JTextField();
	JComboBox cmbEST = new JComboBox();
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
	JLabel lblCPF = new JLabel("CPF:");
	
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
		
		
		try {
			formTEL = new MaskFormatter("(##)####-####");
			txtTELE = new JFormattedTextField(formTEL);
		} catch (Exception ext) {
			ext.printStackTrace();
		}
		txtTELE.setBounds(90, 180, 200, 30);
		paine.add(txtTELE);
		
		
		try {
			formRG = new MaskFormatter("##.###.###-A");
			txtRG = new JFormattedTextField(formRG);
		} catch (Exception exr) {
			exr.printStackTrace();
		}
		txtRG.setBounds(90, 220, 200, 30);
		paine.add(txtRG);
		
		grupo.add(rdbSEX[0]); 
		grupo.add(rdbSEX[1]);
		paine.add(rdbSEX[0]); 
		rdbSEX[0].setBounds(400, 20, 85, 30);
		paine.add(rdbSEX[1]);
		rdbSEX[1].setBounds(500, 20, 90, 30);
		
		try { 
			formCEP = new MaskFormatter("###-#####");
			txtCEP = new JFormattedTextField(formCEP);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		txtCEP.setBounds(400, 60, 185, 30);
		paine.add(txtCEP);
		
		paine.add(cmbEST);
		cmbEST.setBounds(400, 100, 185, 30);
		cmbEST.addItem("AC");		cmbEST.addItem("AL");
		cmbEST.addItem("AP");		cmbEST.addItem("AM");
		cmbEST.addItem("BA");		cmbEST.addItem("CE");
		cmbEST.addItem("DF");		cmbEST.addItem("ES");
		cmbEST.addItem("GO");		cmbEST.addItem("MA");
		cmbEST.addItem("MT");		cmbEST.addItem("MS");
		cmbEST.addItem("MG");		cmbEST.addItem("PA");
		cmbEST.addItem("PB");		cmbEST.addItem("PR");
		cmbEST.addItem("PE");		cmbEST.addItem("PI");
		cmbEST.addItem("RJ");		cmbEST.addItem("RN");
		cmbEST.addItem("RS");		cmbEST.addItem("RO");
		cmbEST.addItem("RR");		cmbEST.addItem("SC");
		cmbEST.addItem("SP");		cmbEST.addItem("SE");
		cmbEST.addItem("TO");	
		
		
		try {
			formCEL = new MaskFormatter("(##)#####-####");
			txtCEL = new JFormattedTextField(formCEL);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		txtCEL.setBounds(400, 140, 185, 30);
		paine.add(txtCEL);
		
		
		try {
			formCPF = new MaskFormatter("###.###.###-##");
			txtCPF = new JFormattedTextField(formCPF);
		} catch (Exception exf) {
			exf.printStackTrace();
		}
		txtCPF.setBounds(400, 180, 185, 30);
		paine.add(txtCPF);
		
		lblSEX.setBounds(320, 20, 200, 30);
		paine.add(lblSEX);
	
		lblCEP.setBounds(320, 60, 200, 30);
		paine.add(lblCEP);
		
		lblEST.setBounds(320, 100, 200, 30);
		paine.add(lblEST);
		
		lblCEL.setBounds(320, 140, 200, 30);
		paine.add(lblCEL);
		
		lblCPF.setBounds(320, 180, 200, 30);
		paine.add(lblCPF);
		
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
		this.setSize(615, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	public static void main(String args[]) {
		Tela_cadastro tela = new Tela_cadastro();
	}
}
