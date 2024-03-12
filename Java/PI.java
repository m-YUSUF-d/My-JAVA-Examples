class PI {
    public static void main(String[] args)
    {
        final int NUNBER_OF_TRIALS = 1000000; // Number of primes to display
        int numberOfHits = 0; // Count the number of hits in the circle

        for(int i = 0 ; i < NUNBER_OF_TRIALS; i++)
        {
            double x = Math.random() * 2.0 - 1;
            double y = Math.random() * 2.0 - 1;

            if(x * x + y * y <= 1)
                numberOfHits++;
        }
        double pi = 4.0 * numberOfHits / NUNBER_OF_TRIALS;

        System.out.println("PI is " + pi);
    }
}