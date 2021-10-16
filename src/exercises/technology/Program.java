package exercises.technology;

public class Program {
    public static void main(String[] args){
        Computer herold = new Computer("The Coolest", "Not high enough", 70);
        System.out.println(herold.shouldIBuy());
        Laptop mac = new Laptop(18, "Mac", "Bigguns", 80);
        System.out.println(mac.shouldIBuy());
        System.out.println(mac.forGaming());

    }
}
