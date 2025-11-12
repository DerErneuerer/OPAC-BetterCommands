package org.opnsoc.opac_better_commands.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import xaero.pac.common.server.parties.command.CommandRequirementProvider;

public class CommandRegister {
    public void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        CommandRequirementProvider commandRequirementProvider = new CommandRequirementProvider();
        new PartyChatCommand().register(dispatcher, commandRequirementProvider);
        new OpenClaimsCommand().register(dispatcher);
        new OpenPartiesCommand().register(dispatcher);
    }
}