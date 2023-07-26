import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String q1 = "\nWhich keyword is used in Java to create a subclass that inherits from another class? \n"
                + "(a) super\n"
                + "(b) this\n"
                + "(c) extends\n"
                + "(d) implements\n";
        String q2 = "\nIn Java, which loop is used when you want to execute the loop body at least once, regardless of the condition? \n"
                + "(a) for loop\n"
                + "(b) while loop\n"
                + "(c) do-while loop\n"
                + "(d) until loop\n";
        String q3 = "\nWhich Java access modifier is the most restrictive? \n"
                + "(a) public\n"
                + "(b) private\n"
                + "(c) protected\n"
                + "(d) default\n";
        String q4 = "\nWhat is the purpose of the 'static' keyword in Java? \n"
                + "(a) It is used to create objects of a class\n"
                + "(b) It is used to make variables constant\n"
                + "(c) It is used to indicate that a method or variable belongs to the class, not to any specific instance of the class\n"
                + "(d) It is used to implement multiple inheritance in Java\n";
        String q5 = "\nWhich Java data type is used to store floating-point numbers with the highest precision? \n"
                + "(a) float\n"
                + "(b) double\n"
                + "(c) long\n"
                + "(d) int\n";

        Question[] questions = {
                new Question(q1, "c"),
                new Question(q2, "c"),
                new Question(q3, "b"),
                new Question(q4, "c"),
                new Question(q5, "b"),
        };
        takeTest(questions);
    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("QUIZ Application");
        System.out.println("\n----------------\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(questions[i].answer))
                score++;
        }
        System.out.println("You got " + score + " out of " + questions.length);
    }
}