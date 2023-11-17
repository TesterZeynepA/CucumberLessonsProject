package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HW_ScenarioOutlineSD {


    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @Then("kullanici {int} sn bekler")
    public void kullanici_sn_bekler(Integer int1) {
        ReusableMethods.waitFor(int1);
    }
    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfa_basliginin_icerdigini_test_eder(String string) {
        Driver.getDriver().getCurrentUrl().contains(string);
    }

}
