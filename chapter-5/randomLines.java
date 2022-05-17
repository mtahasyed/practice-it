/*
* Write a method called randomLines that prints between 5 and 10 random 
* strings of letters (between "a" and "z"), one per line. Each string 
* should have random length of up to 80 characters. 
*/

public static void randomLines() {
    Random random = new Random();
    int numString = random.nextInt(5) + 5;
    for (int i = 0; i < numString; i++) {
        int numOfChar = 0;
        int numOfChar = random.nextInt(80) + 1;
        int counter = 1;
        while (numOfChar != counter) {
            int letter = random.nextInt(26) + 97;
            System.out.print((char) letter);
            counter++;
        }
        System.out.println();
    }
}
