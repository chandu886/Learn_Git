public class WallArea{
    double width;
    double height;  //Instance variables
   // public static void main(String args[]){
    WallArea(){

    }
    WallArea(double width,double height){
            width =1;
            height=-1;
    }
    public WallArea() {
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
        if(width<0){
            setWidth(width=0);
        }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
        if(height<0){
            setHeight(height=0);
    }
        
    }
    public static void main(String args[]) {

    
}
}

