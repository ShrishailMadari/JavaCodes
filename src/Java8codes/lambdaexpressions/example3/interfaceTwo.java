package Java8codes.lambdaexpressions.example3;

public interface interfaceTwo {
    default String familyOfBrothers(){
        System.out.println("this is Family");
        return "we are family";
    }
}
