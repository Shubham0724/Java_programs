class player {
    String gname;
    player(String gname)
    {
        this.gname=gname;
    }
}
class cricket_player extends player{
    int no_of_player;
    cricket_player(String gname,int no_of_player)
    {
        super(gname);
        this.no_of_player=no_of_player;
    }
    void display()
    {
        System.out.println("Game name= "+gname);
        System.out.println("Number of player= "+no_of_player);
    }
}

class football_player extends player{
    int no_of_player;
    football_player(String gname,int no_of_player)
    {
        super(gname);
        this.no_of_player=no_of_player;
    }
    void display()
    {
        System.out.println("Game name= "+gname);
        System.out.println("Number of player= "+no_of_player);
    }
}

class hockey_player extends player{
    int no_of_player;
    hockey_player(String gname,int no_of_player)
    {
        super(gname);
        this.no_of_player=no_of_player;
    }
    void display()
    {
        System.out.println("Game name= "+gname);
        System.out.println("Number of player= "+no_of_player);
    }
}

public class demoplayer
{
    public static void main(String[] args) {
        cricket_player c= new cricket_player("Cricket", 11);
        football_player d= new football_player("Cricket", 11);
        hockey_player e= new hockey_player("Cricket",6);
        c.display();
        d.display();
        e.display();
        


    }
}