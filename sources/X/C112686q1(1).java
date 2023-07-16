package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.6q1  reason: invalid class name and case insensitive filesystem */
public final class C112686q1 {
    public final C91285fx A00;
    public final Context A01;
    public final Resources A02;
    public volatile SettableFuture A03;

    public final synchronized void A00() {
        C91285fx r7;
        String A002;
        if (this.A03 == null) {
            this.A03 = new SettableFuture();
            try {
                r7 = this.A00;
                File AOC = r7.AOC((C109746kY) null, 2093722256);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Executor executor = AnonymousClass0FK.A07;
                Context context = this.A01;
                A002 = C28174Ezk.A00(623);
                A0v.add(new C03140Em(A002, A002));
                A0v.add(new AnonymousClass0QN("layouts.bin.xz", "layouts.bin"));
                AnonymousClass0SJ.A00(AOC);
                for (int i = 0; i < A0v.size(); i = C86124wJ.A0D(AOC, A0v, i)) {
                }
                new AnonymousClass0FK(context, AOC, "unpackLayoutBundle", A0v, executor).A03();
                this.A03.set(new C61663Ut(this.A02, C86154wM.A0U(AOC, "layouts.bin")));
            } catch (IOException e) {
                C86154wM.A0U(r7.AOC((C109746kY) null, 2093722256), A002).delete();
                throw C86154wM.A0h("Unable to initialize mBundledLayoutLoader", e);
            } catch (Throwable th) {
                this.A03.setException(th);
                throw th;
            }
        }
    }

    public C112686q1(Context context, Resources resources) {
        this.A01 = context;
        this.A00 = C91285fx.A00(context);
        this.A02 = resources;
    }
}
