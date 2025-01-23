package Practice2;

public class displayUsingLoops {
    public static void main(String[] args)
    {

        //for loop
        int sum = 0;

        System.out.println("Using for loop: ");
        for(int i = 2; i <= 20; i+=2)
        {
            System.out.printf("%d ",i);
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);

        sum = 0;
        for(int i = 1; i <= 19; i+=2)
        {
            System.out.printf("%d ",i);
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);

        //while loop
        System.out.println("Using while loop: ");

        sum = 0;

        int i = 2;
        while(i <= 20)
        {
            System.out.printf("%d ",i);
            sum = sum + i;
            i+=2;
        }
        System.out.println();
        System.out.println("Sum: "+sum);

        sum = 0;
        i = 1;
        while(i <= 19)
        {
            System.out.printf("%d ",i);
            sum = sum + i;
            i+=2;
        }
        System.out.println();
        System.out.println("Sum: "+sum);

        //do-while loop
        sum = 0;
        System.out.println("Using do-While loop: ");
        i = 2;
        do{
            System.out.printf("%d ",i);
            sum = sum + i;
            i+=2;
        }while(i <= 20);

        System.out.println();
        System.out.println("Sum: "+sum);

        sum = 0;
        i = 1;
        do{
            System.out.printf("%d ",i);
            sum = sum + i;
            i+=2;
        }while(i <= 19);
        System.out.println();
        System.out.println("Sum: "+sum);


    }
}
