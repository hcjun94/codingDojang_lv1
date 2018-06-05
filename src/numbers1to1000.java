public class numbers1to1000 {
    public static void main(String[] args) {
        int store[] = new int[10];

        for (int i = 1; i <= 1000; i++) {
            store[i % 10]++;
            if (i >= 10) store[(i / 10) % 10] += 1;
            if (i >= 100) store[(i / 100) % 10] += 1;
            if (i == 1000) store[1]++;
        }

        for (int i = 0; i < store.length; i++) {
            System.out.print(i + ":" + store[i] + " ");
        }
    }
}
