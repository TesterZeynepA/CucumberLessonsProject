Feature: User login HRM with dataTable

  @validCredentials
  Scenario:login with valid credentials
    Given kullanici anasayfaya gider
    When kullanici credentiallari girer
      | Admin    | admin123 |