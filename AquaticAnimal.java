public class AquaticAnimal extends Animal {
    @Override
    String move() {
        return "Moves by swimming";
    }
    String name = "Whale";
    public static void main(String[] args) {
        AquaticAnimal whale = new AquaticAnimal();
        System.out.println(whale.name + " " + whale.move());
    }
}
