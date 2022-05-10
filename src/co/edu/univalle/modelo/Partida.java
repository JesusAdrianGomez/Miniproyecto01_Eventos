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
    private Jugador ganador;

    public Partida(Jugador jugador1, Jugador jugador2) {
        
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        actualTirador= this.jugador1;
        lanzamientosEmpate = 0;
    }
    
//getters 
    
    public Jugador getJugador1(){
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getLanzamientosEmpate() {
        return lanzamientosEmpate;
    }
    
    public Jugador getActualTirador(){
        return actualTirador;
    }

    public Jugador getGanador() {
        return ganador;
    }
    
    //metodos propios
    
    public String quienTira(){  
        return actualTirador.getNombre();
    }
    
    public String ganadorParcial(){
    if(jugador1.getSumatoriaPuntos()>jugador2.getSumatoriaPuntos()){
        return jugador1.getNombre();
    }else if(jugador2.getSumatoriaPuntos()>jugador1.getSumatoriaPuntos()){
        return jugador2.getNombre();
    }else{
        return "";
        }
    }
    
    public void cambiarTirador(){
        if(actualTirador==jugador1){
            actualTirador=jugador2;
        }else{
            actualTirador=jugador1;
        }
        
    }
    
    public void verificoEmpate(){
        if((jugador1.puntajeTiro()==jugador2.puntajeTiro())&&(jugador1.getLanzamientosRealizados()==jugador2.getLanzamientosRealizados())){
            jugador1.cancelarTiro();
            jugador2.cancelarTiro();            
        }
    }
    
    
    public void tirando(){
        actualTirador.lanzar();
        
    }
    
    public void indicarGanador(){
        if(jugador1.getLanzamientosRestantes()==0&&jugador2.getLanzamientosRestantes()==0){
            if(jugador1.getSumatoriaPuntos()>jugador2.getSumatoriaPuntos()){
                ganador=jugador1;
            }else if(jugador2.getSumatoriaPuntos()>jugador1.getSumatoriaPuntos()){
                ganador=jugador2;
            }else{
                ganador = null;
            }
        }
     
    }
        
      
    
    
    
    
    
    
    
    
    
    
    
    
    
}
