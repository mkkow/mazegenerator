package com.company;

public class Cell {
    private boolean visited;
    private int x,y;
    private boolean N,S,E,W;

    public Cell()
    {
        visited = false;
        x = -1;
        y = -1;
        N=S=E=W=true;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
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

    public boolean isW() {
        return W;
    }

    public void setW(boolean left) {
        this.W = left;
    }

    public boolean isN() {
        return N;
    }

    public void setN(boolean up) {
        this.N = up;
    }

    public boolean isE() {
        return E;
    }

    public void setE(boolean right) {
        this.E = right;
    }

    public boolean isS() {
        return S;
    }

    public void setS(boolean down) {
        this.S = down;
    }
}
