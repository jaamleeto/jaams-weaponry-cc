package net.jaams.weaponry_cc.registry;

import net.jaams.weaponry_cc.JaamsWeaponryCCMod;
import net.jaams.weaponry.item.tiered.TieredWeapons;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.resources.ResourceLocation;

public class SilverItems {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
            JaamsWeaponryCCMod.MODID);

    // -- Ingots --
    public static final RegistryObject<Item> HEAVY_SILVER_INGOT = REGISTRY.register("heavy_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUBLE_SILVER_INGOT = REGISTRY.register("double_silver_ingot",
            () -> new Item(new Item.Properties()));

    // Repair ingredient: silver ingot from Caverns & Chasms
    private static final Ingredient SILVER_INGOT = Ingredient.of(
            ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms:silver_ingot")));

    // Durability base: 107 (small), 157 (medium)
    // Attack damage: gold - 1 (subtract 1 from each gold weapon's attackDamageBonus)
    // Mining level: 0 (same as gold)
    // Enchantability: 22 (same as gold)
    // Speed: 12 (same as gold)

    // -- Simple weapons (repair with silver_ingot) --
    // Durability: 107

    public static final RegistryObject<Item> SILVER_DAGGER = REGISTRY.register("silver_dagger",
            () -> TieredWeapons.sword(107, 12, -4, 0, 22, SILVER_INGOT, 3, -1.8f));
    public static final RegistryObject<Item> SILVER_DAGGER_REVERSE = REGISTRY.register("silver_dagger_reverse",
            () -> TieredWeapons.sword(107, 12, -4.5f, 0, 22, SILVER_INGOT, 3, -1.4f));
    public static final RegistryObject<Item> SILVER_KNUCKLE = REGISTRY.register("silver_knuckle",
            () -> TieredWeapons.sword(107, 12, -3.5f, 0, 22, SILVER_INGOT, 3, -1.6f));
    public static final RegistryObject<Item> SILVER_CLEAVER = REGISTRY.register("silver_cleaver",
            () -> TieredWeapons.sword(107, 12, -1, 0, 22, SILVER_INGOT, 3, -3.2f));
    public static final RegistryObject<Item> SILVER_RING = REGISTRY.register("silver_ring",
            () -> TieredWeapons.sword(107, 12, -3, 0, 22, SILVER_INGOT, 3, -1.8f));
    public static final RegistryObject<Item> SILVER_KAMA = REGISTRY.register("silver_kama",
            () -> TieredWeapons.sword(107, 12, -2.5f, 0, 22, SILVER_INGOT, 3, -2.2f));
    public static final RegistryObject<Item> SILVER_CLAW = REGISTRY.register("silver_claw",
            () -> TieredWeapons.sword(107, 12, -3, 0, 22, SILVER_INGOT, 3, -2.0f));
    public static final RegistryObject<Item> SILVER_SPEAR = REGISTRY.register("silver_spear",
            () -> TieredWeapons.sword(107, 12, -2, 0, 22, SILVER_INGOT, 3, -2.6f));

    // -- Medium weapons (repair with silver_ingot) --
    // Durability: 157

    public static final RegistryObject<Item> SILVER_MACHETE = REGISTRY.register("silver_machete",
            () -> TieredWeapons.sword(157, 12, -1.5f, 0, 22, SILVER_INGOT, 3, -2.5f));
    public static final RegistryObject<Item> SILVER_KATAR = REGISTRY.register("silver_katar",
            () -> TieredWeapons.sword(157, 12, -1, 0, 22, SILVER_INGOT, 3, -2.6f));
    public static final RegistryObject<Item> SILVER_SICKLE = REGISTRY.register("silver_sickle",
            () -> TieredWeapons.sword(157, 12, -2, 0, 22, SILVER_INGOT, 3, -2.2f));

    // -- Medium weapons (repair with double_silver_ingot) --
    // Durability: 157

    public static final RegistryObject<Item> SILVER_KATANA = REGISTRY.register("silver_katana",
            () -> TieredWeapons.sword(157, 12, -0.5f, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.2f));
    public static final RegistryObject<Item> SILVER_BUTTERFLY_SWORD = REGISTRY.register("silver_butterfly_sword",
            () -> TieredWeapons.sword(157, 12, 0, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.6f));
    public static final RegistryObject<Item> SILVER_HOOK_SWORD = REGISTRY.register("silver_hook_sword",
            () -> TieredWeapons.sword(157, 12, 0.5f, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.6f));
    public static final RegistryObject<Item> SILVER_SCYTHE = REGISTRY.register("silver_scythe",
            () -> TieredWeapons.sword(157, 12, 2, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -3.1f));
    public static final RegistryObject<Item> SILVER_TWINBLADE = REGISTRY.register("silver_twinblade",
            () -> TieredWeapons.sword(157, 12, -3, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.2f));
    public static final RegistryObject<Item> SILVER_SAW_CLEAVER = REGISTRY.register("silver_saw_cleaver",
            () -> TieredWeapons.sword(157, 12, 1.5f, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.6f));
    public static final RegistryObject<Item> SILVER_SAW_CLEAVER_UNFOLDED = REGISTRY.register(
            "silver_saw_cleaver_unfolded",
            () -> TieredWeapons.sword(157, 12, 0.5f, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.8f));
    public static final RegistryObject<Item> SILVER_BATTLE_AXE = REGISTRY.register("silver_battle_axe",
            () -> TieredWeapons.axe(157, 12, 6, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 1f, -3.3f));

    // -- Heavy weapons (repair with double_silver_ingot) --
    // Silver longsword: 207
    // Silver zweihander: 217
    // Silver greatsword: 257
    // Silver broadsword: 277

    public static final RegistryObject<Item> SILVER_LONGSWORD = REGISTRY.register("silver_longsword",
            () -> TieredWeapons.sword(207, 12, 1, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.9f));
    public static final RegistryObject<Item> SILVER_ZWEIHANDER = REGISTRY.register("silver_zweihander",
            () -> TieredWeapons.sword(217, 12, 1, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -3.1f));
    public static final RegistryObject<Item> SILVER_GREATSWORD = REGISTRY.register("silver_greatsword",
            () -> TieredWeapons.sword(257, 12, 3, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -3.2f));
    public static final RegistryObject<Item> SILVER_BROADSWORD = REGISTRY.register("silver_broadsword",
            () -> TieredWeapons.sword(277, 12, 1, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -2.8f));

    // -- Ultra heavy weapons --
    // Silver hammer: 357
    // Silver buster: 357
    // Silver greathammer: 457

    public static final RegistryObject<Item> SILVER_HAMMER = REGISTRY.register("silver_hammer",
            () -> TieredWeapons.pickaxe(357, 12, 3, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.DOUBLE_SILVER_INGOT.get())), 3, -3.4f));
    public static final RegistryObject<Item> SILVER_BUSTER_SWORD = REGISTRY.register("silver_buster_sword",
            () -> TieredWeapons.sword(357, 12, 5, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.HEAVY_SILVER_INGOT.get())), 3, -3.4f));
    public static final RegistryObject<Item> SILVER_GREATHAMMER = REGISTRY.register("silver_greathammer",
            () -> TieredWeapons.pickaxe(457, 12, 7, 0, 22,
                    Ingredient.of(new ItemStack(SilverItems.HEAVY_SILVER_INGOT.get())), 3, -3.6f));

    // -- Gun / Scattergun --
    // Durability: 257

    public static final RegistryObject<Item> SILVER_SCATTERGUN = REGISTRY.register("silver_scattergun",
            () -> TieredWeapons.simpleItem(257, 22));
}
