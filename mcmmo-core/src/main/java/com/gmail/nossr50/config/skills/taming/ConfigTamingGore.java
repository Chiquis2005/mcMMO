package com.gmail.nossr50.config.skills.taming;

import com.gmail.nossr50.config.ConfigConstants;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigTamingGore {

    @Setting(value = ConfigConstants.MAX_CHANCE_FIELD_NAME, comment = ConfigConstants.MAX_CHANCE_FIELD_DESCRIPTION)
    private double maxChance = 50.0;

    @Setting(value = "Gore-Bleed-Tick-Length", comment = "How many times to apply the bleed DOT from gore before it wears off.")
    private int goreBleedTicks = 2;

    @Setting(value = "Gore-Damage-Modifier")
    private double goreMofifier = 2.0;

    public double getMaxChance() {
        return maxChance;
    }

    public double getGoreMofifier() {
        return goreMofifier;
    }

    public int getGoreBleedTicks() {
        return goreBleedTicks;
    }
}
