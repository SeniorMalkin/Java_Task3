import factorial.Factorial;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public enum Select {A,B,C,D,F};
    public enum Number {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN}
    public static void main(String[] args) {
        /*
        int[] arr = {7,2,6,15,3,233,0,10,21,0};
        sorting.Sort a = new sorting.Sort(arr);
        System.out.println(a.toString());
        //a.bubleSort();
        a.insertSort();
        System.out.println(a.toString());
        Arrays.sort(arr);
        //a.compareAllSort();

        Sort b = new Sort(100);
        System.out.println(b.toString());
        b.compareAllSort();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Factorial.compareAllMethods(25);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        figure.Figure fig = new figure.Figure(7);
        fig.drawFeelRectangle();
        System.out.println(" ");
        fig.drawDownTriangle();
        System.out.println(" ");
        fig.drawTopTriangle();
        System.out.println(" ");
        fig.drawChar();
        */
        //ARRAY
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(a)
        int SIZE = 7;
        int[] arr = new int[SIZE];
        Random time = new Random(System.currentTimeMillis());
        Random rand = new Random(time.nextInt());
        for(int i=0;i< SIZE;i++){
            arr[i] = rand.nextInt(100);
            if(arr[i]%2 == 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i< SIZE/2;i++){
            arr[i]+=arr[SIZE-(i+1)];
            arr[SIZE-(i+1)] = arr[i] - arr[SIZE-(i+1)];
            arr[i] -= arr[SIZE-(i+1)];
        }
        System.out.println(Arrays.toString(arr));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(b)
        SIZE = 20;
        arr = new int[SIZE];
        int even = 0;
        int odd = 0;
        for(int i=0;i< SIZE;i++){
            arr[i] = rand.nextInt(11);
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Count even: " + even);
        System.out.println("Count odd: " + odd);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(c)
        SIZE = 10;
        arr = new int[SIZE];
        for(int i=0;i< SIZE;i++){
            arr[i] = 1 + rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i< SIZE;i++){
            if((i%2) == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(d)
        System.out.println("  ");
        System.out.println("4(d)");
        SIZE = 15;
        int max = 0,min =200,imax =0,imin =0;
        arr = new int[SIZE];
        for(int i=0;i< SIZE;i++){
            arr[i] = -50 + rand.nextInt(101);
            if(arr[i] >= max){
                max = arr[i];
                imax = i;
            }
            if(arr[i] <= min){
                min = arr[i];
                imin = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max element:" + max +"  Index max:" + imax);
        System.out.println("Min element:" + min +"  Index min:" + imin);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(e)
        System.out.println("  ");
        System.out.println("4(e)");
        SIZE = 10;
        int sum =0 ,sum1 = 0,average = 0,average1 = 0;
        arr = new int[SIZE];
        int[] arr1 = new int[SIZE];
        for(int i=0;i< SIZE;i++) {
            arr[i] = rand.nextInt(11);
            arr1[i] = rand.nextInt(11);
            sum+=arr[i];
            sum1+=arr1[i];
        }
        average = sum / arr.length;
        average1 = sum1 / arr1.length;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        if(average > average1){
            System.out.println("Average first array is more");
        }
        else{
            if(average1 > average){
                System.out.println("Average second array is more");
            }
            else{
                System.out.println("Average both array are equal");
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //4(f)
        System.out.println("  ");
        System.out.println("4(f)");
        SIZE = 20;
        arr = new int[SIZE];
        arr1 = new int[3];

        for(int i=0;i< SIZE;i++) {
            arr[i] = -1 + rand.nextInt(3);
            switch(arr[i]){
                case -1:
                    arr1[0]++;
                    break;
                case 0:
                    arr1[1]++;
                    break;
                case 1:
                    arr1[2]++;
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));

        max = 0;
        imax = 0;
        for(int i=0;i<3;i++)
        {
            if(arr1[i] > max){
                max = arr1[i];
                imax = i;
            }
        }
        System.out.println("The most frequent element:" + (imax-1));

        if (arr1[0] == arr1[1]) {
            System.out.println(-1 + " and " + 0 + " have the same frequency");
        }
        if (arr1[2] == arr1[1]) {
            System.out.println(1 + " and " + 0 + " have the same frequency");
        }
        if(arr1[0] == arr1[2]){
            System.out.println(-1 + " and " + 1 + " have the same frequency");
        }


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TWO-DIMENSIONAL ARRAY
        //5(a)
        System.out.println("  ");
        System.out.println("5(a)");
        int ROW = 5;
        int COLUMN = 5;
        int i;
        int j;
        int[][] arr2 = new int[ROW][COLUMN];
        for(i=0;i< ROW;i++){
            for(j=0; j < COLUMN;j++) {
                arr2[i][j] = 1 + rand.nextInt(99);
            }
        }
        i=0;j=0;
        sum =0;
        long comp =1;
        while ((i<ROW) && (j<COLUMN)) {
            sum = sum + arr2[i][j] + arr2[i][(COLUMN-1)-i];
            comp *= arr2[i][j]*arr2[i][(COLUMN-1)-i];
            i++;j++;
        }
        System.out.println("TWO-DIMENSIONAL ARRAY:");
        for(int k=0;k<ROW;k++) {
            System.out.println(Arrays.toString(arr2[k]));
        }
        System.out.println("Summ: " + sum);
        System.out.println("Composition: " + comp);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //5(b)
        System.out.println("  ");
        System.out.println("5(b)");
        ROW = 8;
        COLUMN = 5;
        i = 0;
        j = 0;
        max = 0;
        imax = 0;
        int jmax = 0;
        arr2 = new int[ROW][COLUMN];
        for(i=0;i< ROW;i++){
            for(j=0; j < COLUMN;j++) {
                arr2[i][j] = -99 + rand.nextInt(199);
                if(arr2[i][j] > max) {
                    max = arr2[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("TWO-DIMENSIONAL ARRAY:");
        for(int k=0;k<ROW;k++) {
            System.out.println(Arrays.toString(arr2[k]));
        }
        System.out.println("Max element: " + max);
        System.out.println("Indexes: " + imax + " , " + jmax);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //5(c)
        System.out.println("  ");
        System.out.println("5(c)");
        ROW = 8;
        COLUMN = 5;
        i = 0;
        j = 0;
        max = 0;
        imax = 0;

        arr2 = new int[ROW][COLUMN];
        for(i=0;i< ROW;i++){
            int partmax = 1;
            for(j=0; j < COLUMN;j++) {
                arr2[i][j] = -10 + rand.nextInt(21);
                partmax*=Math.abs(arr2[i][j]);
            }
            if(partmax > max){
                max = partmax;
                imax = i;
            }
        }
        System.out.println("TWO-DIMENSIONAL ARRAY:");
        for(int k=0;k<ROW;k++) {
            System.out.println(Arrays.toString(arr2[k]));
        }
        System.out.println("Index row: " + imax);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //5(d)
        System.out.println("  ");
        System.out.println("5(d)");
        ROW = 10;
        COLUMN = 7;
        arr2 = new int[ROW][COLUMN];

        for(i=0;i< ROW;i++) {
            for (j = 0; j < COLUMN; j++) {
                arr2[i][j] = rand.nextInt(101);
            }
        }

        System.out.println("TWO-DIMENSIONAL ARRAY:");
        for(int k=0;k<ROW;k++) {
            System.out.println(Arrays.toString(arr2[k]));
        }

        for(i=0;i< ROW;i++) {
            Arrays.sort(arr2[i]);
            for(j=0;j< COLUMN/2;j++){
                arr2[i][j]+=arr2[i][COLUMN-(j+1)];
                arr2[i][COLUMN-(j+1)] = arr2[i][j] - arr2[i][COLUMN-(j+1)];
                arr2[i][j] -= arr2[i][COLUMN-(j+1)];
            }
        }

        System.out.println("TWO-DIMENSIONAL ARRAY:");
        for(int k=0;k<ROW;k++) {
            System.out.println(Arrays.toString(arr2[k]));
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //6.ENUM
        System.out.println("  ");
        System.out.println("6");
        Select mune = Select.C;

        long startTime = System.nanoTime();
        if(mune == Select.A) {
            System.out.println(mune);
        }
        else{
            if(mune == Select.B){
                System.out.println(mune);
            }
            else{
                if(mune == Select.C){
                    System.out.println(mune);
                }
                else{
                    if(mune == Select.D){
                        System.out.println(mune);
                    }
                    else{
                        System.out.println(mune);
                    }
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);


        startTime = System.nanoTime();
        switch (mune){
            case A:
                System.out.println(mune);
                break;
            case B:
                System.out.println(mune);
                break;
            case C:
                System.out.println(mune);
                break;
            case D:
                System.out.println(mune);
                break;
            case F:
                System.out.println(mune);
                break;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        SIZE = 50;
        Number number;
        arr = new int[SIZE];
        int zero=0,one =0, two =0,three = 0,four = 0,five =0,six = 0,seven = 0, eight = 0,nine = 0, ten =0;
        for(i=0;i< SIZE;i++){
            arr[i] = rand.nextInt(11);

            if(arr[i] == 0){
                number = Number.ZERO;
            }
            else{
                if(arr[i] == 1){
                    number = Number.ONE;
                }
                else{
                    if(arr[i] ==2){
                        number =Number.TWO;
                    }
                    else{
                        if(arr[i] == 3){
                            number = Number.THREE;
                        }
                        else{
                            if(arr[i] == 4){
                                number = Number.FOUR;
                            }
                            else{
                                if(arr[i] == 5){
                                    number = Number.FIVE;
                                }
                                else{
                                    if(arr[i] == 6){
                                        number = Number.SIX;
                                    }
                                    else{
                                        if(arr[i] == 7){
                                            number = Number.SEVEN;
                                        }
                                        else{
                                            if(arr[i] == 8){
                                                number = Number.EIGHT;
                                            }
                                            else{
                                                if(arr[i] == 9){
                                                    number = Number.NINE;
                                                }
                                                else{
                                                    number = Number.TEN;
                                                }


                                            }

                                        }

                                    }

                                }
                            }
                        }
                    }
                }
            }

            switch(number){
                case ZERO:
                    zero++;
                    break;
                case ONE:
                    one++;
                    break;
                case TWO:
                    two++;
                    break;
                case THREE:
                    three++;
                    break;
                case FOUR:
                    four++;
                    break;
                case FIVE:
                    five++;
                    break;
                case SIX:
                    six++;
                    break;
                case SEVEN:
                    seven++;
                    break;
                case EIGHT:
                    eight++;
                    break;
                case NINE:
                    nine++;
                    break;
                case TEN:
                    ten++;
                    break;
            }
        }

        System.out.println("ZERO: " + zero);
        System.out.println("ONE: " + one);
        System.out.println("TWO: " + two);
        System.out.println("THREE: " + three);
        System.out.println("FOUR: " + four);
        System.out.println("FIVE: " + five);
        System.out.println("SIX: " + six);
        System.out.println("SEVEN: " + seven);
        System.out.println("EIGHT: " + eight);
        System.out.println("NINE: " + nine);
        System.out.println("TEN: " + ten);




    }
}
