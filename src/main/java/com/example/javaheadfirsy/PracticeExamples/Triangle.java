public class Triangle {

    double area;
    int height;
    int length;

    void setArea(){
        area = (height*length) / 2;
    }

    public static void main(String [] args){
        int x = 0;
        Triangle ta[]  = new Triangle[4];
        while(x<4){
            ta[x] = new Triangle();
            ta[x].height = (x+1)*2;
            ta[x].length = x+4;
            ta[x].setArea();
            System.out.print("trianle " + x + " area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y=x;
        x=27;
        Triangle t = ta[2];
        ta[2].area = 343;
        System.out.print("y= "+ y);
        System.out.println(", t area = " +t.area );


    }
}