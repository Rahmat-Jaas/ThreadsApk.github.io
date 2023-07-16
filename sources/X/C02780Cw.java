package X;

import android.os.ConditionVariable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Cw  reason: invalid class name and case insensitive filesystem */
public final class C02780Cw {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicLong A03 = new AtomicLong(-1);
}
