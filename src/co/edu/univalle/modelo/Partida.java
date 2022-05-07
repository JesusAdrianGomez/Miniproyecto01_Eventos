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
 * @author 
 */


public class Partida {
    private boolean personaVPersona;
    private int numeroLanzamientos;
    private int lanzamientosTotales;
    private int lanzamientosRestantes;
    private int lanzamientosEmpate;
    private Jugador jugador1;
    private Jugador jugador2;

    public Partida(boolean personaVPersona ,int numeroLanzamientos) {
        this.personaVPersona = personaVPersona;
        this.numeroLanzamientos = numeroLanzamientos;
        lanzamientosRestantes = this.numeroLanzamientos;
        this.lanzamientosTotales = 0;
        lanzamientosEmpate = 0;
    }
      
    public void crearJugadores(){
        
        if(personaVPersona){
            
        }
        
    }
    
    /* Getter de Persona Vs Përsona */

    public boolean isPersonaVPersona() {
        return personaVPersona;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
