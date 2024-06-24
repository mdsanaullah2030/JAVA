
package multithread;


public class Multithread {


    public static void main(String[] args) {
       
        
          MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.setName("Thread 2");
        thread2.start();
    }
}

