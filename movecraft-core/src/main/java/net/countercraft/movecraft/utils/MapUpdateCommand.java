/*
 * This file is part of Movecraft.
 *
 *     Movecraft is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Movecraft is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Movecraft.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.countercraft.movecraft.utils;

import net.countercraft.movecraft.api.BlockPosition;
import net.countercraft.movecraft.api.Rotation;
import net.countercraft.movecraft.craft.Craft;

/**
 * Class that stores the data about a single blocks changes to the map in an unspecified world. The world is
 * retrieved contextually from the submitting craft.
 */
public class MapUpdateCommand {
    private BlockPosition blockLocation;
    private final BlockPosition newBlockLocation;
    private final int typeID;
    private final byte dataID;
    private final Object worldEditBaseBlock;
    private final Rotation rotation;
    private final Craft craft;
    private final int smoke;

    public MapUpdateCommand(BlockPosition blockLocation, BlockPosition newBlockLocation, int typeID,
                            byte dataID, Rotation rotation, Craft craft)
    {
        this.blockLocation = blockLocation;
        this.newBlockLocation = newBlockLocation;
        this.typeID = typeID;
        this.dataID = dataID;
        this.worldEditBaseBlock = null;
        this.rotation = rotation;
        this.craft = craft;
        this.smoke = 0;
    }

    public MapUpdateCommand(BlockPosition blockLocation, BlockPosition newBlockLocation, int typeID,
                            byte dataID, Craft craft)
    {
        this.blockLocation = blockLocation;
        this.newBlockLocation = newBlockLocation;
        this.typeID = typeID;
        this.dataID = dataID;
        this.worldEditBaseBlock = null;
        this.rotation = Rotation.NONE;
        this.craft = craft;
        this.smoke = 0;
    }

    public MapUpdateCommand(BlockPosition newBlockLocation, int typeID, byte dataID, Craft craft) {
        this.newBlockLocation = newBlockLocation;
        this.typeID = typeID;
        this.dataID = dataID;
        this.worldEditBaseBlock = null;
        this.rotation = Rotation.NONE;
        this.craft = craft;
        this.smoke = 0;
    }

    public MapUpdateCommand(BlockPosition newBlockLocation, int typeID, byte dataID, Object worldEditBaseBlock,
                            Craft craft)
    {
        this.newBlockLocation = newBlockLocation;
        this.typeID = typeID;
        this.dataID = dataID;
        this.worldEditBaseBlock = worldEditBaseBlock;
        this.rotation = Rotation.NONE;
        this.craft = craft;
        this.smoke = 0;
    }

    public MapUpdateCommand(BlockPosition newBlockLocation, int typeID, byte dataID, Craft craft, int smoke) {
        this.newBlockLocation = newBlockLocation;
        this.typeID = typeID;
        this.dataID = dataID;
        this.worldEditBaseBlock = null;
        this.rotation = Rotation.NONE;
        this.craft = craft;
        this.smoke = smoke;
    }

    public int getTypeID() {
        return typeID;
    }

    public byte getDataID() {
        return dataID;
    }

    public Object getWorldEditBaseBlock() {
        return worldEditBaseBlock;
    }

    public int getSmoke() {
        return smoke;
    }

    public BlockPosition getOldBlockLocation() {
        return blockLocation;
    }

    public BlockPosition getNewBlockLocation() {
        return newBlockLocation;
    }

    public Rotation getRotation() {
        return rotation;
    }

    public Craft getCraft() {
        return craft;
    }
}
