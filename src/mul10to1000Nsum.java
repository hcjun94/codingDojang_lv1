public class mul10to1000Nsum {
    public static void main(String[] args) {
        String[] list = new String[991];
        int result = 0;
        for (int x = 10; x <= 1000; x++) {
            list[x - 10] = "" + x;
        }
        for (String i : list) {
            char[] temp = i.toCharArray();
            int mul = 1;
            for (char j : temp) {
                mul *= Character.getNumericValue(j);
            }
            result += mul;
        }
        System.out.println(result);
    }

}
