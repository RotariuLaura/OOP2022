class Dog {
    static int dogCount = 0;

    public Dog() {
        dogCount += 1;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println("Dog count is now " + Dog.dogCount);
    }
}
