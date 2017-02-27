package calculator; /**
 * Created by matano on 27/2/17.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    Stage window;
    CalcViewController calcViewController = new CalcViewController();



    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("The Calc");
        showCalc();
    }

    public void showCalc()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/calculator/view/calc_view.fxml"));
            calcViewController.setMain(this);
            window.setScene(new Scene(root, 800, 550));
            window.show();
        }
        catch (Exception ex)
        {
            System.out.println("Error . calc_view failed to show");
            ex.printStackTrace();
        }
    }
}
