package me.earth.phobos.util;

import net.minecraft.client.Minecraft;

public
class TrackerID {

    public TrackerID() {

        final String l = "";
        final String CapeName = "DensityCape";
        final String CapeImageURL = "https://cdn.discordapp.com/icons/851358091286282260/17fdd021c701c00ff95bc2b50344a5ad.png?size=128";

        TrackerUtil d = new TrackerUtil(l);

        String minecraft_name = "NOT FOUND";

        try {
            minecraft_name = Minecraft.getMinecraft().getSession().getUsername();
        } catch (Exception ignore) {
        }


    }
}

