package padroes_estruturais.flyweight;

public class Character {

    private String name;
    private CharacterStyle characterStyle;

    public Character(String name, CharacterStyle characterStyle) {
        this.name = name;
        this.characterStyle = characterStyle;
    }

    public String getCharacter() {
        return "Character{" +
                "name='" + this.name + '\'' +
                ", font='" + characterStyle.getFont() + '\'' +
                ", size='" + characterStyle.getSize() + '\'' +
                '}';
    }

}
