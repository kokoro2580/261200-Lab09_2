import oop.ocp.AreaCalculator;
import oop.ocp.Circle;
import oop.ocp.Ellipse;
import oop.ocp.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Rectangle rectangle = new Rectangle(-5,5);///สี่เหลี่ยมใหม่
    Circle circle = new Circle(-5);///วงกลมใหม่
    Ellipse ellipse = new Ellipse(2,-3);///วงรีใหม่

    AreaCalculator calculator = new AreaCalculator();///เริ่มocp
    calculator.calculateArea(rectangle);///คิด4เหลี่ยม
    calculator.calculateArea(circle);///คิดวงกลม
    calculator.calculateArea(ellipse);///คิดวงรี
}
