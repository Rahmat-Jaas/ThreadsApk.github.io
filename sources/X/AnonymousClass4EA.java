package X;

import java.util.List;

/* renamed from: X.4EA  reason: invalid class name */
public final class AnonymousClass4EA implements C83654rl {
    public static final List A03 = C06750aI.A17(AnonymousClass2AP.A0E, AnonymousClass2AP.A0D, AnonymousClass2AP.A0W, AnonymousClass2AP.A0M, AnonymousClass2AP.A0O);
    public final int A00;
    public final AnonymousClass2AP A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4EA(X.AnonymousClass2AP r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            r2.<init>()
            r2.A01 = r3
            r1 = 47
            if (r3 == 0) goto L_0x0013
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = ""
        L_0x0015:
            java.lang.String r0 = X.AnonymousClass00U.A0N(r4, r0, r1)
            r2.A02 = r0
            if (r3 != 0) goto L_0x001f
            X.2AP r3 = X.AnonymousClass2AP.A0Q
        L_0x001f:
            int r0 = r3.A00
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EA.<init>(X.2AP, java.lang.String):void");
    }

    public final String AnX() {
        return this.A02;
    }

    public final int Ayj() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        AnonymousClass4EA r4;
        if (obj instanceof AnonymousClass4EA) {
            r4 = (AnonymousClass4EA) obj;
        } else {
            r4 = null;
        }
        if (r4 == null || !C04220Ms.A0I(r4.A02, this.A02) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        return this.A02;
    }
}
