package Interface;

public class Interfaces {
    public static void main(String[]args){
        Queen q =new Queen();
        q.moves();
        Camel c =new Camel();
        c.moves();
        Horse h =new Horse();
        h.moves();
        Elephant e =new Elephant();
        e.moves();
        Soldier s =new Soldier();
        s.moves();

    }
    
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Queen moves in all directions");
    }
}
class Camel implements chessPlayer{
    public void moves(){
        System.out.println("Camel moves in diagonal directions");
    }
}
class Horse implements chessPlayer{
    public void moves(){
        System.out.println("Horse moves in L-shape directions");
    }
}
class Elephant implements chessPlayer{
    public void moves(){
        System.out.println("Elephant moves in staright or sideways directions");
    }
}
class Soldier implements chessPlayer{
    public void moves(){
        System.out.println("Soldier moves two steps ahead or kills in diagonals");
    }
}
    
