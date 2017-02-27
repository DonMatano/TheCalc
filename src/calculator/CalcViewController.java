package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * Created by matano on 27/2/17.
 */
public class CalcViewController
{
    @FXML
    TextArea inputTextArea ;

    char operation;

    @FXML
    TextArea resultTextArea ;

    double firstNumber = 0, secondNumber = 0;
    boolean isFirstNumber = true;


    private Main main;

    public CalcViewController()
    {
    }

    public void setMain(Main main)
    {
        this.main = main;
    }

    @FXML
    public void onButton_0_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "0");
    }

    @FXML
    public void onButton_1_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "1");
    }

    @FXML
    public void onButton_2_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "2");
    }

    @FXML
    public void onButton_3_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "3");
    }

    @FXML
    public void onButton_4_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "4");
    }

    @FXML
    public void onButton_5_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "5");
    }

    @FXML
    public void onButton_6_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "6");
    }

    @FXML
    public void onButton_7_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "7");
    }

    @FXML
    public void onButton_8_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "8");
    }

    @FXML
    public void onButton_9_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + "9");
    }

    @FXML
    public void onButton_decimal_Pressed()
    {
        inputTextArea.setText(inputTextArea.getText() + ".");
    }

    @FXML
    public void doOperation(char symbol)
    {
        switch (symbol)
        {
            case '+' :
            {
                add();
            }
            break;

            case '-':
            {
                subtract();
            }
            break;

            case '/':
            {
                divide();
            }
            break;

            case '*':
            {
                multiply();
            }

        }
    }

    private void add()
    {
        firstNumber = Double.parseDouble(inputTextArea.getText());

        secondNumber = secondNumber + firstNumber;
        resultTextArea.setText(Double.toString(secondNumber));
        inputTextArea.setText("");

        if (isFirstNumber)
        {
            isFirstNumber = false;
        }
    }

    private void subtract()
    {
        firstNumber = Double.parseDouble(inputTextArea.getText());

        if (isFirstNumber)
        {
            secondNumber = firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
            isFirstNumber = false;
        }
        else
        {
            secondNumber = secondNumber - firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
        }
    }

    private void divide()
    {
        firstNumber = Double.parseDouble(inputTextArea.getText());

        if (isFirstNumber)
        {
            secondNumber = firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
            isFirstNumber = false;
        }
        else
        {
            secondNumber = secondNumber / firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
        }
    }

    private void multiply()
    {
        firstNumber = Double.parseDouble(inputTextArea.getText());

        if (isFirstNumber)
        {
            secondNumber = firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
            isFirstNumber = false;
        }
        else
        {
            secondNumber = secondNumber * firstNumber;
            resultTextArea.setText(Double.toString(secondNumber));
            inputTextArea.setText("");
        }
    }

    @FXML
    public void onButton_multiply_Pressed()
    {
        if(operation == '\u0000' || operation == '*')
        {
            multiply();

        }
        else
        {
            doOperation(operation);
        }

        operation = '*';
    }

    @FXML
    public void onButton_add_Pressed()
    {
        if(operation == '\u0000' || operation == '+')
        {
            add();

        }
        else
        {
            doOperation(operation);
        }

        operation = '+';

    }



    @FXML
    public void onButton_subtract_Pressed()
    {

        if (operation == '\u0000' || operation == '-')
        {
            subtract();
        }
        else
        {
            doOperation(operation);
        }

        operation = '-';
    }

    @FXML
    public void onButton_divide_Pressed()
    {
        if (operation == '\u0000' || operation == '/')
        {
            divide();
        }
        else
        {
            doOperation(operation);
        }

        operation = '/';
    }

    @FXML
    public void onButton_equal_Pressed()
    {
        if (operation != '\u0000')
        {
            doOperation(operation);
        }
    }

    @FXML
    public void onButton_cancel_Pressed()
    {
        operation = '\u0000';
        firstNumber = 0;
        secondNumber = 0;
        isFirstNumber = true;

        inputTextArea.setText("");
        resultTextArea.setText("");
    }

}
