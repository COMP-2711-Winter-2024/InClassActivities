package FactoryExample;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class TestBranch {

    /** Reference to {@code stdout} */
    private final PrintStream stdout;
    private ByteArrayOutputStream fakeStdOutContent;
    private PrintStream fakeStdout;

    public TestBranch() {
        stdout = System.out;
        fakeStdOutContent = new ByteArrayOutputStream();
        fakeStdout = new PrintStream(fakeStdOutContent);
        System.setOut(fakeStdout);
    }

    @BeforeEach
    public void clearStdout() {
        fakeStdout.flush();
        fakeStdOutContent.reset();
    }

    @ParameterizedTest(name = "Account type: {0}, Expected output: {1}")
    @MethodSource
    public void testAccounts(String type, String expOut) {
        Branch branch = new Branch();
        try {
            BankAccount bankAccount = branch.openAccount(type);
        } catch (NullPointerException npe) {
            if (type.equals("N")) return;
            else throw npe;
        }

        String[] stdoutContent = retrieveStdout();

        assertEquals(expOut, stdoutContent[0]);
    }

    private static Stream<Arguments> testAccounts() {
        return Stream.of(
            Arguments.of("P", "Opened a personal account."),
            Arguments.of("B", "Opened a business account."),
            Arguments.of("C", "Opened a chequing account."),
            Arguments.of("N", "Invalid type. No account for you.")
        );
    }

    public static void main(String[] args) {

        BankAccount bankAccount = null;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter\n" +
                        " P for Personal account\n" +
                        " B for Business account\n" +
                        " C for Chequing account\n" +
                "----------------------------");

        String type = in.nextLine();

        Branch branch = new Branch();
        bankAccount = branch.openAccount(type);

        in.close();
    }

    private String[] retrieveStdout() {
        fakeStdout.flush();
        String[] content = fakeStdOutContent.toString().split("\n");
        for (int i = 0; i < content.length; i++) {
            content[i] = content[i].trim();
        }
        return content;
    }

}
