package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ContactController{
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtPhone;
    public Text strName;
    public Text strEmail;
    public Text strAddress;
    public Text strPhone;

    public void submit(ActionEvent actionEvent) {
        String Name = txtName.getText();
        String Email = txtEmail.getText();
        String Address = txtAddress.getText();
        String Phone = txtPhone.getText();

        strName.setText(Name);
        strEmail.setText(Email);
        strAddress.setText(Address);
        strPhone.setText(Phone);
    }
}