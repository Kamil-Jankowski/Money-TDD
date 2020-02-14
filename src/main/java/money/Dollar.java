package money;

import java.util.Objects;

class Dollar {

    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }

}
