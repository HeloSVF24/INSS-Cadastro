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

public class TelaSucesso extends JFrame {

    public TelaSucesso() {

        Container tela = getContentPane();
        setTitle("Cadastro Realizado");
        setSize(300,150);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel msg = new JLabel("Cadastro realizado com sucesso!");
        msg.setBounds(40,40,220,30);
        
        tela.setBackground(Color.pink);

        add(msg);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
