import java.util.*;
public class DominoPile {
    private ArrayList<Domino>pile= new ArrayList();
//    private int top;
//    private int bottom;
//    public int getTop(){return top;}
//    public int getBottom(){return bottom;}

    public DominoPile(){
        pile.clear();
//        top = t;
//        bottom = b;
    }

    public ArrayList getPile(){
        return pile;
    }

    public void newStack6(){
        for(int i = 0; i <= 6; i++){
            for(int j = 0; j<=6; j++){
                Domino myObj = new Domino(i,j);
                pile.add(myObj);
            }
        }
    }

    public void shuffleOptionOne(){
        ArrayList<Domino> newPile = new ArrayList();
        Collections.shuffle(pile);
        for(int i = 0; i <=6; i++){
            newPile.add(i,pile.get(i));
        }
    }

    public void shuffleOptionTwo(){
        Random random = new Random();
        int i;
        int j;
        for(int a = 0; a < 100; a++){
            i = random.nextInt(28);
            j = random.nextInt(28);
            Collections.swap(pile,i,j);
        }
    }
}
