class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length= length;
        this.width = width;
    }
    @Override
    double calculateArea(){
        area = length*width;
        System.out.println("The Area of Rectangle is " + area);
        return area;
    }
}
