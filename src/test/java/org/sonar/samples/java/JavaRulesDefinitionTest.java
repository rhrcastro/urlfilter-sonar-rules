package org.sonar.samples.java;

import org.junit.jupiter.api.Test;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Rule;
import static org.assertj.core.api.Assertions.assertThat;
import com.rhrcastro.java.JavaRulesDefinition;
import com.rhrcastro.java.RulesList;


public class JavaRulesDefinitionTest {
    @Test
    void test() {
        JavaRulesDefinition rulesDefinition = new JavaRulesDefinition();
        RulesDefinition.Context context = new RulesDefinition.Context();
        
        rulesDefinition.define(context);
        RulesDefinition.Repository repository = context.repository(JavaRulesDefinition.REPOSITORY_KEY);

        assertThat(repository.name()).isEqualTo("Java URL Filter - Custom rules");
        assertThat(repository.language()).isEqualTo("java");
        assertThat(repository.rules()).hasSize(RulesList.getChecks().size());
        assertThat(repository.rules().stream().filter(Rule::template)).isEmpty();

    }

}
