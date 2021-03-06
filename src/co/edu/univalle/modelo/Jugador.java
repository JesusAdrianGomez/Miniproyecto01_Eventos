
package co.edu.univalle.modelo;

/**
 * Archivo: Jugador.java
 * Fecha de Creación: 07/05/2022
 * 
 * Esta clase es la encargada de modelar Jugadores para la partida, con el respectivo nombre.
 * 
 * @author Julian Alexander Alvarez Payares <alvarez.julian@correounivalle.edu.co> GitHub: https://github.com/Anezeres 
 * @author Jesus Adrian Gomez Cadena <jesus.cadena@correounivalle.edu.co> GitHub: https://github.com/JesusAdrianGomez
 * Profesor: Luis Yovany Romo Portilla
 * Grupo de FPOE: 01
 * Numero laboratorio: 1

 */

public class Jugador {
    private String nombre;
    boolean esMaquina;
    private int sumatoriaPuntos;
    private int lanzamientosRealizados;
    private int numeroLanzamientos;
    private int lanzamientosRestantes;
    private int[] dados;

    public Jugador(String nombre,int numLanzamientos, boolean esMaquina) {
        this.nombre = nombre;
        this.esMaquina= esMaquina;
        numeroLanzamientos=numLanzamientos;
        lanzamientosRestantes= numeroLanzamientos;
        lanzamientosRealizados = 0;
        sumatoriaPuntos = 0;
        dados = new int[2];
    }


    /* Getters and Setters de la Clase Jugador */

    public String getNombre() {
        return nombre;
    }
    
    public boolean getEsMaquina(){
        return esMaquina;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSumatoriaPuntos() {
        return sumatoriaPuntos;
    }
    
        public int getLanzamientosRestantes() {
        return lanzamientosRestantes;
    }
    

    public int getLanzamientosRealizados() {
        return lanzamientosRealizados;
    }


    public int[] getDados() {
        return dados;
    }
    
    /*metodos propios*/
    
        public int getNumeroLanzamientos(){
        
        return numeroLanzamientos;
    }

    public void calcularLanzamientosRestantes() {
        lanzamientosRestantes=numeroLanzamientos-lanzamientosRealizados;
    }
        public int puntajeTiro(){
            return dados[0]+dados[1];
        }
        
        public void lanzar(){
            dados[0]= (int)(Math.random()*6)+1;
            dados[1]= (int)(Math.random()*6)+1;
            lanzamientosRealizados+=1;
            sumatoriaPuntos+= puntajeTiro();
            calcularLanzamientosRestantes();
        }
        
        public void cancelarTiro(){
            lanzamientosRealizados-=1;
            sumatoriaPuntos-= puntajeTiro();
            calcularLanzamientosRestantes();
        }
    
    
    
    
          
    
}
