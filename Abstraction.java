public class Test1 implements olaOwner, olaDriver, olaCustomer {

interface olaCustomer {
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneytoWallet();
    void raiseTicket();
    void signup();
    void signIn();
}

interface olaDriver {
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}

interface olaOwner {
    void getDriverRecords();
    void getReportByDriverID();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomersFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}

public class Test1 implements olaOwner, olaDriver, olaCustomer {

    public static void main(String[] args) {
        olaCustomer cust = new Test1();
        olaDriver manoj = new Test1();
        manoj.acceptBooking();
    }

    public void bookcab() {
    }

    public void finfARide() {
    }

    public void rentCab() {
    }

    public void rateDriver() {
    }

    public void scheduleCab() {
    }

    public void cancelCab() {
    }

    public void addMoneytoWallet() {
    }

    public void raiseTicket() {
    }

    public void signup() {
    }

    public void signIn() {
    }

    public void getDriverRecords() {
    }

    public void getReportByDriverID() {
    }

    public void getReportByRegion() {
    }

    public void getTotalRevenue() {
    }

    public void getCustomersFeedback() {
    }

    public void addDriver() {
    }

    public void removeDriver() {
    }

    public void changeDriverStatus() {
    }
}
}