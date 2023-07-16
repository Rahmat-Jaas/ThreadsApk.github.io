package X;

import android.os.Bundle;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.7k4  reason: invalid class name and case insensitive filesystem */
public final class C128677k4 implements C145348kM {
    public final AnonymousClass066 A00;
    public final C880856r A01;
    public final AnonymousClass583 A02;
    public final C107266gT A03;
    public final AnonymousClass7Ic A04;
    public final C104996ci A05;
    public final Object A06;
    public final String A07;
    public final Queue A08;

    private void A00(C143698hA r13, Set set) {
        String str = this.A07;
        Object obj = this.A06;
        Bundle bundle = this.A03.A01;
        C120977Dl r2 = new C120977Dl(C116986xw.A00(r13, Collections.unmodifiableSet(set)), obj, str, C86134wK.A0n(bundle), bundle.getString("PAYMENT_OTC_SESSION_ID"), bundle.getString("PAYMENT_OTC_TYPE"), (String) null, C121257Ff.A00(bundle), Collections.unmodifiableSet(set));
        C86114wI.A1A(this.A00, C92975kL.A01(AnonymousClass7Kz.A09(), this.A05, r2).A03(), this.A01, HttpStatus.SC_RESET_CONTENT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A00 == 10) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bln(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r3 = r7 instanceof X.C1373588g
            if (r3 == 0) goto L_0x000d
            r0 = r7
            X.88g r0 = (X.C1373588g) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L_0x0034
        L_0x000d:
            boolean r0 = r7 instanceof X.C1373088b
            r2 = 0
            if (r0 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x0035
            r1 = r7
            X.88g r1 = (X.C1373588g) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L_0x0035
        L_0x0021:
            X.583 r0 = r6.A02
            r0.A01()
            X.56r r1 = r6.A01
            X.88b r0 = new X.88b
            r0.<init>(r7)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r2, r0)
        L_0x0031:
            r1.A0G(r0)
        L_0x0034:
            return
        L_0x0035:
            boolean r0 = r7 instanceof X.AnonymousClass5k9
            if (r0 == 0) goto L_0x0040
            X.56r r1 = r6.A01
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r2, r7)
            goto L_0x0031
        L_0x0040:
            java.util.Queue r5 = r6.A08
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0060
            r0 = 0
            X.7Dk[] r0 = new X.C120967Dk[r0]
            java.util.HashSet r3 = X.C18200wM.A0u()
            java.util.Collections.addAll(r3, r0)
            X.7HL r2 = X.AnonymousClass76O.A00()
            r1 = 1
            com.facebook.redex.IDxSCallbackShape852S0100000_2_I2 r0 = new com.facebook.redex.IDxSCallbackShape852S0100000_2_I2
            r0.<init>(r2, r1)
            r6.A00(r0, r3)
            return
        L_0x0060:
            X.7Ic r0 = r6.A04
            X.56r r1 = r6.A01
            java.lang.String r4 = r6.A07
            java.lang.Object r3 = r6.A06
            X.6gT r2 = r6.A03
            r0.A05(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128677k4.Bln(java.lang.Throwable):void");
    }

    public final void Blo(C108876j6 r7) {
        HashSet A0u;
        IDxSCallbackShape852S0100000_2_I2 iDxSCallbackShape852S0100000_2_I2;
        C120967Dk r1 = r7.A01;
        if (r1 != null) {
            A0u = C18200wM.A0u();
            Collections.addAll(A0u, new C120967Dk[]{r1});
            if ("BIO".equalsIgnoreCase(r1.A03)) {
                iDxSCallbackShape852S0100000_2_I2 = new IDxSCallbackShape852S0100000_2_I2(r7, 0);
            } else {
                iDxSCallbackShape852S0100000_2_I2 = new IDxSCallbackShape852S0100000_2_I2(AnonymousClass76O.A00(), 1);
            }
        } else {
            A0u = C18200wM.A0u();
            Collections.addAll(A0u, new C120967Dk[0]);
            iDxSCallbackShape852S0100000_2_I2 = new IDxSCallbackShape852S0100000_2_I2(AnonymousClass76O.A00(), 1);
        }
        A00(iDxSCallbackShape852S0100000_2_I2, A0u);
    }

    public C128677k4(AnonymousClass066 r1, C880856r r2, AnonymousClass583 r3, C107266gT r4, AnonymousClass7Ic r5, C104996ci r6, Object obj, String str, Queue queue) {
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A07 = str;
        this.A06 = obj;
        this.A03 = r4;
        this.A08 = queue;
    }
}
