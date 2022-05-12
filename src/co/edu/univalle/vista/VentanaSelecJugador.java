
/**
 * Archivo: VentanaSelecJugador.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de la apariencia de la ventana incial que pide el modo de juego que queie jugar el usuario.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 * Profesor: Luis Yovany Romo Portilla
 * Grupo de FPOE: 01
 * Numero laboratorio: 1
 */

package co.edu.univalle.vista;

import co.edu.univalle.modelo.Jugador;
import co.edu.univalle.modelo.Partida;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaSelecJugador extends JFrame implements ActionListener {
    
    private JLabel jlEncabezado;
    private JButton btnJugadorVsJugador;
    private JButton btnJugadorVsMaquina;
    private Container panel;
    
    public VentanaSelecJugador(){
        iniciarComponentes();
        setSize(600,300);
        setVisible(true);
        setTitle("Selección de modo");
        setResizable(false);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
    private void iniciarComponentes(){
        //Cooper Black   Arial Rounded MT Bold  
        jlEncabezado = new JLabel("Selecciona cómo quieres jugar");
        jlEncabezado.setFont(new Font("Cooper Black",1,30)); 
        jlEncabezado.setForeground(Color.BLACK);
        
        btnJugadorVsJugador = new JButton ("jugador vs jugador");
        btnJugadorVsJugador.setFont(new Font("Arial Rounded MT Bold",1, 15));
        btnJugadorVsMaquina = new JButton ("jugador vs maquina");
        btnJugadorVsMaquina.setFont(new Font("Arial Rounded MT Bold",1, 15));
        
        panel = getContentPane();
        
        panel.setLayout(null);
        panel.setBackground(Color.white);
        
        panel.add(jlEncabezado);
        panel.add(btnJugadorVsJugador);
        panel.add(btnJugadorVsMaquina);
        
        btnJugadorVsJugador.setBounds(50, 180, 200, 50);
        btnJugadorVsJugador.setBackground(Color.black);
        btnJugadorVsJugador.setForeground(Color.white);
        btnJugadorVsMaquina.setBounds(350, 180, 200, 50);
        btnJugadorVsMaquina.setBackground(Color.black);
        btnJugadorVsMaquina.setForeground(Color.white);
        jlEncabezado.setBounds(40, 80, 610, 40);
        
        btnJugadorVsMaquina.addActionListener(this);
        btnJugadorVsJugador.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed (ActionEvent a){
        
        if(a.getSource()== btnJugadorVsJugador){
           VentanaPrePartida2 Prejuego= new VentanaPrePartida2();

        }else if(a.getSource()== btnJugadorVsMaquina){
           VentanaPrePartida1 Prejuego= new VentanaPrePartida1();
        }
        dispose();
  
    }
    
}
