package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//added
import javafx.event.ActionEvent;

public class MainController {

    @FXML
    private Label outputField;

    @FXML
    private TextField loanAmountBox;

    @FXML
    private TextField interestRateField;

    @FXML
    private TextField durationField;

    @FXML
    private Button calculateButton;

    @FXML
    void calcbtn_onclick(ActionEvent event) {
    	double result, loanAmt, interestRate, duration, interestAmount, monthlyInstallment, intoMonths;
    	loanAmt = Double.parseDouble(loanAmountBox.getText());
    	interestRate = Double.parseDouble(interestRateField.getText());
    	duration = Double.parseDouble(durationField.getText());
    	
    	if(interestRate > 3 && interestRate < 7 ) {

    	//interest amount calculation
    	interestAmount = (loanAmt * duration * interestRate)/100;
    	
    	//taking the duration in years and converting to months.
    	intoMonths = duration * 12;
    	
    	//monthly installment calculation
    	monthlyInstallment = (loanAmt + interestAmount)/intoMonths;
    	
    	//displaying result
    	result = monthlyInstallment;
    	outputField.setText(" "+result);
    	}
    	else {
    		outputField.setText("Error! Try again. Interest Rate Out Of Bounds");
    	}
    }

}
