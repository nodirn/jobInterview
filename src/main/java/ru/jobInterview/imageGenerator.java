package ru.jobInterview;

//Тропин Андрей
//nodvirn@gmail.com
//Генератор изображений.

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class imageGenerator {

        private static Image createImage(int[] colorArray){
            BufferedImage bufferedImage = new BufferedImage(60,60,BufferedImage.TYPE_INT_RGB);
            Graphics gr = bufferedImage.getGraphics();
            int n=0;
            for (int i=0; i<3;i++) {
                for (int j=0; j<3; j++) {
                    int color = colorArray[n++];
                    gr.setColor(new Color(color));
                    gr.fillRect(i*20, j*20, 20, 20);
                }
            }
            return bufferedImage;
        }

        public static void main(String[] args) {
            int[] arr= new int[9]; //Кол-во ячеек массива соответсвует кол-ву квадратов
            int step = 1; //Шаг переборки цветов. Для тестирования прграммы.
            int maxColor = 0xFFFFFF;
            int  sum=0;
            for (int a = 0; a <= maxColor; a+=step)
                for (int k = 0; k <= maxColor; k+=step)
                    for (int c = 0; c <= maxColor; c+=step)
                        for (int d = 0; d <= maxColor; d+=step)
                            for (int q = 0; q <= maxColor; q+=step)
                                for (int f = 0; f <= maxColor; f+=step)
                                    for (int u = 0; u <= maxColor; u+=step)
                                        for (int h = 0; h <= maxColor; h+=step)
                                            for (int j = 0; j <= maxColor; j+=step) {
                                                arr[0]=j;
                                                arr[1]=h;
                                                arr[2]=q;
                                                arr[3]=a;
                                                arr[4]=f;
                                                arr[5]=u;
                                                arr[6]=d;
                                                arr[7]=c;
                                                arr[8]=k;
                                                sum++;
                                                Image image = createImage(arr);
                                                    File fl = new File("pics");
                                                    if (!fl.isDirectory()) {
                                                        fl.mkdir();
                                                    }
                                                try {
                                                    ImageIO.write((RenderedImage) image, "png", new File("pics\\result" + sum + ".png"));
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }

                                            }
        }
}



