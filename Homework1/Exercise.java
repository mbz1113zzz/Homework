package shapes;

import shapes.Circle;

public class Exercise {
    public static void main(String[] args) {

    }

    public static void Ex1_1()//练习1-1
    {
        Circle circle1 = new Circle();
        Square square1 = new Square();
        circle1.makeVisible();
        square1.makeVisible();
    }

    public static void Ex1_2()//练习1-2
    {
        Circle circle2 = new Circle();
        Circle circle2_1 = new Circle();
        circle2.makeVisible();
        circle2_1.makeVisible();

        circle2.moveDown();
        circle2.moveDown();
        circle2.makeInvisible();
        circle2.makeInvisible();

    }

    public static void Ex1_3()//练习1-3，
    {
        Circle circle3 = new Circle();
        Circle circle3_1 = new Circle();
        circle3.makeVisible();
        circle3_1.makeVisible();

        circle3.moveVertical(0);
        circle3.slowMoveVertical(0);
        circle3.moveHorizontal(-70);
    }

    public static void Ex1_4()//练习1-4
    {
        Circle circle4_1 = new Circle();
        circle4_1.moveHorizontal(70);
        Circle circle4_2 = new Circle();
        circle4_1.makeVisible();
        circle4_2.makeVisible();

        circle4_1.changeColor("red");
        circle4_2.changeColor("black");
    }

    public static void Ex1_5()//练习1-5
    {
        Circle circle5_1 = new Circle();
        circle5_1.makeVisible();//创建一个圆

        circle5_1.changeColor("grey");
    }

    public static void Ex1_6()//练习1-6
    {
        Circle circle6_1 = new Circle();
        circle6_1.makeVisible();//创建一个圆

    }

    public static void Ex1_7()//练习1-7
    {
        Circle circle7_1 = new Circle();
        circle7_1.moveHorizontal(100);
        circle7_1.changeSize(20);
        circle7_1.changeColor("green");
        circle7_1.makeVisible();//绿色小圆

        Circle circle7_2 = new Circle();
        circle7_2.changeSize(50);
        circle7_2.moveVertical(60);
        circle7_2.changeColor("yellow");
        circle7_2.makeVisible();//黄色大圆

        Triangle triangle7_1 = new Triangle();
        triangle7_1.changeColor("black");
        triangle7_1.changeSize(30, 30);
        triangle7_1.moveHorizontal(40);
        triangle7_1.makeVisible();//黑色三角形

        Square square7_1 = new Square();
        square7_1.changeColor("blue");
        square7_1.changeSize(60);
        square7_1.moveVertical(60);
        square7_1.moveHorizontal(60);
        square7_1.makeVisible();//蓝色正方形
    }

    public static void Ex1_8()//练习1-8
    {
        Circle circle8_1 = new Circle();
        circle8_1.moveDown();
    }

    public static void Ex1_9()//练习1-10
    {
        Picture picture = new Picture();
        picture.draw();
    }

    public static void Ex1_10()//练习1-10
    {
        Picture picture = new Picture();
        picture.draw();
        picture.setBlackAndWhite();
        picture.setColor();
    }


    public static void Ex1_14()//练习14
    {
        Picture picture = new Picture();
        picture.draw();
        Circle sun2 = new Circle();
        sun2.makeVisible();
    }

}



