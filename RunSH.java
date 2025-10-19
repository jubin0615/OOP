package OOP;

import java.util.*;

class CS21 {
    protected int count;
    public void setCount(int count) {
        this.count = count;
    }
    public String study(boolean isStudy){
        if(isStudy)
            return "공부한다";
        else return "공부해라!";
    }
}
interface Runnable{
    String run();
}
class Lsh extends CS21 implements Runnable{
    @Override
    public String run(){
        if(this.count == 18)
            return "18런승현";
        else return "런승현" + this.count;
    }
    @Override
    public String study(boolean isStudy){
        return this.run() + " " + super.study(isStudy);
    }
}

public class RunSH {
    public static void main(String[] args){
        Lsh lsh = new Lsh();

        Random random = new Random();
        int runCount = random.nextInt(30) + 1;
        lsh.setCount(runCount);

        boolean isStudy=false;
        System.out.println(lsh.study(isStudy));
    }
}
