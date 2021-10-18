/*
 * Copyright (C) 2012-2021 SonarSource SA - mailto:info AT sonarsource DOT com
 * This code is released under [MIT No Attribution](https://opensource.org/licenses/MIT-0) license.
 */
package org.sonar.samples.java;

import org.junit.jupiter.api.Test;
import org.sonar.plugins.java.api.CheckRegistrar;
import static org.assertj.core.api.Assertions.assertThat;
import org.sonar.samples.java.JavaURLFilterRegistrar;

class JavaURLFilterRegistrarTest {

  @Test
  void checkNumberRules() {
    CheckRegistrar.RegistrarContext context = new CheckRegistrar.RegistrarContext();

    JavaURLFilterRegistrar registrar = new JavaURLFilterRegistrar();
    registrar.register(context);

    assertThat(context.checkClasses()).hasSize(1);
    assertThat(context.testCheckClasses()).hasSize(1);
  }

}
