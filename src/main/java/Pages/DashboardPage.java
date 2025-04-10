package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.*;

import java.util.List;

public class DashboardPage extends BasePage {
    public DashboardPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By dashboardPage = By.xpath("//*[@id=\"Dashboard\"]/a");

    By navigation = By.id("navigation");
    By AdminEle = navigation.id("Admin");
    By LeftSide = By.id("accordion");
    By BranchEle = By.xpath("//a[@href=\"/admin/branch\"]");
    By addBranchBttn = By.id("add_click");
    By addCountryBttn = By.id("airport_add");
    By topUpEle = By.xpath("/html/body/ndc-root/ndc-layout/div/div[1]/tilde-theme-side-menu/div/ul/li[1]/tilde-theme-accordion/section/ul/li[4]/a/span");
    By addTopUpBttn = By.id("add_click");
    By RulesEle = navigation.id("Rules");
    By addMarkup = By.id("add_click");
    By leftCornerOfRules = By.id("side_nav");
    By discount = By.xpath("//a[@href='/odeysysadmin/Rules/searchRuleDiscount']");
    By serviceCharge = leftCornerOfRules.xpath("/html/body/div/section/div/div[1]/nav/div/div[3]");
    By cancellationCharge = leftCornerOfRules.xpath("/html/body/div/section/div/div[1]/nav/div/div[4]");
    By fareRuleMaster = leftCornerOfRules.xpath("//*[@id=\"accordion\"]/div[5]/a/div");
    By offerPricing = leftCornerOfRules.xpath("/html/body/div/section/div/div[1]/nav/div/div[6]/a/div/h4");
    By BookingMidOffice = By.xpath("//a[contains(text(),'Booking-Mid')]");
    By manualInvoice = BookingMidOffice.id("Manual BookingInvoice");
    By searchBooking = BookingMidOffice.id("Search Booking");
    By booking = BookingMidOffice.id("Booking");
    By importPnr = By.id("ImportPnr");
    By termsAndConditions = By.xpath("/html/body/div[1]/section/div/div[1]/nav/div/div[7]/a/div/h4");
    By Reports = By.id("Reports");
    By productEle = LeftSide.id("productMenu");
    By addProduct = By.id("add_click");
    By agencyAdmin = By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4");
    By searchLoginDetails = By.id("searchAgentLoginDetails");
    By RuleEngine = By.xpath("//a[contains(text(),'Rule')]");
    By approvetopup=By.xpath("//*[@id=\"pr_id_5-table\"]/tbody/tr[1]/td[13]/div/div[1]/i");
    By remarks=By.xpath("/html/body/ndc-root/ndc-dialog-modal/p-dialog/div/div/div[3]/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input/ndc-fg-text-area-input/div/textarea");
    By submittopup=By.xpath("/html/body/ndc-root/ndc-dialog-modal/p-dialog/div/div/div[3]/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div/div[2]/button/span");
    //  By AdminTab =By.xpath("//a[contains(text(),'Admin')]");


    public void openAddNewCountryPage() {
        driver.element().click(AdminEle)
                .click(addCountryBttn);
    }

    public void openSearchNewCountryPage() {
        driver.element().click(AdminEle);


    }

    public void openSearchBranchPage() {
        driver.element().click(AdminEle)
                .click(BranchEle);


    }

    public void openAddBranchPage() {
        driver.element().click(AdminTab)
                .click(BranchEle)
                .scrollToElement(addBranchBttn).click(addBranchBttn);
    }

    public void openTopUpPage() {
        driver.element().click(topUpEle);
       driver.element().click(approvetopup);
        driver.element().click(remarks);
        driver.element().type(remarks,"asss");
        driver.element().click(submittopup);
    }

    public void openAddTopUpPage() {
        driver.element().click(topUpEle)
                .click(approvetopup);


    }


    public void openSearchProductPage() {
        driver.element().click(AdminEle)
                .click(productEle);
    }

    public void openAddProductPage() {
        driver.element().click(AdminEle)
                .click(productEle)
                .click(addProduct);
    }

    public void openMarkupSearchPage() {
        driver.element().click(RulesEle);

    }

    public void openAddMarkupPage() {
        driver.element().click(RulesEle)
                .click(addMarkup);


    }

    public void openDiscountSearchPage() {
        driver.element().click(RulesEle)
                .click(discount);


    }

    public void openAddDiscountPage() throws InterruptedException {
        driver.element().click(RulesEle)
                .click(discount);
        Thread.sleep(3000);
        driver.element().click(addMarkup);

    }

    public void openServiceChargeSearchPage() {
        driver.element().click(RuleEngine)
                .click(serviceCharge);


    }

    public void openAddServiceChargePage() throws InterruptedException {
        driver.element().click(RulesEle);
        Thread.sleep(3000);
                driver.element().click(serviceCharge)
                .click(addMarkup);


    }

    public void openCancellationChargeSearchPage() {
        driver.element().click(RulesEle)
                .click(cancellationCharge);


    }

    public void openAddCancellationChargePage() {
        driver.element().click(RulesEle)
                .click(cancellationCharge)
                .click(addMarkup);
    }

    public void openAddFareRulesPage() {
        driver.element().click(RulesEle)
                .click(fareRuleMaster)
                .click(addTopUpBttn);


    }

    public void openOfferPricingSearchPage() {
        driver.element().click(RulesEle)
                .click(offerPricing);


    }

    public void openAddOfferPricingPage() {
        driver.element().click(RulesEle)
                .click(offerPricing)
                .click(addMarkup);

    }

    public void openSearchLoginDetailsPage() {

        driver.element().click(AdminEle)
                .click(agencyAdmin)
                .click(searchLoginDetails);
    }

    public void openTermsAndConditionsPage() {
        driver.element().click(RulesEle)
                .click(termsAndConditions);

    }

    public void openManualInvoicePage() throws IllegalArgumentException {
        try {
            driver.element().click(BookingMidOffice)
                    .click(manualInvoice);
        } catch (IllegalArgumentException ex) {
            // Handle exception
            System.err.println("Invalid arguments: " + ex.getMessage());
        }


    }

    public void openSearchBookingPage() {
        driver.element().click(BookingMidOffice)
                .click(searchBooking);


    }

    public void openBookingPage() {
        try {
            driver.element().click(AdminTab).click(BookingMidOffice);
          //          .scrollToElement(booking).click(booking);
        } catch (ElementNotInteractableException e) {
            driver.element().click(BookingMidOffice)
                    .scrollToElement(booking).click(booking);
        }


    }


    public void openImportPnr() {
        driver.element().scrollToElement(importPnr).click(importPnr);
    }

    public void openReportsPage() {
        driver.element().click(Reports);
    }

    // hagar adds //
//    By importPnr = By.id("ImportPnr");
//    By termsAndConditions = By.xpath("/html/body/div[1]/section/div/div[1]/nav/div/div[7]/a/div/h4");
//    By Reports = By.id("Reports");

    By userManagment = By.xpath("//*[@id=\"UserManagement\"]/a");
    By TravellersDetails = By.xpath("//*[@id=\"travellerseDetails\"]");
    By Master = By.xpath("//a[@href='/master']");
    By Miscellaneous = By.xpath("//*[@id=\"Miscellaneous\"]");
    By searchCurrency = By.id("searchCurrency");
    By regionCity = By.id("regionMisc");
    By knowledge_add = By.xpath("//*[@id=\"searchKc\"]");
    By Supplier = By.xpath("//*[@id=\"Supplier\"]");
    By SupplierCredentials = By.xpath("//*[@id=\"searchSupplierCredential\"]");
    By BSPCommission = By.id("bspMaster");
    By PaymentGateway = By.id("Payment Gateway");
    By PaymentMethod = By.id("searchPaymentMode");
    By Admin = By.xpath("//*[@id=\"Admin\"]/a");
    By Branch = By.xpath("//*[@id=\"accordion\"]/div[2]/a/div/h4");
    By Agency = By.xpath("//*[@id=\"Agency\"]");
    By searchAgency = By.xpath("//*[@id=\"searchAgency\"]");
    By SupplierCredentialField = By.id("searchCredentialField");
    By flightButton = By.id("addCredentialFlght");
    By AdminTab = By.xpath("//a[contains(text(),'Admin')]");
    By AgencyTab = By.xpath("(//a[@class='ng-star-inserted'])[3]");
    By AgencySubTab = By.xpath("(//a[@href='/admin/agency'])");



    //    public void openImportPnr() {
//        driver.element().scrollToElement(importPnr).click(importPnr);
//    }
//
//    public void openReportsPage() {
//        driver.element().click(Reports);
//    }

    public void openUserManagmentPage() {
        driver.element().click(userManagment);
    }

    public void openUserManagmentPage_travellers() {
        driver.element().click(TravellersDetails);
    }

    public void openMaster() {
        driver.element().click(Master);
    }

    public void openMaster_Miscellaneous() {
        driver.element().click(Miscellaneous);
    }

    public void openMaster_Currency() {
        driver.element().click(searchCurrency);
    }

    public void openMaster_Region() {
        driver.element().click(regionCity);
    }

    public void openMaster_Knowledge() throws InterruptedException {
        driver.element().click(knowledge_add);
        Thread.sleep(2000);
    }
    public  void ClickFlight()
    {driver.element().click(flightButton);}

    public void openMaster_Supplier() {
        driver.element().click(Supplier);
    }

    public void openMasterPage() {
        driver.element().click(Master);
    }

    public void openMaster_SupplierCredentials() {
        driver.element().click(SupplierCredentials);
    }
    public void openMaster_SupplierCredentialsField(){
        driver.element().click(SupplierCredentialField);
    }

    public void openMasterBSPCommission() {
        driver.element().click(BSPCommission);
    }

    public void openMasterPaymentGateway() {
        driver.element().click(PaymentGateway);
    }

    public void openMasterPaymentMethod() {
        driver.element().click(PaymentMethod);
    }

    public void openAdmin() {
        driver.element().click(Admin);

    }


    public void openBranchInAdmin() {
        driver.element().click(Branch);
    }

    public void openAgency() {
          driver.element().click(AdminTab).click(AgencyTab).click(AgencySubTab);
    }
    public void openDiscount() {
        driver.element().click(AdminTab).click(RuleEngine).click(discount);
    }


    public void openSearchAgency() {
        driver.element().click(searchAgency);
    }

    // safy adds //
    By userManagement = By.xpath("//*[@id=\"UserManagement\"]/a");
    By myQuotes = By.xpath("//*[@id=\"My Quotes\"]/a");

    public void openUserManagment() {
        driver.element().click(userManagement);

    }

    public void openMyQuotes() {
        driver.element().click(BookingMidOffice)
                .click(myQuotes);
    }

    public void openDashBard() {
        driver.element().click(dashboardPage);
    }

}
