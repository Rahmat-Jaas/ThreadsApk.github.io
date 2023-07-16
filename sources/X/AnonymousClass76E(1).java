package X;

import android.content.Context;
import com.facebook.redex.IDxProviderShape853S0100000_2_I2;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.76E  reason: invalid class name */
public final class AnonymousClass76E {
    public static final ThreadFactory A03 = AnonymousClass85R.A00;
    public C143998hf A00;
    public final Set A01;
    public final Executor A02;

    public AnonymousClass76E(Context context, Set set) {
        AnonymousClass7oM r0 = new AnonymousClass7oM(new IDxProviderShape853S0100000_2_I2(context, 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), A03);
        this.A00 = r0;
        this.A01 = set;
        this.A02 = threadPoolExecutor;
    }
}
