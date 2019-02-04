class Sum1 {

    int sum(int number) {

        int sum = 0;
        int i = number;

        while (number > 0) {

            sum = sum + number % 10;
            number = number / 10;


        }
        return sum;
    }

}
