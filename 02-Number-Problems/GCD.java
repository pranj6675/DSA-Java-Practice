class GCD {
    public static void main(String[] args) {
        int a = 8, b = 12;
        int gcd = 1;
        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}