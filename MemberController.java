package Controller;


import java.sql.SQLException;

import Model.MemberModel;
import dto.MemberDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MemberController {

    @FXML
    private TextField txtMemberId;

    @FXML
    private TableView<?> tblMemberdetail;

    @FXML
    private TextField txtMemberName;

    @FXML
    private TextField txtMemberEmail;

    @FXML
    private TextField txtMemberPhone;

    @FXML
    void btnDeleteMember(ActionEvent event) {
        String memberId = txtMemberId.getText();
        try {
            // Call deleteMember on the model
            String result = MemberModel.deleteMember(memberId);
            System.out.println(result);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error deleting member: " + e.getMessage());
        }
}

    @FXML
    void btnSaveMember(ActionEvent event) {
        try {
            // Get data from UI fields
            String id = txtMemberId.getText();
            String name = txtMemberName.getText();
            String email = txtMemberEmail.getText();
            String phone = txtMemberPhone.getText();

            // Call saveMember on the model, passing the collected data
            String result =MemberModel.saveMember(id, name, email, Integer.parseInt(phone));

            // Display a success or failure message
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error saving member: " + e.getMessage());
        }
    }


    @FXML
    void btnSearchMember(ActionEvent event) {
         String memberId = txtMemberId.getText();
        try {
            // Call searchMember on the model
            MemberDto member = MemberModel.searchMember(memberId);
            
            if (member != null) {
                // Populate the text fields with the member's details
                txtMemberName.setText(member.getName());
                txtMemberEmail.setText(member.getEmail());
                txtMemberPhone.setText(String.valueOf(member.getPhone()));
            } else {
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Error searching for member: " + e.getMessage());
        }
    }

}
