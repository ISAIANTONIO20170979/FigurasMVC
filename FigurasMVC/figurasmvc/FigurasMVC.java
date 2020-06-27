
package figurasmvc;

import Controlador.ctrlFiguras;
import Modelo.modFiguras;
import Vista.frmFiguras;


public class FigurasMVC {

    
    public static void main(String[] args) {
        modFiguras modFiguras = new modFiguras();
        frmFiguras vFiguras = new frmFiguras();
        ctrlFiguras ctrl = new ctrlFiguras(vFiguras,modFiguras); 
        ctrl.iniciar();
        vFiguras.setVisible(true);  
    }
    
}
