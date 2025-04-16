package com.heitorfs.hellokitty.block;

import com.heitorfs.hellokitty.Hellokitty;
import com.heitorfs.hellokitty.world.tree.ModSaplingGenerators;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.function.Function;

public class ModBlocks {

    //region Blue Oak Blocks

    public static final Block BLUE_OAK_LOG = registerBlock(
            "blue_oak_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));

    public static final Block BLUE_OAK_WOOD = registerBlock(
            "blue_oak_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_BLUE_OAK_LOG = registerBlock(
            "stripped_blue_oak_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));

    public static final Block STRIPPED_BLUE_OAK_WOOD = registerBlock(
            "stripped_blue_oak_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block BLUE_OAK_PLANKS = registerBlock(
            "blue_oak_planks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BLUE_OAK_LEAVES = registerBlock(
            "blue_oak_leaves",
            settings -> getLeavesBlock(settings, 0.01f),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static final Block BLUE_OAK_SAPLING = registerBlock(
            "blue_oak_sapling",
            settings -> new SaplingBlock(ModSaplingGenerators.BLUE_OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));

    public static final Block BLUE_OAK_STAIRS = registerBlock("blue_oak_stairs",
            settings -> new StairsBlock(BLUE_OAK_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));

    public static final Block BLUE_OAK_SLAB = registerBlock("blue_oak_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));

    public static final Block BLUE_OAK_BUTTON = registerBlock("blue_oak_button",
            settings -> new ButtonBlock(BlockSetType.OAK, 10, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));

    public static final Block BLUE_OAK_PRESSURE_PLATE = registerBlock("blue_oak_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final Block BLUE_OAK_FENCE = registerBlock("blue_oak_fence",
            FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));

    public static final Block BLUE_OAK_FENCE_GATE = registerBlock("blue_oak_fence_gate",
            settings -> new FenceGateBlock(WoodType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));

    public static final Block BLUE_OAK_DOOR = registerBlock("blue_oak_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR));

    public static final Block BLUE_OAK_TRAPDOOR = registerBlock("blue_oak_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));

    //endregion

    //region Red Maple Blocks

    public static final Block RED_MAPLE_LOG = registerBlock(
            "red_maple_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_LOG));

    public static final Block RED_MAPLE_WOOD = registerBlock(
            "red_maple_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock(
            "stripped_red_maple_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));

    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock(
            "stripped_red_maple_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block RED_MAPLE_PLANKS = registerBlock(
            "red_maple_planks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block RED_MAPLE_LEAVES = registerBlock(
            "red_maple_leaves",
            settings -> getLeavesBlock(settings, 0.02f),
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static final Block RED_MAPLE_SAPLING = registerBlock(
            "red_maple_sapling",
            settings -> new SaplingBlock(ModSaplingGenerators.RED_MAPLE, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));

    public static final Block RED_MAPLE_STAIRS = registerBlock("red_maple_stairs",
            settings -> new StairsBlock(RED_MAPLE_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));

    public static final Block RED_MAPLE_SLAB = registerBlock("red_maple_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));

    public static final Block RED_MAPLE_BUTTON = registerBlock("red_maple_button",
            settings -> new ButtonBlock(BlockSetType.OAK, 10, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));

    public static final Block RED_MAPLE_PRESSURE_PLATE = registerBlock("red_maple_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final Block RED_MAPLE_FENCE = registerBlock("red_maple_fence",
            FenceBlock::new,
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE));

    public static final Block RED_MAPLE_FENCE_GATE = registerBlock("red_maple_fence_gate",
            settings -> new FenceGateBlock(WoodType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));

    public static final Block RED_MAPLE_DOOR = registerBlock("red_maple_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_DOOR));

    public static final Block RED_MAPLE_TRAPDOOR = registerBlock("red_maple_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));

    //endregion

    //region Methods

    private static RegistryKey<Item> keyOfItem(String name)
    {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Hellokitty.MOD_ID, name));
    }

    private static RegistryKey<Block> keyOfBlock(String name)
    {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Hellokitty.MOD_ID, name));
    }

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings)
    {
        final RegistryKey<Block> blockKey = keyOfBlock(name);
        final Block block = factory.apply(settings.registryKey(blockKey));

        final RegistryKey<Item> itemKey = keyOfItem(name);
        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, blockItem);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static Block getLeavesBlock(AbstractBlock.Settings settings, float leafParticleChance) {
        return new TintedParticleLeavesBlock(leafParticleChance, settings) {
            @Override
            public MapCodec<? extends TintedParticleLeavesBlock> getCodec() {
                return null;
            }

            @Override
            protected void spawnLeafParticle(World world, BlockPos pos, Random random) {

            }
        };
    }

    //endregion

    public static void registerModBlocks()
    {
        Hellokitty.LOGGER.info("Registering mod blocks for " + Hellokitty.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(BLUE_OAK_LOG);
            entries.add(STRIPPED_BLUE_OAK_LOG);
            entries.add(BLUE_OAK_PLANKS);
            entries.add(RED_MAPLE_LOG);
            entries.add(STRIPPED_RED_MAPLE_LOG);
            entries.add(RED_MAPLE_PLANKS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(BLUE_OAK_LEAVES);
            entries.add(BLUE_OAK_SAPLING);
            entries.add(BLUE_OAK_LOG);
            entries.add(RED_MAPLE_LEAVES);
            entries.add(RED_MAPLE_SAPLING);
            entries.add(RED_MAPLE_LOG);
        });
    }
}
