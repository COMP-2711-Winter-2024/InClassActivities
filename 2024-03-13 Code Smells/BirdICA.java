import java.util.Scanner;

/**
 * Starter Code for COMP 2711 Code Smells ICA
 */
public class BirdICA {
    /**
     * Get a bird's plumage.
     * 
     * @param bird Bird.
     * @return Plumage.
     */
    public static String plumage(Bird bird) {
        return bird.getPlumage();
    }

    /**
     * Get a bird's air speed velocity.
     * 
     * @param bird Bird.
     * @return Velocity.
     */
    public static Integer airSpeedVelocity(Bird bird) {
        return bird.getAirSpeedVelocity();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BirdFactory birdFactory = new BirdFactory();
        Bird myBird = birdFactory.getBird(sc.nextLine());
        sc.close();
        System.out.println(plumage(myBird));
        System.out.println(airSpeedVelocity(myBird));
    }
}