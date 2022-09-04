package ru.job4j.tracker;

public class FindByIDAction implements UserAction {
    private final Output output;

    public FindByIDAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "FInd Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.println(item);
        } else {
            output.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
