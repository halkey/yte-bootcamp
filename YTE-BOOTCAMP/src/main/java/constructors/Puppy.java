package constructors;

class Puppy {
    public Puppy() {
    }

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println(name);
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy(); // nothing happens
        Puppy puppy_2 = new Puppy("Karabaş"); // sout

    }
}



