import java.awt.*;
public enum ColorNew {
    BLUE(Color.BLUE),

    RED(Color.RED),
    BLACK(Color.BLACK),
    GRAY(Color.GRAY);

    private final Color awtColor;

    ColorNew(Color awtColor) {
        this.awtColor = awtColor;
    }
    public Color getAwtColor() {
        return awtColor;
    }
}
