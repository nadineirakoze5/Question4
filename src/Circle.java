class Circle extends Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        area = radius*radius*Math.PI;
        System.out.println("The Area of Circle is " + area);
        return area;
    }
}
