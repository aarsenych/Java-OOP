package com.gmail.arsenycholexandra.HomeTask9.Task4ASCII;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class ASCII {

	public ASCII() {
		super();
	}

	public void drawASCII(String text) {
		int width = 150;
		int height = 30;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("SansSerif", Font.BOLD, 24));

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.drawString(text, 10, 20);

		for (int y = 0; y < height; y++) {
			StringBuilder builder = new StringBuilder();

			for (int x = 0; x < width; x++) {
				builder.append(image.getRGB(x, y) == -16777216 ? " " : "#");

			}
			System.out.println(builder);
		}

	}

}
