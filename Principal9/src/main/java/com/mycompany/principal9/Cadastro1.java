/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal9;

/**
 *
 * @author Heloisa Silva 2 DS/AMS
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Cadastro1 extends JFrame {

    JButton cadastrar;
    JButton limpar;
    JButton fechar;

    ImageIcon icone1;
    ImageIcon icone2;
    ImageIcon icone3;

    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6,
           rotulo7, rotulo8, rotulo9, rotulo10, rotulo11, rotulo12;

    JTextField texto1, texto2, texto3, texto4, texto5,
               texto6, texto7, texto8, texto9, texto10;

    JRadioButton masculino, feminino;
    ButtonGroup grupoSexo;

    JComboBox lista;

    String cidades[] = {
        "", "AC", "AP", "AM", "PA", "RO", "RR", "TO",
        "AL", "BA", "CE", "MA", "PB", "PE", "PI", "RN", "SE",
        "GO", "MT", "MS", "DF", "ES", "MG", "RJ", "SP",
        "PR", "RS", "SC"
    };

    public Cadastro1() {

        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("Código do cliente:");
        rotulo2 = new JLabel("Nome completo:");
        rotulo3 = new JLabel("Endereço:");
        rotulo4 = new JLabel("Bairro:");
        rotulo5 = new JLabel("Cidade:");
        rotulo6 = new JLabel("Estado:");
        rotulo7 = new JLabel("C.E.P:");
        rotulo8 = new JLabel("Sexo:");
        rotulo9 = new JLabel("Celular:");
        rotulo10 = new JLabel("Telefone:");
        rotulo11 = new JLabel("Data de Aniversário:");
        rotulo12 = new JLabel("Data do Cadastro:");

        lista = new JComboBox(cidades);
        lista.setEditable(true);
        lista.setMaximumRowCount(5);
        lista.setBounds(160, 220, 210, 20);

        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");

        grupoSexo = new ButtonGroup();
        grupoSexo.add(masculino);
        grupoSexo.add(feminino);

        masculino.setBounds(160, 300, 100, 20);
        feminino.setBounds(260, 300, 100, 20);

        texto1 = new JTextField(60);
        texto2 = new JTextField(60);
        texto3 = new JTextField(60);
        texto4 = new JTextField(60);
        texto5 = new JTextField(60);
        texto6 = new JTextField(60);
        texto7 = new JTextField(60);
        texto8 = new JTextField(60);
        texto9 = new JTextField(60);
        texto10 = new JTextField(60);

        rotulo1.setBounds(30, 20, 170, 20);
        rotulo2.setBounds(30, 60, 170, 20);
        rotulo3.setBounds(30, 100, 170, 20);
        rotulo4.setBounds(30, 140, 170, 20);
        rotulo5.setBounds(30, 180, 170, 20);
        rotulo6.setBounds(30, 220, 170, 20);
        rotulo7.setBounds(30, 260, 170, 20);
        rotulo8.setBounds(30, 300, 170, 20);
        rotulo9.setBounds(30, 340, 170, 20);
        rotulo10.setBounds(30, 380, 170, 20);
        rotulo11.setBounds(30, 420, 170, 20);
        rotulo12.setBounds(30, 460, 170, 20);

        texto1.setBounds(160, 20, 210, 20);
        texto2.setBounds(160, 60, 210, 20);
        texto3.setBounds(160, 100, 210, 20);
        texto4.setBounds(160, 140, 210, 20);
        texto5.setBounds(160, 180, 210, 20);
        texto6.setBounds(160, 260, 210, 20);
        texto7.setBounds(160, 340, 210, 20);
        texto8.setBounds(160, 380, 210, 20);
        texto9.setBounds(160, 420, 210, 20);
        texto10.setBounds(160, 460, 210, 20);

        icone1 = new ImageIcon("registration2.GIF");
        cadastrar = new JButton("Cadastrar", icone1);
        cadastrar.setBounds(30, 500, 130, 20);

        icone2 = new ImageIcon("trash.GIF");
        limpar = new JButton("Limpar", icone2);
        limpar.setBounds(170, 500, 100, 20);

        icone3 = new ImageIcon("Close.GIF");
        fechar = new JButton("Fechar", icone3);
        fechar.setBounds(280, 500, 110, 20);

        // EVENTO CADASTRAR
cadastrar.addActionListener(e -> {

    if (!texto1.getText().isEmpty()
            && !texto2.getText().isEmpty()
            && !texto3.getText().isEmpty()) {

        String sexo = "";

        if (masculino.isSelected()) {
            sexo = "Masculino";
        } else if (feminino.isSelected()) {
            sexo = "Feminino";
        }

        String dados =
                "Código: " + texto1.getText() +
                "\nNome: " + texto2.getText() +
                "\nEndereço: " + texto3.getText() +
                "\nBairro: " + texto4.getText() +
                "\nCidade: " + texto5.getText() +
                "\nEstado: " + lista.getSelectedItem() +
                "\nCEP: " + texto6.getText() +
                "\nSexo: " + sexo +
                "\nCelular: " + texto7.getText() +
                "\nTelefone: " + texto8.getText() +
                "\nData de Aniversário: " + texto9.getText() +
                "\nData do Cadastro: " + texto10.getText();

        JOptionPane.showMessageDialog(
                null,
                dados,
                "Dados Cadastrados",
                JOptionPane.INFORMATION_MESSAGE
        );

        TelaSucesso telaSucesso = new TelaSucesso();
        telaSucesso.setVisible(true);

        dispose();

    } else {

        JOptionPane.showMessageDialog(
                null,
                "Preencha os campos obrigatórios!"
        );
    }
  });

        // EVENTO FECHAR
        fechar.addActionListener(e -> {

            TelaEncerramento telaEncerramento = new TelaEncerramento();
            telaEncerramento.setVisible(true);

            dispose();
        });

        // EVENTO LIMPAR
        limpar.addActionListener(e -> {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");
        texto9.setText("");
        texto10.setText("");

        grupoSexo.clearSelection();

        lista.setSelectedIndex(0); // limpa o estado
     });

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulo9);
        tela.add(rotulo10);
        tela.add(rotulo11);
        tela.add(rotulo12);

        tela.add(masculino);
        tela.add(feminino);

        tela.add(lista);

        tela.add(cadastrar);
        tela.add(limpar);
        tela.add(fechar);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);
        tela.add(texto9);
        tela.add(texto10);


        adicionarPlaceholder(texto1, "XXXXXX");
        adicionarPlaceholder(texto2, "Nome e Sobrenome");
        adicionarPlaceholder(texto3, "Rua (nome da rua)");
        adicionarPlaceholder(texto4, "(nome do bairro)");
        adicionarPlaceholder(texto5, "(nome da cidade)");
        adicionarPlaceholder(texto6, "XXXXX-XXX");
        adicionarPlaceholder(texto7, "(xx) xxxxx-xxxx");
        adicionarPlaceholder(texto8, "(xx) xxxx-xxxx");
        adicionarPlaceholder(texto9, "xx/xx/xxxx");
        adicionarPlaceholder(texto10, "xx/xx/xxxx");

        setSize(425, 590);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void adicionarPlaceholder(JTextField campo, String texto) {

        campo.setText(texto);
        campo.setForeground(Color.GRAY);

        campo.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(texto)) {
                    campo.setText("");
                    campo.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(texto);
                    campo.setForeground(Color.GRAY);
                }
            }
        });
    }

    public static void main(String[] args) {
        Cadastro1 app = new Cadastro1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}