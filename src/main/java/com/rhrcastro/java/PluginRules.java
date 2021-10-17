package com.rhrcastro.java;

import org.sonar.api.Plugin;
import com.rhrcastro.java.JavaRulesDefinition;
import com.rhrcastro.java.JavaURLFilterRegistrar;

public class PluginRules implements Plugin {

  @Override
  public void define(Context context) {

    context.addExtension(JavaRulesDefinition.class);
    context.addExtension(JavaURLFilterRegistrar.class);

  }

}
