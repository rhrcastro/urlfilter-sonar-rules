package org.sonar.samples.java.checks;

import com.rhrcastro.java.checks.JavaURLFilterCheck;

import org.junit.jupiter.api.Test;
import org.sonar.java.checks.verifier.CheckVerifier;

public class JavaURLFilterTest {
    @Test
    void detected() {
        JavaURLFilterCheck rule = new JavaURLFilterCheck();

        CheckVerifier.newVerifier()
        .onFile("src/test/files/JavaURLFilterCheck.java")
        .withCheck(rule)
        .verifyIssues();
    }
}
