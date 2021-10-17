package com.rhrcastro.java.checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.ClassTree;
import org.sonar.plugins.java.api.tree.Tree;
import java.util.Collections;
import java.util.List;


@Rule(key = "JavaURLFilter")
public class JavaURLFilterCheck extends IssuableSubscriptionVisitor {
    @Override
    public List<Tree.Kind> nodesToVisit() {
        // Register to the kind of nodes you want to be called upon visit.
        return Collections.singletonList(Tree.Kind.CLASS);
    }
    
}
