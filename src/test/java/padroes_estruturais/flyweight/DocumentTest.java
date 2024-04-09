package padroes_estruturais.flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentTest {

    @Test
    void shouldReturnDocument() {
        Document character = new Document();

        character.addCharacter("A", "arial", 16);

        List<String> characters = Arrays.asList(
                "Character{name='A', font='arial', size='16'}");
        assertEquals(characters, character.getCharacters());
    }

    @Test
    void shouldReturnQuantityCharacter() {
        var document = new Document();
        document.addCharacter("A", "arial", 16);

        assertEquals(1, FlyweightStyleFactory.stylesSize());
    }
}