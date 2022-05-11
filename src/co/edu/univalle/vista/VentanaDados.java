/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Archivo: VentanaDados.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de la apariencia de el juego como tal, es decir, es la apariencia de la ventana de los dados.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 * Profesor: Luis Yovany Romo Portilla
 * Grupo de FPOE: 01
 * Numero laboratorio: 1
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;




public class VentanaDados extends JFrame implements ActionListener{

    private JPanel jpContenidoGeneral;
    private JLabel jlNombre1;
    private JLabel jlSumPuntaje1;
    private JLabel jlTirosRestantes1;
    private JLabel jlNombre2;
    private JLabel jlSumPuntaje2;
    private JLabel jlTirosRestantes2;
    private JButton btnLanzar;
    private JLabel jlGanadorParcial;
    private JLabel jlProximoTirador;
    private JLabel jlLanzamientosJ1;
    private JLabel jlLanzamientosJ2;
    private JLabel jlLanzamientosEmpate;
    private JLabel jlLanzamientosTotales;
    private JLabel jlDado1;
    private JLabel jlDado2;
    private Partida laPartida;
    private Timer tiempo;
    private int min,seg;
    private JLabel time;

    
    public VentanaDados(Jugador jugador1, Jugador jugador2){
        
        laPartida = new Partida(jugador1,jugador2);
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
        
        //tiempo
        tiempo = new Timer(1000, this);
        tiempo.start();
        
        String tiemS = (min<=9?"0":"")+min+":"+(seg<=9?"0":"")+seg;
        time = new JLabel("Tiempo: "+tiemS);
        time.setBounds(445,5, 200, 40);
        jpContenidoGeneral.add(time);
        
        
        //todos los datos de jugador1
        
        jlNombre1 = new JLabel("Jugador 1: "+laPartida.getJugador1().getNombre());
        jlSumPuntaje1 = new JLabel(laPartida.getJugador1().getSumatoriaPuntos()+"");
        jlTirosRestantes1 = new JLabel ("Lanzamientos restantes: "+laPartida.getJugador1().getLanzamientosRestantes());
        jlLanzamientosJ1 = new JLabel("Lanzamientos efecutados: "+laPartida.getJugador1().getLanzamientosRealizados());
        
        jlNombre1.setBounds(10,10, 200,20);
        jlNombre1.setForeground(new Color(0,87,193));
        jlNombre1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlNombre1);
        
                
        jlSumPuntaje1.setBounds(70,180, 200,70);
        jlSumPuntaje1.setForeground(new Color(45,87,193));
        jlSumPuntaje1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 70)); 
        jpContenidoGeneral.add(jlSumPuntaje1);
        
        jlTirosRestantes1.setBounds(10,400, 200,20);
        jlTirosRestantes1.setForeground(new Color(0,87,193));
        jlTirosRestantes1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlTirosRestantes1);
        
        jlLanzamientosJ1.setBounds(10,450, 200,20);
        jlLanzamientosJ1.setForeground(new Color(0,87,193));
        jlLanzamientosJ1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlLanzamientosJ1);
        
        //todos los datos de jugador2
        
        jlNombre2 = new JLabel("Jugador 2: "+laPartida.getJugador2().getNombre());
        jlSumPuntaje2 = new JLabel(laPartida.getJugador2().getSumatoriaPuntos()+"");
        jlTirosRestantes2 = new JLabel ("Lanzamientos restantes: "+laPartida.getJugador2().getLanzamientosRestantes()+"");
        jlLanzamientosJ2 = new JLabel ("Lanzamientos efecutados: "+laPartida.getJugador2().getLanzamientosRealizados());
        
        jlNombre2.setBounds(800,10, 200,20);
        jlNombre2.setForeground(new Color(0,87,193));
        jlNombre2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlNombre2);
        
                
        jlSumPuntaje2.setBounds(850,180, 200,70);
        jlSumPuntaje2.setForeground(new Color(45,87,193));
        jlSumPuntaje2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 70)); 
        jpContenidoGeneral.add(jlSumPuntaje2);
        
        jlTirosRestantes2.setBounds(790,400, 200,20);
        jlTirosRestantes2.setForeground(new Color(0,87,193));
        jlTirosRestantes2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlTirosRestantes2);
        
        jlLanzamientosJ2.setBounds(790,450, 200,20);
        jlLanzamientosJ2.setForeground(new Color(0,87,193));
        jlLanzamientosJ2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlLanzamientosJ2);
     
        // Todo lo de botón lanzar
        
        btnLanzar = new JButton("LANZAR");
        btnLanzar.setBounds(400,450,200,50);
        btnLanzar.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 20));
        jpContenidoGeneral.add(btnLanzar);
        btnLanzar.addActionListener(this);
                
        //todo lo de los dados
        
        jlDado1 = new JLabel(new ImageIcon("src/imagenes/1.jpg"));
        jlDado2 = new JLabel(new ImageIcon("src/imagenes/1.jpg"));
        
        jlDado1.setBounds(220,100,236,236);
        jlDado2.setBounds(520,100,236,236);
        
        jpContenidoGeneral.add(jlDado1);
        jpContenidoGeneral.add(jlDado2);
        
        //todo lo general
        
        jlLanzamientosTotales = new JLabel("Lanzamientos a efectuar "+laPartida.getJugador1().getNumeroLanzamientos());
        jlLanzamientosTotales.setBounds(410, 50, 200, 50);
        jlLanzamientosTotales.setForeground(new Color(0,87,193));
        jlLanzamientosTotales.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlLanzamientosTotales);
        
        jlGanadorParcial = new JLabel("va ganando: "+laPartida.ganadorParcial());
        jlGanadorParcial.setBounds(450, 20, 250, 50);
        jlGanadorParcial.setForeground(new Color(0,87,193));
        jlGanadorParcial.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlGanadorParcial);
        
        jlProximoTirador = new JLabel("tira: "+laPartida.getActualTirador().getNombre());
        jlProximoTirador.setBounds(435, 400, 200, 50);
        jlProximoTirador.setForeground(new Color(0,87,193));
        jlProximoTirador.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 15)); 
        jpContenidoGeneral.add(jlProximoTirador);
        
        jlLanzamientosEmpate = new JLabel("Empates: "+laPartida.getLanzamientosEmpate());
        jlLanzamientosEmpate.setBounds(450, 350, 200, 50);
        jlLanzamientosEmpate.setForeground(new Color(0,87,193));
        jlLanzamientosEmpate.setFont(new Font("Arial Rounded MT Bold",Font.BOLD, 12)); 
        jpContenidoGeneral.add(jlLanzamientosEmpate);
        
        
         
    }
    
    private void actualizarLabelTiempo(){
        String tiemS = (min<=9?"0":"")+min+":"+(seg<=9?"0":"")+seg;
        time.setText("Tiempo: "+tiemS);
    }
    
    private void actualizarPantalla(){
        //jugador1
        jlSumPuntaje1.setText(laPartida.getJugador1().getSumatoriaPuntos()+"");
        jlTirosRestantes1.setText("Lanzamientos restantes: "+laPartida.getJugador1().getLanzamientosRestantes()+"");
        jlLanzamientosJ1.setText("Lanzamientos efecutados: "+laPartida.getJugador1().getLanzamientosRealizados());
        
        //jugador2
        jlSumPuntaje2.setText(laPartida.getJugador2().getSumatoriaPuntos()+"");
        jlTirosRestantes2.setText("Lanzamientos restantes: "+laPartida.getJugador2().getLanzamientosRestantes()+"");
        jlLanzamientosJ2.setText("Lanzamientos efecutados: "+laPartida.getJugador2().getLanzamientosRealizados());
        
        //dados
        jlDado1.setIcon(new ImageIcon("src/imagenes/"+laPartida.getActualTirador().getDados()[0]+".jpg") );
        jlDado2.setIcon(new ImageIcon("src/imagenes/"+laPartida.getActualTirador().getDados()[1]+".jpg") );
        
        //general
        jlGanadorParcial.setText("va ganando: "+laPartida.ganadorParcial());
        jlGanadorParcial.setBounds(420, 20, 200, 50);
        jlLanzamientosEmpate.setText("Empates: "+laPartida.getLanzamientosEmpate());
         
    }
    
    public void actualizarTirador(){
        jlProximoTirador.setText("tira: "+laPartida.getActualTirador().getNombre());
    }
 
    public void finalPartida(){
        if(laPartida.getJugador1().getLanzamientosRestantes()==0&&laPartida.getJugador2().getLanzamientosRestantes()==0){
            laPartida.indicarGanador();
            tiempo.stop();
            if(laPartida.getGanador()==null){
                JOptionPane.showMessageDialog(null,"Empate con "+laPartida.getJugador1().getSumatoriaPuntos()+" puntos", "Fin de la partida",
            JOptionPane.INFORMATION_MESSAGE);
                jugarOtraVez();
                
            }else{
               JOptionPane.showMessageDialog(null,"¡IMPRESIONANTE!, \n "+laPartida.getGanador().getNombre()+ " ha ganado la partida con " +
               laPartida.getGanador().getSumatoriaPuntos()+
               " puntos. \n\nFELICITACIONES!!!\n", "Fin de la partida",
               JOptionPane.INFORMATION_MESSAGE);
               jugarOtraVez();
            }
            
            
            
        }
    }
    
    public void jugarOtraVez(){
        
        int respuestaJugar;
        int respuestaJugadores;
        
        
        respuestaJugar = JOptionPane.showConfirmDialog(
                null,"¿Desea jugar otra vez?", "Información",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(respuestaJugar == JOptionPane.YES_OPTION){
            
                respuestaJugadores = JOptionPane.showConfirmDialog(
                null,"¿Desea jugar con los mismos jugadores y número de intentos?", "Información",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if(respuestaJugadores == JOptionPane.YES_OPTION){
                    dispose();
                    Jugador jugador1= new Jugador(laPartida.getJugador1().getNombre()+"",laPartida.getJugador1().getNumeroLanzamientos(),laPartida.getJugador1().getEsMaquina());
                    Jugador jugador2= new Jugador(laPartida.getJugador2().getNombre()+"",laPartida.getJugador2().getNumeroLanzamientos(),laPartida.getJugador2().getEsMaquina());
                    VentanaDados nuevaPartida = new VentanaDados(jugador1,jugador2);
                }else{
                    dispose();
                   VentanaSelecJugador nuevaSeleccion = new VentanaSelecJugador();
                }
                
        } else {
            dispose();
        }
    }
    
    public void pressLanzar(){
        if(laPartida.getJugador2().getEsMaquina()){
            
            laPartida.tirando();
            laPartida.cambiarTirador();
            laPartida.tirando();
            laPartida.cambiarTirador();
            actualizarPantalla();
            laPartida.verificoEmpate();
            finalPartida();
            
           
            
        }else{
            
            laPartida.tirando();
            laPartida.verificoEmpate();
            actualizarPantalla();
            laPartida.cambiarTirador();
            jlProximoTirador.setText("tira: "+laPartida.getActualTirador().getNombre());
            finalPartida();
            
        }
    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()==btnLanzar ){
        pressLanzar();
        } 
        if(e.getSource()==tiempo){
            actualizarLabelTiempo();
            seg++; 
            if(seg==60){
                seg = 0;
                min++;
            }
             
        }   
        
    }
}

