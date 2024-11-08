import javax.swing.JOptionPane;
public class SelectivoSwitchJava {
    public static void main(String[] yas) {
        //declaracion de variables
        byte opcion;
        float b,h,r;
        double a;
        opcion= Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONE \n 1-.TRIANGULO \n "
                + "2-.RECTANGULO \n 3-.CIRCULO \n Escribe el numero de tu eleccion"));
        switch(opcion){
            case 1:
                b= Float.parseFloat(JOptionPane.showInputDialog("ingresa el valor de la base"));
                h= Float.parseFloat(JOptionPane.showInputDialog("ingresa el valor de la altura"));
                a=(b*h)/2;
                JOptionPane.showMessageDialog(null, "El area es "+a);
                break;
                
            case 2:
                b= Float.parseFloat(JOptionPane.showInputDialog("ingresa el valor de la base"));
                h= Float.parseFloat(JOptionPane.showInputDialog("ingresa el valor de la altura"));
                a=((b)*(h));
                JOptionPane.showMessageDialog(null, "El area es "+a);
                break;
                
            case 3:
                r= Float.parseFloat(JOptionPane.showInputDialog("ingresa el valor del radio"));
                a=(Math.PI*(Math.pow(r, 2)));
                
                JOptionPane.showMessageDialog(null, "El area es "+a);
                break;
            default: JOptionPane.showMessageDialog(null, "solo es posible seleccionar 1, 2, 3 \n intente nuevamente");    
        } 
    }//cierra el metodo main
    
}//cierra la clase
