package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Persona.Estudiante;

public class App 
{
    public static void main(String[] args) 
    {
        int id_actual, genero_actual, tipo_actual, i, j, opc;
        String nombre_actual, apellido_actual;
        float nota_actual;
        
        Estudiante lista_estudiantes[] = new Estudiante[1000];
  	try
        {
            File file = new File("data/Taller_Estudiantes.csv"); //TENER ACCESO AL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader(file));//MANEJO MEMORIA
            String line; //VARIABLE PARA MANIPULAR CADA LINEA DEL ARCHIVO
            //LEER EL ARCHIVO HASTA QUE NO HAYAN MÁS LINEAS
            j = 0;
            i = 1;
            while((line = br.readLine())!= null)
            {
                //RECORTAR LA INFORMACIÓN
                String[] str = line.split(";"); //"; discriminador/wildcard"
                
                if(str[0].equals("id"))
                {
                    continue;
                }
                //MANIPULAR DATOS
                for(i = 0; i < str.length; ++i)
                {
                    id_actual = Integer.parseInt(str[0]);
                    nombre_actual = str[1];
                    apellido_actual = str[2];
                    
                    if(str[3].equals("Female"))
                    {
                       genero_actual = 1;
                    }
                    else
                    {
                       genero_actual = 0;
                    }//1 == Female ; 2 == Male
                    
                    nota_actual = Float.parseFloat(str[4]);
                    tipo_actual = Integer.parseInt(str[5]);
                    
                    lista_estudiantes[j] = new Estudiante( id_actual, genero_actual, tipo_actual, nombre_actual, apellido_actual, nota_actual);
                }
                j++;
            }
        }
	catch(IOException e)
        {
            System.out.println(e);
	}
        
        do
        {
        
            System.out.println(">>>Menu<<<");
            System.out.println("   [1]Mostrar estudiantes por nivel");
            System.out.println("   [2]Porcentaje de genero por niveles");
            System.out.println("   [3]Mostrar Aprobados por nivel");
            System.out.println("   [4]Salir");
            Scanner scanner = new Scanner(System.in);
            
            try
            {
                opc = scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);
                opc = -1;
            }
            
            switch(opc)
            {
                case -1:
                    break;
                case 1:
                    System.out.println("ESTUDIANTES DE NIVEL TECNOLOGO\n");
                    for(i = 0; i < 1000; i++)
                    {
                        if(lista_estudiantes[0].getType() == 1)
                        {
                            System.out.println(lista_estudiantes[i].getFirst_name());
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(opc != 4);
    }   
}