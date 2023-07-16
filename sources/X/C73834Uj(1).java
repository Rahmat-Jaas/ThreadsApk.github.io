package X;

import kotlin.Function;

/* renamed from: X.4Uj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73834Uj implements C04270Mx, C143158gC {
    public final /* synthetic */ C29511yH A00;

    public C73834Uj(C29511yH r1) {
        this.A00 = r1;
    }

    public final Function Ak7() {
        return new AnonymousClass019(1, this.A00, C29511yH.class, "onNextBadgeValue", "onNextBadgeValue(Ljava/lang/String;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C143158gC) || !(obj instanceof C04270Mx)) {
            return false;
        }
        return C04220Ms.A0I(Ak7(), ((C04270Mx) obj).Ak7());
    }

    public final int hashCode() {
        return Ak7().hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r1 = (X.C27091rx) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r0 = X.C18210wN.A0f(r5)
            X.1yH r1 = r4.A00
            r1.setBadgeValue(r0)
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x0026
            X.3GM r1 = r1.getViewModel()
            boolean r0 = r1 instanceof X.C27091rx
            if (r0 == 0) goto L_0x0026
            X.1rx r1 = (X.C27091rx) r1
            X.17J r3 = r1.A01
            if (r3 == 0) goto L_0x0026
            X.44a r2 = r1.A00
            X.25R r1 = r1.A01
            X.25P r0 = X.AnonymousClass25P.DOT
            r2.A02(r0, r1, r3)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73834Uj.onChanged(java.lang.Object):void");
    }
}
