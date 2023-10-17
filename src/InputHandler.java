import java.math.BigDecimal;
import java.util.Scanner;

public class InputHandler {

private BigDecimal arg1;
private BigDecimal arg2;

public void enterNums() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first argument");
    this.arg1 = scanner.nextBigDecimal();
    System.out.println("Enter the second argument");
    this.arg2 = scanner.nextBigDecimal();

}
public BigDecimal getArg1(){
    return arg1;
}
public BigDecimal getArg2(){
    return  arg2;
}


}
