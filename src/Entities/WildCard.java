package Entities;

public class WildCard implements Card{

    private int id;
    private Colors colors;

    public WildCard(int id, Colors colors){
        this.id = id;
        this.colors = colors;
    }

    @Override
    public Type getType() {
        return Type.WildCard;
    }

    @Override
    public int getId() {
        return id;
    }

    public Colors getColors(){
        return colors;
    }

    public enum Colors{
        RED_BLUE,
        BLUE_PINK,
        PINK_PURPLE,
        PURPLE_GREEN,
        GREEN_YELLOW,
        YELLOW_ORANGE,
        ORANGE_BROWN,
        BROWN_RED

    }
}
