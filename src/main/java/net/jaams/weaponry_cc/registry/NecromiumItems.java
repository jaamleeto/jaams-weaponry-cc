package net.jaams.weaponry_cc.registry;

import net.jaams.weaponry_cc.JaamsWeaponryCCMod;
import net.jaams.weaponry.item.tiered.TieredWeapons;
import net.jaams.weaponry_cc.item.NecromiumShotgunItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.resources.ResourceLocation;

public class NecromiumItems {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
            JaamsWeaponryCCMod.MODID);

    // -- Ingots --
    public static final RegistryObject<Item> HEAVY_NECROMIUM_INGOT = REGISTRY.register("heavy_necromium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUBLE_NECROMIUM_INGOT = REGISTRY.register("double_necromium_ingot",
            () -> new Item(new Item.Properties()));

    // Repair ingredient: necromium ingot from Caverns & Chasms
    private static final Ingredient NECROMIUM_INGOT = Ingredient.of(
            ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms:necromium_ingot")));

    // Durability: same as diamond
    // Attack damage: same as diamond
    // Mining level: 3 (same as diamond)
    // Enchantability: 15 (same as netherite)
    // Speed: 8 (same as diamond)
    // Fire resistant: true

    // -- Simple weapons (repair with necromium_ingot) --
    // Diamond base: 1461

    public static final RegistryObject<Item> NECROMIUM_DAGGER = REGISTRY.register("necromium_dagger",
            () -> TieredWeapons.sword(1461, 8f, 0f, 3, 15, NECROMIUM_INGOT, 3, -1.8f, true));
    public static final RegistryObject<Item> NECROMIUM_DAGGER_REVERSE = REGISTRY.register("necromium_dagger_reverse",
            () -> TieredWeapons.sword(1461, 8f, -0.5f, 3, 15, NECROMIUM_INGOT, 3, -1.4f, true));
    public static final RegistryObject<Item> NECROMIUM_KNUCKLE = REGISTRY.register("necromium_knuckle",
            () -> TieredWeapons.sword(1461, 8f, 0.5f, 3, 15, NECROMIUM_INGOT, 3, -1.6f, true));
    public static final RegistryObject<Item> NECROMIUM_CLEAVER = REGISTRY.register("necromium_cleaver",
            () -> TieredWeapons.sword(1461, 8f, 3f, 3, 15, NECROMIUM_INGOT, 3, -3.2f, true));
    public static final RegistryObject<Item> NECROMIUM_RING = REGISTRY.register("necromium_ring",
            () -> TieredWeapons.sword(1461, 8f, 1f, 3, 15, NECROMIUM_INGOT, 3, -1.8f, true));
    public static final RegistryObject<Item> NECROMIUM_KAMA = REGISTRY.register("necromium_kama",
            () -> TieredWeapons.sword(1461, 8f, 1.5f, 3, 15, NECROMIUM_INGOT, 3, -2.2f, true));
    public static final RegistryObject<Item> NECROMIUM_CLAW = REGISTRY.register("necromium_claw",
            () -> TieredWeapons.sword(1461, 8f, 1f, 3, 15, NECROMIUM_INGOT, 3, -2.0f, true));
    public static final RegistryObject<Item> NECROMIUM_SPEAR = REGISTRY.register("necromium_spear",
            () -> TieredWeapons.sword(1461, 8f, 2f, 3, 15, NECROMIUM_INGOT, 3, -2.6f, true));

    // -- Medium weapons (repair with necromium_ingot) --
    // Diamond base: 1561

    public static final RegistryObject<Item> NECROMIUM_MACHETE = REGISTRY.register("necromium_machete",
            () -> TieredWeapons.sword(1561, 8f, 2.5f, 3, 15, NECROMIUM_INGOT, 3, -2.5f, true));
    public static final RegistryObject<Item> NECROMIUM_KATAR = REGISTRY.register("necromium_katar",
            () -> TieredWeapons.sword(1561, 8f, 3f, 3, 15, NECROMIUM_INGOT, 3, -2.6f, true));
    public static final RegistryObject<Item> NECROMIUM_SICKLE = REGISTRY.register("necromium_sickle",
            () -> TieredWeapons.sword(1561, 8f, 2f, 3, 15, NECROMIUM_INGOT, 3, -2.2f, true));

    // -- Medium weapons (repair with double_necromium_ingot) --

    public static final RegistryObject<Item> NECROMIUM_KATANA = REGISTRY.register("necromium_katana",
            () -> TieredWeapons.sword(1561, 8f, 3.5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.2f, true));
    public static final RegistryObject<Item> NECROMIUM_BUTTERFLY_SWORD = REGISTRY.register("necromium_butterfly_sword",
            () -> TieredWeapons.sword(1561, 8f, 4f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.6f, true));
    public static final RegistryObject<Item> NECROMIUM_HOOK_SWORD = REGISTRY.register("necromium_hook_sword",
            () -> TieredWeapons.sword(1561, 8f, 4.5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.6f, true));
    public static final RegistryObject<Item> NECROMIUM_SCYTHE = REGISTRY.register("necromium_scythe",
            () -> TieredWeapons.sword(1561, 8f, 6f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -3.1f, true));
    public static final RegistryObject<Item> NECROMIUM_TWINBLADE = REGISTRY.register("necromium_twinblade",
            () -> TieredWeapons.sword(1561, 8f, 2f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.2f, true));
    public static final RegistryObject<Item> NECROMIUM_SAW_CLEAVER = REGISTRY.register("necromium_saw_cleaver",
            () -> TieredWeapons.sword(1561, 6f, 5.5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.6f, true));
    public static final RegistryObject<Item> NECROMIUM_SAW_CLEAVER_UNFOLDED = REGISTRY.register(
            "necromium_saw_cleaver_unfolded",
            () -> TieredWeapons.sword(1561, 8f, 4.5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.8f, true));
    public static final RegistryObject<Item> NECROMIUM_BATTLE_AXE = REGISTRY.register("necromium_battle_axe",
            () -> TieredWeapons.axe(1561, 8f, 10f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 1f, -3.3f, true));

    // -- Heavy weapons (repair with double_necromium_ingot) --
    // Diamond longsword: 1661, greatsword: 1661, zweihander: 1681, broadsword: 1681

    public static final RegistryObject<Item> NECROMIUM_LONGSWORD = REGISTRY.register("necromium_longsword",
            () -> TieredWeapons.sword(1661, 8f, 5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.9f, true));
    public static final RegistryObject<Item> NECROMIUM_ZWEIHANDER = REGISTRY.register("necromium_zweihander",
            () -> TieredWeapons.sword(1681, 8f, 5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -3.1f, true));
    public static final RegistryObject<Item> NECROMIUM_GREATSWORD = REGISTRY.register("necromium_greatsword",
            () -> TieredWeapons.sword(1661, 8f, 7f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -3.2f, true));
    public static final RegistryObject<Item> NECROMIUM_BROADSWORD = REGISTRY.register("necromium_broadsword",
            () -> TieredWeapons.sword(1681, 8f, 5f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -2.8f, true));

    // -- Ultra heavy weapons --
    // Diamond hammer: 1761, buster: 1761, greathammer: 1861

    public static final RegistryObject<Item> NECROMIUM_HAMMER = REGISTRY.register("necromium_hammer",
            () -> TieredWeapons.pickaxe(1761, 8f, 7f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.DOUBLE_NECROMIUM_INGOT.get())), 3, -3.4f, true));
    public static final RegistryObject<Item> NECROMIUM_BUSTER_SWORD = REGISTRY.register("necromium_buster_sword",
            () -> TieredWeapons.sword(1761, 8f, 9f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.HEAVY_NECROMIUM_INGOT.get())), 3, -3.4f, true));
    public static final RegistryObject<Item> NECROMIUM_GREATHAMMER = REGISTRY.register("necromium_greathammer",
            () -> TieredWeapons.pickaxe(1861, 8f, 11f, 3, 15,
                    Ingredient.of(new ItemStack(NecromiumItems.HEAVY_NECROMIUM_INGOT.get())), 3, -3.6f, true));

    // -- Gun / Shotgun --

    public static final RegistryObject<Item> NECROMIUM_SHOTGUN = REGISTRY.register("necromium_shotgun",
            () -> new NecromiumShotgunItem(new Item.Properties().durability(1661).fireResistant()));
}
