package pl.edu.utp;

public class StructureTest {

    int a = 0;

    public StructureTest() {
        System.out.println("hi from constructor!");
        a = 10;
    }

    //code block
    {
        System.out.println("hi! I'm code block");
        a = 5;
    }

    void displayA() {
        System.out.println(a);
    }

}
