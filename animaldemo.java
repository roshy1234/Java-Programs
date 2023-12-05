/**
 * animaldemo
 */
interface basicanimal {
    public void eat();
    public void sleep();
}

class monkey {
    public void jump() {
        System.out.println("The monkey has jumped");
    }
    public void bite() {
        System.out.println("The monkey has bitten")
    }
}

class human extends monkey implements basicanimal {
    public void eat() {
        System.out.println("Human has eaten food");
    }
    public void sleep() {
        System.out.println("Human has slept")
    }
    @Override
    public void jump() {
        System.out.println("The human has jumped");
    }
    @Override
    public void bite() {
        System.out.println("The human has bitten")
    }
}

public class animaldemo {
    public static void main(String[] args) {
        monkey m = new human();
        m.bite();
        m.jump();
        m.eat();
        m.sleep();
    }
}
