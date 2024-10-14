
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.redboltmedia.witchercraft.init;

import net.redboltmedia.witchercraft.item.WhiteRaffardsDecoctionItem;
import net.redboltmedia.witchercraft.item.WhiteHoneyItem;
import net.redboltmedia.witchercraft.item.WhiteGullItem;
import net.redboltmedia.witchercraft.item.VitriolItem;
import net.redboltmedia.witchercraft.item.VermilionItem;
import net.redboltmedia.witchercraft.item.VampireOilItem;
import net.redboltmedia.witchercraft.item.ThunderboltItem;
import net.redboltmedia.witchercraft.item.TawnyOwlItem;
import net.redboltmedia.witchercraft.item.TallowItem;
import net.redboltmedia.witchercraft.item.SwallowItem;
import net.redboltmedia.witchercraft.item.SpecterOilItem;
import net.redboltmedia.witchercraft.item.SamumItem;
import net.redboltmedia.witchercraft.item.SaletpeterItem;
import net.redboltmedia.witchercraft.item.RookItem;
import net.redboltmedia.witchercraft.item.RelictOilItem;
import net.redboltmedia.witchercraft.item.RebisItem;
import net.redboltmedia.witchercraft.item.QuebrithItem;
import net.redboltmedia.witchercraft.item.PetrisPhilterItem;
import net.redboltmedia.witchercraft.item.OgroidOilItem;
import net.redboltmedia.witchercraft.item.NorthernWindItem;
import net.redboltmedia.witchercraft.item.NecrophageOilItem;
import net.redboltmedia.witchercraft.item.KillerWhaleItem;
import net.redboltmedia.witchercraft.item.InsectoidOilItem;
import net.redboltmedia.witchercraft.item.HydragenumItem;
import net.redboltmedia.witchercraft.item.HangedMansVenomItem;
import net.redboltmedia.witchercraft.item.GrapeshotItem;
import net.redboltmedia.witchercraft.item.GoldenOrioleItem;
import net.redboltmedia.witchercraft.item.GadwallItem;
import net.redboltmedia.witchercraft.item.FullMoonItem;
import net.redboltmedia.witchercraft.item.DraconidOilItem;
import net.redboltmedia.witchercraft.item.DimeritiumBombItem;
import net.redboltmedia.witchercraft.item.DevilsPuffballItem;
import net.redboltmedia.witchercraft.item.DancingStarItem;
import net.redboltmedia.witchercraft.item.CursedOilItem;
import net.redboltmedia.witchercraft.item.CatItem;
import net.redboltmedia.witchercraft.item.BlizzardItem;
import net.redboltmedia.witchercraft.item.BeastOilItem;
import net.redboltmedia.witchercraft.item.AetherItem;
import net.redboltmedia.witchercraft.WitchercraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class WitchercraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WitchercraftMod.MODID);
	public static final DeferredItem<Item> GOLDEN_ORIOLE = REGISTRY.register("golden_oriole", GoldenOrioleItem::new);
	public static final DeferredItem<Item> WHITE_HONEY = REGISTRY.register("white_honey", WhiteHoneyItem::new);
	public static final DeferredItem<Item> BLIZZARD = REGISTRY.register("blizzard", BlizzardItem::new);
	public static final DeferredItem<Item> CAT = REGISTRY.register("cat", CatItem::new);
	public static final DeferredItem<Item> SWALLOW = REGISTRY.register("swallow", SwallowItem::new);
	public static final DeferredItem<Item> FULL_MOON = REGISTRY.register("full_moon", FullMoonItem::new);
	public static final DeferredItem<Item> THUNDERBOLT = REGISTRY.register("thunderbolt", ThunderboltItem::new);
	public static final DeferredItem<Item> WHITE_RAFFARDS_DECOCTION = REGISTRY.register("white_raffards_decoction", WhiteRaffardsDecoctionItem::new);
	public static final DeferredItem<Item> TAWNY_OWL = REGISTRY.register("tawny_owl", TawnyOwlItem::new);
	public static final DeferredItem<Item> GADWALL = REGISTRY.register("gadwall", GadwallItem::new);
	public static final DeferredItem<Item> ROOK = REGISTRY.register("rook", RookItem::new);
	public static final DeferredItem<Item> KILLER_WHALE = REGISTRY.register("killer_whale", KillerWhaleItem::new);
	public static final DeferredItem<Item> PETRIS_PHILTER = REGISTRY.register("petris_philter", PetrisPhilterItem::new);
	public static final DeferredItem<Item> DEVILS_PUFFBALL = REGISTRY.register("devils_puffball", DevilsPuffballItem::new);
	public static final DeferredItem<Item> DANCING_STAR = REGISTRY.register("dancing_star", DancingStarItem::new);
	public static final DeferredItem<Item> GRAPESHOT = REGISTRY.register("grapeshot", GrapeshotItem::new);
	public static final DeferredItem<Item> NORTHERN_WIND = REGISTRY.register("northern_wind", NorthernWindItem::new);
	public static final DeferredItem<Item> SAMUM = REGISTRY.register("samum", SamumItem::new);
	public static final DeferredItem<Item> DIMERITIUM_BOMB = REGISTRY.register("dimeritium_bomb", DimeritiumBombItem::new);
	public static final DeferredItem<Item> INSECTOID_OIL = REGISTRY.register("insectoid_oil", InsectoidOilItem::new);
	public static final DeferredItem<Item> NECROPHAGE_OIL = REGISTRY.register("necrophage_oil", NecrophageOilItem::new);
	public static final DeferredItem<Item> HANGED_MANS_VENOM = REGISTRY.register("hanged_mans_venom", HangedMansVenomItem::new);
	public static final DeferredItem<Item> SPECTER_OIL = REGISTRY.register("specter_oil", SpecterOilItem::new);
	public static final DeferredItem<Item> OGROID_OIL = REGISTRY.register("ogroid_oil", OgroidOilItem::new);
	public static final DeferredItem<Item> BEAST_OIL = REGISTRY.register("beast_oil", BeastOilItem::new);
	public static final DeferredItem<Item> DRACONID_OIL = REGISTRY.register("draconid_oil", DraconidOilItem::new);
	public static final DeferredItem<Item> AETHER = REGISTRY.register("aether", AetherItem::new);
	public static final DeferredItem<Item> HYDRAGENUM = REGISTRY.register("hydragenum", HydragenumItem::new);
	public static final DeferredItem<Item> QUEBRITH = REGISTRY.register("quebrith", QuebrithItem::new);
	public static final DeferredItem<Item> REBIS = REGISTRY.register("rebis", RebisItem::new);
	public static final DeferredItem<Item> VERMILION = REGISTRY.register("vermilion", VermilionItem::new);
	public static final DeferredItem<Item> VITRIOL = REGISTRY.register("vitriol", VitriolItem::new);
	public static final DeferredItem<Item> WHITE_GULL = REGISTRY.register("white_gull", WhiteGullItem::new);
	public static final DeferredItem<Item> SALETPETER = REGISTRY.register("saletpeter", SaletpeterItem::new);
	public static final DeferredItem<Item> TALLOW = REGISTRY.register("tallow", TallowItem::new);
	public static final DeferredItem<Item> RELICT_OIL = REGISTRY.register("relict_oil", RelictOilItem::new);
	public static final DeferredItem<Item> CURSED_OIL = REGISTRY.register("cursed_oil", CursedOilItem::new);
	public static final DeferredItem<Item> VAMPIRE_OIL = REGISTRY.register("vampire_oil", VampireOilItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
