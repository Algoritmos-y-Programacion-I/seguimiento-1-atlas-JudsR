/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final int COSTO_X_NOCHE = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudad;
        int edad, documento, noches;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?: ");
        nombre = escaner.nextLine();
        System.out.println("Cual es tu edad?: ");
        edad = escaner.nextInt();
        documento = evaluarTiCedula(edad);

        // ...
        System.out.println("Bienvenido " + nombre + "!");
		mainApp.run();

        System.out.println("Desde cual ciudad partirias hacia tu destino?: ");
        ciudad = escaner.nextline();

        System.out.println("Cuantas noches planeas estar en la ciudad? (min.1 / max. 4): ");
        noches = escaner.nextInt();

        System.out.println("OK, te quedaras "+noches" en Bogota y este es el reumen de tu compra: ");
        totalPagar = calculos(noches);
        System.out.println("tiquetes de avión "+ciudad"-bogota-"+ciudad"por un total de: "+total);



        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
        
	}

    public void calculos(int noches)
    {
        int pagarNoches, total;
        final double COSTO_TRAYECTO_AVION = 250000;
        final int COSTO_X_NOCHE = 150000;

        pagarNoches = noches*COSTO_X_NOCHE;
        total = pagarNoches+COSTO_TRAYECTO_AVION;

        return total;        
    }

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
        mainApp.run();
        System.out.println(" ");

        
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

    public int evaluarTiCedula(int edad){
        int documento;
        if (edad >= 18) {
           System.out.println("Ingresa tu numero de cedula: ");
           documento = escaner.nextInt();
        } else {
           System.out.println("Ingresa tu numero de tarjeta de identidad: ");
           documento = escaner.nextInt();
        }
        return documento;
    }

    /*public int limiteNoches(){
        int noches;
        while (True) {
            noches = escaner.nextInt();
            if (noches >=1 || noches <= 4) {
                break;
            }
            else{
                System.out.println("Numero de noches no valido, ingrese un numero entre 1 a 4");
            }
        return noches;
        }
         
    }*/

	

	
}