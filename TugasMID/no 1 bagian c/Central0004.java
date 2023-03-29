/* Aisyah Safira Rachman */
/* 13020210004 */
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0004 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0004 obj = new Central0004();
        System.out.println("main");
        obj.aaa();
    }
}
