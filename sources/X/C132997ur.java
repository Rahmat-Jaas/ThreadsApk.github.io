package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7ur  reason: invalid class name and case insensitive filesystem */
public final class C132997ur implements C83484rS {
    public final C1202879o A00;
    public final C146208lp A01;
    public final C146208lp A02;
    public final Executor A03;

    public final void CwT(C12140lP r5) {
        this.A03.execute(new C1364982y(r5, this, this.A01, false));
    }

    public final void CwU(C12140lP r5) {
        this.A03.execute(new C1364982y(r5, this, this.A02, false));
    }

    public C132997ur(C1202879o r2, C146208lp r3, C146208lp r4) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = newSingleThreadExecutor;
    }
}
