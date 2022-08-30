/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Proyecto1 {public static void main(String[] args) {
        //Empesamos creeando la lista 
        List<ClsVendedores> misEmp = new ArrayList();
        
        
        Random dato = new Random();
        int r = 0, r1 = 0,r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0;
        int r9 = 0, r10 = 0, r11 = 0, r12 = 0, r13 = 0, r14 = 0, r15 = 0, r16 = 0, r17 = 0;
        int r18 = 0, r19 = 0, r20 = 0, r21 = 0, r22 = 0, r23 = 0;
        
        for(int i =0; i<1; i++){
            r=dato.nextInt(100); r1=dato.nextInt(100); r2=dato.nextInt(100);
            r3=dato.nextInt(100); r4=dato.nextInt(100); r5=dato.nextInt(100);
            r6=dato.nextInt(100); r7=dato.nextInt(100); r8=dato.nextInt(100);
            r9=dato.nextInt(100); r10=dato.nextInt(100); r11=dato.nextInt(100);
            r12=dato.nextInt(100); r13=dato.nextInt(100); r14=dato.nextInt(100);
            r15=dato.nextInt(100); r16=dato.nextInt(100); r17=dato.nextInt(100);
            r18=dato.nextInt(100); r19=dato.nextInt(100); r20=dato.nextInt(100);
            r21=dato.nextInt(100); r22=dato.nextInt(100); r23=dato.nextInt(100);

            
        }
        
        ClsVendedores ven = new ClsVendedores("1-Beto");
        ven.setEnero(r);
        ven.setFebrero(r1);
        ven.setMarzo(r2);
        misEmp.add(ven);
            
        ven=new ClsVendedores("2-Roberto");
        ven.setEnero(r3);
        ven.setFebrero(r4);
        ven.setMarzo(r5);
        misEmp.add(ven);
 
        ven = new ClsVendedores("3-Victor");
        ven.setEnero(r6);
        ven.setFebrero(r7);
        ven.setMarzo(r8);
        misEmp.add(ven);
        
        ven = new ClsVendedores("4-Lemus");
        ven.setEnero(r9);
        ven.setFebrero(r10);
        ven.setMarzo(r11);
        misEmp.add(ven);
        
        ven = new ClsVendedores("5-Antonio");
        ven.setEnero(r12);
        ven.setFebrero(r13);
        ven.setMarzo(r14);
        misEmp.add(ven);
        
        ven = new ClsVendedores("6-Arturo");
        ven.setEnero(r15);
        ven.setFebrero(r16);
        ven.setMarzo(r17);
        misEmp.add(ven);
        
        ven = new ClsVendedores("7-Hector");
        ven.setEnero(r18);
        ven.setFebrero(r19);
        ven.setMarzo(r20);
        misEmp.add(ven);
        
        ven = new ClsVendedores("8-Mynor");
        ven.setEnero(r21);
        ven.setFebrero(r22);
        ven.setMarzo(r23);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
         
        double sumaEnero = 0;  
        double sumaFebrero = 0;
        double sumaMarzo = 0;   
        double SumasMesesTotal = 0;
        
        System.out.println("Vendedores");//Imprime Vendedores 
        System.out.println("-----------");
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));
        
        
        for (ClsVendedores v : misEmp){
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            
            SumasMesesTotal= sumaEnero+sumaFebrero+sumaMarzo;
        }
        //Impresion de la tabal y losdatos  vendedores 
        System.out.println("\n\t-------------------------------------------------------------------");
        System.out.println("\n\tNOMBRE\t\t |    ENERO\t\t |  FEBRERO\t |  MARZO");
        System.out.println("\t1-Beto\t         |     "+r+"\t\t |  "+r1+"\t\t |  "+r2);
        System.out.println("\t2-Roberto\t |     "+r3+"\t\t |  "+r4+"\t\t |  "+r5);
        System.out.println("\t3-Victor\t |     "+r6+"\t\t |  "+r7+"\t\t |  "+r8);
        System.out.println("\t4-Lemus\t\t |     "+r9+"\t\t |  "+r10+"\t\t |  "+r11);
        System.out.println("\t5-Antonio\t |     "+r12+"\t\t |  "+r13+"\t\t |  "+r14);
        System.out.println("\t6-Arturo\t |     "+r15+"\t\t |  "+r16+"\t\t |  "+r17);
        System.out.println("\t7-Hector\t |     "+r18+"\t\t |  "+r19+"\t\t |  "+r20);
        System.out.println("\t8-Mynor\t\t |     "+r21+"\t\t |  "+r22+"\t\t |  "+r23);
        System.out.println("\tTOTAL MES\t |     "+sumaEnero+"\t\t |  "+sumaFebrero+"\t| "+sumaMarzo);
        System.out.println("\n\t-------------------------------------------------------------------");
        System.out.println("\n\tVentas Totales Por Todos os Meses = "+SumasMesesTotal);
        System.out.println("\n\t-----------------------------------------------------");
System.out.println("\n\tLa Suma Total De Enero="+sumaEnero);
        System.out.println("\tLa  Suma Total de febrero ="+sumaFebrero);
                   
        System.out.println("\tLa Suma Total De Marzo ="+sumaMarzo);
System.out.println("\n\t------------------------------------------------------------");
    }
    
}
