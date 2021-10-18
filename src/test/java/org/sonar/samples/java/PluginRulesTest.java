package org.sonar.samples.java;
import org.junit.jupiter.api.Test;
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarProduct;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.utils.Version;
import com.rhrcastro.java.PluginRules;

import static org.assertj.core.api.Assertions.assertThat;

public class PluginRulesTest {
    @Test
    void testName() {
      Plugin.Context context = new Plugin.Context(new MockedSonarRuntime());
  
      new PluginRules().define(context);
  
      assertThat(context.getExtensions()).hasSize(2);
    }
    private static class MockedSonarRuntime implements SonarRuntime {
  
      @Override
      public Version getApiVersion() {
        return Version.create(7, 9);
      }
  
      @Override
      public SonarProduct getProduct() {
        return SonarProduct.SONARQUBE;
      }
  
      @Override
      public SonarQubeSide getSonarQubeSide() {
        return SonarQubeSide.SCANNER;
      }
  
      @Override
      public SonarEdition getEdition() {
        return SonarEdition.COMMUNITY;
      }
    }
}
