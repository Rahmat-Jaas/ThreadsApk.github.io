package X;

import com.facebook.redex.IDxTFactoryShape1S1000000_2_I2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6nH  reason: invalid class name and case insensitive filesystem */
public final class C111406nH {
    public final ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new IDxTFactoryShape1S1000000_2_I2(str, 2));
        C04220Ms.A06(newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }
}
