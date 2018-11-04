package figure;

public class Figure {

    int size;

    public Figure(int size) {
        this.size = size;
    }

    public void drawFeelRectangle(){
        String res = " ";
        for(int i=0;i<size;i++){
            res += "# ";
        }
        for(int j=0;j<size;j++){
            System.out.println(res);

        }
    }

    public void drawDownTriangle(){

        String res = " # ";
        for(int j=0;j<size;j++){
            System.out.println(res);
            res += "# ";

        }
    }

    public  void drawTopTriangle(){

        String res = " ";
        for(int j=0;j<size;j++){
            for(int i=0;i<size - j ;i++){
                res += "# ";
            }
            System.out.println(res);
            res = " ";

        }
    }

    public void drawChar(){
        String res = " ";
        String buf = " ";

        for(int i=0;i<size;i++){
            res += "# ";
        }
        System.out.println(res);
        for(int j= 1;j<size-1;j++){
            for(int i=0;i< j;i++){
                buf += "  ";
            }
            buf+="# ";
            System.out.println(buf);
            buf =" ";
        }
        System.out.println(res);
    }
}
