package practice06;

import java.util.*;

/** $$$$
 * [좌표 정렬] - Class
 */
class Position implements Comparable<Position>{
    public int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Position o) {
        if(this.x == o.x){
            return this.y - o.x; // 오름차순
            // return o.y - this.y // 내림차순
        } else {
            return this.x - o.x;
        }
    }
}
public class Main007 {



/**
5
2 7
1 3
1 2
2 5
3 6
*/

    public static void main(String[] args) {
        Main007 main = new Main007();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // 개수

        ArrayList<Position> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            arr.add(new Position(x, y));
        }

        for(Position o : arr){
            System.out.println(o.x + " " + o.y);
        }

    }

}
