public class Matango {
    private int hp;
    final int LEVEL = 10;
    private char suffix;
    public Matango(int hp, char suffix) {
        setHP(hp);
        setSuffix(suffix);
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public int getHP() {
        return this.hp;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public char getSuffix() {
        return this.suffix;
    }
    public void run() {
        System.out.println("お化けキノコ" + this.getSuffix() + "は逃げ出した！");
    }
}
