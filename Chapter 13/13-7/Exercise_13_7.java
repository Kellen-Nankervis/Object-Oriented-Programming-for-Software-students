package com.company;

class Exercise_13_7 {
    public static void main(String[] args) {
        GeometricObject[] triangles = {new Triangle(8.0,8.0,8.0), new Triangle(4.0,5.0,6.0), new Triangle(3.0,4.0,5.0), new Triangle(7.0, 4.0, 9.0), new Triangle()};

        for(int i = 0; i < 5; i++){
            System.out.println("\nTriangle number: " + (i+1));
            System.out.println("Area: " + triangles[i].getArea());
            System.out.println("How to color: " + ((Triangle)triangles[i]).howToColor());
        }
    }
}
