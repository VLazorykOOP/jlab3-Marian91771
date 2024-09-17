// Завдання 1
// Базовий клас Двигун
class Engine {
    protected String model;
    protected int power; // Потужність в кінських силах (hp)

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public void show() {
        System.out.println("Model: " + model + ", Power: " + power + " hp");
    }
}

// Підклас Двигун внутрішнього згоряння
class InternalCombustionEngine extends Engine {
    protected String fuelType; // Тип палива

    public InternalCombustionEngine(String model, int power, String fuelType) {
        super(model, power);
        this.fuelType = fuelType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Підклас Дизельний двигун
class DieselEngine extends InternalCombustionEngine {
    private boolean turbocharged; // Чи є турбонаддув

    public DieselEngine(String model, int power, boolean turbocharged) {
        super(model, power, "Diesel");
        this.turbocharged = turbocharged;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Turbocharged: " + (turbocharged ? "Yes" : "No"));
    }
}

// Підклас Реактивний двигун
class JetEngine extends Engine {
    private int thrust; // Сила тяги

    public JetEngine(String model, int power, int thrust) {
        super(model, power);
        this.thrust = thrust;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Thrust: " + thrust + " N");
    }
}

// Головний клас програми
public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів типу Engine
        Engine[] engines = new Engine[3];

        // Ініціалізація об'єктів
        engines[0] = new DieselEngine("1.9 TDI", 200, true);
        engines[1] = new JetEngine("JetPro", 1000, 50000);
        engines[2] = new InternalCombustionEngine("1.4 MPI", 150, "Gasoline");

        // Виведення інформації про кожен двигун
        for (Engine engine : engines) {
            engine.show();
            System.out.println();
        }
    }
}


// Завдання 2
//// Абстрактний клас Norm
//abstract class Norm {
//    public abstract double calculateMagnitude(); // Обчислення модуля вектора
//    public double calculateNorm() {
//        double magnitude = calculateMagnitude();
//        return magnitude * magnitude; // Норма - квадрат модуля
//    }
//}
//
//// Клас для 2D вектора
//class Vector2D extends Norm {
//    private double x;
//    private double y;
//
//    public Vector2D(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public double calculateMagnitude() {
//        return Math.sqrt(x * x + y * y); // Модуль як корінь з суми квадратів
//    }
//
//    @Override
//    public String toString() {
//        return "Vector2D(" + x + ", " + y + ")";
//    }
//}
//
//// Клас для 3D вектора
//class Vector3D extends Norm {
//    private double x;
//    private double y;
//    private double z;
//
//    public Vector3D(double x, double y, double z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    @Override
//    public double calculateMagnitude() {
//        return Math.max(Math.max(x, y), z); // Модуль як максимальне значення компонент
//    }
//
//    @Override
//    public String toString() {
//        return "Vector3D(" + x + ", " + y + ", " + z + ")";
//    }
//}
//
//// Головний клас програми
//public class Main {
//    public static void main(String[] args) {
//        // Створення об'єктів Vector2D і Vector3D
//        Norm[] vectors = new Norm[2];
//        vectors[0] = new Vector2D(3, 4);
//        vectors[1] = new Vector3D(1, 5, 2);
//
//        // Виведення модулів та норм для кожного вектора
//        for (Norm vector : vectors) {
//            System.out.println(vector);
//            System.out.println("Magnitude: " + vector.calculateMagnitude());
//            System.out.println("Norm: " + vector.calculateNorm());
//            System.out.println();
//        }
//    }
//}


// Завдання 3
// Інтерфейс Norm
//interface Norm {
//    double calculateMagnitude(); // Обчислення модуля вектора
//    default double calculateNorm() {
//        double magnitude = calculateMagnitude();
//        return magnitude * magnitude; // Норма - квадрат модуля
//    }
//}
//
//// Клас для 2D вектора
//class Vector2D implements Norm {
//    private double x;
//    private double y;
//
//    public Vector2D(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public double calculateMagnitude() {
//        return Math.sqrt(x * x + y * y); // Модуль як корінь з суми квадратів
//    }
//
//    @Override
//    public String toString() {
//        return "Vector2D(" + x + ", " + y + ")";
//    }
//}
//
//// Клас для 3D вектора
//class Vector3D implements Norm {
//    private double x;
//    private double y;
//    private double z;
//
//    public Vector3D(double x, double y, double z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    @Override
//    public double calculateMagnitude() {
//        return Math.max(Math.max(x, y), z); // Модуль як максимальне значення компонент
//    }
//
//    @Override
//    public String toString() {
//        return "Vector3D(" + x + ", " + y + ", " + z + ")";
//    }
//}
//
//// Головний клас програми
//public class Main {
//    public static void main(String[] args) {
//        // Створення об'єктів Vector2D і Vector3D
//        Norm[] vectors = new Norm[2];
//        vectors[0] = new Vector2D(3, 4);
//        vectors[1] = new Vector3D(1, 5, 2);
//
//        // Виведення модулів та норм для кожного вектора
//        for (Norm vector : vectors) {
//            System.out.println(vector);
//            System.out.println("Magnitude: " + vector.calculateMagnitude());
//            System.out.println("Norm: " + vector.calculateNorm());
//            System.out.println();
//        }
//    }
//}
