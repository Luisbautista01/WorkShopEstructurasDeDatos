import java.util.Queue;
import java.util.Stack;


public class HtmlValidator {

    public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {
        //Metodo para validar etiquetas HTML
        Stack<HtmlTag> stack = new Stack<>();
        //While recorre todas las etiquetas de la cola
        while (!tags.isEmpty()) {
            //Se obtiene la etiqueta actual
            HtmlTag currentTag = tags.poll();
            if (currentTag.isSelfClosing()) { // Si la etiqueta actual es auto-cerrada
                continue; // No es necesario agregarla a la pila, simplemente se continua con la siguiente etiqueta
            }
            //si la etiqueta actual es de apertura, se agrega a la pila
            if (currentTag.isOpenTag()) {
                stack.push(currentTag);
            } else {
                // Si es una etiqueta de cierre se comprueba si la pila está vaciá
                if (stack.isEmpty()) {
                    return null;
                } else if (stack.peek().matches(currentTag)) {// si la etiqueta coincide con la ultima etiqueta abierta
                    stack.pop();// se elimina de la pila
                } else {
                    return stack;
                }
            }
        }
        return stack;
    }
}
