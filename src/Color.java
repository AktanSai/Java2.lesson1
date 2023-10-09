public enum Color {
    BLACK(1),
    BROWN(2),
    WHITE(3),
    GRAY(4);
    private int colorCode;

    public int getColorCode() {
        return colorCode;
    }

    Color(int colorCode){
        this.colorCode = colorCode;
    }
}
