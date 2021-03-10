public class while003 {
    public static void main(String[] args) {
        int value = 50;
        int dividing =1;
        int sumofdivisors =0;
        while(dividing <= value) {
            if(value%dividing == 0) {
                System.out.println("\t The number\t"+ value+ " is divided by \t" +dividing+" \texactly");
                sumofdivisors = sumofdivisors+dividing;
            }
            dividing++;
        }
        System.out.println("\tThe sum of integer divisors of the number  "+ value +" is\t"+ sumofdivisors);
    }
}
