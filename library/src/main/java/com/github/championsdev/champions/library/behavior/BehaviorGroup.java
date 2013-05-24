/*
This file is part of Champions.

    Champions is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Champions is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Champions.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.github.championsdev.champions.library.behavior;

import com.github.championsdev.champions.library.event.cplayer.*;
import com.github.championsdev.champions.library.event.skill.SkillUseEvent;
import com.github.championsdev.champions.library.event.weapon.WeaponClickEvent;
import com.github.championsdev.champions.library.event.weapon.WeaponEvent;
import com.github.championsdev.champions.library.event.weapon.WeaponHitEvent;

import java.util.ArrayList;

/**
 * @author B2OJustin
 */
public class BehaviorGroup extends Behavior {
    public ArrayList<Behavior> behaviors = new ArrayList<>();

    public BehaviorGroup attach(Behavior behavior) {
        behaviors.add(behavior);
        return this;
    }

    public BehaviorGroup attach(Behavior behavior, int priority) {
        if(priority > behaviors.size()) behaviors.add(behavior);
        else behaviors.add(priority, behavior);
        return this;
    }

    public BehaviorGroup detach(Behavior behavior) {
        behaviors.remove(behavior);
        return this;
    }

    public BehaviorGroup swap(Behavior oldBehavior, Behavior newBehavior) {
        int index = behaviors.indexOf(oldBehavior);
        if(index == -1) behaviors.add(newBehavior);
        else behaviors.add(index, newBehavior);
        return this;
    }

    @Override
    public void onQuit(CPlayerQuitEvent event) {
        for(Behavior behavior : behaviors) behavior.onQuit(event);
    }

    @Override
    public void onDeath(CPlayerDeathEvent event) {
        for(Behavior behavior : behaviors) behavior.onDeath(event);
    }

    @Override
    public void onPlayerKill(CPlayerKillEvent event) {
        for(Behavior behavior : behaviors) behavior.onPlayerKill(event);
    }

    @Override
    public void onMobKill(CPlayerMobKillEvent event) {
        for(Behavior behavior : behaviors) behavior.onMobKill(event);
    }

    @Override
    public void onJoin(CPlayerJoinEvent event) {
        for(Behavior behavior : behaviors) behavior.onJoin(event);
    }

    @Override
    public void onWeaponChange(CPlayerWeaponChangeEvent event) {
        for(Behavior behavior : behaviors) behavior.onWeaponChange(event);
    }

    @Override
    public void onLevelUp(CPlayerLevelUpEvent event) {
        for(Behavior behavior : behaviors) behavior.onLevelUp(event);
    }

    @Override
    public void onExpGain(CPlayerExpGainEvent event) {
        for(Behavior behavior : behaviors) behavior.onExpGain(event);
    }

    @Override
    public void onUse(SkillUseEvent event) {
        for(Behavior behavior : behaviors) behavior.onUse(event);
    }

    @Override
    public void onClick(WeaponClickEvent event) {
        for(Behavior behavior : behaviors) behavior.onClick(event);
    }

    @Override
    public void onHit(WeaponHitEvent event) {
        for(Behavior behavior : behaviors) behavior.onHit(event);
    }

    @Override
    public void onSelect(WeaponEvent event) {
        for(Behavior behavior : behaviors) behavior.onSelect(event);
    }
}
