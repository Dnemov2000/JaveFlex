module com.mycompany.mavenproject7 {
     requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.base;
    requires javafx.media;
    requires java.sql;
    
    opens com.mycompany.mavenproject7 to javafx.fxml,com.google.gson;
    exports com.mycompany.mavenproject7;
}
