package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6sb  reason: invalid class name and case insensitive filesystem */
public abstract class C114046sb {
    public final void A00() {
        WeakReference weakReference = ((AnonymousClass52R) this).A00;
        if (weakReference.get() != null && ((AnonymousClass586) weakReference.get()).A0I) {
            AnonymousClass586 r2 = (AnonymousClass586) weakReference.get();
            C880856r r1 = r2.A0D;
            if (r1 == null) {
                r1 = C880856r.A03();
                r2.A0D = r1;
            }
            AnonymousClass586.A00(r1, true);
        }
    }

    public final void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = ((AnonymousClass52R) this).A00;
        if (weakReference.get() != null && !((AnonymousClass586) weakReference.get()).A0J && ((AnonymousClass586) weakReference.get()).A0I) {
            AnonymousClass586 r2 = (AnonymousClass586) weakReference.get();
            C113496rW r1 = new C113496rW(i, charSequence);
            C880856r r0 = r2.A08;
            if (r0 == null) {
                r0 = C880856r.A03();
                r2.A08 = r0;
            }
            AnonymousClass586.A00(r0, r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if ((r1 & 32768) != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C106686fR r5) {
        /*
            r4 = this;
            r0 = r4
            X.52R r0 = (X.AnonymousClass52R) r0
            java.lang.ref.WeakReference r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r3.get()
            X.586 r0 = (X.AnonymousClass586) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x004a
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0037
            X.7Gy r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.586 r0 = (X.AnonymousClass586) r0
            int r1 = r0.A01()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L_0x0031
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            X.6fR r5 = new X.6fR
            r5.<init>(r2, r0)
        L_0x0037:
            java.lang.Object r1 = r3.get()
            X.586 r1 = (X.AnonymousClass586) r1
            X.56r r0 = r1.A0A
            if (r0 != 0) goto L_0x0047
            X.56r r0 = X.C880856r.A03()
            r1.A0A = r0
        L_0x0047:
            X.AnonymousClass586.A00(r0, r5)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114046sb.A02(X.6fR):void");
    }
}
