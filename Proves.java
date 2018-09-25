/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

/**
 *
 * @author Andrea Perez
 */
public class Proves {
    public static void main(String[] args) {
        
        //P R I M E R A  P A R T E   E J E R C I C I O:
        Vivienda v = new Vivienda ("Consell de Cent",345,1);
        Persona p1 = new Persona();
        p1.setNombre("Josep");
        p1.setEdad(23);
        p1.setPeso(78.5);
        
        Persona p2= new Persona ("Clara", 19, 55,v);
        
        System.out.println("El nombre de p1 es: " + p1.getNombre());
        System.out.println("La edad de p1 es: " + p1.getEdad());
        System.out.println("---------------------------------------"); 
        System.out.println("El nombre de p2 es: " + p2.getNombre());
        System.out.println("---------------------------------------");
        int nuevaEdad=p1.getEdad()+10;
        p1.setEdad(nuevaEdad);
        
        System.out.println("La nueva edad de " + p1.getNombre() + " es: " + p1.getEdad());
        
        p2.setPeso(p2.getPeso()-5);
        //Despues de haber modificado toString:
        System.out.println("---------------------------------------");
        System.out.println(p1);   
        System.out.println(p2);
        

        //S E G U N D A  P A R T E   E J E R C I C I O:
        
        
        
        Persona aux=new Persona("Lluisset",23,80,v);
        
        System.out.println(v);
        
        System.out.println(aux);
        Vivienda vivienda = new Vivienda ("Consell de Cent",345,1);

        Persona p3 = new Persona("Ignasi",34,75, vivienda);
        System.out.println("Ignasi vive en la calle " + p3.getCasa().getDireccion());
        
        System.out.println("---------------------------------------");
        
        Persona p4 = new Persona ("Maria", 25, 56, new Vivienda( "Diagonal", 88, 7)); //Anonimo
        System.out.println("Maria vive en el piso " + p4.getCasa().getDirPiso());
        
        System.out.println("---------------------------------------");
        
         p3.setCasa(new Vivienda("Mallorca", 123, 5));
//        p3.getCasa().setDireccion("Mallorca");
//        p3.getCasa().setDirNum(123);
//        p3.getCasa().setDirPiso(5);
        
        
        
        System.out.println(p3);
        
        p4.getCasa().setDirPiso(7);
        System.out.println(p4);
        
        System.out.println("---------------------------------------");
        
        if (p4.getEdad()>=18){
            System.out.println("Maria es mayor de edad");
        } else{
            System.out.println("No es mayor de edad");
        }
        
        if (p3.getPeso() < 80) {
            System.out.println(p3.getNombre() + " pesa menos de 80kg");
        }
        
    }
}
