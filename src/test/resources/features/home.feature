Feature: Search milk on Carrefour website

    Scenario: I want to search on duck-duck-go site
        Given I launch the home page
        And I enter milk for search
        And I select the first product
        Then Should get the details of product
