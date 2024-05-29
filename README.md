Integrantes:
- Manuela Bedoya.
- Santiago Guerrrero.
- Luis Antonio Bautista.

Para resolver el problema de validar etiquetas HTML en los testFile1....tesFile7, hicimos lo siguiente:

1. Implementamos un metodo que utiliza pilas(Stack), Que solo procesa etiquetas Html.
   
                             Stack<HtmlTag> stack = new Stack<>();
   
2. Utilizamos el bucle while para recorrer todas las etiquetas en la cola(Queue).
   
4. Para cada etiqueta, verificamos si es auto-cerrada y, de ser así, continuamos con la siguiente etiqueta, y si la etiqueta era de apertura, la agregamos a la pila.
   
5. Si encontramos una etiqueta de cierre, realizamos las siguientes verificaciones:
   - Si la pila estaba vacía, retornamos null para indicar un error de validación, ya que no hay una etiqueta de apertura correspondiente.
   - Si la etiqueta de cierre coincidia con la última etiqueta de apertura en la pila, solo removimos esta última de la pila.
   - Si las etiquetas no coincidian, retornamos la pila indicando un error de validación.
  
6. Al finalizar el bucle, retornamos la pila. Si la pila estaba vacía, significaba que todas las etiquetas de apertura tienen una etiqueta de cierre correspondiente y están correctamente emparejadas.
   Y si la pila no estaba vacía, esta contiene las etiquetas de apertura que no tienen una etiqueta correspondiente de cierre, lo que indicaba un error en la estructura HTML

   




