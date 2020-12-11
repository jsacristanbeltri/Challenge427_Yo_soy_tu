//Jorge Sacristan Beltri

import java.util.Scanner;

public class Challenge427_Yo_soy_tu
{
    public static void main (String[] args)
    {
        String nombre = "", parentesco="", frases="", fraseaux="";
        int numeroCasos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de casos (entero): ");
        numeroCasos = sc.nextInt();
        sc.nextLine();
        
        for (int i=0;i<numeroCasos;i++)
        {
            System.out.printf("Introduzca el %d nombre: " , i+1);
            nombre = sc.nextLine();
            System.out.printf("Introduzca el %d parentesco: " , i+1);
            parentesco = sc.nextLine();
            
            if(nombre.equals("Luke") && parentesco.equals("Padre"))
                frases =frases+"TOP SECRET\n";
                  
            else
                frases =frases+nombre+ ", yo soy tu " + parentesco+"\n";
  
        }
        System.out.println(frases);
    }
}
    
