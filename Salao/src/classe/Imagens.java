package classe;

import javax.swing.ImageIcon;

public class Imagens {
    public ImageIcon img(String url){
        ImageIcon imagem = new ImageIcon(getClass().getResource(url));
        return imagem;
    }
}
