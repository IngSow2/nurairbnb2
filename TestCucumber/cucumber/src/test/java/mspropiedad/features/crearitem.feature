@Propiedades
Feature: Perform a item creation

  Scenario: Perform item creation with valid details
    Given an item with valid details
      | id      | 3fa85f64-5717-4562-b3fc-2c963f66afa6       |
      | nombre      | departamento |
      | estado      | HABILITADO |
      | precio      | 0.0 |
    When request is submitted for item creation
    Then verify that the Item HTTP response is 200
    And a item id is returned

  Scenario: Perform a failed item creation
    Given an item with invalid details
      | id      | 3fa85f64-5717-4562-b3fc-2c963f66afa6       |
      | nombre      | departamento |
      | estado      | HABILITADO |
      | precio      | 0.0 |
    When request is submitted for item creation
    Then verify that the Item HTTP response is 200