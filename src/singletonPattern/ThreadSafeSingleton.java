package singletonPattern;

public class ThreadSafeSingleton {
//    volatile keyword to make sure that any changes to this instance are visible to other threads
    private static volatile ThreadSafeSingleton threadSafeSingleton;

    private  ThreadSafeSingleton(){}

    public  static ThreadSafeSingleton getInstance(){
        // check without synchronization
        if(threadSafeSingleton == null){
//            Synchronize only critical area
            synchronized (ThreadSafeSingleton.class){
//                check with synchronization
                if(threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return  threadSafeSingleton;
    }

    void showStatus(){
        System.out.println("Available");
    }
}
