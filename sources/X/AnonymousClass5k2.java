package X;

import android.util.SparseArray;

/* renamed from: X.5k2  reason: invalid class name */
public final class AnonymousClass5k2 extends C1202479j {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ C145368kO A02;
    public final /* synthetic */ C107346gb A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5k2(SparseArray sparseArray, C145368kO r2, C107346gb r3, C104996ci r4, int i) {
        super(r4);
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A01 = sparseArray;
    }

    public final C145388kQ A04(C113806sA r4) {
        int i = this.A00;
        C145368kO r1 = this.A02;
        SparseArray sparseArray = this.A01;
        if (i == 0) {
            return r1.Ch4(sparseArray, r4);
        }
        return r1.Cc3(sparseArray, r4);
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r3) {
        Object obj;
        Throwable th = r3.A02;
        if (th != null || (obj = r3.A01) == null) {
            th.getClass();
            return AnonymousClass7Kx.A0C(th);
        }
        C1373788i r0 = ((C107336ga) obj).A00;
        if (r0 == null) {
            return AnonymousClass7Kx.A0A(obj);
        }
        return AnonymousClass7Kx.A0B(obj, r0);
    }
}
