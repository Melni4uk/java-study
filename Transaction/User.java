package Transaction;

import java.util.UUID;

public class User {
    public UUID getId(){
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
