public class AquaticAnimal extends Animal {
    @Override
    String move() {
        return "Moves by swimming";
    }
    String name = "Fish";
    public static void main(String[] args) {
        AquaticAnimal octupus = new AquaticAnimal();
        System.out.println(whale.name + " " + octupus.move());
    }
}
