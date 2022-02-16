/*
 Diseña un TDA que permita construir objetos que almacenen una matriz CUADRADA de enteros. 
L- El constructor de la clase recibirá un ENTERO indicando el tamaño de RENGLONES Y COLUMNAS que se deberá construir. 
Las operaciones y comportamiento es el siguiente:
L- sumarValores: éste método no tiene parámetro, y obtiene la suma de TODOS LOS VALORES capturados de la matriz, retornando la suma de los mismos.
L- sumarValoresRenglon(int numRenglon): éste método regresa la suma de valores del renglón indicado por la variable 
L- sumarValoresColumna(int numColumna): igual que el anterior pero para columnas, indicando por la variable numColumna el índice de columa que se desea sumar.
- intercambioRenglones(int reng1, int ren2): Realiza un intercambio de datos entre el renglon 1 y renglon 2.
- intercambioColumnas(int col1, int col2): Realiza un intercambio de valores entre las columnas 1 y 2.
- copiarRenglon(int origen, int destino): Realiza un copiado de valores desde renglon origen hacia renglón destino.
- copiarColumna(int colOrigen, int ColDestino): Copia los datos de la columna origen sobre la destino.
- inversa: no lleva parámetro, retorna la matriz inversa, es decirlo los renglones los vuelve columnas y viceversa.
 */
/**
 *
 * @author IsidroAntonio
 */
public class MatrizEntero {
    private int [][] Matriz;
    private int Tam;
    //constructor, crea una matriz de tamaño N, y la inicializa con valores random
    public MatrizEntero(int tam){
       Tam=tam;
       Matriz=new int[Tam][Tam];
        for (int i = 0; i < Tam; i++) {
            for (int j = 0; j < Tam; j++) {
                Matriz[i][j]=(int)(Math.random()*100);
            }
        }
    }
    
    //get y set
    public int[][] getMatriz() {
        return Matriz;
    }
    public void setMatriz(int[][] Matriz) {
        this.Matriz = Matriz;
    }
    public int getTam() {
        return Tam;
    }
    public void setTam(int Tam) {
        this.Tam = Tam;
    }
    
    
    //Operaciones y comportamientos
    public int sumarValores(){
        int sumaDMatriz=0;
         for (int i = 0; i < Tam; i++) {
            for (int j = 0; j < Tam; j++) {
                sumaDMatriz+=Matriz[i][j];
            }
        }
        return sumaDMatriz;
    }
    // éste método no tiene parámetro, y obtiene la suma de TODOS LOS VALORES capturados de la matriz, retornando la suma de los mismos.
    public int sumarValoresRenglon(int numRen){
        int sumaRen=0;
            for (int j = 0; j < Tam; j++) {
                sumaRen+=Matriz[numRen][j];
            }
        return sumaRen;
    }
    // éste método regresa la suma de valores del renglón indicado por la variable 
    public int sumarValoresColumna(int numCol){
        int sumaCol=0;
            for (int j = 0; j < Tam; j++) {
                sumaCol+=Matriz[j][numCol];
            }
        return sumaCol;
    }
//: igual que el anterior pero para columnas, indicando por la variable numColumna el índice de columa que se desea sumar.
 public int[][] intercambioRenglones(int reng1, int ren2){
     return Matriz;
 }
//: Realiza un intercambio de datos entre el renglon 1 y renglon 2.
 public int[][] intercambioColumnas(int col1, int col2){
     return Matriz;
 }
 //: Realiza un intercambio de valores entre las columnas 1 y 2.
 public int[][] copiarRenglon(int origen, int destino){
     return Matriz;
 }
//: Realiza un copiado de valores desde renglon origen hacia renglón destino.
 public int[][] copiarColumna(int colOrigen, int ColDestino){
 return Matriz;
 }
//: Copia los datos de la columna origen sobre la destino.
 public int[][] inversa(){
    return Matriz;
}
 //: no lleva parámetro, retorna la matriz inversa, es decirlo los renglones los vuelve columnas y viceversa.
}
