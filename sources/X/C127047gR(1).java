package X;

import android.content.Context;
import com.facebook.papaya.client.ICallback;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.facebook.redex.IDxTFactoryShape1S1000000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.7gR  reason: invalid class name and case insensitive filesystem */
public final class C127047gR implements C146428mE {
    public final C112836qH A00;
    public final C127007gN A01;
    public final C90685du A02;
    public final Executor A03 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new IDxTFactoryShape1S1000000_2_I2("com.facebook.papaya.api_run_thread", 3)));
    public final Executor A04 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new IDxTFactoryShape1S1000000_2_I2("com.facebook.papaya.api_stop_thread", 3)));

    public final void A6a(LogSink logSink, String str) {
        C90685du r1 = this.A02;
        synchronized (r1) {
            r1.A00.put(str, logSink);
        }
    }

    public final ListenableFuture CfM(PapayaRestrictions papayaRestrictions) {
        SettableFuture settableFuture = new SettableFuture();
        this.A03.execute(new AnonymousClass82I(this, papayaRestrictions, settableFuture));
        return settableFuture;
    }

    public final void CiY(ICallback iCallback) {
        C127007gN r1 = this.A01;
        synchronized (r1) {
            r1.A00 = iCallback;
        }
    }

    public final ListenableFuture Cvy() {
        SettableFuture settableFuture = new SettableFuture();
        this.A04.execute(new C1357980e(this, settableFuture));
        return settableFuture;
    }

    public final ListenableFuture CwR(C146148lj r4) {
        SettableFuture settableFuture = new SettableFuture();
        this.A03.execute(new AnonymousClass82H(r4, this, settableFuture));
        return settableFuture;
    }

    public final ListenableFuture D8A() {
        SettableFuture settableFuture = new SettableFuture();
        this.A04.execute(new C1358080f(this, settableFuture));
        return settableFuture;
    }

    public C127047gR(Context context, C110576lv r7) {
        C127007gN r4 = new C127007gN();
        this.A01 = r4;
        C90685du r3 = new C90685du();
        this.A02 = r3;
        this.A00 = new C112836qH(context, r4, r7, r3);
    }
}
