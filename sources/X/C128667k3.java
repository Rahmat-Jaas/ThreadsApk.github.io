package X;

import java.util.Map;

/* renamed from: X.7k3  reason: invalid class name and case insensitive filesystem */
public final class C128667k3 implements C145348kM {
    public C107266gT A00;
    public C115406v0 A01;
    public final C880856r A02;
    public final AnonymousClass7Ic A03;
    public final C104996ci A04;
    public final Object A05;
    public final String A06;
    public final Map A07 = C18220wO.A0y();
    public final AnonymousClass583 A08;

    public final void Blo(C108876j6 r4) {
        C04220Ms.A0B(r4, 0);
        C120967Dk r0 = r4.A01;
        if (r0 != null) {
            String str = r0.A03;
            C115406v0 r02 = this.A01;
            if (r02 != null) {
                if (!C04220Ms.A0I(str, r02.A00)) {
                    throw C18180wK.A0a("Auth Ticket type and current in progress auth factor can not be different.");
                }
            }
            C04220Ms.A0E("inProgressAuthFactor");
            throw null;
        }
        Map map = this.A07;
        C115406v0 r03 = this.A01;
        if (r03 != null) {
            map.put(r03, r4);
            A00(r4);
            return;
        }
        C04220Ms.A0E("inProgressAuthFactor");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A00 == 10) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bln(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r2 = r5 instanceof X.C1373588g
            if (r2 == 0) goto L_0x000d
            r0 = r5
            X.88g r0 = (X.C1373588g) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L_0x0036
        L_0x000d:
            boolean r0 = r5 instanceof X.C1373088b
            r3 = 0
            if (r0 != 0) goto L_0x0021
            if (r2 == 0) goto L_0x0037
            r1 = r5
            X.88g r1 = (X.C1373588g) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L_0x0037
        L_0x0021:
            X.583 r0 = r4.A08
            r0.A01()
            X.56r r1 = r4.A02
            if (r5 == 0) goto L_0x0042
            X.88b r0 = new X.88b
            r0.<init>(r5)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r3, r0)
        L_0x0033:
            r1.A0G(r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r5 instanceof X.AnonymousClass5k9
            if (r0 == 0) goto L_0x0047
            X.56r r1 = r4.A02
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r3, r5)
            goto L_0x0033
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0047:
            X.6v0 r2 = r4.A01
            java.lang.String r0 = "inProgressAuthFactor"
            if (r2 != 0) goto L_0x0051
            X.C04220Ms.A0E(r0)
            throw r3
        L_0x0051:
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0060
            java.util.Map r0 = r4.A07
            r0.remove(r2)
        L_0x0060:
            r4.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128667k3.Bln(java.lang.Throwable):void");
    }

    public C128667k3(C880856r r2, AnonymousClass583 r3, AnonymousClass7Ic r4, C104996ci r5, Object obj, String str) {
        AnonymousClass0wJ.A1Q(r5, r3);
        C18230wP.A1R(str, 5, obj);
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r3;
        this.A02 = r2;
        this.A06 = str;
        this.A05 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r3 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C108876j6 r14) {
        /*
            r13 = this;
            java.util.LinkedHashSet r2 = X.C86134wK.A0u()
            java.util.Map r5 = r13.A07
            java.util.Iterator r4 = X.C86154wM.A0s(r5)
        L_0x000a:
            boolean r0 = r4.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x0025
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.6v0 r0 = (X.C115406v0) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "BIO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x000a
            r7 = 1
            if (r3 != 0) goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r5)
        L_0x002a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0076
            java.util.Map$Entry r0 = X.C18180wK.A0o(r5)
            java.lang.Object r4 = r0.getKey()
            X.6v0 r4 = (X.C115406v0) r4
            java.lang.Object r3 = r0.getValue()
            X.6j6 r3 = (X.C108876j6) r3
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x004d
            if (r7 == 0) goto L_0x004d
            goto L_0x002a
        L_0x004d:
            if (r3 != 0) goto L_0x006a
            X.7Ic r0 = r13.A03
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r6)
            r5.add(r4)
            X.56r r1 = r13.A02
            java.lang.String r4 = r13.A06
            java.lang.Object r3 = r13.A05
            X.6gT r2 = r13.A00
            if (r2 != 0) goto L_0x0072
            java.lang.String r0 = "inProgressAuthObject"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x006a:
            X.7Dk r0 = r3.A01
            if (r0 == 0) goto L_0x002a
            r2.add(r0)
            goto L_0x002a
        L_0x0072:
            r0.A05(r1, r2, r3, r4, r5)
            return
        L_0x0076:
            com.facebook.redex.IDxSCallbackShape308S0200000_2_I2 r3 = new com.facebook.redex.IDxSCallbackShape308S0200000_2_I2
            r3.<init>(r6, r14, r13)
            java.lang.String r6 = r13.A06
            java.lang.Object r5 = r13.A05
            X.6gT r0 = r13.A00
            java.lang.String r4 = "inProgressAuthObject"
            r10 = 0
            if (r0 == 0) goto L_0x00da
            android.os.Bundle r0 = r0.A01
            java.lang.String r7 = X.C86134wK.A0n(r0)
            X.6gT r0 = r13.A00
            if (r0 == 0) goto L_0x00da
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_SESSION_ID"
            java.lang.String r8 = r1.getString(r0)
            X.6gT r0 = r13.A00
            if (r0 == 0) goto L_0x00da
            android.os.Bundle r1 = r0.A01
            java.lang.String r0 = "PAYMENT_OTC_TYPE"
            java.lang.String r9 = r1.getString(r0)
            X.6gT r0 = r13.A00
            if (r0 == 0) goto L_0x00da
            android.os.Bundle r0 = r0.A01
            java.util.Map r11 = X.C121257Ff.A00(r0)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)
            X.6gi r4 = X.C116986xw.A00(r3, r0)
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r2)
            X.7Dl r3 = new X.7Dl
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.6ci r1 = r13.A04
            X.76O r0 = X.AnonymousClass7Kz.A09()
            X.79j r0 = X.C92975kL.A01(r0, r1, r3)
            X.M5J r1 = r0.A03()
            X.C04220Ms.A06(r1)
            r0 = 207(0xcf, float:2.9E-43)
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r13, r0)
            X.C121277Fh.A01(r10, r1, r0)
            return
        L_0x00da:
            X.C04220Ms.A0E(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128667k3.A00(X.6j6):void");
    }
}
