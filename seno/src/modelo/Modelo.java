/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author carlos bastidas
 */
public class Modelo {

    private double grados;// creacion de variable de tipo double
    private double resultado;
   //generamos los metodos get y set de las variables grados y resultados
    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    //creamos el metodo seno para hayar el seno del numero que recive la  varaible grados
    
    public double seno() {
        this.resultado=0;
        double i = 0, //creamos las  variables que se requeriran para la operacion
                x = 0,
                pi = 3.1415926535897932384626433832795;
        double resultadoNumerador,
                numerador,
                denominador,
                Fact,
                base,
                frac;
        x = (this.grados * pi) / 180; // x va a ser quien reciba el valor de los grados en radianes
        while (i <= 1000) { // iniciamos un ciclo while desde 0 hasta 1000
            numerador = (double) Math.pow((-1), i); // numerados recibara el resultado de la potencia -1 a la i utilizando la libreria math con su metodo pow 
            denominador = (2 * i) + 1; // asignamos a denominador lo que nos de en (2xi)+1
            base = Math.pow(x, ((2 * i) + 1));
            Fact = denominador - 1;// se le resta uno al denominador para multiplicar la cifra entera menor a el 
            if (denominador == 0) {// esto se hace por si el denominador llega a dar 0 la division  se puede realizar ya que de lo contrario seria una inconsistencia matematica
                denominador = 1;
            }
            while (Fact > 1) {// en este ciclo se haya el factorial del denominador que previamente se tenia
                denominador = denominador * Fact;
                Fact = Fact - 1;
            }

            resultadoNumerador = numerador * base;// se multiplica -1 a la i por x a la (2xi)+1

            frac = resultadoNumerador / denominador; // una ves se tiene el resultado del factoorial del denominador y el resultado del denominador se ahce la division 
            this.resultado = this.resultado + frac;//y  obtenemos los valores que se iran sumando para obtener el seno del numero que estemos buscando
            i = i + 1;// se summa de a uno para que sigamos con la siguiente posicion en la serie
            
        }
        return this.resultado; //returnamos el resultado para poder mostrarlo en pantalla
       
        
    }
    
}
