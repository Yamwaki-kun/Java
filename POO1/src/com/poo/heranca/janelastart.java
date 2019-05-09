package com.poo.heranca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelastart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelastart frame = new janelastart();
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
	public janelastart() {
		setTitle("Cadastrar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastro Pessoa Fisica");
		PessoaFisica pf = new PessoaFisica();
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PessoaFisicaFrm jpf = new PessoaFisicaFrm();
				jpf.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 95, 186, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCadastroPessoaJuridica = new JButton("Cadastro Pessoa Juridica");
		btnCadastroPessoaJuridica.setBackground(Color.LIGHT_GRAY);
		btnCadastroPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PessoaJuridicaFrm jpf = new PessoaJuridicaFrm();
				jpf.setVisible(true);
			}
		});
		btnCadastroPessoaJuridica.setBounds(238, 95, 186, 37);
		contentPane.add(btnCadastroPessoaJuridica);
	}

}
