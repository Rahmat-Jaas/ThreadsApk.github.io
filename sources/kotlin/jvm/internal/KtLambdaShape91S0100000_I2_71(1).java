package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape91S0100000_I2_71 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape91S0100000_I2_71(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.1ZT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.1ZU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.1ZT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.1ZT} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r1 = r4.mArguments;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r2 = r1.getString("ARGUMENT_PRODUCT_ELIGIBILITY");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r1 = r4.mArguments;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r1 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        r0 = (com.instagram.api.schemas.IGRevShareProductType) r1.getParcelable("ARGUMENT_PRODUCT_TYPE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (r0 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        return new X.C66493xh(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0238, code lost:
        return X.C63803iN.A05(r2, r3, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0227;
                case 1: goto L_0x0215;
                case 2: goto L_0x0207;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01eb;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01cf;
                case 7: goto L_0x01c1;
                case 8: goto L_0x01b7;
                case 9: goto L_0x01ad;
                case 10: goto L_0x0239;
                case 11: goto L_0x0021;
                case 12: goto L_0x01aa;
                case 13: goto L_0x01a1;
                case 14: goto L_0x0005;
                case 15: goto L_0x0189;
                case 16: goto L_0x0179;
                case 17: goto L_0x01aa;
                case 18: goto L_0x01a1;
                case 19: goto L_0x0005;
                case 20: goto L_0x0154;
                case 21: goto L_0x0145;
                case 22: goto L_0x000e;
                case 23: goto L_0x000e;
                case 24: goto L_0x000e;
                case 25: goto L_0x0127;
                case 26: goto L_0x01aa;
                case 27: goto L_0x01a1;
                case 28: goto L_0x0005;
                case 29: goto L_0x000e;
                case 30: goto L_0x01aa;
                case 31: goto L_0x01a1;
                case 32: goto L_0x0005;
                case 33: goto L_0x00fc;
                case 34: goto L_0x00d7;
                case 35: goto L_0x01aa;
                case 36: goto L_0x01a1;
                case 37: goto L_0x0005;
                case 38: goto L_0x00ac;
                case 39: goto L_0x0087;
                case 40: goto L_0x01aa;
                case 41: goto L_0x01a1;
                case 42: goto L_0x0005;
                case 43: goto L_0x007c;
                case 44: goto L_0x006c;
                case 45: goto L_0x01aa;
                case 46: goto L_0x01a1;
                case 47: goto L_0x0005;
                case 48: goto L_0x0041;
                case 49: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r5 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r5
        L_0x000e:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            if (r5 != 0) goto L_0x000d
        L_0x001e:
            com.instagram.api.schemas.IGRevShareProductType r5 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            return r5
        L_0x0021:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r5 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            java.io.Serializable r1 = r1.getSerializable(r0)
        L_0x0030:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x0035:
            r1 = r5
            goto L_0x0030
        L_0x0037:
            java.lang.Object r0 = r7.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.35b r5 = new X.35b
            r5.<init>(r0)
            return r5
        L_0x0041:
            java.lang.Object r5 = r7.A00
            X.1a7 r5 = (X.AnonymousClass1a7) r5
            X.0Oa r0 = r5.A01
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            android.os.Bundle r1 = r5.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r2 = (com.instagram.api.schemas.IGRevShareProductType) r2
            if (r2 != 0) goto L_0x005c
        L_0x005a:
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x005c:
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r3 = r1.getString(r0)
        L_0x0066:
            X.3xj r5 = new X.3xj
            r5.<init>(r2, r4, r3)
            return r5
        L_0x006c:
            java.lang.Object r0 = r7.A00
            X.1a7 r0 = (X.AnonymousClass1a7) r0
            X.0Oa r0 = r0.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.CDB r5 = new X.CDB
            r5.<init>(r0)
            return r5
        L_0x007c:
            java.lang.Object r4 = r7.A00
            X.1ZU r4 = (X.AnonymousClass1ZU) r4
            X.0Oa r0 = r4.A01
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
            goto L_0x00b6
        L_0x0087:
            java.lang.Object r4 = r7.A00
            X.1ZU r4 = (X.AnonymousClass1ZU) r4
            X.0Oa r3 = r4.A01
            r3.getValue()
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 31792201(0x1e51c49, float:8.41619E-38)
            java.lang.String r0 = "blocked_category"
            X.9K7 r5 = new X.9K7
            r5.<init>(r2, r0, r1)
            android.content.Context r1 = r4.requireContext()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r3)
            X.KK7 r0 = X.KK7.A00(r0)
            r5.A0L(r1, r0, r4)
            return r5
        L_0x00ac:
            java.lang.Object r4 = r7.A00
            X.1ZT r4 = (X.AnonymousClass1ZT) r4
            X.0Oa r0 = r4.A01
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
        L_0x00b6:
            android.os.Bundle r1 = r4.mArguments
            r2 = 0
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r2 = r1.getString(r0)
        L_0x00c1:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r0 = (com.instagram.api.schemas.IGRevShareProductType) r0
            if (r0 != 0) goto L_0x00d1
        L_0x00cf:
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x00d1:
            X.3xh r5 = new X.3xh
            r5.<init>(r0, r3, r2)
            return r5
        L_0x00d7:
            java.lang.Object r4 = r7.A00
            X.1ZT r4 = (X.AnonymousClass1ZT) r4
            X.0Oa r3 = r4.A01
            r3.getValue()
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 31792201(0x1e51c49, float:8.41619E-38)
            java.lang.String r0 = "blocked_category"
            X.9K7 r5 = new X.9K7
            r5.<init>(r2, r0, r1)
            android.content.Context r1 = r4.requireContext()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r3)
            X.KK7 r0 = X.KK7.A00(r0)
            r5.A0L(r1, r0, r4)
            return r5
        L_0x00fc:
            java.lang.Object r5 = r7.A00
            X.CRz r5 = (X.C22281CRz) r5
            X.0Oa r0 = r5.A04
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            android.os.Bundle r1 = r5.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x0115
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r2 = (com.instagram.api.schemas.IGRevShareProductType) r2
            if (r2 != 0) goto L_0x0117
        L_0x0115:
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x0117:
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0121
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r3 = r1.getString(r0)
        L_0x0121:
            X.3xi r5 = new X.3xi
            r5.<init>(r2, r4, r3)
            return r5
        L_0x0127:
            java.lang.Object r0 = r7.A00
            X.5xM r0 = (X.AnonymousClass5xM) r0
            com.instagram.service.session.UserSession r2 = r0.A09()
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x013d
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.api.schemas.IGRevShareProductType r0 = (com.instagram.api.schemas.IGRevShareProductType) r0
            if (r0 != 0) goto L_0x013f
        L_0x013d:
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
        L_0x013f:
            X.3xU r5 = new X.3xU
            r5.<init>(r0, r2)
            return r5
        L_0x0145:
            java.lang.Object r0 = r7.A00
            X.CS3 r0 = (X.CS3) r0
            X.0Oa r0 = r0.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.7tJ r5 = X.C25584DoK.A02(r0)
            return r5
        L_0x0154:
            java.lang.Object r4 = r7.A00
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x0177
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            java.lang.String r0 = r1.getString(r0)
        L_0x0163:
            com.instagram.api.schemas.UserMonetizationProductType r2 = X.AnonymousClass2FJ.A00(r0)
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x0171
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            java.lang.String r3 = r1.getString(r0)
        L_0x0171:
            X.3xT r5 = new X.3xT
            r5.<init>(r2, r3)
            return r5
        L_0x0177:
            r0 = r3
            goto L_0x0163
        L_0x0179:
            java.lang.Object r0 = r7.A00
            X.1ZG r0 = (X.AnonymousClass1ZG) r0
            X.0Oa r0 = r0.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.CDB r5 = new X.CDB
            r5.<init>(r0)
            return r5
        L_0x0189:
            java.lang.Object r2 = r7.A00
            X.1bQ r2 = (X.AnonymousClass1bQ) r2
            X.0Oa r0 = r2.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r2.A00
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.3xg r5 = new X.3xg
            r5.<init>(r1, r0)
            return r5
        L_0x01a1:
            java.lang.Object r0 = r7.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r1 = r0.invoke()
            return r1
        L_0x01aa:
            java.lang.Object r1 = r7.A00
            return r1
        L_0x01ad:
            java.lang.Object r0 = r7.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.3Y0 r5 = new X.3Y0
            r5.<init>(r0)
            return r5
        L_0x01b7:
            java.lang.Object r0 = r7.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.3AU r5 = new X.3AU
            r5.<init>(r0)
            return r5
        L_0x01c1:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324217756459373(0x810caf001e216d, double:3.0349198028451405E-306)
            goto L_0x0234
        L_0x01cf:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324217756983669(0x810caf00262175, double:3.0349198031767074E-306)
            goto L_0x0234
        L_0x01dd:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167226971070843(0x20810caf002c217b, double:4.069162180710667E-152)
            goto L_0x0234
        L_0x01eb:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167226970939769(0x20810caf002a2179, double:4.069162180599528E-152)
            goto L_0x0234
        L_0x01f9:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324217757180280(0x810caf00292178, double:3.034919803301045E-306)
            goto L_0x0234
        L_0x0207:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167226971005306(0x20810caf002b217a, double:4.0691621806550974E-152)
            goto L_0x0234
        L_0x0215:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36605692731593162(0x820caf000611ca, double:3.2129257105284996E-306)
            java.lang.Long r5 = X.C63803iN.A07(r2, r3, r0)
            return r5
        L_0x0227:
            java.lang.Object r0 = r7.A00
            X.7EN r0 = (X.AnonymousClass7EN) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167226970612084(0x20810caf00252174, double:4.0691621803216785E-152)
        L_0x0234:
            java.lang.Boolean r5 = X.C63803iN.A05(r2, r3, r0)
            return r5
        L_0x0239:
            X.0gi r1 = X.C09820gj.A00
            X.0gW r0 = X.AnonymousClass0gN.A00()
            X.0kf r2 = new X.0kf
            r2.<init>(r1, r0)
            r3 = 232754083(0xddf8ba3, float:1.3777052E-30)
            r4 = 2
            r5 = 0
            r6 = 1
            X.0gV r1 = new X.0gV
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r0 = r7.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.75J r5 = new X.75J
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71.invoke():java.lang.Object");
    }
}
