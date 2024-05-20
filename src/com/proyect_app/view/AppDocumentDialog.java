package com.proyect_app.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.proyect_app.view.components.RoundedPanel;

public class AppDocumentDialog extends JDialog{

    private RoundedPanel panelInfo, panel;
    private JLabel tittle, description;

    public AppDocumentDialog(){
        this.config();
        initComponents();
    }

    public void initComponents() {
        createText();
        createRoundedPanel();
        createPanel();
        
    }

    public void config() {
        this.setLayout(null);
        this.setSize(500, 600);
        this.setBackground(new Color(163, 206, 241));
        this.setVisible(true);
    }

    private void createPanel(){
        panel = new RoundedPanel(0,0);
        panel.setBackground(new Color(39, 76, 119));
        panel.setBounds(0, 0, 500, 600);
        this.add(panel);
    }
    private void createRoundedPanel() {
        panelInfo = new RoundedPanel(35,35);
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(30, 30, 430, 500);
        this.add(panelInfo);
    }

    private void createText(){
        tittle = new JLabel("Instrucciones de uso");
        tittle.setBounds(130, 30, 300, 40);
        tittle.setFont(new Font("Arial", Font.BOLD, 20));
        tittle.setForeground(new Color(39, 76, 119));
        this.add(tittle);

        description = new JLabel(
        "<html>Seleccionar la Variable a Calcular:<br><br>"+
        
        "El usuario debe identificar cuál de las variables de la fórmula necesita calcular.<br>"+
        "Haga clic en el botón correspondiente a la variable deseada (por ejemplo, si necesita calcular el empuje, haga clic en E : Empuje.<br><br>"+
        "Ingreso de Datos:<br><br>"+
        
        "Tras seleccionar la variable, la interfaz presentará un nuevo formulario o cuadro de diálogo donde se le solicitará ingresar los valores conocidos de las otras variables.<br>"+
        "Asegúrese de ingresar los valores en las unidades correctas para evitar errores en el cálculo.<br><br>"+
        "Realizar el Cálculo:<br><br>"+
        
        "Después de ingresar los datos, haga clic en el botón para calcular.<br>"+
        "La interfaz mostrará el resultado del cálculo basado en los valores proporcionados.<br><br>"+
        "Consultar la Ayuda:<br><br>"+
        
        "Si en algún momento necesita ver la documentacion, haga clic en el botón de ayuda (ícono con un signo de interrogación). <br>"+
        "Esto abrirá una ventana con información adicional sobre la fórmula.<br><br>"+
        "Regresar al Inicio:<br><br>"+
        
        "Para volver al menú principal o a la pantalla inicial, haga clic en el botón de inicio (ícono de una casa).</html>");

        description.setFont(new Font("Arial", Font.PLAIN, 12));
        description.setBounds(50, 80, 400, 450);
        description.setForeground(new Color(39, 76, 119));
        this.add(description);
    }
    
}
