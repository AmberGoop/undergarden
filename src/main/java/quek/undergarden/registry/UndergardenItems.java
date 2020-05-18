package quek.undergarden.registry;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import quek.undergarden.UndergardenMod;
import quek.undergarden.item.*;
import quek.undergarden.item.armor.*;
import quek.undergarden.item.tool.*;

public class UndergardenItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, UndergardenMod.MODID);

    //normal stuff
    public static final RegistryObject<Item> undergarden_portal_catalyst = ITEMS.register("undergarden_portal_catalyst", UndergardenPortalCatalystItem::new);
    public static final RegistryObject<Item> depthrock_pebble = ITEMS.register("depthrock_pebble", DepthrockPebbleItem::new);
    public static final RegistryObject<Item> smogstem_stick = ITEMS.register("smogstem_stick", UndergardenItem::new);
    public static final RegistryObject<Item> twistytwig = ITEMS.register("twistytwig", UndergardenItem::new);
    public static final RegistryObject<Item> cloggrum_ingot = ITEMS.register("cloggrum_ingot", UndergardenItem::new);
    public static final RegistryObject<Item> cloggrum_nugget = ITEMS.register("cloggrum_nugget", UndergardenItem::new);
    public static final RegistryObject<Item> froststeel_ingot = ITEMS.register("froststeel_ingot", UndergardenItem::new);
    public static final RegistryObject<Item> froststeel_nugget = ITEMS.register("froststeel_nugget", UndergardenItem::new);
    public static final RegistryObject<Item> utheric_shard = ITEMS.register("utheric_shard", UndergardenItem::new);
    public static final RegistryObject<Item> utherium_ingot = ITEMS.register("utherium_ingot", UndergardenItem::new);
    public static final RegistryObject<Item> utherium_chunk = ITEMS.register("utherium_chunk", UndergardenItem::new);
    public static final RegistryObject<Item> smogstem_torch = ITEMS.register("smogstem_torch", () -> new WallOrFloorItem(
            UndergardenBlocks.smogstem_torch.get(), UndergardenBlocks.smogstem_wall_torch.get(), new Item.Properties().group(UndergardenItemGroups.UNDERGARDEN_BLOCKS)));
    public static final RegistryObject<Item> gloomgourd_seeds = ITEMS.register("gloomgourd_seeds", () -> new BlockNamedItem(
            UndergardenBlocks.gloomgourd_stem.get(), (new Item.Properties()).group(UndergardenItemGroups.UNDERGARDEN_ITEMS)));
    public static final RegistryObject<Item> ditchbulb = ITEMS.register("ditchbulb", UndergardenItem::new);
    public static final RegistryObject<Item> brute_tusk = ITEMS.register("brute_tusk", UndergardenItem::new);
    public static final RegistryObject<Item> glowing_kelp = ITEMS.register("glowing_kelp", () -> new BlockItem(UndergardenBlocks.glowing_kelp.get(), (new Item.Properties()).group(UndergardenItemGroups.UNDERGARDEN_BLOCKS)));

    //boss loot
    public static final RegistryObject<Item> masticator_scales = ITEMS.register("masticator_scales", () -> new UndergardenItem(Rarity.UNCOMMON));
    public static final RegistryObject<ShieldItem> masticated_shield = ITEMS.register("masticated_shield", () -> new UndergardenShieldItem(UndergardenShieldTiers.MASTICATED, Rarity.EPIC));
    public static final RegistryObject<Item> masticated_chestplate = ITEMS.register("masticated_chestplate", () -> new MasticatedChestplateItem(UndergardenArmorMaterials.MASTICATED));
    public static final RegistryObject<Item> cloggrum_battleaxe = ITEMS.register("cloggrum_battleaxe", CloggrumBattleaxeItem::new);

    //tools
    public static final RegistryObject<SwordItem> smogstem_sword = ITEMS.register("smogstem_sword", () -> new UndergardenSword(UndergardenItemTiers.SMOGSTEM));
    public static final RegistryObject<PickaxeItem> smogstem_pickaxe = ITEMS.register("smogstem_pickaxe", () -> new UndergardenPickaxe(UndergardenItemTiers.SMOGSTEM));
    public static final RegistryObject<AxeItem> smogstem_axe = ITEMS.register("smogstem_axe", () -> new UndergardenAxe(UndergardenItemTiers.SMOGSTEM));
    public static final RegistryObject<ShovelItem> smogstem_shovel = ITEMS.register("smogstem_shovel", () -> new UndergardenShovel(UndergardenItemTiers.SMOGSTEM));

    public static final RegistryObject<SwordItem> cloggrum_sword = ITEMS.register("cloggrum_sword", () -> new UndergardenSword(UndergardenItemTiers.CLOGGRUM));
    public static final RegistryObject<PickaxeItem> cloggrum_pickaxe = ITEMS.register("cloggrum_pickaxe", () -> new UndergardenPickaxe(UndergardenItemTiers.CLOGGRUM));
    public static final RegistryObject<AxeItem> cloggrum_axe = ITEMS.register("cloggrum_axe", () -> new UndergardenAxe(UndergardenItemTiers.CLOGGRUM));
    public static final RegistryObject<ShovelItem> cloggrum_shovel = ITEMS.register("cloggrum_shovel", () -> new UndergardenShovel(UndergardenItemTiers.CLOGGRUM));
    public static final RegistryObject<ShieldItem> cloggrum_shield = ITEMS.register("cloggrum_shield", () -> new UndergardenShieldItem(UndergardenShieldTiers.CLOGGRUM));

    public static final RegistryObject<SwordItem> froststeel_sword = ITEMS.register("froststeel_sword", () -> new UndergardenSword(UndergardenItemTiers.FROSTSTEEL));
    public static final RegistryObject<PickaxeItem> froststeel_pickaxe = ITEMS.register("froststeel_pickaxe", () -> new UndergardenPickaxe(UndergardenItemTiers.FROSTSTEEL));
    public static final RegistryObject<AxeItem> froststeel_axe = ITEMS.register("froststeel_axe", () -> new UndergardenAxe(UndergardenItemTiers.FROSTSTEEL));
    public static final RegistryObject<ShovelItem> froststeel_shovel = ITEMS.register("froststeel_shovel", () -> new UndergardenShovel(UndergardenItemTiers.FROSTSTEEL));

    public static final RegistryObject<SwordItem> utheric_sword = ITEMS.register("utheric_sword", () -> new UndergardenSword(UndergardenItemTiers.UTHERIC));
    public static final RegistryObject<PickaxeItem> utheric_pickaxe = ITEMS.register("utheric_pickaxe", () -> new UndergardenPickaxe(UndergardenItemTiers.UTHERIC));
    public static final RegistryObject<AxeItem> utheric_axe = ITEMS.register("utheric_axe", () -> new UndergardenAxe(UndergardenItemTiers.UTHERIC));
    public static final RegistryObject<ShovelItem> utheric_shovel = ITEMS.register("utheric_shovel", () -> new UndergardenShovel(UndergardenItemTiers.UTHERIC));

    public static final RegistryObject<Item> slingshot = ITEMS.register("slingshot", SlingshotItem::new);
    public static final RegistryObject<ShearsItem> cloggrum_shears = ITEMS.register("cloggrum_shears", CloggrumShearsItem::new);

    //armors
    public static final RegistryObject<Item> cloggrum_helmet = ITEMS.register("cloggrum_helmet", () -> new UndergardenArmorItem(UndergardenArmorMaterials.CLOGGRUM, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> cloggrum_chestplate = ITEMS.register("cloggrum_chestplate", () -> new UndergardenArmorItem(UndergardenArmorMaterials.CLOGGRUM, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> cloggrum_leggings = ITEMS.register("cloggrum_leggings", () -> new UndergardenArmorItem(UndergardenArmorMaterials.CLOGGRUM, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> cloggrum_boots = ITEMS.register("cloggrum_boots", () -> new UndergardenArmorItem(UndergardenArmorMaterials.CLOGGRUM, EquipmentSlotType.FEET));

    public static final RegistryObject<Item> froststeel_helmet = ITEMS.register("froststeel_helmet", () -> new UndergardenArmorItem(UndergardenArmorMaterials.FROSTSTEEL, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> froststeel_chestplate = ITEMS.register("froststeel_chestplate", () -> new UndergardenArmorItem(UndergardenArmorMaterials.FROSTSTEEL, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> froststeel_leggings = ITEMS.register("froststeel_leggings", () -> new UndergardenArmorItem(UndergardenArmorMaterials.FROSTSTEEL, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> froststeel_boots = ITEMS.register("froststeel_boots", () -> new UndergardenArmorItem(UndergardenArmorMaterials.FROSTSTEEL, EquipmentSlotType.FEET));

    public static final RegistryObject<Item> utheric_helmet = ITEMS.register("utheric_helmet", () -> new UndergardenArmorItem(UndergardenArmorMaterials.UTHERIC, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> utheric_chestplate = ITEMS.register("utheric_chestplate", () -> new UndergardenArmorItem(UndergardenArmorMaterials.UTHERIC, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> utheric_leggings = ITEMS.register("utheric_leggings", () -> new UndergardenArmorItem(UndergardenArmorMaterials.UTHERIC, EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> utheric_boots = ITEMS.register("utheric_boots", () -> new UndergardenArmorItem(UndergardenArmorMaterials.UTHERIC, EquipmentSlotType.FEET));

    //foods
    public static final RegistryObject<Item> underbeans = ITEMS.register("underbeans", () -> new BlockNamedItem(
            UndergardenBlocks.underbean_bush.get(), (new Item.Properties()).group(UndergardenItemGroups.UNDERGARDEN_ITEMS).food(UndergardenFoods.UNDERBEANS)));
    public static final RegistryObject<Item> gloomgourd_pie = ITEMS.register("gloomgourd_pie", () -> new UndergardenItem(UndergardenFoods.GLOOMGOURD_PIE));
    public static final RegistryObject<Item> raw_dweller_meat = ITEMS.register("raw_dweller_meat", () -> new UndergardenItem(UndergardenFoods.RAW_DWELLER));
    public static final RegistryObject<Item> dweller_steak = ITEMS.register("dweller_steak", () -> new UndergardenItem(UndergardenFoods.COOKED_DWELLER));

    //spawn eggs
    public static final RegistryObject<Item> dweller_spawn_egg = ITEMS.register("dweller_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.dweller, 4804417, 16776960));
    public static final RegistryObject<Item> gwibling_spawn_egg = ITEMS.register("gwibling_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.gwibling, 10064737, 15845330));
    public static final RegistryObject<Item> rotdweller_spawn_egg = ITEMS.register("rotdweller_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.rotdweller, 72451, 10963256));
    public static final RegistryObject<Item> rotwalker_spawn_egg = ITEMS.register("rotwalker_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.rotwalker, 5988164, 10963256));
    public static final RegistryObject<Item> rotbeast_spawn_egg = ITEMS.register("rotbeast_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.rotbeast, 3751199,7153174));
    public static final RegistryObject<Item> brute_spawn_egg = ITEMS.register("brute_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.brute, 7035982, 4012083));

    public static final RegistryObject<Item> masticator_spawn_egg = ITEMS.register("masticator_spawn_egg", () -> new UndergardenSpawnEgg(UndergardenEntities.masticator, 2366466, 15881511));
}