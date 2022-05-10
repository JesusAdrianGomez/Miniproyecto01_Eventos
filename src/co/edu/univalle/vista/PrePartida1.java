/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Archivo: PrePartida1.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de la pedida de un nombre y el numero de tiros para modelar partidas.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 * Profesor: Luis Yovany Romo Portilla
 * Grupo de FPOE: 01
 * Numero laboratorio: 1
 */

package co.edu.univalle.vista;

import co.edu.univalle.modelo.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 */
public class PrePartida1 extends JFrame {
     private JPanel jpContenido;
    private JLabel jlNombre1;
    private JLabel jlLanzamientos;
    private JTextField txtPedirN1;
    private JTextField txtPedirLanzamientos;
    private JButton btnAceptar;
 

    
    public PrePartida1(){
        iniciarComponentes();
       
    }
    
    private void iniciarComponentes(){
        //Configuración de la ventana
        
        setTitle("ingrese el nombre");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        
        
        //Configuración del Encabezado
        jpContenido = new JPanel();      
        jpContenido.setBounds(0,0, 600, 400);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        
        jlNombre1 = new JLabel("Ingresa el primer nombre" );
        jlLanzamientos = new JLabel("Número de lanzamientos");
        
        jpContenido.add(jlNombre1);
        jpContenido.add(jlLanzamientos);
       
        
  
        
        jlNombre1.setBounds(150,10, 519,35);
        jlNombre1.setForeground(new Color(0,87,193));
        jlNombre1.setFont(new Font("arial", Font.BOLD, 20)); 
        
       
        
        jlLanzamientos.setBounds(150,170, 519,35);
        jlLanzamientos.setForeground(new Color(0,87,193));
        jlLanzamientos.setFont(new Font("arial", Font.BOLD, 20)); 
        
        
        btnAceptar = new JButton("ACEPTAR");
        btnAceptar.setBounds(200,290, 150,35);
        
        jpContenido.add(btnAceptar);
        
         
 
      
        
        
        
                
        txtPedirN1 = new JTextField();
        txtPedirN1.setHorizontalAlignment(JTextField.CENTER);
        txtPedirN1.setForeground(Color.GRAY);
        txtPedirN1.setFont(new Font("arial", Font.BOLD, 20)); 
        
        
        
        
        txtPedirLanzamientos = new JTextField();
        txtPedirLanzamientos.setHorizontalAlignment(JTextField.CENTER);
        txtPedirLanzamientos.setForeground(Color.GRAY);
        txtPedirLanzamientos.setFont(new Font("arial", Font.BOLD, 20)); 
       
        
        jpContenido.add(txtPedirN1);
        jpContenido.add(txtPedirLanzamientos);
  
        
        txtPedirN1.setBounds(75,50,410, 40);
        txtPedirLanzamientos.setBounds(75,210,410, 40);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnAceptar.addActionListener(manejadorEventos);
        txtPedirN1.addKeyListener(manejadorEventos);
        txtPedirLanzamientos.addKeyListener(manejadorEventos);
        
        txtPedirN1.requestFocusInWindow();
        
               
    }
    
    
    private void comenzarJuego(){
        String nombre = txtPedirN1.getText();
        String lanzamientos= txtPedirLanzamientos.getText();
        boolean integerOrNot1 = lanzamientos.matches("-?\\d+");
        boolean boolNombre = !nombre.trim().isEmpty() || nombre.trim().length() > 0;
        boolean boolLanza = (!lanzamientos.trim().isEmpty() || lanzamientos.trim().length() > 0)&&integerOrNot1&&Integer.parseInt(lanzamientos)>0;
        
        
        //int numLanzamientos = Integer.parseInt(txtPedirLanzamientos.getText());
        if(boolNombre&&boolLanza){
            int numLanzamientos = Integer.parseInt(lanzamientos);
            Jugador jugador1 = new Jugador(nombre,numLanzamientos,false);
            Jugador jugador2 = new Jugador("Maquina",numLanzamientos,true);
            dispose();                                  
            VentanaDados juego = new VentanaDados(jugador1, jugador2);
        }else if(boolLanza==false)
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese un numero correcto","Advertencia", JOptionPane.ERROR_MESSAGE);
            txtPedirLanzamientos.requestFocusInWindow();
        }  
            
                      
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnAceptar){                
                 comenzarJuego();
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/
            if(e.getKeyCode() == e.VK_ENTER){
                btnAceptar.doClick();
            }
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*System.out.println("Se presionó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
            
        }
        
        @Override
        public void keyTyped(KeyEvent e) {
            /*System.out.println("Se digitó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
        }
    }
    
}
