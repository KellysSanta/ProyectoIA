/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoia;

/**
 *
 * @author Santa Gutierrez
 */
public class Aux2 {
     private int tam = 0;
 
    public Aux2(int tam){
        this.tam = tam;
    }
 /*
    public int[] toMatrix(int pos){
        int y = pos/tam;
        int x = pos-(y*tam);
        int[] posF = {x,y};
        return posF;
    }
    
    public int toFixed(int x, int y){
        return ((y*tam)+x);
    }
    */
    public int[][] toAdd(int[][] array, int x, int y){
        int[][] newArray = new int[array.length+1][2];
        for(int i=0;i<array.length;i++){
            newArray[i][0]=array[i][0];
            newArray[i][1]=array[i][1];
        }
        newArray[array.length][0]=x;
        newArray[array.length][1]=y;
        return newArray;
    }
    
    public boolean inRange(int x, int y){
        if(x<0){return false;}
        else if(y<0){return false;}
        else if(x>=tam){return false;}
        else return y < tam;
    }
    
    public void printMatrix(int[][] matrix){
        System.out.println("--------------------------");
        String line="";
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                line+=matrix[i][j]+" ";
            }
            System.out.println(line);
            line="";
        }
        System.out.println("--------------------------");
    }
}
