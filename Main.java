import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        DogWalkCompany[] companies = new DogWalkCompany[100];
        for (int i = 0; i < 100; i++) {
            companies[i] = new DogWalkCompany(s.nextLine());
        }
        //for (int i = 0; i < 100; i++) {
            f = new File("walkers.txt");
            s = new Scanner(f);
            int total =  0;        
        while (s.hasNextLine()) {
            int company = s.nextInt();
            int maxDogs = s.nextInt();
            int startHour = s.nextInt();
            int endHour = s.nextInt();
            //System.out.println(s.nextInt());
            DogWalker walker = new DogWalker(maxDogs, companies[company]);
            int pay = walker.dogWalkShift(startHour, endHour);
            //System.out.println(pay);
            total = total + pay;
            System.out.println("Total is " + total);
        //}
        //I've spent 2 hours trying to make one loop
        }
        s.close();
    }
}