/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author nopucemo
 */
public class Estudiante 
{
    int id, genre, type;
    String first_name, last_name;
    float grade;

    public Estudiante(int id, int genre, int type, String first_name, String last_name, float grade) 
    {
        this.id = id;
        this.genre = genre;
        this.type = type;
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade = grade;
    }
    
    public Estudiante() 
    {
        this.first_name = "";
        this.last_name = "";
        this.id = 0;
        this.genre = 0;
        this.type = 0;
        this.grade = 0;
    }

    public int getId() {
        return id;
    }

    public int getGenre() {
        return genre;
    }

    public int getType() {
        return type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public float getGrade() {
        return grade;
    }
    
}
