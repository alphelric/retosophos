@RestApi
  Feature: Consume services
    I as an user of services
    Want to consume a services
    For validate the post and get methods

  @TestCase1
  Scenario: Consume services
    Given Miguel call an api from https://gorest.co.in/
    When He Put in /public-api/albums/
        | id | user_id | title                    |
        | 32 |    2684 | automation rest services |
    Then He Get the /public-api/albums/
        | id | user_id | title                    |
        | 32 |    2684 | automation rest services |