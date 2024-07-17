module com.cse.oop.mainproject.postoffice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.oop.mainproject.postoffice to javafx.fxml;
    exports com.cse.oop.mainproject.postoffice;
}