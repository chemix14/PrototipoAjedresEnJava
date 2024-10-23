/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

/**
 *
 * @author losro
 */
public class Movimiento {
    private Pieza pieza;
    private int posX;
    private int posY;

    public Movimiento() {
    }
    
    

public Movimiento(Pieza pieza, int posX, int posY) {
        this.pieza = pieza;
        this.posX = posX;
        this.posY = posY;
    }
    
    

    public Pieza getPieza() {
        return pieza;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
    
}
