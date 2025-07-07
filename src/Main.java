public class Main {
    public static void main(String[] args) {
        Hero h = new Hero(40, "ミナト");
        King k = new King();
        k.talk(h);
        Inn inn = new Inn();
        inn.checkIn(h);
        Matango m = new Matango(100, 'A');
        h.attack(m);
    }
}