package Application;

import controllers.LoginController;
import dao.AppointmentQs;
import dao.CustomerQs;
import dao.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Appointments;
import models.Customers;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Locale;
import java.util.ResourceBundle;

/**This Class contains the methods required for launching the application and connecting to the database*/

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (Main.class.getResource("/Views/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Omega Database Application");
        stage.setScene(scene);
        stage.show();
    }

    /** This is the main method. This method launched the application and connects to the database*/
    public static void main(String[] args) throws SQLException, InvocationTargetException {

        ResourceBundle rb = ResourceBundle.getBundle("/Languages", Locale.getDefault());


        JDBC.openConnection();

        launch();

        JDBC.closeConnection();
    }


}