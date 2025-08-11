package algorithm.mutualExclusion;

import java.util.Random;

public class SemaphoreExample {

    public static class Semaphore {

        // 세마포어 카운트
        private static int count;

        public static int getCount() {
            return count;
        }

        // 임계 영역: 공유 자원(count)을 제어하는 acquire 메서드 세마포어 값을 감소시킴
        // p 연산
        public synchronized void acquire() throws InterruptedException {
            // 점유 대기: 카운트가 0이면 대기
            while (count == 0) {
                wait(); // 대기
            }
            // 상호 배제: 카운트 감소
            count--;
        }

        // 임계 영역: 공유 자원(count)을 제어하는 release 메서드 세마포어 값을 증가시키고, 대기 중인 스레드에 알림
        // v 연산
        public synchronized void release() {
            count++; // 세마포어 값을 증가
            notify(); // 대기 중인 스레드에 알림
        }

        // 생성자
        public Semaphore(int count){
            this.count = count;
        }
    }


    private static void useResource() throws InterruptedException {
        Random random = new Random();
        int sleepTime = random.nextInt(5000) + 1000; // 1초에서 5초 사이의 랜덤한 값으로 대기
        System.out.println(Thread.currentThread().getName() + " is using a resource for " + sleepTime + " ms");
        Thread.sleep(sleepTime); // 리소스 사용
    }


    public static void main(String[] args) {
        final int NUM_THREADS = 10;
        final int NUM_RESOURCES = 3;
        final Semaphore semaphore = new Semaphore(NUM_RESOURCES);

        for (int i = 0; i < NUM_THREADS; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(semaphore.getCount());
                        semaphore.acquire(); // 세마포어로부터 리소스를 획득
                        useResource(); // 리소스 사용
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(semaphore.getCount());
                        semaphore.release(); // 세마포어에 리소스 반납
                    }
                }
            }).start();
        }
    }

}

