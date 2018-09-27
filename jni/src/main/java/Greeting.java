class Greeting {
    static {
        com.github.fommil.jni.JniLoader.load("libgreeting.dll");
    }

    public static void main(String[] args) {
        Greeting.greeting();
    }

    public static native void greeting();
}
