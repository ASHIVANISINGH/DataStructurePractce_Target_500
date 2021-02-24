package array.java.world.com.geek.forgeek;

public class TowerOfHanoi {

    public void towerOfHanoiProblem(int n,char sorce,char aux,char dest){

        if(n>0){
            towerOfHanoiProblem(n-1,sorce,dest,aux);
            System.out.println("Move  "+n+" th disc "+" from  "+sorce+"  to "+dest);
            towerOfHanoiProblem(n-1,aux,dest,sorce);
        }
    }
    public static void main(String [] args){
        TowerOfHanoi tower=new TowerOfHanoi();
        tower.towerOfHanoiProblem(3,'A','B','C');
    }
}
