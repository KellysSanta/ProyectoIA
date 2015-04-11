/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoia;

import java.io.IOException;

/**
 *
 * @author kazemu
 */
public class Control {
    
    private int matrix[][];
    private int posStart[];
    private int posEnd[];
    
    Control(String fileIn) throws IOException {
        Reader reader = new Reader(fileIn);
        this.matrix=reader.getMatrix();
        
        findPosStart();
        System.out.println("Posicion de inicio: "+posStart[0]+"-"+posStart[1]);
        
        findPosEnd();
        System.out.println("Posicion final: "+posEnd[0]+"-"+posEnd[1]);
        
        Aux2 aux = new Aux2(matrix.length);
        aux.printMatrix(matrix);
    }
    
    int[] findPosStart(){
        posStart = new int[2];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix.length;k++){
                if(matrix[j][k]==0){
                    posStart[0]=j;
                    posStart[1]=k;
                    j=k=matrix.length;
                }
            }
        }
        return posStart;
    }
    
    int[] findPosEnd(){
        posStart = new int[2];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix.length;k++){
                if(matrix[j][k]==7){
                    posStart[0]=j;
                    posStart[1]=k;
                    j=k=matrix.length;
                }
            }
        }
        return posStart;
    }
    
    void busquedaAmplitud(){
        BusquedaAmplitud busquedaAmplitud = new BusquedaAmplitud(matrix, posStart[0], posStart[1]);
        busquedaAmplitud.run();
    }
    
}
