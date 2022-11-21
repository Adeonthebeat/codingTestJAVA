package lecture06;

import java.util.*;

/** $$$$$
 * [좌표정렬] - 정렬
 */
class Point implements Comparable<Point> {

    public int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y - o.y; // 오름차순
            // return o.y - this.y // 내림차순
        } else {
            return this.x - o.x; // 오름차순
            // return o.x - this.x // 내림차순
        }
    }
}
public class Main07 {


/**
5
2 7
1 3
1 2
2 5
3 6
*/


    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 작업의 개수

        ArrayList<Point> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for(Point o : arr){
            System.out.println(o.x + " " + o.y);
        }

    }
}
