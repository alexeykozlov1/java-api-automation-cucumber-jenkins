Feature: Customer testing
  @Smoke
  Scenario Outline: Boarding new customer
    Given I have the data to create customer with "<firstName>","<lastName>","<phone>","<address1>","<address2>"
    And I use customer header
    When I create post request to create customer
    Then I get status code 201 from database
    And response body should contain
      | firstName |
      | lastName  |
      | phone     |
      | addresses |
      | id        |

    Examples:
      | firstName | lastName | phone | address1 | address2 |
      | Alex      | Kozlov   | 123   | Backer 2 | Union 3  |
  @Smoke1
Scenario: Delete new customer
  Given I use customer header
  When I create delete request to create customer
  Then I get status code 200 from database























#
#  Scenario Outline: Walmart Get Request
#    Given I use customer header
#    When I make the request to Walmart
#    Then I get status code 403 from database
#    And getting "<message>" in the body with
#    Examples:
#      | message          |
#      | Account Inactive |
#
#  Scenario Outline: Walmart Get Request with 2 responses
#    Given I use customer header
#    When I make the request to Walmart
#    Then I get status code 403 from database
#    And getting "<message>" in the body with "<code>"
#    Examples:
#      | message          | code |
#      | Account Inactive | 403  |
#
#
#
#  Scenario Outline: Boarding new customer and verify the database
#    Given I have the data to create customer with "<firstName>","<lastName>","<phone>","<address1>","<address2>"
#    And I use customer header
#    When I create post request to create customer
#    Then I get status code 201 from database
#    And I had stored the customer response
#    Then I send query to database to verify the request
#    And I should get the data that matching the request
#    And response body should contain
#      | firstName |
#      | lastName  |
#      | phone     |
#      | addresses |
#      | id        |
#
#    Examples:
#      | firstName | lastName | phone | address1 | address2 |
#      | Alex      | Kozlov   | 123   | Backer 2 | Union 3  |