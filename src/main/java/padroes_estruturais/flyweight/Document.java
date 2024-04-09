package padroes_estruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<Character> characters = new ArrayList<>();

    public void addCharacter(String nameCharacter, String font, Integer size) {
        CharacterStyle characterStyle = FlyweightStyleFactory.getStyle(font, size);
        Character character = new Character(nameCharacter, characterStyle);
        characters.add(character);
    }

    public List<String> getCharacters() {
        List<String> characters_dto = new ArrayList<String>();
        for (Character character : this.characters) {
            characters_dto.add(character.getCharacter());
        }

        return characters_dto;
    }
}
