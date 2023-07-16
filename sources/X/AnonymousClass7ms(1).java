package X;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7ms  reason: invalid class name */
public final class AnonymousClass7ms implements C145428kU {
    public final Context A00;
    public final Handler A01;
    public final C105106ct A02;
    public final C105106ct A03;
    public final AnonymousClass75H A04;
    public final Set A05;
    public final Set A06;
    public final Executor A07;
    public final AtomicBoolean A08;
    public final AtomicReference A09;
    public final C105116cu A0A;
    public final C143918hW A0B;
    public final AnonymousClass73O A0C;
    public final C142258eT A0D;
    public final File A0E;

    public final C1202579k AHO(List list) {
        return AnonymousClass6JE.A00(new AnonymousClass5r7(-5));
    }

    static {
        TimeUnit.SECONDS.toMillis(1);
    }

    public AnonymousClass7ms(Context context, C143918hW r10, AnonymousClass75H r11, File file) {
        if (AnonymousClass6D8.A00 == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass85I());
            AnonymousClass6D8.A00 = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = AnonymousClass6D8.A00;
        C105116cu r2 = new C105116cu(context);
        AnonymousClass73O r1 = AnonymousClass73O.A00;
        this.A01 = AnonymousClass0wJ.A0F();
        this.A09 = new AtomicReference();
        this.A05 = Collections.synchronizedSet(C18200wM.A0u());
        this.A06 = Collections.synchronizedSet(C18200wM.A0u());
        this.A08 = C18230wP.A0w();
        this.A00 = context;
        this.A0E = file;
        this.A04 = r11;
        this.A0B = r10;
        this.A07 = threadPoolExecutor2;
        this.A0A = r2;
        this.A0C = r1;
        this.A03 = new C105106ct();
        this.A02 = new C105106ct();
        this.A0D = AnonymousClass6BV.A02;
    }

    public final void Ca5(C148668re r3) {
        C105106ct r1 = this.A03;
        synchronized (r1) {
            r1.A00.add(r3);
        }
    }
}
