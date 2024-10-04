package thread.example;

public class Cestino {
    private int num;

    public Cestino(int count){
        this.num = count;
    }

    public int getMonete(){
        return this.num;
    }

    public void addMoneta(int n){
        this.num += n;
    }
}
