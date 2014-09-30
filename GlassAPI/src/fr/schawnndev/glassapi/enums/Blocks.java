package fr.schawnndev.glassapi.enums;

public enum Blocks {
	STAINED_GLASS_PANE, STAINED_GLASS;

	public class StainedGlassPane {

		Blocks bl;

		public StainedGlassPane(Blocks block) {
			this.bl = block;
		}

		public Blocks getBlock() {
			return bl;
		}
	}
	
	public static class MainBlocks {
		public static int getBlockInt(Blocks block) {
			switch (block) {
			case STAINED_GLASS:
				return 95;
			case STAINED_GLASS_PANE:
				return 160;
			default:
				return 0;

			}
		}
	}
}
