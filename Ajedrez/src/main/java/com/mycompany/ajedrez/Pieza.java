/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

import java.awt.Color;

/**
 *
 * @author losro
 */
public class Pieza {
    private String nombre;
    private Color color;
    private String imagen;
    private int posX;
    private int posY;

    public Pieza(String nombre, Color color, int posX, int posY) {
        this.nombre = nombre;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    
    if(color == Color.BLACK){
        switch (nombre) { 
            case "Peon":
                imagen="Peonn.png";
             break;
            case "Torre":
                imagen="Torren.png";
            break; 
            case "Alfil" :
               imagen="Alfiln.png";
             break;
            case "Reina" :
                imagen="Reinan.png";
             break;
             case "Rey" :
               imagen="Reyn.png";
             break;
             case "Caballo" :
                imagen="Caballon.png";
             break;
            }
    }
    else{
        switch (nombre) { 
             case "Peon":
                imagen="Peonb.png";
             break;
            case "Torre":
                imagen="Torreb.png";
            break; 
            case "Alfil" :
               imagen="Alfilb.png";
             break;
            case "Reina" :
                imagen="Reinab.png";
             break;
             case "Rey" :
               imagen="Reyb.png";
             break;
             case "Caballo" :
                imagen="Caballob.png";
             break;
            }
    }
    
        
    }

    public Pieza(int i, int j) {
        
        this.nombre=null; 
        this.color = null;
        this.imagen="pixel.png";
        this.posX = i;
        this.posY = j;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}

    
    
    
           
    

