package Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle("red",2,3,20);
        shapes[1]=new Rectangle("blue",3,20, 15, 7);
        shapes[2]=new Circle("black",4,5,17);

        for(Shape shape :shapes){
shape.draw();

        }
    }
}
