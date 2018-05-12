/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.newpackage;

/**
 *
 * @author Alumno
 */
public class arrays 
{
    
    public static void main(String[] args) 
    {
   
//        /**int[] array = new int [20];
//        
//        for(int i=0;i<20;i++)
//        {
//            array[i] = i*3;
//        }
//      
//        for(int i=0;i<20;i++)
//        {
//        //System.out.println(array[i]);  imprime 20 numero de multiplos de 3
//            
//        if(array[i]%2 !=0)
//         
//             System.out.println("Impares = "+array[i]);
//         
//        }*/
        
   
   //     int[] array = new int [5];
   //     array [0] = 5;
   //     array [1] = 15;
   //     array [2] = 25;
   //     array [3] = 35;
   //     array [4] = 45;
   //     System.out.println(array[2]);
   // for(int i=0;i<5;i++){
   //     System.out.println(array[i]);
   // }    
        //System.out.println("Termino el for");
   //     if(i%2!=0){
   //         System.out.println("Posiciones Impares"+array[i]);
   //     }
   // }
        
//        int[][] array = new int[10][10];
//        int n = 1;
//        
//            for(int i=0; i < 10; i++)
//            {
//                for(int j=0; j < 10; j++){
//                    array[i][j] = n;
//                    n++;
//                }
//            }
//             for(int i=0;i<10;i++)
//            {
//                for(int j=0; j<10;j++)
//                {
//                    System.out.print("\t" +array[i][j]);//tabulador de 4 espacios antes de la siguiente posicion
//                }
//                System.out.println(" ");//imprime espacio
//           }
        int[][] array = new int[10][10];
        int n = 1;
        
        for(int i=0;i<10;i++)// i linea
        {
            for(int j=0;j<10;j++)// j columna
                array[i][j] = n;
              
        }       
    
        
        for(int i=0; i <= n ;i++)
        {
            for (int j=0; j<= n;j++)
                if(j ==0 || j == n || i == 0 || i == n){
                    System.out.println(array[i][j]); 
                    array[i][j] = n;
                n++;
                }
                else{
                    System.out.print(" ");
                }
        }
        
        System.out.println();
        
    }  
}
    
