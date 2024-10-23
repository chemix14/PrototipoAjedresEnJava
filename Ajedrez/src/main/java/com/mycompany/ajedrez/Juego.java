/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.DefaultListModel;

/**
 *
 * @author losro
 */
public class Juego {
    private Tablero tablero;
    private Pieza[][] piezas = new Pieza[8][8];
    private Stack<Movimiento> movimientos;
    
    public Juego(Tablero tablero, Pieza[][] piezas) {
        this.tablero = tablero;
        this.piezas = piezas;
    }
    
    public Juego(){
        this.piezas[0][0] = new Pieza("Torre",Color.BLACK,0,0);
        this.piezas[0][1] = new Pieza("Caballo",Color.BLACK,0,1);
        this.piezas[0][2] = new Pieza("Alfil",Color.BLACK,0,2);
        this.piezas[0][3] = new Pieza("Reina",Color.BLACK,0,3);
        this.piezas[0][4] = new Pieza("Rey",Color.BLACK,0,4);
        this.piezas[0][5] = new Pieza("Alfil",Color.BLACK,0,5);
        this.piezas[0][6] = new Pieza("Caballo",Color.BLACK,0,6);
        this.piezas[0][7] = new Pieza("Torre",Color.BLACK,0,7);
         this.piezas[1][0] = new Pieza("Peon",Color.BLACK,1,0);
        this.piezas[1][1] = new Pieza("Peon",Color.BLACK,1,1);
        this.piezas[1][2] = new Pieza("Peon",Color.BLACK,1,2);
        this.piezas[1][3] = new Pieza("Peon",Color.BLACK,1,3);
        this.piezas[1][4] = new Pieza("Peon",Color.BLACK,1,4);
        this.piezas[1][5] = new Pieza("Peon",Color.BLACK,1,5);
        this.piezas[1][6] = new Pieza("Peon",Color.BLACK,1,6);
        this.piezas[1][7] = new Pieza("Peon",Color.BLACK,1,7);
        
        for(int i=0; i <= 5; i++){
            for(int j=0; j<=5; j++){
                this.piezas[i+2][j] = new Pieza(i+2,j);
            }
        }
        
        
        
        this.piezas[7][0] = new Pieza("Torre",Color.WHITE,7,0);
        this.piezas[7][1] = new Pieza("Caballo",Color.WHITE,7,1);
        this.piezas[7][2] = new Pieza("Alfil",Color.WHITE,7,2);
        this.piezas[7][3] = new Pieza("Reina",Color.WHITE,7,3);
        this.piezas[7][4] = new Pieza("Rey",Color.WHITE,7,4);
        this.piezas[7][5] = new Pieza("Alfil",Color.WHITE,7,5);
        this.piezas[7][6] = new Pieza("Caballo",Color.WHITE,7,6);
        this.piezas[7][7] = new Pieza("Torre",Color.WHITE,7,7);
         this.piezas[6][0] = new Pieza("Peon",Color.WHITE,6,0);
        this.piezas[6][1] = new Pieza("Peon",Color.WHITE,6,1);
        this.piezas[6][2] = new Pieza("Peon",Color.WHITE,6,2);
        this.piezas[6][3] = new Pieza("Peon",Color.WHITE,6,3);
        this.piezas[6][4] = new Pieza("Peon",Color.WHITE,6,4);
        this.piezas[6][5] = new Pieza("Peon",Color.WHITE,6,5);
        this.piezas[6][6] = new Pieza("Peon",Color.WHITE,6,6);
        this.piezas[6][7] = new Pieza("Peon",Color.WHITE,6,7);
        
    }
      
    public List<Pieza> mostrarPizas(){
        List<Pieza> a = new ArrayList<Pieza>();
        System.out.println("------------------------------------------------------------");
        for(int i=0; i<8 ; i++){
            for(int j = 0; j<8 ; j++){
                if(this.piezas[i][j] !=null){
                   a.add(this.piezas[i][j]);
                   
                }
                
            }
        }
        return a;
    }
    
    
   /*public void mostrarPizas1(){
        System.out.println("------------------------------------------------------------");
        for(int i=0; i<8 ; i++){
            for(int j = 0; j<8 ; j++){
                if(this.piezas[i][j] !=null){
                   System.out.println(piezas[i][j].getNombre()+" - "+piezas[i][j].getPosX()+" , "+piezas[i][j].getPosY());
                   
                }
                
            }
        }
    }*/
    
    public DefaultListModel mostrarMovimientos(){
        DefaultListModel l2 = new DefaultListModel();
        System.out.println("------------------------------------------------------------");
         
        while(!this.getMovimientos().empty()){
            
            Movimiento m1 = new Movimiento();
            m1 = this.getMovimientos().pop();
            System.out.println(m1.getPieza().getNombre()+" "+m1.getPosX()+","+m1.getPosY());
          String a=m1.getPieza().getNombre();
          String h=String.valueOf(m1.getPosX());
          String z=String.valueOf(m1.getPosY());
           this.piezas[m1.getPieza().getPosX()][m1.getPieza().getPosY()] = new Pieza(m1.getPieza().getPosX(),m1.getPieza().getPosY());
           this.piezas[m1.getPosX()][m1.getPosY()]= new Pieza(m1.getPieza().getNombre(),m1.getPieza().getColor(),m1.getPosX(),m1.getPosY());
          
           l2.addElement(a+" de "+m1.getPieza().getPosX()+","+m1.getPieza().getPosY()+" a "+" "+h+","+z);
           
        }
        return l2;
    }
    
    /*
    public DefaultListModel mostrarMovimientos2(){
        DefaultListModel l2 = new DefaultListModel();
        System.out.println("------------------------------------------------------------");
         
        while(!this.getMovimientos().empty()){
            
            Movimiento m1 = new Movimiento();
            m1 = this.getMovimientos().pop();
            System.out.println(m1.getPieza().getNombre()+" "+m1.getPosX()+","+m1.getPosY());
          String a=m1.getPieza().getNombre();
          String h=String.valueOf(m1.getPosX());
          String z=String.valueOf(m1.getPosY());
           this.piezas[m1.getPieza().getPosX()][m1.getPieza().getPosY()] = new Pieza(m1.getPieza().getPosX(),m1.getPieza().getPosY());
           this.piezas[m1.getPosX()][m1.getPosY()]= new Pieza(m1.getPieza().getNombre(),m1.getPieza().getColor(),m1.getPosX(),m1.getPosY());
          
           l2.addElement(a+" de "+m1.getPieza().getPosX()+","+m1.getPieza().getPosY()+" a "+a+" "+h+","+z);
           
        }
        return l2;
    }*/
    
    
    public Stack<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Stack<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Pieza[][] getPiezas() {
        return piezas;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void setPiezas(Pieza[][] piezas) {
        this.piezas = piezas;
    }
    
}
