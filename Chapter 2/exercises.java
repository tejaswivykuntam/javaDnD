import java.util.Scanner;
/**
 *
 * @author Tejaswi
 */
class e214 {
    public static void main(String args[]) {
        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
        System.out.println();
        System.out.printf("%s%s%s%s", "1 ", "2 ", "3 ", "4");
    }
}

class e215 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int in1 = input.nextInt();
        System.out.println("Enter another integer");
        int in2 = input.nextInt();
        
        int sq_sum = in1 * in1 + in2 * in2;
        int sq_diff = in1 * in1 - in2 * in2;
        
        System.out.println("Sum of squares is: " + sq_sum);
        System.out.println("Difference of squares is: " + sq_diff);
    }
}

class e216 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int in1 = input.nextInt();
        int in1sq = in1 * in1;
        if (in1 == 100){
            System.out.println(in1 + " == " + 100);
        }
        if (in1 != 100){
            System.out.println(in1 + " != " + 100);
        }
        if (in1 < 100){
            System.out.println(in1 + " < " + 100);
        }
        if (in1 > 100){
            System.out.println(in1 + " > " + 100);
        }
        if (in1 <= 100){
            System.out.println(in1 + " <= " + 100);
        }
        if (in1 >= 100){
            System.out.println(in1 + " >= " + 100);
        }
        
        if (in1sq == 100){
            System.out.println(in1sq + " == " + 100);
        }
        if (in1sq != 100){
            System.out.println(in1sq + " != " + 100);
        }
        if (in1sq < 100){
            System.out.println(in1sq + " < " + 100);
        }
        if (in1sq > 100){
            System.out.println(in1sq + " > " + 100);
        }
        if (in1sq <= 100){
            System.out.println(in1sq + " <= " + 100);
        }
        if (in1sq >= 100){
            System.out.println(in1sq + " >= " + 100);
        }
    } 
}

class e217 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i1, i2, i3;
        System.out.println("Enter three integers: ");
        i1 = input.nextInt();
        i2 = input.nextInt();
        i3 = input.nextInt();
        int sum = i1 + i2 + i3;
        int avg = sum / 3;
        
        int largest= i1;
        int smallest = i1;
        
        if(i2 > largest && i2 > i3){
            largest = i2;
        }
        if(i3 > largest && i3 > i2){
            largest = i3;
        }
        
        if(i2 < smallest && i2 < i3){
            smallest = i2;
        }
        if(i3 < smallest && i3 < i2){
            smallest = i3;
        }
        
        System.out.println("Sum of the three numbers is: " + sum);
        System.out.println("Average of the three numbers is: " + avg);
        System.out.println("Smallest number among the inputs is: " + smallest);
        System.out.println("Largest number among the inputs is: " + largest);
        
    }
}

class e218 {
    public static void main(String[] args){
        System.out.println("*********"); // fig 1
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
        
        System.out.println("   ***   "); // fig 2
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
        
        System.out.println("    *    "); // fig 3
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        
        System.out.println("    *    "); // fig 4
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");
        
    }
}

class e224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in1, in2, in3, in4, in5, largest, smallest;
        System.out.println("Enter 5 numbers: ");
        in1 = input.nextInt();
        in2 = input.nextInt();
        in3 = input.nextInt();
        in4 = input.nextInt();
        in5 = input.nextInt();
        
        largest = in1;
        smallest = in1;
        
        if (in2 > largest){
            largest = in2;
        }
	if (in3 > largest){
            largest = in3;
        }
	if (in4 > largest){
            largest = in4;
        }
	if (in5 > largest){
            largest = in5;
        }
        
        if (in2 < smallest){
            smallest = in2;
        }
	if (in3 < smallest){
            smallest = in3;
        }
	if (in4 < smallest){
            smallest = in4;
        }
	if (in5 < smallest){
            smallest = in5;
        }
        
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);
    }
}

class e225{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int in = input.nextInt();
        if(in % 3 == 0){
            System.out.println("Divisible by 3.");
        }
        else{
            System.out.println("Not divisible by 3.");
        }
    }
}

class e226{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int in1 = input.nextInt();
        int in2 = input.nextInt();
        in1 *= 3;
        in2 *= 2;
        if(in1 % in2 == 0){
            System.out.println("Condition satisfied.");
        }
        else{
            System.out.println("Condition not satisfied.");
        }
    }
}

class e227{
    public static void main(String[] args){
 
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
        System.out.println("* * * * * * * * ");
        System.out.println(" * * * * * * * *");
    }
}

class e228{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int radius = input.nextInt();
        float pi = 3.141592654f;
        System.out.printf("%s%d%n", "The diameter of the circle is: ", 2 * radius);
        System.out.printf("%s%f%n", "The circumference of the circle is: ", 2 * pi * radius);
        System.out.printf("%s%f%n", "The area of the circle is: ", pi * radius * radius);
        
    }
}

class e229{
    public static void main(String[] args){
        System.out.println((int)'A');
        System.out.println((int)'B');
        System.out.println((int)'C');
        System.out.println((int)'a');
        System.out.println((int)'b');
        System.out.println((int)'c');
        System.out.println((int)'0');
        System.out.println((int)'1');
        System.out.println((int)'2');
        System.out.println((int)'$');
        System.out.println((int)'*');
        System.out.println((int)'+');
        System.out.println((int)'/');
        System.out.println((int)' ');
    }
}

class e230{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        int in = input.nextInt();
        int ones, tens, hundreds, ks, tenks;
        
        ones = in % 10;
        in /= 10;
        
        tens = in % 10;
        in /= 10;
        
        hundreds = in % 10;
        in /= 10;
        
        ks = in % 10;
        in /= 10;
        
        tenks = in % 10;
        
        System.out.printf("%d %d %d %d %d", tenks, ks, hundreds, tens, ones);
    }
}

class e232{
    public static void main(String[] args){
        
        int in1, in2, in3, in4, in5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        in1 = input.nextInt();
        in2 = input.nextInt();
        in3 = input.nextInt();
        in4 = input.nextInt();
        in5 = input.nextInt();
        
        int pn = 0;
        int nn = 0;
        int zn = 0;
        
        if(in1 > 0){
            pn++;
        }
        else if(in1 < 0){
            nn++;
        }
        else{
            zn++;
        }
        if(in2 > 0){
            pn++;
        }
        else if(in2 < 0){
            nn++;
        }
        else{
            zn++;
        }
        if(in3 > 0){
            pn++;
        }
        else if(in3 < 0){
            nn++;
        }
        else{
            zn++;
        }
        if(in4 > 0){
            pn++;
        }
        else if(in4 < 0){
            nn++;
        }
        else{
            zn++;
        }
        if(in5 > 0){
            pn++;
        }
        else if(in5 < 0){
            nn++;
        }
        else{
            zn++;
        }
        
        System.out.printf("%s%d%s%d%s%d%n", "Positive numbers: ", pn, ", Negative numbers: ", nn, ", Zeros: ", zn);
    }
}

class e233{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        float heightinmeters;
        int weightinkg;
        
        System.out.println("Enter weight in kg: ");
        weightinkg = input.nextInt();
        System.out.println("Enter height in meters: ");
        heightinmeters = input.nextFloat();
        
        float bmi = weightinkg / (heightinmeters * heightinmeters);
        System.out.println("Your BMI is:" + bmi);
        System.out.println("Refer to the below chart to check your category.");
        System.out.println();
        System.out.println("BMI Categories: ");
        System.out.println("Underweight: <18.5");
        System.out.println("Normal weight: 18.5-24.9");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obesity: BMI of 30 or greater");

    }
}

class e234{
    public static void main(String[] args){
        long currentpop = 7923746440L;
        long growthrate = 6586445L;
        
        System.out.printf("%s%d%n", "Population in 1 year will be: " , (currentpop + growthrate));
        System.out.printf("%s%d%n", "Population in 2 years will be: " , (currentpop + 2 * growthrate));
        System.out.printf("%s%d%n", "Population in 3 years will be: " , (currentpop + 3 * growthrate));
        System.out.printf("%s%d%n", "Population in 4 years will be: " , (currentpop + 4 * growthrate));
        System.out.printf("%s%d%n", "Population in 5 years will be: " , (currentpop + 5 * growthrate));

    }
}