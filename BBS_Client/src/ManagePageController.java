/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.blinderjay.BBS.client.util.ThreadInfo;
import com.blinderjay.BBS.client.util.ThreadUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;

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
    @FXML
    private TableColumn<ThreadInfo, Object> tc_delete;
    @FXML
    private TableColumn<ThreadInfo, Object> tc_check;
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

        //set the table to be editable
        threadmanage.setEditable(true);
        
        tc_context.setCellValueFactory(cellData -> cellData.getValue().contexproperty());
        //set the cell of the table to be editable
        tc_context.setCellFactory(TextFieldTableCell.forTableColumn());                 
tc_context.setOnEditCommit( e ->{
    
});
        
        
        
        tc_topic.setCellValueFactory(cellData -> cellData.getValue().topicproperty());
                //set the cell of the table to be editable
        tc_topic.setCellFactory(TextFieldTableCell.forTableColumn());
        //set the handler when the cell has been edited
tc_topic.setOnEditCommit( e ->{
    
});
        
        
        tc_delete.setCellValueFactory(cellData -> cellData.getValue().DelProperty());

        tc_check.setCellValueFactory(cellData -> cellData.getValue().CheckProperty());
        threadmanage.setItems(testdata);
    }

    @FXML
    public void deleteMyThreads(ActionEvent event) {
        int i = 0;
        for (ThreadInfo ti : testdata) {
            System.out.println("get data:" + ti.gettopic());
            if (ti.getIsChecked()) {
                System.out.println("is checked??:" + ti.getIsChecked());
                testdata.remove(i);
                ThreadUtil.delete(ti.getTid());
            }
            i++;
        }
    }

}
