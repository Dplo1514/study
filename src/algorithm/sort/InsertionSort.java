package algorithm.sort;

public class InsertionSort {

    /*
       * 삽입 정렬
            * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
            * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
            * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
                * 삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여 삽입할 위치를 지정한 후
                * 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
                * 즉, 두 번째 자료는 첫 번째 자료, 세 번째 자료는 두 번째와 첫 번째 자료, 네 번째 자료는 세 번째, 두 번째, 첫 번째 자료와 비교한 후
                * 자료가 삽입될 위치를 찾는다. 자료가 삽입될 위치를 찾았다면 그 위치에 자료를 삽입하기 위해 자료를 한 칸씩 뒤로 이동시킨다.
                * 처음 Key 값은 두 번째 자료부터 시작한다.
                * 삽입 정렬의 시간복잡도는 최선의 경우 O(N) , 최악의 경우에는 O(N2)
        * 장점
            * 안정한 정렬 방법
            * 레코드의 수가 적을 경우 알고리즘 자체가 매우 간단하므로 다른 복잡한 정렬 방법보다 유리할 수 있다.
            * 대부분의 레코드가 이미 정렬되어 있는 경우에 매우 효율적일 수 있다.
        * 단점
            * 비교적 많은 레코드들의 이동을 포함한다.
            * 레코드 수가 많고 레코드 크기가 클 경우에 적합하지 않다.
        * 시간 복잡도
        * 최선
            * 비교 횟수
                * 이동 없이 1번의 비교만 이루어진다.
                * 외부 루프: (n-1)번
                * Best T(n) = O(n)
        * 최악
            * 비교 횟수
                * 외부 루프 안의 각 반복마다 i번의 비교 수행
                * 외부 루프: (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)
        * 교환 횟수
            * 외부 루프의 각 단계마다 (i+2)번의 이동 발생
            * n(n-1)/2 + 2(n-1) = (n^2+3n-4)/2 = O(n^2)
            * Worst T(n) = O(n^2)
    */

    public static void main(String[] args) {
        int[] arr = {9, 10, 7, 6, 8, 1, 5, 3, 4, 2};
        insertionSortAsc(arr);
        insertionSortDesc(arr);
    }

    static int[] insertionSortAsc(int[] arr) {
        System.out.println("\n" + "삽입정렬 오름차순");
        for (int i = 1; i < arr.length; i++) {
            //정렬의 타겟과 비교할 n번째 원소의 idx / target의 앞 원소 인덱스
            int n = i - 1;
            //정렬의 타겟이될 n번째의 다음 원소
            int target = arr[i];
            //n이 0보다 크거나 같고 target원소가 n번째 원소보다 작은 경우 반복
            while (n >= 0 && target < arr[n]) {
                //arr의 n번째 원소를 arr의 n + 1번째로 민다.
                arr[n + 1] = arr[n];
                //while문의 조건이 true일 경우 n -1번째와 target을 한번 더 비교해야해서 정렬하기 위해 n--해준다.
                n--;
            }
            //위 while문에 걸리지 않으면 target의 정렬 위치가 확정됨을 의미 해당 위치에 할당해준다.
            arr[n + 1] = target;

            // 정렬 과정 출력
            System.out.print(i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + "  ");
            }
            System.out.println();
        }
        return arr;
    }

    static int[] insertionSortDesc(int[] arr) {
        System.out.println("\n" + "삽입정렬 내림차순");
        for (int i = 1; i < arr.length; i++) {
            //정렬의 타겟과 비교할 n번째 원소의 idx  / target의 앞 원소 인덱스
            int n = i - 1;

            //정렬의 타겟이될 n번째의 다음 원소
            int target = arr[i];

            //n이 0보다 크거나 같고 target원소가 n번째 원소보다 큰 경우 반복
            while (n >= 0 && target > arr[n]) {
                //arr의 n + 1번째 원소를 arr의 n번째로 민다.
                arr[n + 1] = arr[n];

                //while문의 조건이 true일 경우 n -1번째와 target을 한번 더 비교해야해서 정렬하기 위해 n--해준다.
                n--;
            }
            //위 while문에 걸리지 않으면 target의 정렬 위치가 확정됨을 의미 해당 위치에 할당해준다.
            arr[n + 1] = target;

            // 정렬 과정 출력
            System.out.print(i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + "  ");
            }
            System.out.println();
        }
        return arr;
    }

}
