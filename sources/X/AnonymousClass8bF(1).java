package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.8bF  reason: invalid class name */
public abstract class AnonymousClass8bF extends AnonymousClass7AM {
    public final Random A07() {
        if (this instanceof AnonymousClass8bD) {
            ThreadLocalRandom current = ThreadLocalRandom.current();
            C04220Ms.A06(current);
            return current;
        }
        Object obj = ((C141428bE) this).A00.get();
        C04220Ms.A06(obj);
        return (Random) obj;
    }
}
