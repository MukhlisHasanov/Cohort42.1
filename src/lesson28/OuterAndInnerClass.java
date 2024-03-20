package lesson28;

public class OuterAndInnerClass {
    private static String field = "field";

    private static void printText() {
        System.out.println("private method print text");
    }

    public void useInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }
    static class InnerClass {
        String getField() {
            return field;
        }

        void innerPrintText() {
            printText();
        }
    }
}
