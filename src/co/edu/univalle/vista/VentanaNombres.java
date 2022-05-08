/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author RYZEN
 */
public class VentanaNombres extends JFrame{
    
    private JLabel jlMensaje;
    private JPanel jpContenido;
    private JLabel jlNombre;
    private JTextField txtNombre;
    private JButton btnIngresar; 
    private JSpinner txtNumero;
    
    private Jugador jugador1;
    private Jugador jugador2;
    private int numeroLanzamientos;
    private int i;
    
    public VentanaNombres(int numero){
        iniciarComponentes(numero);
        i = numero;
        this.jugador2 = new Jugador("Hola 1");
        this.jugador1 = new Jugador("Hola 2");
        numeroLanzamientos=0;
    }
    
    private void iniciarComponentes(int numero){
        //Configuración de la ventana
        
        if(numero == 1){
            setTitle("Ingresa el primer nombre");
        }else if(numero == 2){
            setTitle("Ingrese el segundo nombre");
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,530);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        
        //Configuración del Encabezado
        jpContenido = new JPanel();
        
        jlMensaje = new JLabel("BIENVENIDO AL EJERCICIO DE TU MEMORIA",SwingConstants.CENTER);
        
         if(numero == 1){
            jlNombre = new JLabel("Ingresa el primer nombre",SwingConstants.CENTER );
        }else if(numero == 2){
            jlNombre = new JLabel("Ingresa el segundo nombre",SwingConstants.CENTER );
        }else if(numero == 3){
            jlNombre = new JLabel("Ingresa el numero de tiros",SwingConstants.CENTER );
        }
        
        
        
        
        jpContenido.setSize(519,500);        
        jpContenido.setBounds(0,100, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);

        
        
        jlNombre.setBounds(0,25, 519,35);
        jlNombre.setForeground(new Color(0,87,193));
        jlNombre.setFont(new Font("arial", Font.BOLD, 20)); 
                
        btnIngresar = new JButton("Iniciar Juego");
        btnIngresar.setBounds(180,120, 150,35);
        
        
        jpContenido.add(jlMensaje);
        jpContenido.add(jlNombre);
        jpContenido.add(btnIngresar);
                
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20)); 
        
        
        txtNumero = new JSpinner();
       
        
        jpContenido.add(txtNombre);
        jpContenido.add(txtNumero);
        
        txtNombre.setBounds(50,70,410, 40);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnIngresar.addActionListener(manejadorEventos);
        txtNombre.addKeyListener(manejadorEventos);
        
        txtNombre.requestFocusInWindow();
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
               
    }
    
    private void iniciarJuego(){
        String nombre =txtNombre.getText();
        if((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && (i == 1)){
            dispose(); 
            i = i + 1;
            jugador1.setNombre(nombre);
            VentanaNombres ventana = new VentanaNombres(i);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        }else if((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && (i == 2)){
            dispose(); 
            i = i + 1;
            jugador2.setNombre(nombre);
            VentanaNombres ventana = new VentanaNombres(i);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        }else if((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && (i == 3)){
            dispose(); 
            i = i + 1;
            numeroLanzamientos = Integer.parseInt(nombre);       
            
            System.out.println("Jugador 1: " + jugador1.getNombre());
            System.out.println("Jugador 2: " + jugador2.getNombre());
            System.out.println("Numero Lanzamientos: " + numeroLanzamientos);
    
        }
        else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
        }
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnIngresar){                
                iniciarJuego();
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/
            if(e.getKeyCode() == e.VK_ENTER){
                btnIngresar.doClick();
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
