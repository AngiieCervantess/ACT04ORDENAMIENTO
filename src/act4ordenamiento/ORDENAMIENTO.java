/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4ordenamiento;

/**
 *
 * @author Angelica
 */
public class ORDENAMIENTO {
    
    public static int[] ordenamiento(int[]vec){
   
int menor;
int aux;
for (int i=0; i<vec.length-1; i++) {
menor = vec[i];
for (int j=i+1; j<=vec.length-1; j++) {
if (vec[j] < menor) {
aux = vec[j];
vec[j] = menor;
menor = aux;
}
}
vec[i] = menor;
}
return vec;
    }    
}

