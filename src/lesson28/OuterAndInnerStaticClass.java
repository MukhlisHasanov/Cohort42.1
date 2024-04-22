package lesson28;

public class OuterAndInnerStaticClass {

    static class InnerClass {
        private String field = "field";

        private void printText() {
            System.out.println("private method print text");
        }

        public void useInnerClass() {
            OuterAndInnerClass.InnerClass innerClass = new OuterAndInnerClass.InnerClass();
            System.out.println(innerClass.getField());
            innerClass.innerPrintText();  
        }
    }


    static class InerClass {
        String getField() {
          //  return field;
        return "static class field";
        }

        void innerPrintText() {
           // printText();
            System.out.println("method of static class");
        }
    }
}
