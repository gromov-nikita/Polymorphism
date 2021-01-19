public class RectangularGlyph extends Glyph{
    private int width = 1;
    RectangularGlyph(int r) {
        width = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), width = " + width);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), width = " + width);
    }
}
