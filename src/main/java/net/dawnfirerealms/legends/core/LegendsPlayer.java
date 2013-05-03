/*
This file is part of Legends.

    Legends is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Legends is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Legends.  If not, see <http://www.gnu.org/licenses/>.
*/
package net.dawnfirerealms.legends.core;

import net.dawnfirerealms.legends.library.race.Race;
import net.dawnfirerealms.legends.library.restriction.Restrictions;
import net.dawnfirerealms.legends.library.skill.Skill;
import net.dawnfirerealms.legends.library.skill.SkillUser;
import net.dawnfirerealms.legends.library.weapon.Weapon;
import net.dawnfirerealms.legends.library.weapon.WeaponUser;
import net.minecraft.server.v1_5_R2.EntityPlayer;
import org.bukkit.craftbukkit.v1_5_R2.CraftServer;
import org.bukkit.craftbukkit.v1_5_R2.entity.CraftPlayer;

import java.util.ArrayList;

public class LegendsPlayer extends CraftPlayer implements SkillUser, WeaponUser {
    private Race race;

    public LegendsPlayer(CraftServer server, EntityPlayer player) {
        super(server, player);
    }

    public Race getRace() {
        return race;
    }

    @Override
    public ArrayList<Skill> getSkills() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addSkill(Skill skill) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeSkill(Skill skill) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Restrictions<Skill> getSkillRestrictions() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Restrictions<Weapon> getWeaponRestrictions() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Weapon getCurrentWeapon() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
