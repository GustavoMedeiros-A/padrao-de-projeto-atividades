package padroes_estruturais.flyweight;

public class CharacterStyle {
    private String font;
    private Integer size;

    public CharacterStyle(String font, Integer size) {
        this.font = font;
        this.size = size;
    }

    public String getFont() {
        return this.font;
    }

    public Integer getSize() {
        return this.size;
    }

}
