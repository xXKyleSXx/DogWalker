import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class DogWalkCompany {
    private int[] schedule;


public DogWalkCompany(String dogs) {
    File file = new File("companies.txt");
    schedule = new int [24];
    Scanner s = new Scanner(dogs);
    for (int i = 0; i < 24; i++)
        schedule[i] = s.nextInt();
    s.close();
    }

    public int numAvailableDogs(int hour) {
        return schedule[hour];
    }
    
    public void updateDogs(int hour, int numberDogsWalked) {
        schedule[hour] -= numberDogsWalked;
    }
}