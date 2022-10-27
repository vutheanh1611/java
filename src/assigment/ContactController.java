package assigment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ContactController {
    public TextField txtName;
    public TextField txtEmail;
    public ListView<Contact> lv;

    private ObservableList<Contact> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        // System.out.println("Submitted..."+name);
        Contact ct = new Contact(name,email);
        ls.add(ct);
        print();
    }

    public void print(){
        lv.setItems(ls);
    }
}