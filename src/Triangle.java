class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea(){
        area = 0.5*base*height;
        System.out.println("The Area of Triangle is " + area);
        return area;
    }
}
