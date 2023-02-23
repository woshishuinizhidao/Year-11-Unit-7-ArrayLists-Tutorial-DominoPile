public class Domino {
    private int top;
    private int bottom;

    public Domino (){
        top = 0;
        bottom = 0;
    }

    public Domino (int t, int b){
        top = t;
        bottom = b;
    }

    public int getTop(){return top;}
    public int getBottom(){return bottom;}
    //public int getDomino(){int domino = top / bottom;}
    public void setTop (int top){this.top = top;}
    public void setBottom (int bottom){this.bottom = bottom;}
    public String toString(){return top + "/" + bottom;}
    public String flip(){return bottom + "/" + top;}
    public void settle(){
       if(bottom < top){
            flip();
        }
    }
    public int compareTo(Domino other){
        other.settle();
        settle();
        if(getTop() < other.getTop()){
            return -1;
        }
        else if(getTop() > other.getTop()){
            return 1;
        }
        else if(getTop()==other.getTop()){
            if(getBottom()<other.getBottom()){
                return -1;
            }
            else if(getBottom()>other.getBottom()){
                return 1;
            }
            else if(getBottom()==other.getBottom()){
                return 0;
            }
        }
        return 0;
    }

    public int compareToWeight(Domino other){
        int thisD = (getTop() + getBottom())/2;
        int otherD = (other.getTop() + other.getBottom())/2;
        if(thisD < otherD){
            return -1;
        }
        if(thisD > otherD){
            return 1;
        }
        if(thisD == otherD){
            return 0;
        }
        return 0;
    }

    public boolean canConnect(Domino other){
        if(getTop() == other.getTop() || getTop() == other.getBottom() || getBottom() == other.getTop() || getBottom() == other.getBottom()){
            return true;
        }
        else {return false;}
    }
}
