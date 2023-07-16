package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55m  reason: invalid class name and case insensitive filesystem */
public final class C879555m extends AnonymousClass03I implements C84464tB, C004402a {
    public Integer A00;
    public int A01;
    public boolean A02;
    public final WeakReference A03;
    public final HashSet A04 = C18200wM.A0u();

    public C879555m(View view, boolean z) {
        super(1);
        WeakReference weakReference;
        if (z) {
            weakReference = C86144wL.A0w(view);
        } else {
            weakReference = null;
        }
        this.A03 = weakReference;
        AnonymousClass03O.A01(view, this);
        C006002r.A00(view, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass03O r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r1 = r4.A00
            if (r1 != 0) goto L_0x0033
            java.lang.ref.WeakReference r0 = r4.A03
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0053
            X.03Y r1 = X.C006102s.A00(r0)
            if (r1 == 0) goto L_0x0053
            r0 = 8
            X.03V r2 = r1.A00
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x0051
            int r1 = A00(r1)
        L_0x0025:
            r0 = 2
            X.01T r0 = r2.A05(r0)
            int r0 = r0.A00
            int r1 = r1 + r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0053
        L_0x0033:
            int r0 = r4.A01
            int r2 = r1.intValue()
            if (r2 == r0) goto L_0x0053
            java.util.HashSet r0 = r4.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.8ir r0 = (X.C144658ir) r0
            r0.C46(r2, r3)
            goto L_0x0041
        L_0x0051:
            r1 = 0
            goto L_0x0025
        L_0x0053:
            r4.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879555m.A03(X.03O):void");
    }

    public final void A04(AnonymousClass03O r2) {
        this.A02 = true;
    }

    public final void A6s(C144658ir r2) {
        C04220Ms.A0B(r2, 0);
        this.A04.add(r2);
    }

    public final AnonymousClass03Y Bky(View view, AnonymousClass03Y r6) {
        C04220Ms.A0B(r6, 1);
        int A002 = A00(r6);
        this.A00 = Integer.valueOf(A002);
        if (!this.A02) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((C144658ir) it.next()).C46(A002, false);
            }
            this.A01 = A002;
        }
        return r6;
    }

    public final void CLs(Activity activity) {
    }

    public final void onStop() {
    }

    public static final int A00(AnonymousClass03Y r2) {
        AnonymousClass03V r22 = r2.A00;
        int i = r22.A05(8).A00 - r22.A05(2).A00;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final void Cc8(C144658ir r2) {
        this.A04.remove(r2);
    }

    public final AnonymousClass03Y A02(AnonymousClass03Y r5, List list) {
        boolean A1V = C18210wN.A1V(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((((AnonymousClass03O) next).A00.A06() & 8) != 0) {
                if (next != null) {
                    int A002 = A00(r5);
                    Iterator it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        ((C144658ir) it2.next()).C46(A002, A1V);
                    }
                    this.A01 = A002;
                }
            }
        }
        return r5;
    }
}
