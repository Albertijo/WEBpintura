/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpintura;

/**
 *
 * @author Alberto
 */
public class WEBpintura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Concurso {
 // Lista de usuarios registrados en la web
 List<Usuario> usuarios;
 public Concurso() {
 usuarios = new ArrayList<>();
 }
 public void puntuar(Usuario usuario, Cuadro cuadro, int puntos) {
 if (!usuarios.contains(usuario)) {
 throw new NoRegistradoException("Debes estar registrado para poder puntuar");
 }
 if ((puntuacion < 0) || (puntuacion > 5)) {
 throw new PuntuacionIncorrectaException("")
 }
 cuadro.sumarPuntuacion(puntuacion);
 }
}

}
