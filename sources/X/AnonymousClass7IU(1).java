package X;

import java.util.Map;

/* renamed from: X.7IU  reason: invalid class name */
public final class AnonymousClass7IU {
    public final C147138nS A00;
    public final AnonymousClass06B A01;
    public final C111686o9 A02;

    public final C62793ak A01(Class cls) {
        C04220Ms.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, AnonymousClass00U.A0L("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName));
        }
        throw C18190wL.A0a("Local and anonymous classes can not be ViewModels");
    }

    public final C62793ak A02(Class cls, String str) {
        C98386Fh r2;
        C04220Ms.A0B(str, 0);
        Map map = this.A01.A00;
        C62793ak r3 = (C62793ak) map.get(str);
        if (cls.isInstance(r3)) {
            C147138nS r22 = this.A00;
            if ((r22 instanceof C98386Fh) && (r2 = (C98386Fh) r22) != null) {
                C04220Ms.A0A(r3);
                if (r2 instanceof C884558d) {
                    C884558d r23 = (C884558d) r2;
                    C04220Ms.A0B(r3, 0);
                    AnonymousClass062 r1 = r23.A00;
                    if (r1 != null) {
                        AnonymousClass070 r0 = r23.A01;
                        C04220Ms.A0A(r0);
                        C116026wI.A00(r1, r3, r0);
                    }
                } else {
                    C884458c r24 = (C884458c) r2;
                    C04220Ms.A0B(r3, 0);
                    AnonymousClass070 r12 = r24.A01;
                    if (r12 != null) {
                        AnonymousClass062 r02 = r24.A00;
                        C04220Ms.A0A(r02);
                        C116026wI.A00(r02, r3, r12);
                    }
                }
            }
            C04220Ms.A0C(r3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        } else {
            C884758f r13 = new C884758f(this.A02);
            r13.A01(C124877bt.A01, str);
            try {
                r3 = this.A00.create(cls, r13);
            } catch (AbstractMethodError unused) {
                r3 = this.A00.create(cls);
            }
            C04220Ms.A0B(r3, 1);
            C62793ak r03 = (C62793ak) map.put(str, r3);
            if (r03 != null) {
                r03.onCleared();
                return r3;
            }
        }
        return r3;
    }

    public static AnonymousClass7IU A00(C147138nS r1, AnonymousClass06C r2) {
        return new AnonymousClass7IU(r1, r2);
    }

    public AnonymousClass7IU(C147138nS r2, AnonymousClass06B r3, C111686o9 r4) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7IU(X.AnonymousClass06C r4) {
        /*
            r3 = this;
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            X.06B r2 = r4.getViewModelStore()
            boolean r0 = r4 instanceof X.C012605w
            if (r0 == 0) goto L_0x001a
            X.05w r4 = (X.C012605w) r4
            X.8nS r0 = r4.getDefaultViewModelProviderFactory()
            X.6o9 r1 = r4.getDefaultViewModelCreationExtras()
        L_0x0016:
            r3.<init>(r0, r2, r1)
            return
        L_0x001a:
            X.7bt r0 = X.C124877bt.A00
            if (r0 != 0) goto L_0x0025
            X.7bt r0 = new X.7bt
            r0.<init>()
            X.C124877bt.A00 = r0
        L_0x0025:
            X.C04220Ms.A0A(r0)
            X.58e r1 = X.C884658e.A00
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IU.<init>(X.06C):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7IU(X.C147138nS r3, X.AnonymousClass06C r4) {
        /*
            r2 = this;
            X.AnonymousClass0wJ.A1O(r4, r3)
            X.06B r1 = r4.getViewModelStore()
            boolean r0 = r4 instanceof X.C012605w
            if (r0 == 0) goto L_0x0015
            X.05w r4 = (X.C012605w) r4
            X.6o9 r0 = r4.getDefaultViewModelCreationExtras()
        L_0x0011:
            r2.<init>(r3, r1, r0)
            return
        L_0x0015:
            X.58e r0 = X.C884658e.A00
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IU.<init>(X.8nS, X.06C):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass7IU(C147138nS r2, AnonymousClass06B r3) {
        this(r2, r3, C884658e.A00);
        AnonymousClass0wJ.A1O(r3, r2);
    }
}
