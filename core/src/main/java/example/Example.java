package example;


import static example.Example2.staticMethodToImport;

public class Example {

    public String EXAMPLE_STRING = "";

    public void methodWithSwitchWithoutDefault(String str) {

        switch(str) {
            case "one" :
                System.out.println(str);
                break;
            case "two" :
                System.out.println(str);
                break;
        }

        staticMethodToImport();
    }

}
