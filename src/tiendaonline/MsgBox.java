package tiendaonline;
import javax.swing.JOptionPane;

public class MsgBox {

    static void Show(String msg, type t) {
        String msgTitle = "";
        int msgType= 0;
        
        switch(t){
            case type.ERROR -> { 
                msgTitle = "Ocurrio un error";
                msgType = 0;
            }
            case type.INFO -> {
                msgTitle = "Informacion";
                msgType = 1;
            }
            case type.SUCCESS -> {
                msgTitle = "Exito!";
                msgType = -1;
            }
            
        }
        
        JOptionPane.showMessageDialog(null,msg, msgTitle, msgType);
    }
    public enum type{
        ERROR,
        SUCCESS,
        INFO
    }
}
