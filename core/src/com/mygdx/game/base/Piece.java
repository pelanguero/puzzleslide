package com.mygdx.game.base;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Piece {
    private TextureRegion region;
    private int x;
    private int y;
    private int sizeX;
    private int sizeY;
    private boolean canMove;
    private boolean shouldDraw;
    private int count=0;
    public Piece() {

    }

    public void draw(SpriteBatch batch,int offsetX,int offsetY){
        if(shouldDraw){
            batch.draw(region,offsetX+((x+1)*sizeX),offsetY+((y+1)*sizeY));
        }
    }

    public TextureRegion getRegion() {
        return region;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setRegion(TextureRegion region) {
        this.region = region;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "region=" + region +
                ", x=" + x +
                ", y=" + y +
                ", sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", canMove=" + canMove +
                '}';
    }

    public boolean isShouldDraw() {
        return shouldDraw;
    }

    public void setShouldDraw(boolean shouldDraw) {
        this.shouldDraw = shouldDraw;
    }
}
