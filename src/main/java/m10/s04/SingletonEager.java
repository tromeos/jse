package m10.s04;

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    // when it is not so easy: static initializer
//    static {
//    	// ...
//    	instance = new Eager();
//      // ...
//    }

    private int life;

    private SingletonEager() {
        this.life = 42;
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
