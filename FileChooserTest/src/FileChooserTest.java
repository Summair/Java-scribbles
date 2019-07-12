import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class FileChooserTest extends Application {
		@Override
	
	public void start(Stage stage)throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("FileChooserTest.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("File Chooser Test");
		stage.setScene(scene);
		stage.show();
		
		}

		public static void main(String[] args) {
			launch(args);
		}


}
