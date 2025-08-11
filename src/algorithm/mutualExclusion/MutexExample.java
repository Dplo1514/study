package algorithm.mutualExclusion;
public class MutexExample {

    // 1. Mutex 선언
    private final Object lock = new Object();
    private int sharedResource = 0;

    public static void main(String[] args) throws InterruptedException {
        MutexExample example = new MutexExample();
        example.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*
                    2. Mutex를 이용한 동기화 처리된 임계 영역 Mutex 객체를 사용해 상호 배제를 구현함
                       Mutex 객체를 소유하지 않은 다른 스레드는 sharedResource 객체에 대한 접근이 불가능하게 됨
                       점유 대기와 순환 대기 상태는 발생하지 않음
                */
                // 한 프로세스 내부에서 하나의 스레드만 mutex 객체에 접근 가능하게한다.
                synchronized (lock) {
                    for (int i = 0; i < 1000; i++) {
                        sharedResource++;
                        System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 1000; i++) {
                        sharedResource--;
                        System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
                    }
                }
            }
        });
        /*
            3. 각 스레드에 Mutex 전달 두 스레드가 동일한 Mutex 객체를 사용하도록 함
               두 스레드는 Mutex 객체에 대한 경합이 발생할 경우, 상호 배제를 위해 대기하게 됨
        */
        thread1.start();
        thread2.start();

        // 4. 두 스레드의 종료 대기
        thread1.join();
        thread2.join();

        // 5. 결과 출력
        System.out.println("Final Counter: " + sharedResource);
    }
}

