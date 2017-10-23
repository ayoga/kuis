/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengecekankesehatan;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Anjas
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private RadioButton laki;
    @FXML
    private RadioButton perem;
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    @FXML
    private TextField beratideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private TextField nama;
    @FXML
    private TextField tinggi;
    @FXML
    private TextField berat;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    

    @FXML
    private void proses(ActionEvent event) {
    int ideal = 0;
    String analisahasil = null;
    String analisasaran = null;
    if(laki.isSelected()){
        ideal = parseInt(tinggi.getText().toString()) - 105;
    }
     if(perem.isSelected()){
        ideal = parseInt(tinggi.getText().toString()) - 110;
    }
     beratideal.setText("" + ideal);
     if(ideal == parseInt(berat.getText())){
     analisahasil = "ideal";
     analisasaran = "Berat anda sudah ideal \njaga pola makan dan berat anda";
     }else if(ideal < parseInt(berat.getText())){
     analisahasil = "OverWeight";
     analisasaran = "Anda sedang mengalami OverWeight \nJagalah pola makan anda";
     }else if(ideal > parseInt(berat.getText())){
     analisahasil = "UnderWeight";
     analisasaran = "Anda sedang mengalami UnderWeight \natur pola makan anda hingga mencapai berat badan ideal";
     }
     hasil.setText("Nama "+nama.getText()+", Anda "+analisahasil);
     saran.setText(analisasaran);
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void reset(ActionEvent event) {
    nama.setText("");
    tinggi.setText("");
    berat.setText("");
    laki.setSelected(false);
    perem.setSelected(false);
    beratideal.setText("");
    hasil.setText("");
    saran.setText("");
    }
    
}
