package org.sonar.samples.java;

import org.junit.jupiter.api.Test;
import org.sonar.plugins.java.api.CheckRegistrar;
import static org.assertj.core.api.Assertions.assertThat;
import com.rhrcastro.java.JavaURLFilterRegistrar;

public class JavaURLFilterRegistrarCheck {
    @Test
    void checkNumberRules() {
        CheckRegistrar.RegistrarContext context = new CheckRegistrar.RegistrarContext();

        JavaURLFilterRegistrar registrar = new JavaURLFilterRegistrar();
        registrar.register(context);

        assertThat(context.checkClasses()).hasSize(1);
        assertThat(context.testCheckClasses()).hasSize(1);
    }
}
