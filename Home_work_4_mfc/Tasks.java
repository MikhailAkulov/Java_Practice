package Home_work_4_mfc;

public abstract class Tasks {
    public static int number;

    public int num() {  // метод не абстрактный, наследуется напрямую
        number++;
        return number;  // возврат сгенерированного значения
    }

    public abstract int prioritet(); // метод абстрактный, требует реализации в классе наследнике

    public abstract int time(); // метод абстрактный, требует реализации в классе наследнике
}