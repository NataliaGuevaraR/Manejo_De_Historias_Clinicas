
package Logic;

public class TreeNode {
    Enfermedad enfermedad;
    TreeNode izquierda;
    TreeNode derecha;

    public TreeNode(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
        this.izquierda = null;
        this.derecha = null;
    }
}