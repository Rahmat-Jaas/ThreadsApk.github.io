package X;

import com.facebook.papaya.store.Callback;
import com.facebook.redex.IDxFunctionShape362S0100000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.6Ba  reason: invalid class name and case insensitive filesystem */
public enum C97356Ba implements Executor {
    ;

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    /* access modifiers changed from: public */
    C97356Ba() {
    }

    public static ListenableFuture A00(Callback callback) {
        return C34497IYj.A00(new IDxFunctionShape362S0100000_2_I2(callback, 3), callback.mFuture, A01);
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
