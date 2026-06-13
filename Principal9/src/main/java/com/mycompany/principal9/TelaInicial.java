/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal9;

/**
 *
 * @author Heloisa Silva 2 DS/AMS
 */

import java.awt.*;
import javax.swing.*;

public class TelaInicial extends JFrame {

    JButton abrirCadastro;
    JLabel rotulo1;

    public TelaInicial() {

        Container tela = getContentPane();
        setTitle("Tela Inicial");
        setSize(300,250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        rotulo1 = new JLabel("INSS");
        rotulo1.setBounds(100,10,200,80);
        rotulo1.setFont(new  Font("Times New Roman",Font.BOLD,40));
        rotulo1.setForeground(Color.WHITE);

        abrirCadastro = new JButton("Cadastro");
        abrirCadastro.setBounds(95,120,100,20);
        abrirCadastro.setBackground(Color.WHITE);
        abrirCadastro.setForeground(Color.PINK);

        
        tela.setBackground(Color.pink);

        add(abrirCadastro);
        add(rotulo1);

        abrirCadastro.addActionListener(e -> {
            Cadastro1 cadastro = new Cadastro1();
            cadastro.setVisible(true);
            dispose();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
