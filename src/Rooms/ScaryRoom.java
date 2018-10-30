package Rooms;

import Game.Runner;
import People.Person;


public class ScaryRoom extends Room{

    public ScaryRoom(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc((int)(Math.random()*6));

        x.setyLoc((int)(Math.random()*6));
        System.out.println("BOO! I scared ya! Why are u running! ~");

    }


}
