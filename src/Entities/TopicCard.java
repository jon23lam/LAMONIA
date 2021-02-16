package Entities;

public class TopicCard implements Card{

    private int id;
    private String topic;
    private Color color;

    public TopicCard(int id, String topic, Color color){
        this.id = id;
        this.topic = topic;
        this.color = color;
    }

    @Override
    public Type getType() {
        return Type.TopicCard;
    }

    @Override
    public int getId() {
        return id;
    }

    public Color getColor(){
        return color;
    }

    public String getTopic(){
        return topic;
    }

    public enum Color{
        RED,
        BLUE,
        PINK,
        PURPLE,
        GREEN,
        YELLOW,
        ORANGE,
        BROWN
    }
}
