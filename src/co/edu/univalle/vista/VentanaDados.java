/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.vista;

/**
 *
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 */
import co.edu.univalle.modelo.Jugador;
import co.edu.univalle.modelo.Partida;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class VentanaDados extends JFrame {

    private JPanel jpContenidoGeneral;
    private JLabel jlNombre1;
    private JLabel jlSumPuntaje1;
    private JLabel jlTirosRestantes1;
    private JButton btnLanzar;
    private JLabel jlDado1;
    private JLabel jlDado2;
    private Partida laPartida;

    
    public VentanaDados(Jugador jugador1, Jugador jugador2, int numLanzamientos){
        
        laPartida = new Partida(numLanzamientos,jugador1,jugador2);
        inciarComponentes();
        setSize(1000,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Jugando a de dados");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
          
    }
    
    private void inciarComponentes(){
        
        jpContenidoGeneral= new JPanel();
 
        
      
        jpContenidoGeneral.setBounds(0, 0, 519,530);
        jpContenidoGeneral.setLayout(null);
        jpContenidoGeneral.setBackground(Color.WHITE);
        add(jpContenidoGeneral);
        
        //todos los datos de jugador1
        
        JLabel jlNombre1 = new JLabel("Jugador 1: "+laPartida.getJugador1().getNombre());
        JLabel jlSumPuntaje1 = new JLabel(laPartida.getJugador1().getSumatoriaPuntos()+"");
        JLabel jlTirosRestantes1 = new JLabel ("Lanzamientos restantes: "+laPartida.getJugador1().getLanzamientosRestantes()+"");
        
        jlNombre1.setBounds(10,10, 200,20);
        jlNombre1.setForeground(new Color(0,87,193));
        jlNombre1.setFont(new Font("arial",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlNombre1);
        
                
        jlSumPuntaje1.setBounds(70,180, 200,70);
        jlSumPuntaje1.setForeground(new Color(45,87,193));
        jlSumPuntaje1.setFont(new Font("arial",Font.BOLD, 70)); 
        jpContenidoGeneral.add(jlSumPuntaje1);
        
        jlTirosRestantes1.setBounds(10,400, 200,20);
        jlTirosRestantes1.setForeground(new Color(0,87,193));
        jlTirosRestantes1.setFont(new Font("arial",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlTirosRestantes1);
        
        //todos los datos de jugador2
        
        JLabel jlNombre2 = new JLabel("Jugador 2: "+laPartida.getJugador1().getNombre());
        JLabel jlSumPuntaje2 = new JLabel(laPartida.getJugador1().getSumatoriaPuntos()+"");
        JLabel jlTirosRestantes2 = new JLabel ("Lanzamientos restantes: "+laPartida.getJugador1().getLanzamientosRestantes()+"");
        
        jlNombre2.setBounds(800,10, 200,20);
        jlNombre2.setForeground(new Color(0,87,193));
        jlNombre2.setFont(new Font("arial",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlNombre2);
        
                
        jlSumPuntaje2.setBounds(850,180, 200,70);
        jlSumPuntaje2.setForeground(new Color(45,87,193));
        jlSumPuntaje2.setFont(new Font("arial",Font.BOLD, 70)); 
        jpContenidoGeneral.add(jlSumPuntaje2);
        
        jlTirosRestantes2.setBounds(800,400, 200,20);
        jlTirosRestantes2.setForeground(new Color(0,87,193));
        jlTirosRestantes2.setFont(new Font("arial",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlTirosRestantes2);
        
     
        // Todo lo de botón lanzar
        
        btnLanzar = new JButton("LANZAR");
        btnLanzar.setBounds(400,450,200,50);
        btnLanzar.setFont(new Font("arial",Font.BOLD, 20));
        jpContenidoGeneral.add(btnLanzar);
        
        
        //todo lo de los dados
        
        jlDado1 = new JLabel(new ImageIcon("src/imagenes/1.jpg"));
        jlDado2 = new JLabel(new ImageIcon("src/imagenes/1.jpg"));
        
        jlDado1.setBounds(220,100,236,236);
        jlDado2.setBounds(520,100,236,236);
        
        jpContenidoGeneral.add(jlDado1);
        jpContenidoGeneral.add(jlDado2);
         
    }
}

