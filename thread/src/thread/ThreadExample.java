package thread;

public class ThreadExample {

    public static void main(String[] args) {
//        Runnable printA = (Runnable) new PrintChar('a', 100);
//        Runnable printB = (Runnable) new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

//        java.lang.Thread thread1 = new java.lang.Thread(printA);
//        java.lang.Thread thread2 = new java.lang.Thread(printB);
        java.lang.Thread thread3 = new java.lang.Thread(print100);

//        thread1.start();
//        thread2.start();
        thread3.start();
    }
    
}
