/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Archivo: PrePartida2.java
 * Fecha de Creación: 07/05/2022
 * 

 * Esta clase es la encargada de modelar la pedida de nombres y numero de tiros para las partidas.
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
import java.awt.Image;
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 */
public class VentanaPrePartida2 extends JFrame{
    
    private JPanel jpContenido;
    private JLabel jlNombre1;
    private JLabel jlNombre2;
    private JLabel jlLanzamientos;
    private JTextField txtPedirN1;
    private JTextField txtPedirN2;
    private JTextField txtPedirLanzamientos;
    private JButton btnAceptar;
 

    
    public VentanaPrePartida2(){
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
        jpContenido.setBackground(Color.white);
        
        add(jpContenido);
        
        
        jlNombre1 = new JLabel("Ingresa el primer nombre" );
        jlNombre2 = new JLabel("Ingresa el segundo nombre");
        jlLanzamientos = new JLabel("Número de lanzamientos");
        
        jpContenido.add(jlNombre1);
        jpContenido.add(jlNombre2);
        jpContenido.add(jlLanzamientos);
       
        
  
        
        jlNombre1.setBounds(150,10, 519,35);
        jlNombre1.setForeground(Color.BLACK);
        jlNombre1.setFont(new Font("Cooper Black", Font.BOLD, 20)); 
        
        
                
        jlNombre2.setBounds(150,90, 519,35);
        jlNombre2.setForeground(Color.BLACK);
        jlNombre2.setFont(new Font("Cooper Black", Font.BOLD, 20)); 
        
        jlLanzamientos.setBounds(150,170, 519,35);
        jlLanzamientos.setForeground(Color.BLACK);
        jlLanzamientos.setFont(new Font("Cooper Black", Font.BOLD, 20)); 
        
        
        btnAceptar = new JButton("ACEPTAR");
        btnAceptar.setBounds(200,290, 150,35);
        btnAceptar.setFont(new Font("Arial Rounded MT Bold",1, 15));
        btnAceptar.setBackground(Color.black);
        btnAceptar.setForeground(Color.white);
        
        jpContenido.add(btnAceptar);
        
         
 
      
        
        
        
                
        txtPedirN1 = new JTextField();
        txtPedirN1.setHorizontalAlignment(JTextField.CENTER);
        txtPedirN1.setForeground(Color.GRAY);
        txtPedirN1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20)); 
        
        txtPedirN2 = new JTextField();
        txtPedirN2.setHorizontalAlignment(JTextField.CENTER);
        txtPedirN2.setForeground(Color.GRAY);
        txtPedirN2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20)); 
        
        
        
        txtPedirLanzamientos = new JTextField();
        txtPedirLanzamientos.setHorizontalAlignment(JTextField.CENTER);
        txtPedirLanzamientos.setForeground(Color.GRAY);
        txtPedirLanzamientos.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 20)); 
       
        
        jpContenido.add(txtPedirN1);
        jpContenido.add(txtPedirN2);
        jpContenido.add(txtPedirLanzamientos);
  
        
        txtPedirN1.setBounds(75,50,410, 40);
        txtPedirN2.setBounds(75,130,410, 40);
        txtPedirLanzamientos.setBounds(75,210,410, 40);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnAceptar.addActionListener(manejadorEventos);
        txtPedirN1.addKeyListener(manejadorEventos);
        txtPedirN2.addKeyListener(manejadorEventos);
        txtPedirLanzamientos.addKeyListener(manejadorEventos);
        
        txtPedirN1.requestFocusInWindow();
        
               
    }
    
    
    private void comenzarJuego(){
        String nombre = txtPedirN1.getText();
        String nombre2 = txtPedirN2.getText();
        String lanzamientos= txtPedirLanzamientos.getText();
        boolean integerOrNot1 = lanzamientos.matches("-?\\d+");
        boolean boolNombre = !nombre.trim().isEmpty() || nombre.trim().length() > 0;
        boolean boolNombre2 = !nombre2.trim().isEmpty() || nombre2.trim().length() > 0;
        boolean boolLanza = (!lanzamientos.trim().isEmpty() || lanzamientos.trim().length() > 0)&&integerOrNot1&&Integer.parseInt(lanzamientos)>0;
        
        
        //int numLanzamientos = Integer.parseInt(txtPedirLanzamientos.getText());
        if(boolNombre&&boolNombre2&&boolLanza){
            
            int numLanzamientos = Integer.parseInt(lanzamientos);
            Jugador jugador1 = new Jugador(nombre,numLanzamientos,false);
            Jugador jugador2 = new Jugador(nombre2,numLanzamientos,false);
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
