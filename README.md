import java.util.Random;

class RandomNumber extends Thread {
    int number;

    public void run() 
    {
        Random r = new Random();
        number = r.nextInt(50);
        System.out.println("Generated number : " + number); 
    }
    
    int getRandomNumber(){
        return number;
    }
}
class Square extends Thread{
    int number;

    Square(int n){
        number = n;
    }
    public void run(){
        System.out.println("Square : " + number*number);
        
        }
    }

class Cube extends Thread{
    int number;

    Cube(int n){
        number = n;
    }
    public void run(){
        System.out.println("Cube : " + number*number*number);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        }
    }

class Musics{
    public static void main(String[] args){

        RandomNumber rn = new RandomNumber();
        rn.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int number = rn.getRandomNumber();
         Square sq = new Square(number);
         sq.start();
       
        Cube cb = new Cube(number);
        cb.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RandomNumber rn1 = new RandomNumber();
         rn1.start();
         try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          int number1 = rn1.getRandomNumber();
          Square sq1 = new Square(number1);
          sq1.start();
        Cube cb1 = new Cube(number1);
        cb1.start();
        try{
            rn.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
