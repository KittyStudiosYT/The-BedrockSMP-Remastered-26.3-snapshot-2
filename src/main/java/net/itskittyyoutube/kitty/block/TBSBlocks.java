package net.itskittyyoutube.kitty.block;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.itskittyyoutube.kitty.TBS;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class TBSBlocks {
    //Planks
    public static final Block PLANKS_TEMPLATE = registerBlock("planks_template",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CHERRY_BIRCH_PLANKS = registerBlock("cherry_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GOLDEN_BIRCH_PLANKS = registerBlock("golden_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    //Doors
    public static final Block WHITE_DOOR = registerBlock("white_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_DOOR = registerBlock("light_gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GRAY_DOOR = registerBlock("gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BLACK_DOOR = registerBlock("black_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BROWN_DOOR = registerBlock("brown_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block RED_DOOR = registerBlock("red_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block ORANGE_DOOR = registerBlock("orange_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block YELLOW_DOOR = registerBlock("yellow_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIME_DOOR = registerBlock("lime_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GREEN_DOOR = registerBlock("green_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block CYAN_DOOR = registerBlock("cyan_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_DOOR = registerBlock("light_blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block BLUE_DOOR = registerBlock("blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block PURPLE_DOOR = registerBlock("purple_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block MAGENTA_DOOR = registerBlock("magenta_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block PINK_DOOR = registerBlock("pink_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block DARK_OAK_DOOR_WITH_WINDOWS = registerBlock("dark_oak_door_with_windows",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).pushReaction(PushReaction.DESTROY).sound(SoundType.STONE)));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).pushReaction(PushReaction.DESTROY)
                    .noLootTable().isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.DESTROY)
                    .isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block CHERRY_BIRCH_DOOR = registerBlock("cherry_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_DOOR = registerBlock("golden_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD)));


    //Trapdoors
    public static final Block WHITE_TRAPDOOR = registerBlock("white_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_TRAPDOOR = registerBlock("light_gray_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GRAY_TRAPDOOR = registerBlock("gray_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BLACK_TRAPDOOR = registerBlock("black_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BROWN_TRAPDOOR = registerBlock("brown_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block RED_TRAPDOOR = registerBlock("red_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block YELLOW_TRAPDOOR = registerBlock("yellow_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIME_TRAPDOOR = registerBlock("lime_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GREEN_TRAPDOOR = registerBlock("green_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block CYAN_TRAPDOOR = registerBlock("cyan_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_TRAPDOOR = registerBlock("light_blue_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block BLUE_TRAPDOOR = registerBlock("blue_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block PURPLE_TRAPDOOR = registerBlock("purple_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block MAGENTA_TRAPDOOR = registerBlock("magenta_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block PINK_TRAPDOOR = registerBlock("pink_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block DARK_OAK_TRAPDOOR_WITH_WINDOWS = registerBlock("dark_oak_trapdoor_with_windows",
            properties -> new TrapDoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava()));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F).isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).noLootTable().isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(50.0F, 1200.0F).isValidSpawn(Blocks::never).sound(SoundType.STONE)));
    public static final Block CHERRY_BIRCH_TRAPDOOR = registerBlock("cherry_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_TRAPDOOR = registerBlock("golden_birch_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava().sound(SoundType.WOOD)));

    //Buttons
    public static final Block WHITE_BUTTON = registerBlock("white_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_BUTTON = registerBlock("light_gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GRAY_BUTTON = registerBlock("gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BLACK_BUTTON = registerBlock("black_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BROWN_BUTTON = registerBlock("brown_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block RED_BUTTON = registerBlock("red_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block YELLOW_BUTTON = registerBlock("yellow_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIME_BUTTON = registerBlock("lime_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GREEN_BUTTON = registerBlock("green_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block CYAN_BUTTON = registerBlock("cyan_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_BUTTON = registerBlock("light_blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block BLUE_BUTTON = registerBlock("blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block PURPLE_BUTTON = registerBlock("purple_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block MAGENTA_BUTTON = registerBlock("magenta_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block PINK_BUTTON = registerBlock("pink_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_BUTTON = registerBlock("cherry_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_BUTTON = registerBlock("golden_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sound(SoundType.WOOD)));

    //Pressure Plates
    public static final Block WHITE_PRESSURE_PLATE = registerBlock("white_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_PRESSURE_PLATE = registerBlock("light_gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GRAY_PRESSURE_PLATE = registerBlock("gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BLACK_PRESSURE_PLATE = registerBlock("black_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BROWN_PRESSURE_PLATE = registerBlock("brown_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block RED_PRESSURE_PLATE = registerBlock("red_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block YELLOW_PRESSURE_PLATE = registerBlock("yellow_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIME_PRESSURE_PLATE = registerBlock("lime_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GREEN_PRESSURE_PLATE = registerBlock("green_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block CYAN_PRESSURE_PLATE = registerBlock("cyan_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_PRESSURE_PLATE = registerBlock("light_blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block BLUE_PRESSURE_PLATE = registerBlock("blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block PURPLE_PRESSURE_PLATE = registerBlock("purple_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block MAGENTA_PRESSURE_PLATE = registerBlock("magenta_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block PINK_PRESSURE_PLATE = registerBlock("pink_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_PRESSURE_PLATE = registerBlock("cherry_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_PRESSURE_PLATE = registerBlock("golden_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sound(SoundType.WOOD)));

    //Stairs
    public static final Block WHITE_STAIRS = registerBlock("white_stairs",
            properties -> new StairBlock(TBSBlocks.WHITE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_STAIRS = registerBlock("light_gray_stairs",
            properties -> new StairBlock(TBSBlocks.LIGHT_GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_STAIRS = registerBlock("gray_stairs",
            properties -> new StairBlock(TBSBlocks.GRAY_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_STAIRS = registerBlock("black_stairs",
            properties -> new StairBlock(TBSBlocks.BLACK_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_STAIRS = registerBlock("brown_stairs",
            properties -> new StairBlock(TBSBlocks.BROWN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_STAIRS = registerBlock("red_stairs",
            properties -> new StairBlock(TBSBlocks.RED_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            properties -> new StairBlock(TBSBlocks.ORANGE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_STAIRS = registerBlock("yellow_stairs",
            properties -> new StairBlock(TBSBlocks.YELLOW_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_STAIRS = registerBlock("lime_stairs",
            properties -> new StairBlock(TBSBlocks.LIME_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_STAIRS = registerBlock("green_stairs",
            properties -> new StairBlock(TBSBlocks.GREEN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_STAIRS = registerBlock("cyan_stairs",
            properties -> new StairBlock(TBSBlocks.CYAN_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_STAIRS = registerBlock("light_blue_stairs",
            properties -> new StairBlock(TBSBlocks.LIGHT_BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_STAIRS = registerBlock("blue_stairs",
            properties -> new StairBlock(TBSBlocks.BLUE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_STAIRS = registerBlock("purple_stairs",
            properties -> new StairBlock(TBSBlocks.PURPLE_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_STAIRS = registerBlock("magenta_stairs",
            properties -> new StairBlock(TBSBlocks.MAGENTA_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_STAIRS = registerBlock("pink_stairs",
            properties -> new StairBlock(TBSBlocks.PINK_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_STAIRS = registerBlock("cherry_birch_stairs",
            properties -> new StairBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_STAIRS = registerBlock("golden_birch_stairs",
            properties -> new StairBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.defaultBlockState(),
                    properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Slabs
    public static final Block WHITE_SLAB = registerBlock("white_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_SLAB = registerBlock("light_gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_SLAB = registerBlock("gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_SLAB = registerBlock("black_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_SLAB = registerBlock("brown_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_SLAB = registerBlock("red_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_SLAB = registerBlock("yellow_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_SLAB = registerBlock("lime_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_SLAB = registerBlock("green_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_SLAB = registerBlock("cyan_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_SLAB = registerBlock("light_blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_SLAB = registerBlock("blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_SLAB = registerBlock("purple_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_SLAB = registerBlock("magenta_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_SLAB = registerBlock("pink_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_SLAB = registerBlock("cherry_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_SLAB = registerBlock("golden_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Fences
    public static final Block WHITE_FENCE = registerBlock("white_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_FENCE = registerBlock("light_gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_FENCE = registerBlock("gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_FENCE = registerBlock("black_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_FENCE = registerBlock("brown_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_FENCE = registerBlock("red_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_FENCE = registerBlock("yellow_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_FENCE = registerBlock("lime_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_FENCE = registerBlock("green_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_FENCE = registerBlock("cyan_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_FENCE = registerBlock("light_blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_FENCE = registerBlock("blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_FENCE = registerBlock("purple_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_FENCE = registerBlock("magenta_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_FENCE = registerBlock("pink_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE = registerBlock("cherry_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE = registerBlock("golden_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Fence Gates
    public static final Block WHITE_FENCE_GATE = registerBlock("white_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_GRAY_FENCE_GATE = registerBlock("light_gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GRAY_FENCE_GATE = registerBlock("gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLACK_FENCE_GATE = registerBlock("black_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BROWN_FENCE_GATE = registerBlock("brown_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block RED_FENCE_GATE = registerBlock("red_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block YELLOW_FENCE_GATE = registerBlock("yellow_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIME_FENCE_GATE = registerBlock("lime_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GREEN_FENCE_GATE = registerBlock("green_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CYAN_FENCE_GATE = registerBlock("cyan_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block LIGHT_BLUE_FENCE_GATE = registerBlock("light_blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block BLUE_FENCE_GATE = registerBlock("blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PURPLE_FENCE_GATE = registerBlock("purple_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block MAGENTA_FENCE_GATE = registerBlock("magenta_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block PINK_FENCE_GATE = registerBlock("pink_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE_GATE = registerBlock("cherry_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE_GATE = registerBlock("golden_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //Leaves
    public static final Block CHERRY_BIRCH_LEAVES = registerBlock("cherry_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.2F)
                    .randomTicks()
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(Blocks::never)));
    public static final Block GOLDEN_BIRCH_LEAVES = registerBlock("golden_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2F)
                    .randomTicks()
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(Blocks::never)));

    //Logs
    public static final Block CHERRY_BIRCH_LOG = registerBlock("cherry_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_CHERRY_BIRCH_LOG = registerBlock("stripped_cherry_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block GOLDEN_BIRCH_LOG = registerBlock("golden_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_GOLDEN_BIRCH_LOG = registerBlock("stripped_golden_birch_log",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    //Woods
    public static final Block CHERRY_BIRCH_WOOD = registerBlock("cherry_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_CHERRY_BIRCH_WOOD = registerBlock("stripped_cherry_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block GOLDEN_BIRCH_WOOD = registerBlock("golden_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_GOLDEN_BIRCH_WOOD = registerBlock("stripped_golden_birch_wood",
            logProperties -> new RotatedPillarBlock(logProperties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));

    //Saplings
    //public static final Block CHERRY_BIRCH_SAPLING = registerBlock("cherry_birch_sapling",
            //properties -> new SaplingBlock(TBSSaplingGenerators.CHERRY_BIRCH, properties.mapColor(MapColor.COLOR_PINK)
                    //.noCollision().randomTicks().instabreak()
                    //.sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    //public static final Block GOLDEN_BIRCH_SAPLING = registerBlock("golden_birch_sapling",
            //properties -> new SaplingBlock(TBSSaplingGenerators.GOLDEN_BIRCH, properties.mapColor(MapColor.GOLD)
                    //.noCollision().randomTicks().instabreak()
                    //.sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));

    //Shelves [NEEDS WORK]
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS)
                    //.strength(2.0F, 3.0F).sound(SoundType.SHELF).ignitedByLava()));
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE)
                    //.instrument(NoteBlockInstrument.BASS).sound(SoundType.SHELF).ignitedByLava().strength(2.0F, 3.0F)));

    //public static final Block SHELFSHELF = register("shelfshelf",
            //ShelfBlock::new,
            //AbstractBlock.Settings.create()
                    //.mapColor(BLUE_PLANKS.getDefaultMapColor())
                    //.instrument(NoteBlockInstrument.BASS)
                    //.sound(SoundType.SHELF)
                    //.ignitedByLava()
                    //.strength(2.0F, 3.0F));

    public static final Block SHELFSHELF = registerShelfBlock("shelfshelf",
            key -> new ShelfBlock( // <--- Change this right here
                    BlockBehaviour.Properties.ofFullCopy(TBSBlocks.BLUE_PLANKS).sound(SoundType.WOOD).lightLevel(state -> 2).noOcclusion().setId(key)));

    //Blocks
    public static final Block DIAMARITE_BLOCK = registerBlock("diamarite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CORRUPTIONITE_BLOCK = registerBlock("corruptionite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    public static final Block BYZANTIUM_BLOCK = registerBlock("byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops().strength(4.0F, 6.0F).sound(SoundType.METAL)));
    public static final Block RAW_BYZANTIUM_BLOCK = registerBlock("raw_byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final Block BYZANTIUM_ORE = registerBlock("byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_BYZANTIUM_ORE = registerBlock("deepslate_byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.DEEPSLATE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

    public static final Block DIAMARITE_CORE = registerBlock("diamarite_core",
            properties -> new HeavyCoreBlock(properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.SNARE)
                    .sound(SoundType.HEAVY_CORE).strength(10.0F).pushReaction(PushReaction.NORMAL).strength(1200.0F)));

    public static final Block GILDED_NETHERITE_BLOCK = registerBlock("gilded_netherite_block",
            properties -> new Block(properties.mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final Block GOLDEN_DEBRIS = registerBlock("golden_debris",
            properties -> new Block(properties.mapColor(MapColor.GOLD).requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));

    public static final Block ENERGY_BLOCK = registerBlock("energy_block",
            properties -> new Block(properties.mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.METAL)));

    //Extra
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TBS.MOD_ID, name)))));
    }


    private static Block registerShelfBlock(String name, java.util.function.Function<ResourceKey<Block>, Block> factory) {
        Identifier id = Identifier.fromNamespaceAndPath(TBS.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(BuiltInRegistries.BLOCK.key(), id);
        // Construct with registry key to satisfy settings that need an id during construction
        Block block = factory.apply(key);
        // Register the block
        Registry.register(BuiltInRegistries.BLOCK, id, block);
        // Register the block item so it appears in inventory and can be placed
        ResourceKey<Item> itemKey = ResourceKey.create(BuiltInRegistries.ITEM.key(), id);
        Item.Properties itemSettings = new Item.Properties().setId(itemKey);

        // Standard block item registration for shelves
        BlockItem item = new BlockItem(block, itemSettings);
        Registry.register(BuiltInRegistries.ITEM, id, item);
        // NOTE: Creative tab population moved to registerModBlocks() for manual ordering
        return block;
    }


    //private static Block register(String id,
                                  //Function<AbstractBlock.Settings, Block> factory,
                                  //AbstractBlock.Settings settings) {
        //RegistryKey<Block> key = RegistryKey.of(
                //RegistryKeys.BLOCK,
                //Identifier.of(TBS.MOD_ID, id)
        //);

        //return Registry.register(
                //Registries.BLOCK,
                //Identifier.of(TBS.MOD_ID, id),
                //factory.apply(settings.registryKey(key))
        //);
    //}

    public static void registerBlocks() {
        TBS.LOGGER.info("Registering Mod Blocks for " + TBS.MOD_ID);

        //Creative Tabs
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.accept(TBSBlocks.CHERRY_BIRCH_LEAVES);
            //entries.accept(TBSBlocks.CHERRY_BIRCH_SAPLING);
            entries.accept(TBSBlocks.GOLDEN_BIRCH_LEAVES);
            //entries.accept(TBSBlocks.GOLDEN_BIRCH_SAPLING);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.accept(PLANKS_TEMPLATE);
            entries.accept(WHITE_PLANKS);
            entries.accept(WHITE_STAIRS);
            entries.accept(WHITE_SLAB);
            entries.accept(WHITE_FENCE);
            entries.accept(WHITE_FENCE_GATE);
            entries.accept(WHITE_DOOR);
            entries.accept(WHITE_TRAPDOOR);
            entries.accept(WHITE_PRESSURE_PLATE);
            entries.accept(WHITE_BUTTON);
            entries.accept(LIGHT_GRAY_PLANKS);
            entries.accept(LIGHT_GRAY_STAIRS);
            entries.accept(LIGHT_GRAY_SLAB);
            entries.accept(LIGHT_GRAY_FENCE);
            entries.accept(LIGHT_GRAY_FENCE_GATE);
            entries.accept(LIGHT_GRAY_DOOR);
            entries.accept(LIGHT_GRAY_TRAPDOOR);
            entries.accept(LIGHT_GRAY_PRESSURE_PLATE);
            entries.accept(LIGHT_GRAY_BUTTON);
            entries.accept(GRAY_PLANKS);
            entries.accept(GRAY_STAIRS);
            entries.accept(GRAY_SLAB);
            entries.accept(GRAY_FENCE);
            entries.accept(GRAY_FENCE_GATE);
            entries.accept(GRAY_DOOR);
            entries.accept(GRAY_TRAPDOOR);
            entries.accept(GRAY_PRESSURE_PLATE);
            entries.accept(GRAY_BUTTON);
            entries.accept(BLACK_PLANKS);
            entries.accept(BLACK_STAIRS);
            entries.accept(BLACK_SLAB);
            entries.accept(BLACK_FENCE);
            entries.accept(BLACK_FENCE_GATE);
            entries.accept(BLACK_DOOR);
            entries.accept(BLACK_TRAPDOOR);
            entries.accept(BLACK_PRESSURE_PLATE);
            entries.accept(BLACK_BUTTON);
            entries.accept(BROWN_PLANKS);
            entries.accept(BROWN_STAIRS);
            entries.accept(BROWN_SLAB);
            entries.accept(BROWN_FENCE);
            entries.accept(BROWN_FENCE_GATE);
            entries.accept(BROWN_DOOR);
            entries.accept(BROWN_TRAPDOOR);
            entries.accept(BROWN_PRESSURE_PLATE);
            entries.accept(BROWN_BUTTON);
            entries.accept(RED_PLANKS);
            entries.accept(RED_STAIRS);
            entries.accept(RED_SLAB);
            entries.accept(RED_FENCE);
            entries.accept(RED_FENCE_GATE);
            entries.accept(RED_DOOR);
            entries.accept(RED_TRAPDOOR);
            entries.accept(RED_PRESSURE_PLATE);
            entries.accept(RED_BUTTON);
            entries.accept(ORANGE_PLANKS);
            entries.accept(ORANGE_STAIRS);
            entries.accept(ORANGE_SLAB);
            entries.accept(ORANGE_FENCE);
            entries.accept(ORANGE_FENCE_GATE);
            entries.accept(ORANGE_DOOR);
            entries.accept(ORANGE_TRAPDOOR);
            entries.accept(ORANGE_PRESSURE_PLATE);
            entries.accept(ORANGE_BUTTON);
            entries.accept(YELLOW_PLANKS);
            entries.accept(YELLOW_STAIRS);
            entries.accept(YELLOW_SLAB);
            entries.accept(YELLOW_FENCE);
            entries.accept(YELLOW_FENCE_GATE);
            entries.accept(YELLOW_DOOR);
            entries.accept(YELLOW_TRAPDOOR);
            entries.accept(YELLOW_PRESSURE_PLATE);
            entries.accept(YELLOW_BUTTON);
            entries.accept(LIME_PLANKS);
            entries.accept(LIME_STAIRS);
            entries.accept(LIME_SLAB);
            entries.accept(LIME_FENCE);
            entries.accept(LIME_FENCE_GATE);
            entries.accept(LIME_DOOR);
            entries.accept(LIME_TRAPDOOR);
            entries.accept(LIME_PRESSURE_PLATE);
            entries.accept(LIME_BUTTON);
            entries.accept(GREEN_PLANKS);
            entries.accept(GREEN_STAIRS);
            entries.accept(GREEN_SLAB);
            entries.accept(GREEN_FENCE);
            entries.accept(GREEN_FENCE_GATE);
            entries.accept(GREEN_DOOR);
            entries.accept(GREEN_TRAPDOOR);
            entries.accept(GREEN_PRESSURE_PLATE);
            entries.accept(GREEN_BUTTON);
            entries.accept(CYAN_PLANKS);
            entries.accept(CYAN_STAIRS);
            entries.accept(CYAN_SLAB);
            entries.accept(CYAN_FENCE);
            entries.accept(CYAN_FENCE_GATE);
            entries.accept(CYAN_DOOR);
            entries.accept(CYAN_TRAPDOOR);
            entries.accept(CYAN_PRESSURE_PLATE);
            entries.accept(CYAN_BUTTON);
            entries.accept(LIGHT_BLUE_PLANKS);
            entries.accept(LIGHT_BLUE_STAIRS);
            entries.accept(LIGHT_BLUE_SLAB);
            entries.accept(LIGHT_BLUE_FENCE);
            entries.accept(LIGHT_BLUE_FENCE_GATE);
            entries.accept(LIGHT_BLUE_DOOR);
            entries.accept(LIGHT_BLUE_TRAPDOOR);
            entries.accept(LIGHT_BLUE_PRESSURE_PLATE);
            entries.accept(LIGHT_BLUE_BUTTON);
            entries.accept(BLUE_PLANKS);
            entries.accept(BLUE_STAIRS);
            entries.accept(BLUE_SLAB);
            entries.accept(BLUE_FENCE);
            entries.accept(BLUE_FENCE_GATE);
            entries.accept(BLUE_DOOR);
            entries.accept(BLUE_TRAPDOOR);
            entries.accept(BLUE_PRESSURE_PLATE);
            entries.accept(BLUE_BUTTON);
            entries.accept(PURPLE_PLANKS);
            entries.accept(PURPLE_STAIRS);
            entries.accept(PURPLE_SLAB);
            entries.accept(PURPLE_FENCE);
            entries.accept(PURPLE_FENCE_GATE);
            entries.accept(PURPLE_DOOR);
            entries.accept(PURPLE_TRAPDOOR);
            entries.accept(PURPLE_PRESSURE_PLATE);
            entries.accept(PURPLE_BUTTON);
            entries.accept(MAGENTA_PLANKS);
            entries.accept(MAGENTA_STAIRS);
            entries.accept(MAGENTA_SLAB);
            entries.accept(MAGENTA_FENCE);
            entries.accept(MAGENTA_FENCE_GATE);
            entries.accept(MAGENTA_DOOR);
            entries.accept(MAGENTA_TRAPDOOR);
            entries.accept(MAGENTA_PRESSURE_PLATE);
            entries.accept(MAGENTA_BUTTON);
            entries.accept(PINK_PLANKS);
            entries.accept(PINK_STAIRS);
            entries.accept(PINK_SLAB);
            entries.accept(PINK_FENCE);
            entries.accept(PINK_FENCE_GATE);
            entries.accept(PINK_DOOR);
            entries.accept(PINK_TRAPDOOR);
            entries.accept(PINK_PRESSURE_PLATE);
            entries.accept(PINK_BUTTON);
            entries.accept(DARK_OAK_DOOR_WITH_WINDOWS);
            entries.accept(DARK_OAK_TRAPDOOR_WITH_WINDOWS);
            entries.accept(STONE_DOOR);
            entries.accept(STONE_TRAPDOOR);
            entries.accept(BEDROCK_DOOR);
            entries.accept(BEDROCK_TRAPDOOR);
            entries.accept(OBSIDIAN_DOOR);
            entries.accept(OBSIDIAN_TRAPDOOR);
            entries.accept(CHERRY_BIRCH_PLANKS);
            entries.accept(CHERRY_BIRCH_STAIRS);
            entries.accept(CHERRY_BIRCH_SLAB);
            entries.accept(CHERRY_BIRCH_FENCE);
            entries.accept(CHERRY_BIRCH_FENCE_GATE);
            entries.accept(CHERRY_BIRCH_DOOR);
            entries.accept(CHERRY_BIRCH_TRAPDOOR);
            entries.accept(CHERRY_BIRCH_PRESSURE_PLATE);
            entries.accept(CHERRY_BIRCH_BUTTON);
            entries.accept(GOLDEN_BIRCH_PLANKS);
            entries.accept(GOLDEN_BIRCH_STAIRS);
            entries.accept(GOLDEN_BIRCH_SLAB);
            entries.accept(GOLDEN_BIRCH_FENCE);
            entries.accept(GOLDEN_BIRCH_FENCE_GATE);
            entries.accept(GOLDEN_BIRCH_DOOR);
            entries.accept(GOLDEN_BIRCH_TRAPDOOR);
            entries.accept(GOLDEN_BIRCH_PRESSURE_PLATE);
            entries.accept(GOLDEN_BIRCH_BUTTON);
        });
    }
}
