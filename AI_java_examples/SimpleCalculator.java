import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton;
    
    public SimpleCalculator() {
        setTitle("簡易計算機");
        setLayout(new FlowLayout());
        
        // 建立元件
        Label label1 = new Label("數字1：");
        num1Field = new TextField(10);
        
        Label label2 = new Label("數字2：");
        num2Field = new TextField(10);
        
        Label label3 = new Label("結果：");
        resultField = new TextField(10);
        resultField.setEditable(false);
        
        addButton = new Button("加法 (+)");
        subtractButton = new Button("減法 (-)");
        multiplyButton = new Button("乘法 (×)");
        divideButton = new Button("除法 (÷)");
        
        // 加入元件
        add(label1);
        add(num1Field);
        add(label2);
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(label3);
        add(resultField);
        
        // 註冊事件監聽器
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        
        // 視窗關閉事件
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        setSize(300, 250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            
            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("不能除以0");
                    return;
                }
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("輸入錯誤");
        }
    }
    
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
