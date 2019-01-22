import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.File;

public class Controller {

    @FXML
    public TextField textField;

    @FXML
    public TextArea textArea;


    public void filNavneFinder(ActionEvent actionEvent) {

        //Her initialiseres stien efter hvad der bliver skrevet i textfeltet
        String path = textField.getText();

        //Her laver jeg et fil objekt der indeholder stien
        File folder = new File(path);

        //Her laver jeg et fil array med filerne fra den valgte sti
        File[] filesFromPath = Main.readMediaFolder(path);

        //Her koerer jeg et for each loop der kører gennem alle filerne
        for (File file : filesFromPath) {
            if (file.isFile()) {
                textArea.appendText(file.getName() + "\n");
            }
        }
    }
}


