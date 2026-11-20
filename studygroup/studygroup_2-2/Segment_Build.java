import java.util.*;

class SegmentTreeSum {

    static long[] A, sumTree;

    static long BuildSum(int index, int start, int end) {
        if (start == end) {
            sumTree[index] = A[start];
        } else {
            sumTree[index] = BuildSum(index * 2 + 1, start, (start + end) / 2)
                    + BuildSum(index * 2 + 2, (start + end) / 2 + 1, end);
        }
        return sumTree[index];
    }

    static long Sum(int left, int right, int sid, int start, int end) {
        long res;
        if (left > end || right < start) {
            res = 0;
        } else if (start >= left && end <= right) {
            res = sumTree[sid];
            System.out.println("[" + start + "," + end + "] " + res);

        } else {
            res = Sum(left, right, sid * 2 + 1, start, (start + end) / 2)
                    + Sum(left, right, sid * 2 + 2, (start + end) / 2 + 1, end);
        }
        return res;
    }

    static void UpdateSum(int oid, long amt, int sid, int start, int end) {
        if (oid < start || oid > end) {
            return;
        }
        sumTree[sid] += amt;
        System.out.println("[" + start + "," + end + "] " + (sumTree[sid]-amt) +" -> "+ sumTree[sid]);
        if (start != end) {
            UpdateSum(oid, amt, sid * 2 + 1, start, (start + end) / 2);
            UpdateSum(oid, amt, sid * 2 + 2, (start + end) / 2 + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1) {
             int N = sc.nextInt();

            A = new long[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextLong();

            int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
            int t = 1 << (h + 1);
            sumTree = new long[t];
            BuildSum(0, 0, N - 1);

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                String op = sc.next();
                if (op.equals("ADD")) {
                    UpdateSum(sc.nextInt(), sc.nextLong(), 0, 0, N - 1);
                }
            }

        } 
        else if (x == 2) {
            int N = sc.nextInt();

            A = new long[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextLong();

            int h = (int) Math.ceil(Math.log((double) N) / Math.log(2.0));
            int t = 1 << (h + 1);
            sumTree = new long[t];
            BuildSum(0, 0, N - 1);

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                String op = sc.next();
                if (op.equals("SUM")) {
                    System.out.println("TOTAL " + Sum(sc.nextInt(), sc.nextInt(), 0, 0, N - 1));
                }
            }

        }
        sc.close();

    }
   
}