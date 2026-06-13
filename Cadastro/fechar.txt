/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal9;

/**
 *
 * @author Heloisa 2 DS/AMS
 */

import java.awt.*;
import javax.swing.*;

public class TelaEncerramento extends JFrame {

    public TelaEncerramento() {

        Container tela = getContentPane();
        setTitle("Encerramento");
        setSize(300,150);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel msg = new JLabel("Cadastro cancelado.");
        msg.setBounds(80,40,150,30);
        
        tela.setBackground(Color.pink);

        add(msg);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
