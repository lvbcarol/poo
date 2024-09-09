/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligarDois;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author carol
 */
public class TelaInicial extends JFrame {
    public TelaInicial(){
        super("Turminha Semear");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        
        //Criação dos botôes para escolher a fase
        JButton fase1Button = new JButton("Cores");
        JButton fase2Button = new JButton("Letras");
        JButton fase3Button = new JButton("Números");
        JButton fase4Button = new JButton("Animais");
        
        //Adiciona os ouvintes de eventos aos btões
        fase1Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                iniciarFase(1);
            }
        });
        
        fase2Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                iniciarFase(2);
            }
        });
        
        fase3Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                iniciarFase(3);
            }
        });
        
        fase4Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                iniciarFase(4);
            }
        });
        
        //Adiciona os botões ao painel
        JPanel panel = new JPanel();
        panel.add(fase1Button);
        panel.add(fase2Button);
        panel.add(fase3Button);
        panel.add(fase4Button);
        
        //Adiciona o painel a tela
        add(panel);
        setVisible(true);
        
    }
    
    private void iniciarFase(int numeroFase) {
        System.out.println("Fase 1 - Cores");
    }
    
    public static void main(String[]args) {
        //inicia a tela inicial
        SwingUtilities.invokeLater(() -> new TelaInicial());
        
    }
}
