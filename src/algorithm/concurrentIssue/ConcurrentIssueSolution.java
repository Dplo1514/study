package algorithm.concurrentIssue;

public class ConcurrentIssueSolution {

    /* Synchronized란?
        * synchronized는 Java에서 동시성 문제를 해결하기 위해 사용하는 키워드입니다.
        * synchronized는 메서드 또는 블록에 사용할 수 있으며, 해당 메서드 또는 블록이 한 번에 하나의 스레드에 의해서만 실행되도록 보장합니다.
        * synchronized를 사용하는 메서드 또는 블록은 임계영역(critical section)으로 설정되며, 하나의 스레드가 임계영역에 진입하면 다른 스레드는 해당 영역에 접근할 수 없습니다.
        * 이를 통해 다른 스레드들이 영역에 접근하지 못하게 하여 동시성 문제를 해결할 수 있습니다.

       1. Method를 사용하는 방법
        public synchronized void someMethod() {
            // 메서드 내용
        }

       2. 코드 블럭에 사용하는 방법
        public void someMethod() {
            synchronized (someObject) {
                // 임계 영역 내용
            }
        }
    */

    private int sharedResource = 0;

    public static void main(String[] args) throws InterruptedException {
        ConcurrentIssueSolution example = new ConcurrentIssueSolution();
        example.doWork();
    }

    public synchronized void incrementCounter() {
        // synchronized 블럭으로 감싸서 하나의 스레드만 접근할 수 있도록 함
        for (int i = 0; i < 1000; i++) {
            sharedResource++;
            System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
        }
    }

    public synchronized void decrementCounter() {
        // synchronized 블럭으로 감싸서 하나의 스레드만 접근할 수 있도록 함
        for (int i = 0; i < 1000; i++) {
            sharedResource--;
            System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
        }
    }

    public void doWork() throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 1. 현재 counter 값을 1000번 증가시킴
                incrementCounter();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 2. 현재 counter 값을 1000번 감소시킴
                decrementCounter();
            }
        });

        // 3. 두 스레드를 시작
        thread1.start();
        thread2.start();

        // 4. 두 스레드의 종료를 대기
        thread1.join();
        thread2.join();

        // 5. 결과 출력
        System.out.println("Final Counter: " + sharedResource);
    }
}

