package X;

/* renamed from: X.7U9  reason: invalid class name */
public abstract class AnonymousClass7U9 implements C142668fO {
    public final float A00;
    public final C81784oM A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f5, code lost:
        if (r6 == null) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C142678fP CbD(X.C142738fV r12, X.C147188nY r13, int r14) {
        /*
            r11 = this;
            r3 = 0
            X.C04220Ms.A0B(r12, r3)
            r0 = 988743187(0x3aef0613, float:0.0018236063)
            r13.Cvb(r0)
            X.534 r0 = X.AnonymousClass6aA.A02
            r13.AEA(r0)
            r0 = -1524341038(0xffffffffa52466d2, float:-1.425957E-16)
            r13.Cvb(r0)
            X.4oM r6 = r11.A01
            long r4 = X.C86114wI.A0A(r6)
            long r1 = X.AnonymousClass7KE.A06
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            long r0 = X.C86114wI.A0A(r6)
        L_0x0025:
            X.7W3 r2 = X.AnonymousClass7W3.A04(r13, r3)
            X.7KE r0 = X.C86134wK.A0I(r0)
            X.4oM r7 = X.C115806vw.A01(r13, r0)
            r0 = -1629816343(0xffffffff9edaf9e9, float:-2.3185008E-20)
            r13.Cvb(r0)
            long r0 = X.AnonymousClass7KE.A01
            float r0 = X.C121657He.A00(r0)
            double r0 = (double) r0
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0077
            X.6uT r0 = X.AnonymousClass6aA.A00
        L_0x0046:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.4oM r8 = X.C115806vw.A01(r13, r0)
            boolean r10 = r11.A02
            float r9 = r11.A00
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r13.Cvb(r0)
            r0 = -1737891121(0xffffffff9869e2cf, float:-3.0229053E-24)
            r13.Cvb(r0)
            X.534 r0 = X.AnonymousClass7DA.A05
            java.lang.Object r5 = r13.AEA(r0)
        L_0x0063:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x009d
            r0 = r5
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0089
            X.C04220Ms.A06(r1)
            r5 = r1
            goto L_0x0063
        L_0x0077:
            X.6uT r0 = X.AnonymousClass6aA.A01
            goto L_0x0046
        L_0x007a:
            r0 = 2042140174(0x79b8960e, float:1.1980326E35)
            r13.Cvb(r0)
            long r0 = X.AnonymousClass7KE.A01
            X.C121657He.A00(r0)
            X.AnonymousClass7W3.A0z(r13, r3)
            goto L_0x0025
        L_0x0089:
            java.lang.String r0 = "Couldn't find a valid parent for "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r5)
            java.lang.String r0 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x009d:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            X.AnonymousClass7W3.A0w(r2, r3)
            r0 = 1643267286(0x61f244d6, float:5.5863403E20)
            r13.Cvb(r0)
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x00e3
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r13, r12, r11, r0)
            java.lang.Object r5 = r2.A13()
            if (r0 != 0) goto L_0x00bf
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r5 != r0) goto L_0x00c7
        L_0x00bf:
            X.52w r5 = new X.52w
            r5.<init>(r7, r8, r9, r10)
            r2.A14(r5)
        L_0x00c7:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.52w r5 = (X.C874752w) r5
            X.AnonymousClass7W3.A0w(r2, r3)
        L_0x00cf:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.7UC r5 = (X.AnonymousClass7UC) r5
            r4 = 0
            r1 = 18
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r12, (X.C146958n9) r4, (int) r1)
            X.AnonymousClass7K5.A03(r13, r5, r12, r0)
            X.AnonymousClass7W3.A0w(r2, r3)
            return r5
        L_0x00e3:
            X.AnonymousClass7W3.A0w(r2, r3)
            r4 = 0
            int r1 = r5.getChildCount()
        L_0x00eb:
            if (r4 >= r1) goto L_0x00f7
            android.view.View r6 = r5.getChildAt(r4)
            boolean r0 = r6 instanceof X.AnonymousClass50i
            if (r0 == 0) goto L_0x012b
            if (r6 != 0) goto L_0x0106
        L_0x00f7:
            android.content.Context r0 = r5.getContext()
            X.C04220Ms.A06(r0)
            X.50i r6 = new X.50i
            r6.<init>(r0)
            r5.addView(r6)
        L_0x0106:
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A10(r13, r12, r11, r0)
            boolean r0 = X.C147188nY.A12(r13, r6, r0)
            java.lang.Object r5 = r2.A13()
            if (r0 != 0) goto L_0x011b
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r5 != r0) goto L_0x0125
        L_0x011b:
            X.50i r6 = (X.AnonymousClass50i) r6
            X.52x r5 = new X.52x
            r5.<init>(r6, r7, r8, r9, r10)
            r2.A14(r5)
        L_0x0125:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.52x r5 = (X.AnonymousClass52x) r5
            goto L_0x00cf
        L_0x012b:
            int r4 = r4 + 1
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7U9.CbD(X.8fV, X.8nY, int):X.8fP");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7U9) {
                AnonymousClass7U9 r5 = (AnonymousClass7U9) obj;
                if (this.A02 != r5.A02 || !C18180wK.A1W(Float.compare(this.A00, r5.A00)) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C86104wH.A05(C86124wJ.A04(this.A02 ? 1 : 0) * 31, this.A00));
    }

    public AnonymousClass7U9(C81784oM r1, float f, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = r1;
    }
}
