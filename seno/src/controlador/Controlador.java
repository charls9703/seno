/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author carlos bastidas
 */
public class Controlador implements ActionListener {

    private Vista objVista; //se crea la variable de tipo objeto de la clase vista
    private Modelo objModelo; //  se crea la variable de tipo objeto de la clase modelo

    public Controlador(Vista objVista, Modelo objModelo) { //creamos el controlador con los parametros que va a recibir de las clases vista y modelo
        this.objVista = objVista; 
        this.objModelo = objModelo;
        this.objVista.btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // esto es para que reciva los eventos o los clicks que se hacen a los botones y a lo panerles donde se escribe
        objModelo.setGrados(Double.valueOf(objVista.grados.getText()));
        objModelo.seno();
        objVista.resultado.setText(String.valueOf(objModelo.getResultado()));
    }

    public void iniciarVista() {
        objVista.setTitle("MVC SENO");
        objVista.setLocationRelativeTo(null);

    }

}
