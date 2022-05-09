/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.modelo;

/**
 * Archivo: Partida.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de generar Jugadores para la partida, enviandoles el respectivo nombre.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author Jesus Adrian Gomez Cadena
 * <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 */

//la validacion de si son dos o un jugador va a ir en la interface
public class Partida {
 
    private int lanzamientosEmpate;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador actualTirador;

    public Partida(int numeroLanzamientos, Jugador jugador1, Jugador jugador2) {
        
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        lanzamientosEmpate = 0;
    }
    
//getters 
    
    public String quienTira(){
      
        return actualTirador.getNombre();
    }

    public Jugador getJugador1(){
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getLanzamientosEmpate() {
        return lanzamientosEmpate;
    }
    
    //metodos propios
    
    public String ganadorParcial(){
    if(jugador1.getSumatoriaPuntos()>jugador2.getSumatoriaPuntos()){
        return jugador1.getNombre();
    }else if(jugador2.getSumatoriaPuntos()>jugador1.getSumatoriaPuntos()){
        return jugador2.getNombre();
    }else{
        return "";
        }
    }
    
    public void tirando(){
      
    }
        
      
    
    
    
    
    
    
    
    
    
    
    
    
    
}
