import java.util.Scanner;

public class Octavo {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese un número (máximo 9 dígitos): ");
        int numero = teclado.nextInt();
        
        String numeroEnPalabras = convertirNumeroEnPalabras(numero);
        
        System.out.println("El texto del número es: " + numeroEnPalabras);
    }
    
    public static String convertirNumeroEnPalabras(int numero) {
        if (numero == 0) {
            return "CERO";
        } else if (numero < 0 || numero > 999999999) {
            return "Número fuera de rango";
        }
        
        String[] unidades = {
            "", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ",
            "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE"
        };
        
        String[] decenas = {
            "", "", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"
        };
        
        String[] centenas = {
            "", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS",
            "OCHOCIENTOS", "NOVECIENTOS"
        };
        
        String[] grupos = {
            "", "MIL", "MILLÓN", "MIL MILLONES"
        };
        
        String numeroEnPalabras = "";
        int contadorGrupos = 0;
        
        while (numero > 0) {
            int grupo = numero % 1000;
            int centena = grupo / 100;
            int decena = (grupo / 10) % 10;
            int unidad = grupo % 10;
            
            String palabrasGrupo = "";
            
            if (centena > 0) {
                if (centena == 1 && decena == 0 && unidad == 0) {
                    palabrasGrupo += "CIEN";
                } else {
                    palabrasGrupo += centenas[centena] + " ";
                }
            }
            
            if (decena > 0 || unidad > 0) {
                if (decena == 1) {
                    palabrasGrupo += unidades[10 + unidad] + " ";
                } else if (decena == 2 && unidad > 0) {
                    palabrasGrupo += "VEINTI" + unidades[unidad] + " ";
                } else {
                    palabrasGrupo += decenas[decena] + " " + unidades[unidad] + " ";
                }
            }
            
            if (grupo > 0) {
                palabrasGrupo += grupos[contadorGrupos] + " ";
            }
            
            numeroEnPalabras = palabrasGrupo + numeroEnPalabras;
            
            numero /= 1000;
            contadorGrupos++;
        }
        
        return numeroEnPalabras.trim();
    }
    }
    

