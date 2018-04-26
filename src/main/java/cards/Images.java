package cards;

import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Images {
	
	public static Image aplyColor(Image img, int color){
		try {
			Image image = img.getCopy();
			image.applyColor2(color);
			return image;
		} catch (ImageException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
