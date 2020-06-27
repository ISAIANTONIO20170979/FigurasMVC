package Controlador;

import Modelo.modFiguras;
import Vista.frmFiguras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ctrlFiguras implements ActionListener {

    private frmFiguras vFiguras;
    private modFiguras modFiguras;

    public ctrlFiguras(frmFiguras vFiguras, modFiguras modFiguras) {

        this.vFiguras = vFiguras;
        this.modFiguras = modFiguras;

        this.vFiguras.btnArea.addActionListener(this);
        this.vFiguras.btnPerimetro.addActionListener(this);
        this.vFiguras.btnDescripcion.addActionListener(this);
    }

    public void iniciar() {
        vFiguras.setTitle("Figuras");
        vFiguras.setLocationRelativeTo(null);
        vFiguras.txtLado.setVisible(true);
        vFiguras.txtAltura.setVisible(false);
        vFiguras.lblAltura.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*Cuadrado*/
        if (vFiguras.cmbxFiguras.getSelectedIndex() == 0){
            if (e.getSource() == vFiguras.btnArea) {
                    modFiguras.setLado(Float.parseFloat(vFiguras.txtLado.getText()));
                    JOptionPane.showMessageDialog(null, "Area: " + modFiguras.areaCuadrado());
                }
                if (e.getSource() == vFiguras.btnPerimetro) {
                    modFiguras.setLado(Float.parseFloat(vFiguras.txtLado.getText()));
                    JOptionPane.showMessageDialog(null, "Perimetro: " + modFiguras.perimetroCuadrado());
                }
                if (e.getSource() == vFiguras.btnDescripcion) {
                    modFiguras.setLado(Float.parseFloat(vFiguras.txtLado.getText()));
                    JOptionPane.showMessageDialog(null, "Descripción: " + modFiguras.desCuadrado());
                }
        }
        /*Rectangulo*/
        if (vFiguras.cmbxFiguras.getSelectedIndex() == 1){
            if (e.getSource() == vFiguras.btnArea) {
                    modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Area: " + modFiguras.areaRectangulo());
                }
                if (e.getSource() == vFiguras.btnPerimetro) {
                    modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Perimetro: " + modFiguras.perimetroRectangulo());
                }
                if (e.getSource() == vFiguras.btnDescripcion) {
                    modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Descripción: " + modFiguras.descripRectangulo());
                }
        }
        /*Triangulo*/
        if (vFiguras.cmbxFiguras.getSelectedIndex() == 2){
            if (e.getSource() == vFiguras.btnArea) {
                    modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Area: " + modFiguras.areaTriangulo());
                }
                if (e.getSource() == vFiguras.btnPerimetro) {
                    modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Perimetro: " + modFiguras.perimetroTriangulo());
                }
                if (e.getSource() == vFiguras.btnDescripcion) {
                   modFiguras.setBase(Float.parseFloat(vFiguras.txtLado.getText()));
                    modFiguras.setAltura(Float.parseFloat(vFiguras.txtAltura.getText()));
                    JOptionPane.showMessageDialog(null, "Descripción: " + modFiguras.descripTriangulo());
                }
        }
    }


}
