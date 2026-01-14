package pagesOfYasasiiWeb;

import org.apache.tools.ant.launch.Locator;
import org.openqa.selenium.devtools.v113.page.Page;

import com.microsoft.playwright.*;

public class Playwright_inventory {

    private final Page page;

    public Playwright_inventory(Page page) {
        this.page = page;
    }

    /* ================= LOCATORS ================= */

    private Locator hamburger() {
        return page.locator("//a[@class='nav-link navbar-brand menu']//div[@class='bar3']");
    }

    private Locator inventory() {
        return page.locator("//i[@class='ki ki-inventory']");
    }

    private Locator pharmacyLocation() {
        return page.locator("#sublocationid");
    }

    private Locator general() {
        return page.locator("//div[@class='link-value'][normalize-space()='General']");
    }

    private Locator supplierMenu() {
        return page.locator("//div[normalize-space()='Supplier']");
    }

    private Locator supplierName() {
        return page.locator("#suppliername");
    }

    private Locator referenceCode() {
        return page.locator("#referencecode");
    }

    private Locator saveSupplier() {
        return page.locator("#btnsaveSupplier");
    }

    private Locator okButton() {
        return page.locator("//button[normalize-space()='OK']");
    }

    private Locator printIcon() {
        return page.locator("//i[@class='ki ki-print']");
    }

    private Locator refreshIcon() {
        return page.locator("//i[@class='ki ki-refresh']");
    }

    /* ================= COMMON UTILS ================= */

    private void selectDropdownValue(String value) {
        page.locator("//li[normalize-space()='" + value + "']").click();
    }

    /* ================= METHODS ================= */

    // ---------------- Inventory Home ----------------
    public void inventoryHome(String pharmacyLocationName, String issueLocation) {

        hamburger().click();
        inventory().click();

        // Handle optional popup
        Locator yesBtn = page.locator("//ki-dialog-common//button[normalize-space()='Yes']");
        if (yesBtn.isVisible()) {
            yesBtn.click();
        }

        pharmacyLocation().click();
        selectDropdownValue(pharmacyLocationName);
        okButton().click();

        page.locator("//div[contains(text(),'Inventory Home')]").click();

        page.locator("//span[normalize-space()='Today']").click();
        refreshIcon().click();

        // Switch location
        page.locator("//i[@class='ki ki-map-pin-fill']").click();
        pharmacyLocation().click();
        selectDropdownValue(issueLocation);
        okButton().click();

        page.locator("//i[@class='ki ki-map-pin-fill']").click();
        pharmacyLocation().click();
        selectDropdownValue(pharmacyLocationName);
        okButton().click();
    }

    // ---------------- Supplier ----------------
    public void createAndUpdateSupplier(String supplier) {

        hamburger().click();
        general().click();
        supplierMenu().click();

        supplierName().fill(supplier);
        referenceCode().fill("KMC300");
        saveSupplier().click();

        okButton().click();

        page.locator("//input[@placeholder='Supplier Name']").fill(supplier);
        page.keyboard().press("Enter");

        page.locator("//i[@class='fa fa-arrow-circle-o-right']").click();

        page.locator("#phoneno").fill("0987678098");
        page.locator("#websiteurl").fill("https://www.tutorialspoint.com/");
        page.locator("#emailaddress").fill("KMCMed@gmail.com");
        page.locator("#contactpersonsname").fill("KAmeda");

        page.locator("//button[@title='Update']").click();

        printIcon().click();
        page.keyboard().press("Escape");

        refreshIcon().click();
    }

    // ---------------- Sublocation ----------------
    public void createSublocation(String pharmacyLocationName) {

        hamburger().click();
        page.locator("//div[normalize-space()='Sublocation Creation']").click();

        page.locator("#name").fill(pharmacyLocationName);
        page.locator("#referencecode").fill("5661");
        page.locator("#reqvaliditydays").fill("2");

        page.locator("#btnSublocation").click();
        okButton().click();

        page.locator("//input[@placeholder='Sublocation']").fill(pharmacyLocationName);
        page.keyboard().press("Enter");

        page.locator("//i[@class='fa fa-arrow-circle-o-right text-white']").click();

        // Delete existing items
        while (page.locator("//i[@title='Delete']").count() > 0) {
            page.locator("//i[@title='Delete']").first().click();
            page.locator("//button[normalize-space()='Yes']").click();
            okButton().click();
        }
    }

    // ---------------- Inventory Indent ----------------
    public void inventoryIndent(String issueLocation) {

        hamburger().click();
        page.locator("//div[normalize-space()='Indent']").click();
        page.locator("//div[normalize-space()='Inventory Indent']").click();

        page.locator("#phisslocid").fill(issueLocation);
        selectDropdownValue(issueLocation);

        addIndentItem("WAXONIL O KID EAR DROPS", "30");
        addIndentItem("DOLOPAR 650 TAB", "30");
        addIndentItem("MIRAGO 25MG TAB", "30");

        page.locator("//i[@class='ki ki-save']").click();
        okButton().click();
    }

    private void addIndentItem(String item, String qty) {
        page.locator("#itemname").fill(item);
        page.keyboard().press("Enter");
        page.locator("//div[@class='displaing-item']").click();
        page.locator("#indqty").fill(qty);
        page.locator("//i[@class='ki ki-plus']").click();
    }

    // ---------------- GRN ----------------
    public void stockGRN(String supplierName) {

        hamburger().click();
        page.locator("//div[normalize-space()='GRN']").click();
        page.locator("//span[@class='btn btn-link ng-star-inserted']").click();

        page.locator("#supplierid").click();
        selectDropdownValue(supplierName);

        String grnNo = String.valueOf(System.currentTimeMillis());
        page.locator("#grn").fill(grnNo);

        addGRNItem("DOLOPAR 650 TAB", "99900", "12");
        addGRNItem("MORPHINE 50MG TAB", "3300", "16");

        page.locator("//i[@class='ki ki-save']").click();
    }

    private void addGRNItem(String item, String qty, String price) {

        page.locator("#itemname").fill(item);
        page.keyboard().press("Enter");
        page.locator("//div[@class='displaing-item']").click();

        page.locator("#batchno").fill(String.valueOf(System.nanoTime()));
        page.locator("#altqty").fill(qty);

        page.locator("#unitcostprice").fill(price);
        page.locator("#unitsellingprice").fill(price);

        page.locator("//div[@class='card grn']//button[1]").click();
    }
}
