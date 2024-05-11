package com.proyect_app.view.components;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class NumericTextField extends JTextField {
    
    public NumericTextField() {
        ((AbstractDocument) this.getDocument()).setDocumentFilter(new NumericDocumentFilter());
    }

    class NumericDocumentFilter extends DocumentFilter {
        private static final int MAX_INTEGER_DIGITS = 4;
        private static final int MAX_DECIMAL_DIGITS = 3;

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (isValidText(fb.getDocument(), string, offset)) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isValidText(fb.getDocument(), text, offset)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean isValidText(Document doc, String text, int offset) throws BadLocationException {
            if (text.matches("[0-9.]*")) {
                StringBuilder currentText = new StringBuilder(doc.getText(0, doc.getLength()));
                StringBuilder newText = currentText.replace(offset, offset + text.length(), text);

                if (newText.toString().equals(".")) {
                    return false;
                }

                int dotIndex = newText.indexOf(".");
                if (dotIndex == -1) {
                    if(newText.length() > MAX_INTEGER_DIGITS) {
                        return false;
                    }
                } else {
                    String integerPart = newText.substring(0, dotIndex);
                    String decimalPart = newText.substring(dotIndex + 1);
                    //Control cantidad maximo de numeros enteros y decimales
                    if (integerPart.length() > MAX_INTEGER_DIGITS || decimalPart.length() > MAX_DECIMAL_DIGITS) {
                        return false;
                    }
                    //Solo se permite un solo punto (para representar la parte decimal)
                    if (newText.chars().filter(ch -> ch == '.').count() > 1) {
                        return false;
                    }
                    //Si el primer entero es 0, no pueden haber más digitos a parte del punto
                    if (!decimalPart.isEmpty() && decimalPart.charAt(0) == '0' && decimalPart.length() > 1) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }
/* 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Numeric Text Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new NumericTextField());
        frame.pack();
        frame.setVisible(true);
    }
*/
}
