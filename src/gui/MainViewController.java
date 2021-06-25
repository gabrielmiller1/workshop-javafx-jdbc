
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
    
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;
    
    
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }
    
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }
    
    public void onMenuItemAboutAction(){
        System.out.println("onMenuItemAboutAction");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
