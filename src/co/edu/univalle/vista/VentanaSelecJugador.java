
package co.edu.univalle.vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gomex
 */
public class VentanaSelecJugador extends JFrame implements ActionListener {
    
    private JLabel lblEncabezado;
    private JButton btnJugadorVsJugador;
    private JButton btnJugadorVsMaquina;
    private Container panel;
    
    public VentanaSelecJugador(){
        
        setVisible(true);
        setSize(600,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        lblEncabezado = new JLabel("Selecciona cómo quieres jugar");
        btnJugadorVsJugador = new JButton ("jugador vs jugador");
        btnJugadorVsMaquina = new JButton ("jugador vs maquina");
        
        panel = getContentPane();
        
        panel.setLayout(null);
        
        panel.add(lblEncabezado);
        panel.add(btnJugadorVsJugador);
        panel.add(btnJugadorVsMaquina);
        
        btnJugadorVsJugador.setBounds(50, 180, 200, 50);
        btnJugadorVsMaquina.setBounds(350, 180, 200, 50);
        lblEncabezado.setBounds(200, 80, 200, 20);
        
        btnJugadorVsMaquina.addActionListener(this);
        btnJugadorVsJugador.addActionListener(this);
    }
    
    @Override
    public void actionPerformed (ActionEvent a){
        if(a.getSource()== btnJugadorVsJugador){
            //instanciar dos veces la ventana nombre
        }else{
            //lnstanciar una vez la ventana nombre
        }
        setVisible(false);
    }
    
}
