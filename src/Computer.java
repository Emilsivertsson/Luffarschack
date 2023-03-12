import java.util.Random;

public class Computer{

    char [] numbers = {'1','2','3','4','5','6','7','8','9'};
    public char sign;

    public Computer(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public char getComputerMove(){
        Random random = new Random();
        return numbers[random.nextInt(numbers.length)];
    }
}
