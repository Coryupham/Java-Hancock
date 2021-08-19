public class Hello {
    private int num;

    //constructor: special method to init variables
    public Hello(){
        num = 0;
    }

    public Hello(int startingValue){
        num = startingValue;
    }

    public void plus(){
        num += 100;
    }

    public void display (){
        System.out.println(num);
    }

    public int getNum(){
        return num;
    }

}
