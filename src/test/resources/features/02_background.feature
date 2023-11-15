@background
Feature: Using Background Keywords:

  Background: Ortak Stepler
    Given kullanici google sayfasina gider

  Scenario: TC03_amazonSearch
    When kullanici amazon icin arama yapar
    Then sayfa basliginin amazon kelimesi icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04_linkedinSearch
    When kullanici linkedin icin arama yapar
    Then sayfa basliginin linkedin kelimesi icerdigini test eder
    And sayfayi kapatir
