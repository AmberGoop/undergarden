package quek.undergarden.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import quek.undergarden.data.provider.UGItemModelProvider;
import quek.undergarden.registry.UGBlocks;
import quek.undergarden.registry.UGItems;

public class UGItemModels extends UGItemModelProvider {

	public UGItemModels(PackOutput output, ExistingFileHelper fileHelper) {
		super(output, fileHelper);
	}

	@Override
	protected void registerModels() {
		block(UGBlocks.DEPTHROCK);
		block(UGBlocks.DEPTHROCK_COAL_ORE);
		block(UGBlocks.DEPTHROCK_CLOGGRUM_ORE);
		block(UGBlocks.SHIVERSTONE_FROSTSTEEL_ORE);
		block(UGBlocks.DEPTHROCK_UTHERIUM_ORE);
		block(UGBlocks.DEEPTURF_BLOCK);
		block(UGBlocks.DEEPSOIL_FARMLAND);
		block(UGBlocks.DEEPSOIL);
		blockFlat(UGBlocks.SMOGSTEM_SAPLING);
		block(UGBlocks.SMOGSTEM_LOG);
		block(UGBlocks.SMOGSTEM_LEAVES);
		blockFlat(UGBlocks.WIGGLEWOOD_SAPLING);
		block(UGBlocks.WIGGLEWOOD_LOG);
		block(UGBlocks.WIGGLEWOOD_LEAVES);
		block(UGBlocks.SMOGSTEM_PLANKS);
		block(UGBlocks.WIGGLEWOOD_PLANKS);
		block(UGBlocks.DEPTHROCK_BRICKS);
		block(UGBlocks.CRACKED_DEPTHROCK_BRICKS);
		blockFlat(UGBlocks.DEEPTURF);
		blockFlat(UGBlocks.DITCHBULB_PLANT);
		blockFlat(UGBlocks.INDIGO_MUSHROOM);
		blockFlat(UGBlocks.VEIL_MUSHROOM);
		blockFlat(UGBlocks.INK_MUSHROOM);
		blockFlat(UGBlocks.BLOOD_MUSHROOM);
		block(UGBlocks.GLOOMGOURD);
		block(UGBlocks.CARVED_GLOOMGOURD);
		block(UGBlocks.DEPTHROCK_PEBBLES);
		block(UGBlocks.GLOOM_O_LANTERN);
		block(UGBlocks.SHARD_O_LANTERN);
		block(UGBlocks.CLOGGRUM_BLOCK);
		block(UGBlocks.FROSTSTEEL_BLOCK);
		block(UGBlocks.UTHERIUM_BLOCK);
		block(UGBlocks.DEPTHROCK_STAIRS);
		block(UGBlocks.DEPTHROCK_BRICK_STAIRS);
		block(UGBlocks.SMOGSTEM_STAIRS);
		block(UGBlocks.WIGGLEWOOD_STAIRS);
		block(UGBlocks.DEPTHROCK_SLAB);
		block(UGBlocks.DEPTHROCK_BRICK_SLAB);
		block(UGBlocks.SMOGSTEM_SLAB);
		block(UGBlocks.WIGGLEWOOD_SLAB);
		itemFence(UGBlocks.SMOGSTEM_FENCE, "smogstem_planks");
		itemFence(UGBlocks.WIGGLEWOOD_FENCE, "wigglewood_planks");
		blockFlat(UGBlocks.CLOGGRUM_BARS);
		block(UGBlocks.SHIVERSTONE);
		block(UGBlocks.GOO);
		block(UGBlocks.SMOG_VENT);
		blockFlat(UGBlocks.ASHEN_DEEPTURF);
		block(UGBlocks.ASHEN_DEEPTURF_BLOCK);
		block(UGBlocks.DEPTHROCK_REGALIUM_ORE);
		block(UGBlocks.SHIVERSTONE_BRICKS);
		block(UGBlocks.SHIVERSTONE_STAIRS);
		block(UGBlocks.SHIVERSTONE_BRICK_STAIRS);
		block(UGBlocks.SHIVERSTONE_SLAB);
		block(UGBlocks.SHIVERSTONE_BRICK_SLAB);
		block(UGBlocks.REGALIUM_BLOCK);
		block(UGBlocks.TREMBLECRUST);
		block(UGBlocks.TREMBLECRUST_BRICKS);
		block(UGBlocks.CRACKED_TREMBLECRUST_BRICKS);
		block(UGBlocks.TREMBLECRUST_UTHERIUM_ORE);
		block(UGBlocks.SMOGSTEM_WOOD);
		block(UGBlocks.WIGGLEWOOD_WOOD);
		block(UGBlocks.LOOSE_TREMBLECRUST);
		block(UGBlocks.DEPTHROCK_IRON_ORE);
		block(UGBlocks.DEPTHROCK_GOLD_ORE);
		block(UGBlocks.DEPTHROCK_DIAMOND_ORE);
		block(UGBlocks.SMOGSTEM_FENCE_GATE);
		block(UGBlocks.WIGGLEWOOD_FENCE_GATE);
		wall(UGBlocks.DEPTHROCK_WALL, UGBlocks.DEPTHROCK);
		wall(UGBlocks.POLISHED_DEPTHROCK_WALL, UGBlocks.POLISHED_DEPTHROCK);
		wall(UGBlocks.DEPTHROCK_BRICK_WALL, UGBlocks.DEPTHROCK_BRICKS);
		wall(UGBlocks.SHIVERSTONE_WALL, UGBlocks.SHIVERSTONE);
		wall(UGBlocks.SHIVERSTONE_BRICK_WALL, UGBlocks.SHIVERSTONE_BRICKS);
		wall(UGBlocks.TREMBLECRUST_WALL, UGBlocks.TREMBLECRUST);
		wall(UGBlocks.TREMBLECRUST_BRICK_WALL, UGBlocks.TREMBLECRUST_BRICKS);
		block(UGBlocks.COARSE_DEEPSOIL);
		block(UGBlocks.SMOGSTEM_PRESSURE_PLATE);
		block(UGBlocks.WIGGLEWOOD_PRESSURE_PLATE);
		block(UGBlocks.DEPTHROCK_PRESSURE_PLATE);
		block(UGBlocks.SHIVERSTONE_PRESSURE_PLATE);
		blockFlat(UGBlocks.GRONGLE_SAPLING);
		block(UGBlocks.GRONGLE_LOG);
		block(UGBlocks.GRONGLE_LEAVES);
		block(UGBlocks.GRONGLE_WOOD);
		block(UGBlocks.GRONGLE_SLAB);
		itemFence(UGBlocks.GRONGLE_FENCE, "grongle_planks");
		block(UGBlocks.GRONGLE_PLANKS);
		block(UGBlocks.GRONGLE_FENCE_GATE);
		block(UGBlocks.GRONGLE_STAIRS);
		block(UGBlocks.GRONGLE_PRESSURE_PLATE);
		block(UGBlocks.STRIPPED_SMOGSTEM_LOG);
		block(UGBlocks.STRIPPED_WIGGLEWOOD_LOG);
		block(UGBlocks.STRIPPED_GRONGLE_LOG);
		block(UGBlocks.STRIPPED_SMOGSTEM_WOOD);
		block(UGBlocks.STRIPPED_WIGGLEWOOD_WOOD);
		block(UGBlocks.STRIPPED_GRONGLE_WOOD);
		block(UGBlocks.CRACKED_SHIVERSTONE_BRICKS);
		block(UGBlocks.FORGOTTEN_BLOCK);
		block(UGBlocks.CHISELED_DEPTHROCK_BRICKS);
		block(UGBlocks.CHISELED_SHIVERSTONE_BRICKS);
		block(UGBlocks.FROZEN_DEEPTURF_BLOCK);
		blockFlat(UGBlocks.FROZEN_DEEPTURF);
		block(UGBlocks.CHISELED_TREMBLECRUST_BRICKS);
		block(UGBlocks.TREMBLECRUST_STAIRS);
		block(UGBlocks.TREMBLECRUST_BRICK_STAIRS);
		block(UGBlocks.TREMBLECRUST_SLAB);
		block(UGBlocks.TREMBLECRUST_BRICK_SLAB);
		block(UGBlocks.TREMBLECRUST_PRESSURE_PLATE);
		block(UGBlocks.GOO_BLOCK);
		block(UGBlocks.SEDIMENT);
		block(UGBlocks.SEDIMENT_GLASS);
		blockFlatWithBlockTexture(UGBlocks.SEDIMENT_GLASS_PANE, "sediment_glass");
		block(UGBlocks.CLOGGRUM_TILES);
		block(UGBlocks.CLOGGRUM_TILE_STAIRS);
		block(UGBlocks.CLOGGRUM_TILE_SLAB);
		block(UGBlocks.DEPTHROCK_TILES);
		block(UGBlocks.DEPTHROCK_TILE_STAIRS);
		block(UGBlocks.DEPTHROCK_TILE_SLAB);
		block(UGBlocks.MOGMOSS_RUG);
		block(UGBlocks.BLUE_MOGMOSS_RUG);
		normalItem(UGItems.MAMMOTH_DISC);
		normalItem(UGItems.LIMAX_MAXIMUS_DISC);
		normalItem(UGItems.GLOOMPER_ANTHEM_DISC);
		normalItem(UGItems.RELICT_DISC);
		normalItem(UGItems.GLOOMPER_SECRET_DISC);
		normalItem(UGItems.CATALYST);
		normalItem(UGItems.DEPTHROCK_PEBBLE);
		normalItem(UGItems.TWISTYTWIG);
		normalItem(UGItems.CLOGGRUM_INGOT);
		normalItem(UGItems.CLOGGRUM_NUGGET);
		normalItem(UGItems.FROSTSTEEL_INGOT);
		normalItem(UGItems.FROSTSTEEL_NUGGET);
		normalItem(UGItems.UTHERIC_SHARD);
		normalItem(UGItems.UTHERIUM_CRYSTAL);
		normalItem(UGItems.REGALIUM_CRYSTAL);
		normalItem(UGItems.FORGOTTEN_INGOT);
		normalItem(UGItems.FORGOTTEN_NUGGET);
		torchItem(UGBlocks.SHARD_TORCH);
		normalItem(UGItems.DITCHBULB);
		normalItem(UGItems.GLOOMGOURD_SEEDS);
		normalItem(UGItems.BRUTE_TUSK);
		normalItem(UGItems.MOGMOSS);
		normalItem(UGItems.GLITTERKELP);
		normalItem(UGItems.GOO_BALL);
		normalItem(UGItems.ROTTEN_BLISTERBERRY);
		normalItem(UGItems.BLISTERBOMB);
		normalItem(UGItems.DROOPFRUIT);
		toolItem(UGItems.CLOGGRUM_SWORD);
		toolItem(UGItems.CLOGGRUM_PICKAXE);
		toolItem(UGItems.CLOGGRUM_AXE);
		toolItem(UGItems.CLOGGRUM_SHOVEL);
		toolItem(UGItems.CLOGGRUM_HOE);
		normalItem(UGItems.CLOGGRUM_HELMET);
		normalItem(UGItems.CLOGGRUM_CHESTPLATE);
		normalItem(UGItems.CLOGGRUM_LEGGINGS);
		normalItem(UGItems.CLOGGRUM_BOOTS);
		normalItem(UGItems.FROSTSTEEL_HELMET);
		normalItem(UGItems.FROSTSTEEL_CHESTPLATE);
		normalItem(UGItems.FROSTSTEEL_LEGGINGS);
		normalItem(UGItems.FROSTSTEEL_BOOTS);
		normalItem(UGItems.UTHERIUM_HELMET);
		normalItem(UGItems.UTHERIUM_CHESTPLATE);
		normalItem(UGItems.UTHERIUM_LEGGINGS);
		normalItem(UGItems.UTHERIUM_BOOTS);
		toolItem(UGItems.FROSTSTEEL_SWORD);
		toolItem(UGItems.FROSTSTEEL_PICKAXE);
		toolItem(UGItems.FROSTSTEEL_AXE);
		toolItem(UGItems.FROSTSTEEL_SHOVEL);
		toolItem(UGItems.FROSTSTEEL_HOE);
		toolItem(UGItems.UTHERIUM_SWORD);
		toolItem(UGItems.UTHERIUM_PICKAXE);
		toolItem(UGItems.UTHERIUM_AXE);
		toolItem(UGItems.UTHERIUM_SHOVEL);
		toolItem(UGItems.UTHERIUM_HOE);
		normalItem(UGItems.FORGOTTEN_UPGRADE_TEMPLATE);
		toolItem(UGItems.FORGOTTEN_SWORD);
		toolItem(UGItems.FORGOTTEN_PICKAXE);
		toolItem(UGItems.FORGOTTEN_AXE);
		toolItem(UGItems.FORGOTTEN_SHOVEL);
		toolItem(UGItems.FORGOTTEN_HOE);
		normalItem(UGItems.SMOGSTEM_BOAT);
		normalItem(UGItems.SMOGSTEM_CHEST_BOAT);
		normalItem(UGItems.WIGGLEWOOD_BOAT);
		normalItem(UGItems.WIGGLEWOOD_CHEST_BOAT);
		normalItem(UGItems.GRONGLE_BOAT);
		normalItem(UGItems.GRONGLE_CHEST_BOAT);
		normalItem(UGItems.VIRULENT_MIX_BUCKET);
		normalItem(UGItems.GWIBLING_BUCKET);
		normalItem(UGItems.UNDERBEANS);
		normalItem(UGItems.ROASTED_UNDERBEANS);
		normalItem(UGItems.BLISTERBERRY);
		normalItem(UGItems.GLOOMGOURD_PIE);
		normalItem(UGItems.RAW_DWELLER_MEAT);
		normalItem(UGItems.DWELLER_STEAK);
		normalItem(UGItems.RAW_GWIBLING);
		normalItem(UGItems.COOKED_GWIBLING);
		normalItem(UGItems.RAW_GLOOMPER_LEG);
		normalItem(UGItems.GLOOMPER_LEG);
		normalItem(UGItems.BLOODY_STEW);
		normalItem(UGItems.INDIGO_STEW);
		normalItem(UGItems.INKY_STEW);
		normalItem(UGItems.VEILED_STEW);
		rodItem(UGItems.UNDERBEAN_STICK);
		normalItem(UGItems.RAW_CLOGGRUM);
		normalItem(UGItems.RAW_FROSTSTEEL);
		block(UGBlocks.SHIVERSTONE_COAL_ORE);
		block(UGBlocks.SHIVERSTONE_IRON_ORE);
		block(UGBlocks.SHIVERSTONE_DIAMOND_ORE);
		block(UGBlocks.SHIVERSTONE_CLOGGRUM_ORE);
		block(UGBlocks.SHIVERSTONE_UTHERIUM_ORE);
		block(UGBlocks.SHIVERSTONE_REGALIUM_ORE);
		block(UGBlocks.RAW_CLOGGRUM_BLOCK);
		block(UGBlocks.RAW_FROSTSTEEL_BLOCK);
		blockFlatWithItemTexture(UGBlocks.CLOGGRUM_LANTERN, "cloggrum_lantern_item");
		blockFlat(UGBlocks.HANGING_GRONGLE_LEAVES);
		block(UGBlocks.BOOMGOURD);
		block(UGBlocks.POLISHED_DEPTHROCK);
		block(UGBlocks.POLISHED_DEPTHROCK_SLAB);
		block(UGBlocks.POLISHED_DEPTHROCK_STAIRS);
		normalItem(UGItems.DITCHBULB_PASTE);
		blockFlat(UGBlocks.AMOROUS_BRISTLE);
		blockFlat(UGBlocks.MISERABELL);
		blockFlat(UGBlocks.BUTTERBUNCH);
		block(UGBlocks.INDIGO_MUSHROOM_CAP);
		block(UGBlocks.INDIGO_MUSHROOM_STEM);
		block(UGBlocks.VEIL_MUSHROOM_CAP);
		block(UGBlocks.VEIL_MUSHROOM_STEM);
		blockFlat(UGBlocks.MUSHROOM_VEIL);
		block(UGBlocks.INK_MUSHROOM_CAP);
		blockFlat(UGBlocks.SEEPING_INK);
		block(UGBlocks.INK_MUSHROOM_STEM);
		block(UGBlocks.BLOOD_MUSHROOM_CAP);
		block(UGBlocks.BLOOD_MUSHROOM_STEM);
		normalItem(UGItems.BLOOD_GLOBULE);
		block(UGBlocks.ENGORGED_BLOOD_MUSHROOM_CAP);
		normalItem(UGItems.BLUE_MOGMOSS);
		normalItem(UGItems.SLOP_BOWL);
		normalItem(UGItems.ANCIENT_HELMET);
		normalItem(UGItems.ANCIENT_CHESTPLATE);
		normalItem(UGItems.ANCIENT_LEGGINGS);

		egg(UGItems.DWELLER_SPAWN_EGG);
		egg(UGItems.GWIBLING_SPAWN_EGG);
		egg(UGItems.ROTLING_SPAWN_EGG);
		egg(UGItems.ROTWALKER_SPAWN_EGG);
		egg(UGItems.ROTBEAST_SPAWN_EGG);
		egg(UGItems.BRUTE_SPAWN_EGG);
		egg(UGItems.SCINTLING_SPAWN_EGG);
		egg(UGItems.GLOOMPER_SPAWN_EGG);
		egg(UGItems.STONEBORN_SPAWN_EGG);
		egg(UGItems.NARGOYLE_SPAWN_EGG);
		egg(UGItems.MUNCHER_SPAWN_EGG);
		egg(UGItems.SPLOOGIE_SPAWN_EGG);
		egg(UGItems.GWIB_SPAWN_EGG);
		egg(UGItems.MOG_SPAWN_EGG);
		egg(UGItems.SMOG_MOG_SPAWN_EGG);
		egg(UGItems.FORGOTTEN_SPAWN_EGG);
		egg(UGItems.FORGOTTEN_GUARDIAN_SPAWN_EGG);

		sign(UGBlocks.SMOGSTEM_SIGN);
		sign(UGBlocks.WIGGLEWOOD_SIGN);
		sign(UGBlocks.GRONGLE_SIGN);

		sign(UGBlocks.SMOGSTEM_HANGING_SIGN);
		sign(UGBlocks.WIGGLEWOOD_HANGING_SIGN);
		sign(UGBlocks.GRONGLE_HANGING_SIGN);

		button(UGBlocks.DEPTHROCK_BUTTON, UGBlocks.DEPTHROCK);
		button(UGBlocks.SHIVERSTONE_BUTTON, UGBlocks.SHIVERSTONE);
		button(UGBlocks.TREMBLECRUST_BUTTON, UGBlocks.TREMBLECRUST);
		button(UGBlocks.SMOGSTEM_BUTTON, UGBlocks.SMOGSTEM_PLANKS);
		button(UGBlocks.WIGGLEWOOD_BUTTON, UGBlocks.WIGGLEWOOD_PLANKS);
		button(UGBlocks.GRONGLE_BUTTON, UGBlocks.GRONGLE_PLANKS);

		blockFlatWithItemTexture(UGBlocks.SMOGSTEM_DOOR, "smogstem_door");
		blockFlatWithItemTexture(UGBlocks.WIGGLEWOOD_DOOR, "wigglewood_door");
		blockFlatWithItemTexture(UGBlocks.GRONGLE_DOOR, "grongle_door");

		trapdoor(UGBlocks.SMOGSTEM_TRAPDOOR);
		trapdoor(UGBlocks.WIGGLEWOOD_TRAPDOOR);
		trapdoor(UGBlocks.GRONGLE_TRAPDOOR);

		blockFlatWithBlockTexture(UGBlocks.TALL_DEEPTURF, "tall_deepturf_top");
		withExistingParent(BuiltInRegistries.BLOCK.getKey(UGBlocks.TALL_SHIMMERWEED.get()).getPath(), mcLoc("item/generated"))
				.texture("layer0", modLoc("block/tall_shimmerweed_top"))
				.texture("layer1", modLoc("block/tall_shimmerweed_bulb"))
				.renderType("translucent");
	}
}