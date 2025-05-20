package ly.interfaceAndpolymorphicExam;

public class Test01 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        Mouse mouse = new Mouse();
        noteBook.start();
        noteBook.useUsb(mouse);
        noteBook.stop();
        System.out.println("===================");
        KeyBoard keyBoard = new KeyBoard();
        noteBook.start();
        noteBook.useUsb(keyBoard);
        noteBook.stop();
    }
}
