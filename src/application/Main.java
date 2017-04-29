package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.stage = primaryStage;
			pane = (AnchorPane)FXMLLoader.load(Main.class.getResource("JavaFxmlPane1.fxml"));
			scene = new Scene(pane, 640, 480);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
