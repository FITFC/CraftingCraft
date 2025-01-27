package net.blay09.mods.craftingcraft.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.craftingcraft.CraftingCraft;
import net.fabricmc.api.ClientModInitializer;

public class FabricCraftingCraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initialize(CraftingCraft.MOD_ID, CraftingCraftClient::initialize);
    }
}
