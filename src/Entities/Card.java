package Entities;

public interface Card {

    public Type getType();

    public int getId();

    public enum Type{
        TopicCard,
        WildCard
    }
}
