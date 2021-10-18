/*
 * Copyright (C) 2012-2021 SonarSource SA - mailto:info AT sonarsource DOT com
 * This code is released under [MIT No Attribution](https://opensource.org/licenses/MIT-0) license.
 */
package org.sonar.samples.java;

import org.sonar.api.Plugin;

import org.sonar.samples.java.JavaURLFilterDefinition;
import org.sonar.samples.java.JavaURLFilterRegistrar;


public class JavaURLFilterRulesPlugin implements Plugin {

  @Override
  public void define(Context context) {
    context.addExtension(JavaURLFilterDefinition.class);

    context.addExtension(JavaURLFilterRegistrar.class);

  }

}
