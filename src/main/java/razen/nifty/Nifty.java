package razen.nifty;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import razen.nifty.util.registry.BlockRegistry;
import razen.nifty.util.registry.ItemRegistry;

public class Nifty implements ModInitializer {

	//Item Group and Creative Tab
	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(id("group"), () -> new ItemStack(Items.ANVIL));


	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();

	}

	//Mod ID
	public static Identifier id(String name) {
		return new Identifier("nifty", name);
	}
}
