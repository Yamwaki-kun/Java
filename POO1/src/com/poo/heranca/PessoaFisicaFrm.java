package com.poo.heranca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PessoaFisicaFrm extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCpf;
	private JTextField txtRg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PessoaFisicaFrm frame = new PessoaFisicaFrm();
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
	public PessoaFisicaFrm() {
		setTitle("Pessoa Fisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 375);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(97, 29, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(50, 32, 47, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(50, 63, 47, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(97, 60, 96, 20);
		contentPane.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(97, 98, 96, 20);
		contentPane.add(txtEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(97, 129, 96, 20);
		contentPane.add(txtTelefone);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(97, 166, 96, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(50, 101, 47, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(30, 132, 67, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(30, 169, 67, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(50, 200, 47, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(50, 235, 47, 14);
		contentPane.add(lblRg);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(97, 197, 96, 20);
		contentPane.add(txtCpf);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(97, 232, 96, 20);
		contentPane.add(txtRg);
		
		PessoaFisica pf = new PessoaFisica();
		
		JButton txtCad = new JButton("Cadastrar");
		txtCad.setBackground(Color.LIGHT_GRAY);
		txtCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(txtId.getText()));
				pf.setNome(txtNome.getText());
				pf.setEmail(txtEmail.getText());
				pf.setTelefone(txtTelefone.getText());
				pf.setEndereco(txtEndereco.getText());
				pf.setCpf(txtCpf.getText());
				pf.setRg(txtRg.getText());
				pf.cadastrar();
			}
		});
		txtCad.setBounds(62, 269, 131, 23);
		contentPane.add(txtCad);
	}
}
