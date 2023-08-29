import java.util.*;
class numbergame{
    public static void guessnum(int key,int usernum){
        if(key==usernum){
            System.out.println("correct  :)");
            
        }
        else if(key<usernum){
            System.out.println("too highy  :(");
        }
        else{
            System.out.println("too low  :(");
        }
    }
    public static void main(String args[]){
        int randomnum=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int cout=0;
        while(true){
            System.out.println("guess number: ");
            int guess=sc.nextInt();
            cout++;
            guessnum(randomnum,guess);
            if(randomnum==guess){
                System.out.println("sorce: "+cout);
                break;
            }
        }
    }
}