package X;

import java.util.Arrays;

/* renamed from: X.1vn  reason: invalid class name and case insensitive filesystem */
public final class C28931vn extends AnonymousClass48U {
    public final int A00;
    public final boolean A01;

    public C28931vn() {
        super((AnonymousClass19C) null);
        this.A01 = false;
        this.A00 = 3;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C28931vn)) {
            C28931vn r4 = (C28931vn) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.A01), Integer.valueOf(this.A00), C18180wK.A0X()});
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C28931vn(X.AnonymousClass19C r2, int r3, int r4, boolean r5) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x000a
            r5 = 0
        L_0x000a:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x000f
            r3 = 3
        L_0x000f:
            r1.<init>(r2)
            r1.A01 = r5
            r1.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28931vn.<init>(X.19C, int, int, boolean):void");
    }
}
