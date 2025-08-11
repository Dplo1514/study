package algorithm.concurrentIssue;

public class ConcurrentIssueExample {
    // 각각의 스레드가 공유할 공유 자원이다.
    private int sharedResource = 0;

    public static void main(String[] args) throws InterruptedException {
        ConcurrentIssueExample example = new ConcurrentIssueExample();
        example.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 1. 현재 sharedResource 값을 1000번 증가시킴
                for (int i = 0; i < 1000; i++) {
                    sharedResource++;
                    System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
                    /*  기대 값
                        1, 2, 3, 4, 5, ..., 999, 1000
                    */
                    /*  출력 값
                        0 번째 반복 sharedResource : 1
                        1 번째 반복 sharedResource : -998
                        2 번째 반복 sharedResource : -997
                        3 번째 반복 sharedResource : -996
                        4 번째 반복 sharedResource : -995
                        5 번째 반복 sharedResource : -994
                        6 번째 반복 sharedResource : -993
                        7 번째 반복 sharedResource : -992
                        8 번째 반복 sharedResource : -991
                        9 번째 반복 sharedResource : -990
                        10 번째 반복 sharedResource : -989
                     */
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 2. 현재 sharedResource 값을 1000번 감소시킴
                for (int i = 0; i < 1000; i++) {
                    sharedResource--;
                    System.out.println(i + " 번째 반복 sharedResource : " + sharedResource);
                    /*  기대 값
                        -1, -2, -3, -4, -5, ..., -999, -1000
                    */
                    /*  출력 값
                        0 번째 반복 sharedResource : 775
                        1 번째 반복 sharedResource : 995
                        2 번째 반복 sharedResource : 994
                        3 번째 반복 sharedResource : 993
                        4 번째 반복 sharedResource : 992
                        5 번째 반복 sharedResource : 991
                        6 번째 반복 sharedResource : 990
                        7 번째 반복 sharedResource : 989
                        8 번째 반복 sharedResource : 988
                        9 번째 반복 sharedResource : 987
                        10 번째 반복 sharedResource : 986
                     */
                }
            }
        });

        // 3. 두 스레드를 시작
        thread1.start();
        thread2.start();

        // 4. 두 스레드의 종료를 대기
        thread1.join();
        thread2.join();

        // 5. 최종 결과 출력
        System.out.println("Final sharedResource: " + sharedResource);
    }
}

