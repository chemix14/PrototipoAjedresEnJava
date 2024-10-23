/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author losro
 */
public class Tablero {
    private int[][] plano = new int[8][8];
    private int ancho;
    private int alto;
    private int color;
    private int numCuadros = 8;
    
    public static void main(String[] a){
        Tablero t1 = new Tablero();
        //t1.dibujar();
    }
    
    
    public Tablero() {
    }

    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
   
        
   public void dibujar(Graphics g, JPanel p) {
        int numCuadros = 8; 
        int anchoCuadro = p.getWidth() / numCuadros;
        int altoCuadro = p.getHeight() / numCuadros;
        
        for (int fila = 0; fila < numCuadros; fila++) {
            for (int col = 0 ; col < numCuadros; col++) {
                if ((fila + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col * anchoCuadro, fila * altoCuadro, anchoCuadro, altoCuadro);
            }
        }
    }
    
    public void dibujar(Graphics g, JPanel p, Pieza[][] piezas) {
       
        int anchoCuadro = p.getWidth() / numCuadros;
        int altoCuadro = p.getHeight() / numCuadros;
        int x=0, y =0;
        int tam=30;
        String nImg="";
        
        for (int fila = 0; fila < numCuadros; fila++) {
            for (int col = 0 ; col < numCuadros; col++) {
                
                if ((fila + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                
                g.fillRect(col * anchoCuadro, fila * altoCuadro, anchoCuadro, altoCuadro);
                
                if(piezas[fila][col]!=null){
                    
                    x=(col * anchoCuadro) + (anchoCuadro/2-20);
                    y=(fila * altoCuadro) + (altoCuadro/2-20);
                    if(piezas[fila][col].getImagen().equals("pixel.png")) tam =0;
                    else tam = (anchoCuadro/2+10);
                    
                    nImg = piezas[fila][col].getImagen();
                    
                    ImageIcon img = new ImageIcon(getClass().getResource(nImg));
                     g.drawImage(img.getImage(), x,y,  tam,tam+10, null);
                     System.out.println("PosXIMG: " + x+" PosYIMG: "+ y);
                     
                }
            }
        }
    }
    
    public Graphics cambiaColor(Graphics g){
        if(color == 0){
                    g.setColor(Color.BLACK);
                    color=1;
                }
                else{
                    g.setColor(Color.WHITE);
                    color=0;
        }
        return g;
    }

    public int[][] getPlano() {
        return plano;
    }

    public void setPlano(int[][] plano) {
        this.plano = plano;
    }
    
    
}
