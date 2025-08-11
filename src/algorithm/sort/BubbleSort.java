package algorithm.sort;


/*
    * 버블 정렬 : 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘이며 인접한 2개의 레코드를 비교하여 정렬한다.
    * ex : 1번째 , 2번째 비교 -> 2번째 3번째 비교 -> 3번째 4번째 비교
    * 장점
        * 1. 구현이 매우 간단하다.
    * 단점
        * 1. 순서에 맞지 않은 요소를 인접한 요소와 교환한다.
        * 2. 하나의 요소가 가장 왼쪽에서 가장 오른쪽으로 이동하기 위해서는 배열에서 모든 다른 요소들과 교환되어야 한다.
        * 3. 특히 특정 요소가 최종 정렬 위치에 이미 있는 경우라도 교환되는 일이 일어난다.
        * 4. 일반적으로 자료의 교환 작업(SWAP)이 자료의 이동 작업(MOVE)보다 더 복잡하기 때문에 버블 정렬은 단순성에도 불구하고 거의 쓰이지 않는다.
    * 시간 복잡도
        * 비교 횟수
            * 최상, 평균, 최악 모두 일정
            * n-1, n-2, … , 2, 1 번 = n(n-1)/2
        * 교환 횟수
            * 입력 자료가 역순으로 정렬되어 있는 최악의 경우, 한 번 교환하기 위하여 3번의 이동(SWAP 함수의 작업)이 필요하므로 (비교 횟수 * 3) 번 = 3n(n-1)/2
            * 입력 자료가 이미 정렬되어 있는 최상의 경우, 자료의 이동이 발생하지 않는다.
            * T(n) = O(n^2)
    * 단순(구현 간단)하지만 비효율적인 방법
        * 삽입 정렬, 선택 정렬, "버블 정렬"
    * 복잡하지만 효율적인 방법
        * 퀵 정렬, 힙 정렬, 합병 정렬, 기수 정렬
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 10, 7, 6, 8, 1, 5, 3, 4, 2};
        bubbleSortAsc(arr);
        bubbleSortDesc(arr);
    }

    static int[] bubbleSortAsc(int[] arr) {
        System.out.println("\n" + "버블정렬 오름차순");
        int temp = 0;
        //배열의 앞의 원소를 인덱스할 i
        //배열의 길이만큼 반복할 바깥쪽 반복문
        for (int i = 0; i < arr.length; i++) {
            //배열의 길이 -1만큼 반복
            for (int j = 0; j < arr.length - i; j++) {
                //배열의 마지막 원소가 인덱스되며
                //배열의 j번째 원소와 j + 1번째 원소를 비교한다. (두개씩)
                //배열의 j번째 원소가  j + 1번째 원소보다 클 경우
                //1. j에는 j+1이 / 2. j+1에는 j가
                if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // 정렬 과정 출력
            System.out.print("\n" + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        return arr;
    }

    static int[] bubbleSortDesc(int[] arr) {
        System.out.println("\n" + "버블정렬 내림차순");
        int temp = 0;
        //배열의 앞의 원소를 인덱스할 i
        //배열의 길이만큼 반복할 바깥쪽 반복문
        for (int i = 0; i < arr.length; i++) {
            //배열의 길이 -1만큼 반복
            for (int j = 0; j < arr.length - i; j++) {
                //배열의 마지막 원소가 인덱스되며
                //배열의 j번째 원소와 j + 1번째 원소를 비교한다. (두개씩)
                //j + 1번째 원소가 j번째 원소보다 클 경우
                //1. j에는 j+1이 / 2. j+1에는 j가
                if (j + 1 < arr.length && arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            // 정렬 과정 출력
            System.out.print("\n" + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        return arr;
    }


}

