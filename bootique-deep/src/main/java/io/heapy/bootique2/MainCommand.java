package io.heapy.bootique2;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import io.heapy.sample.common2.Service;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainCommand implements Command {

    private final Provider<Service> serviceProvider;

    @Inject
    public MainCommand(Provider<Service> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public CommandOutcome run(Cli cli) {
        System.out.println(serviceProvider.get().name());
        return CommandOutcome.succeeded();
    }
}
