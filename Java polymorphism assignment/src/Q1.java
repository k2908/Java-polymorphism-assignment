
class Q1 {

	public static void main(String[] args) {
		Shape  Shapes[]= new Shape[2];
		Shapes[0]=new Rectangle("green", 5, 6);
		Shapes[1]=new Triangle("blue", 2, 5);
		for(int i=0; i< Shapes.length;i++) {
			System.out.println(Shapes[i].toString());
		}
	}

}
abstract class Shape{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
 public Shape() {
	 
 };
 public Shape(String color) {
	 this.color=color;
 }

public String toString() {
	return "Shape [color=" + color + "]";
};
	
}
class Rectangle extends Shape{
	public Rectangle() {
		super();
	}
	
	int length;
	int width;
	Rectangle(String color,int length,int width){
		super(color);
		this.length= length;
		this.width= width;
		
	}
	
	
	public double getArea() {
		// TODO Auto-generated method stub
		double area =0;
		area=length*width;
		return area;
	}


	
	public String toString() {
		return "Rectangle with length=" + length + " and width " + width + "has area as " + getArea();
	}
	
}
class Triangle extends Shape{
	public Triangle() {
		super();
	}
	int base;
	int height;
	
	public Triangle(String color,int base, int height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	public double getArea(){
		double area=0;
		area=(base*height)*0.5;
		return area;
		
	}
	
	public String toString() {
		return "Triangle with base=" + base + " and height " + height + " has area as " + getArea();
	}

	


	
}