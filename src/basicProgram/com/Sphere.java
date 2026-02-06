package com.my.shape;
public class Sphere extends Shape{
    Sphere(int dim1){
        super(dim1,-1);
    }
    public double Sphere(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}