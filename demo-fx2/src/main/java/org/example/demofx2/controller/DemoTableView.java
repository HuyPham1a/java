package org.example.demofx2.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.example.demofx2.entity.Student;
import org.example.demofx2.repository.StudentRepository;

import java.net.URL;
import java.util.ResourceBundle;

public class DemoTableView implements Initializable {

    public TableView tableView;

    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Student> data = FXCollections.observableArrayList(studentRepository.findAll());
        tableView.setItems(data);
    }
}
