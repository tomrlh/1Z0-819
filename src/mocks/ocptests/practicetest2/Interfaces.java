package mocks.ocptests.practicetest2;

interface Plant {
    default String grow() {
        return "grow!";
    }
}

interface Living {
    public default String grow() {
        return "Super Growing!";
    }
}

public class Interfaces implements Plant, Living {
    public String grow() {
        // return super.Plant.grow(); // não compila
        return Plant.super.grow();
    }
}
