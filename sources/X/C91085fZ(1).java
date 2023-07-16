package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5fZ  reason: invalid class name and case insensitive filesystem */
public final class C91085fZ extends AnonymousClass5AD {
    public C127397h3 A00;
    public final Handler A01 = new C86814zA(Looper.getMainLooper(), this);
    public final AnonymousClass3HX A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91085fZ(X.AnonymousClass3HX r4, X.C127397h3 r5, int r6) {
        /*
            r3 = this;
            X.6e5 r2 = new X.6e5
            r2.<init>(r6)
            r1 = 2131297464(0x7f0904b8, float:1.8212874E38)
            android.util.SparseArray r0 = r4.A01
            r0.get(r1)
            r3.<init>(r2)
            r3.A02 = r4
            r3.A00 = r5
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.4zA r0 = new X.4zA
            r0.<init>(r1, r3)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91085fZ.<init>(X.3HX, X.7h3, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(M5O m5o) {
        C109326jp A0L;
        C127397h3 A06 = C127397h3.A06(((C108076hm) ((C88835Aw) m5o).A00).A01);
        if (A06 != null && A06.A03 == 13366 && (A0L = A06.A0L(38)) != null) {
            AnonymousClass794.A00();
            C86124wJ.A1E(this.A01, A0L, 0);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(M5O m5o) {
        C109326jp A0L;
        C127397h3 A06 = C127397h3.A06(((C108076hm) ((C88835Aw) m5o).A00).A01);
        if (A06 != null && A06.A03 == 13366 && (A0L = A06.A0L(40)) != null) {
            AnonymousClass794.A00();
            C86124wJ.A1E(this.A01, A0L, 0);
        }
    }
}
