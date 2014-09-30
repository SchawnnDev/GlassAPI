package fr.schawnndev.glassapi.enums;

public enum GlassColor {
	WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK;

	public static class MainGlassColors {
		public static byte getColorInt(GlassColor color) {
			switch (color) {
			case BLACK:
				return 15;
			case BLUE:
				return 11;
			case BROWN:
				return 12;
			case CYAN:
				return 9;
			case GRAY:
				return 7;
			case GREEN:
				return 13;
			case LIGHT_BLUE:
				return 3;
			case LIGHT_GRAY:
				return 8;
			case LIME:
				return 5;
			case MAGENTA:
				return 2;
			case ORANGE:
				return 1;
			case PINK:
				return 6;
			case PURPLE:
				return 10;
			case RED:
				return 14;
			case WHITE:
				return 0;
			case YELLOW:
				return 4;
			default:
				return 0;

			}
		}
	}

}
