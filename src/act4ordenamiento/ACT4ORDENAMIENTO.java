/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4ordenamiento;

import static act4ordenamiento.ORDENAMIENTO.ordenamiento;


/**
 *
 * @author Angelica
 */
public class ACT4ORDENAMIENTO {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int[] vector = {5,14,7,50,1,4,88,23,2};
int[] nuevoVector = ordenamiento(vector);
for (int i=0; i<nuevoVector.length; i++) {
System.out.println(nuevoVector[i]);
} 
}
}


