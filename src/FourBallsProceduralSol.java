import processing.core.PApplet;

public class FourBallsProceduralSol extends PApplet {
    int x=0;
    int x1=0;
    int x2=0;
    int x3=0;
    static int height=1000;
    static int width=1000;

        public  void settings(){
            size(width, height);
        }

        public  void draw(){
            circle(x, height/5,10);
            x=x+1;
            circle(x1, (height*2)/5, 10);
            x1=x1+2;
            circle(x2, (height*3)/5, 10);
            x2=x2+3;
            circle(x3, (height*4)/5, 10);
            x3=x3+4;
        }

        public static void main(String[] args){
            PApplet.main("FourBallsProceduralSol",args);
        }

}
