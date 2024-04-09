
package padroes_estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightStyleFactory {
    private static Map<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font, Integer size) {
        var style = styles.get(font);
        if (style == null) {
            style = new CharacterStyle(font, size);
            styles.put(font, style);
        }

        return style;
    }

    public static int stylesSize() {
        return styles.size();
    }

}
