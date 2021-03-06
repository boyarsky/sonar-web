/*
 * SonarSource :: Web :: Sonar Plugin
 * Copyright (c) 2010-2016 SonarSource SA and Matthijs Galesloot
 * sonarqube@googlegroups.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sonar.plugins.web.core.helpers;

import static org.mockito.Mockito.mock;

import javax.annotation.Nullable;

import org.sonar.api.issue.Issuable;
import org.sonar.api.issue.Issue;
import org.sonar.api.rule.RuleKey;

public class IssueBuilderMock implements Issuable.IssueBuilder {

  @Override
  public Issuable.IssueBuilder ruleKey(RuleKey ruleKey) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder line(@Nullable Integer line) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder message(@Nullable String message) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder severity(@Nullable String severity) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder reporter(@Nullable String reporter) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder effortToFix(@Nullable Double d) {
    return this;
  }

  @Override
  public Issuable.IssueBuilder attribute(String key, @Nullable String value) {
    return this;
  }

  @Override
  public Issue build() {
    return mock(Issue.class);
  }
}
