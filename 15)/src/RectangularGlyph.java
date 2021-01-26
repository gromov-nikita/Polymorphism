import com.gromovLearn.*;
public class RectangularGlyph extends Glyph{
    private int width = 1;
    public RectangularGlyph(int r) {
        width = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), width = " + width);
    }
    public void draw() {
        System.out.println("RectangularGlyph.draw(), width = " + width);
    }
}
