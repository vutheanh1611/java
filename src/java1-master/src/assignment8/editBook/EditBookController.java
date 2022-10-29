package assignment8.editBook;

import assignment8.Book;
import assignment8.Main;
import assignment8.bookList.BookListController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditBookController implements Initializable {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAuthor;
    public ComboBox<String> cbPublisher;
    public ComboBox<String> cbType;
    public TextField txtPrice;
    public TextField txtQuantity;

    public static Book editedBook;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> publishers = FXCollections.observableArrayList();
        publishers.addAll(
                "Penguin/Random House",
                "Hachette Book Group",
                "Harper Collins",
                "Simon and Schuster",
                "Macmillan"
        );
        cbPublisher.setItems(publishers);

        ObservableList<String> type = FXCollections.observableArrayList();
        type.addAll(
                "Fantasy",
                "Science Fiction",
                "Dystopian",
                "Adventure",
                "Romance",
                "Detective & Mystery Horror",
                "Thriller",
                "Memoir & Autobiography",
                "Biography",
                "Cooking",
                "Art & Photography",
                "Self-Help/Personal Development",
                "Motivational/Inspirational",
                "Health & Fitness",
                "History"
        );

        cbType.setItems(type);
        txtId.setText(editedBook.getId());
        txtName.setText(editedBook.getName());
        txtAuthor.setText(editedBook.getAuthor());
        cbPublisher.setValue(editedBook.getPublisher());
        cbType.setValue(editedBook.getType());
        txtPrice.setText(Double.toString(editedBook.getPrice()));
        txtQuantity.setText(Integer.toString(editedBook.getQuantity()));
    }

    public void edit(ActionEvent actionEvent) {
        try {
            String id = txtId.getText();
            if (id.equals("")) throw new Exception("You haven't fill out ID!");
            for (Book b: BookListController.bookList) {
                if (!id.equals(editedBook.getId()) && b.getId().equals(id)) throw new Exception("ID already exists!");
            }
            String name = txtName.getText();
            if (name.equals("")) throw new Exception("You haven't fill out Name!");
            String author = txtAuthor.getText();
            if (author.equals("")) throw new Exception("You haven't fill out Author!");
            String publisher = cbPublisher.getValue();
            if (publisher == null) throw new Exception("You haven't chosen publisher!");
            String type = cbType.getValue();
            if (type == null) throw new Exception("You haven't chosen type!");
            double price = Double.parseDouble(txtPrice.getText());
            if (price < 0) throw new Exception("Price can not be negative!");
            int quantity = Integer.parseInt(txtQuantity.getText());
            if (quantity < 0) throw new Exception("Quantity can not be negative");

            editedBook.setId(id);
            editedBook.setName(name);
            editedBook.setAuthor(author);
            editedBook.setPublisher(publisher);
            editedBook.setType(type);
            editedBook.setPrice(price);
            editedBook.setQuantity(quantity);

            System.out.println(BookListController.bookList);

            goBackToList(actionEvent);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void goBackToList(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../bookList/bookList.fxml"));

        Main.rootStage.setTitle("Books management");
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

}
