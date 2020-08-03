import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResize {

   /* private static final int IMG_WIDTH = 413;
    private static final int IMG_HEIGHT = 531;*/

    private static final int IMG_WIDTH = 350;
    private static final int IMG_HEIGHT = 350;

    public static void main(String [] args){

        try{

            BufferedImage originalImage = ImageIO.read(new File("D:\\Ashwani\\Documents\\moluDocs\\photo.jpg"));
            int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

            BufferedImage tThumbImage = new BufferedImage( IMG_WIDTH, IMG_HEIGHT, BufferedImage.TYPE_INT_RGB );
            Graphics2D tGraphics2D = tThumbImage.createGraphics(); //create a graphics object to paint to
            tGraphics2D.setBackground( Color.WHITE );
            tGraphics2D.setPaint( Color.WHITE );
            tGraphics2D.fillRect( 0, 0, IMG_WIDTH, IMG_HEIGHT );
            tGraphics2D.setRenderingHint( RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
            tGraphics2D.drawImage( originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null ); //draw the image scaled

            ImageIO.write( tThumbImage, "jpg", new File("D:\\Ashwani\\Documents\\moluDocs\\photo_java2.jpg" ));

            BufferedImage resizeImageJpg = resizeImage(originalImage, type);
            ImageIO.write(resizeImageJpg, "jpg", new File("D:\\Ashwani\\Documents\\moluDocs\\photo_java.jpg"));

            /*BufferedImage resizeImagePng = resizeImage(originalImage, type);
            ImageIO.write(resizeImagePng, "png", new File("c:\\image\\mkyong_png.jpg"));

            BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
            ImageIO.write(resizeImageHintJpg, "jpg", new File("c:\\image\\mkyong_hint_jpg.jpg"));

            BufferedImage resizeImageHintPng = resizeImageWithHint(originalImage, type);
            ImageIO.write(resizeImageHintPng, "png", new File("c:\\image\\mkyong_hint_png.jpg"));*/


            /*File input = new File("D:\\Ashwani\\Documents\\moluDocs\\photo.jpg");
            BufferedImage image = ImageIO.read(input);

            BufferedImage resized = resize(image, 500, 500);

            File output = new File("D:\\Ashwani\\Documents\\moluDocs\\photo_java.jpg");
            ImageIO.write(resized, "jpg", output);*/
            System.out.println("Image resize done in java");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }

    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){

        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();
        g.setComposite(AlphaComposite.Src);

        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        return resizedImage;
    }
}
