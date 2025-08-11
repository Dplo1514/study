package algorithm.sort;

public class SelectionSort {
    /*
    or문을 통해 가장 작은 값을 찾고, 맨 앞자리와 교환
    다음 for문에선 맨 앞자리값을 제외한 값 중 가장 작은 값을 찾고, 두번째 앞자리와 교환
    이 작업을 최대 n - 1 번 반복하면 정렬 완료 -> 시간복잡도 : O(n^2)
    ex) 3 4 1 5 2 를 정렬한다고 가정
    1번째 loop => 최소값 = 1 -> 1 4 3 5 2 => 1 확정
    2번째 loop => 최소값 = 2 -> 1 2 3 5 4 => 2 확정
    3번째 loop => 최소값 = 3 -> 1 2 3 5 4 => 3 확정
    4번째 loop => 최소값 = 4 -> 1 2 3 4 5 => 4확정, 5확정
    */

    static void selectionSortDesc(int[] arr) {
        int desc = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    desc = arr[i];
                    arr[i] = arr[j];
                    arr[j] = desc;
                }
            }

            // 정렬 과정 출력
            System.out.print("Desc : " + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    static void selectionSortAsc(int[] arr) {
        int asc = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    asc = arr[i];
                    arr[i] = arr[j];
                    arr[j] = asc;
                }
            }

            // 정렬 과정 출력
            System.out.print("Asc : " + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {10 , 6 , 3 , 1 , 5 , 4 , 9 , 8 , 7 , 2};
        selectionSortAsc(sortArr);
        selectionSortDesc(sortArr);
    }
}
