package com.mygdx.game.base;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


import java.util.ArrayList;
import java.util.List;


public class Table {
    private List<Piece> pieces;
    private int initPositionX;
    private int initPositionY;

    private int emptyX;
    private int emptyY;
    private int count=0;
    public void draw(SpriteBatch batch){
        for (int i=0;i<pieces.size();i++
             ) {
            pieces.get(i).draw(batch,initPositionX,initPositionY);
        }
    }

    public static List<Piece> buildPieces(Texture texture,int width,int height,int imageWidth,int imageHeight,Table table){
        List<Piece> retorno=new ArrayList<>();
        int maxY=imageHeight/height;
        for(int i=0;(i*height)<imageHeight;i++){
            for(int j=0;(j*width)<imageWidth;j++){
                Piece pieza=new Piece();
                pieza.setX(j);
                pieza.setY(maxY-i);
                pieza.setSizeX(width);
                pieza.setSizeY(height);
                pieza.setCanMove(((table.getEmptyX()+1)==j&&(table.getEmptyY())==(maxY-i))||
                        ((table.getEmptyX())==j&&(table.getEmptyY()-1)==(maxY-i)));
                pieza.setShouldDraw(!(table.getEmptyX()==j && table.getEmptyY()==(maxY-i)));
                pieza.setRegion(new TextureRegion(texture,
                        (j*height),
                        (i*width),height,width));
                retorno.add(pieza);
            }
        }
        return retorno;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public int getInitPositionX() {
        return initPositionX;
    }

    public void setInitPositionX(int initPositionX) {
        this.initPositionX = initPositionX;
    }

    public int getInitPositionY() {
        return initPositionY;
    }

    public void setInitPositionY(int initPositionY) {
        this.initPositionY = initPositionY;
    }

    public int getEmptyX() {
        return emptyX;
    }

    public void setEmptyX(int emptyX) {
        this.emptyX = emptyX;
    }

    public int getEmptyY() {
        return emptyY;
    }

    public void setEmptyY(int emptyY) {
        this.emptyY = emptyY;
    }
}
