/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.blinderjay.BBS.client.util.ThreadInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author blinderjay
 */
public class ManagePageController implements Initializable {

    @FXML
    private TableView<ThreadInfo> threadmanage;
    @FXML
    private TableColumn<ThreadInfo, String> tc_topic;
    @FXML
    private TableColumn<ThreadInfo, String> tc_context;
    @FXML
    private TableColumn<ThreadInfo, String> tc_time;

    private ObservableList<ThreadInfo> testdata;
//@FXML

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        testdata = FXCollections.observableArrayList();
        testdata.add(new ThreadInfo("csdcdsc", "hellow"));
        testdata.add(new ThreadInfo("fsdf", "helwoew"));

        tc_context.setCellValueFactory(cellData -> cellData.getValue().contexproperty());
        tc_topic.setCellValueFactory(cellData -> cellData.getValue().topicproperty());
        threadmanage.setItems(testdata);
    }

}
