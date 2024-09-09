/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligarDois;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author carol
 */
public class Fase1 extends JFrame {
    private JButton cartaSelecionada1 = null;
    private JButton cartaSelecionada2 = null;
    
    public Fase1(){
        super("Fase 1");
        setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        //Crie os botões para representar as cartas do jogo
        JButton[] cartas = new JButton[8];
        for (int i = 0; i < 8, i++) {
            cartas[i] = new JButton("Carta" + (i + ));
            cartas[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selecionarCarta(JButton) e.getSource()
                            }
            });
        }
        
        //Adicionar os botôes no painel
        JPanel panel = new JPanel(new GridLayout(2, 4));
        for (JButton carta : cartas) {
            panel.add(carta);
        }
        
        //Adicionar o painel a tela
        add(panel);
        setVisible(true);
    }
    
    private void selecionarCarta(JButton carta) {
        if (cartaSelecionada1 == null){
            cartaSelecionada1 = carta;
            carta.setText("Carta Selecionada");
        } else if (cartaSelecionada2 == null && !carta.equals(cartaSelecionada1)) {
            cartaSelecionada2 = carta;
            carta.setText("Carta selecionada");
            
            //Verifica se é o par correto
            if (cartaSelecionada1.getText().equals(cartaSElecionada2.getText())) {
                JOptionPane.showMessageDialog(this, "Par encontrado!");
            } else {
                Timer timer = new Timer(1000, new ActionListener()) {
                    public void actionPerformed(ActionEvent e) {
                        cartaSelecionada1.setText("");
                        cartaSelecionada2.setText("");
                        cartaSelecionada1 = null;
                        cartaSelecionada2 = null;
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Fase1());
    }

    private void setDefaultCloseOPeration(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRElativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
