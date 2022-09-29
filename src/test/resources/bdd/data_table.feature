#For Junit
#Feature file will run in parallel,
# and Scenario runs in sequential order,
# when using surefire-plugin.

Feature: Data Table Demo

  Rule: Data Table
    @scenario3
  Scenario: Single Row With No Header
    Given my credentials
    | John | 123 |
    | Roy  | 234 |

#For Test NG & CLIs
#Scenarios and 'Scenario-outline' are executed
# in multiple threads in parallel.
