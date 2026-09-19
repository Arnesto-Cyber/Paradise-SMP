package com.paradisesmp;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ParadiseMod.MODID)
public class ParadiseMod {

    public static final String MODID = "paradise";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ParadiseMod(IEventBus modEventBus) {

        LOGGER.info("Paradise SMP Mod Loaded!");
    }
}