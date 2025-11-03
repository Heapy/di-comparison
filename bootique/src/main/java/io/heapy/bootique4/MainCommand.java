package io.heapy.bootique4;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class MainCommand implements Command {

    private final Provider<Service> serviceProvider;

    @Inject
    public MainCommand(Provider<Service> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public CommandOutcome run(Cli cli) {
        System.out.println(serviceProvider.get().doIt());
        return CommandOutcome.succeeded();
    }
}
