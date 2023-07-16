package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape68S0100000_I2_48 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape68S0100000_I2_48(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0330, code lost:
        r2 = X.C63803iN.A0C(X.AnonymousClass0TJ.A05, r3, 36878805407039661L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0340, code lost:
        if (r2.length() != 0) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0344, code lost:
        return X.AnonymousClass84Y.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0350, code lost:
        return new java.util.HashSet(X.C81074n3.A07(r2, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0400, code lost:
        r1 = X.C18170wI.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0408, code lost:
        if (r2.containsKey(r1) == false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x040e, code lost:
        return X.C18210wN.A0Q(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x040f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0005;
                case 2: goto L_0x0028;
                case 3: goto L_0x0043;
                case 4: goto L_0x004d;
                case 5: goto L_0x005f;
                case 6: goto L_0x0069;
                case 7: goto L_0x0073;
                case 8: goto L_0x007d;
                case 9: goto L_0x00ab;
                case 10: goto L_0x00c1;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00e8;
                case 13: goto L_0x00fe;
                case 14: goto L_0x0110;
                case 15: goto L_0x0122;
                case 16: goto L_0x0138;
                case 17: goto L_0x014a;
                case 18: goto L_0x0160;
                case 19: goto L_0x0172;
                case 20: goto L_0x0187;
                case 21: goto L_0x019d;
                case 22: goto L_0x01af;
                case 23: goto L_0x01c5;
                case 24: goto L_0x01da;
                case 25: goto L_0x0261;
                case 26: goto L_0x02e3;
                case 27: goto L_0x02ef;
                case 28: goto L_0x02ff;
                case 29: goto L_0x0306;
                case 30: goto L_0x0318;
                case 31: goto L_0x032a;
                case 32: goto L_0x0351;
                case 33: goto L_0x0363;
                case 34: goto L_0x0375;
                case 35: goto L_0x0388;
                case 36: goto L_0x0392;
                case 37: goto L_0x039c;
                case 38: goto L_0x000e;
                case 39: goto L_0x03aa;
                case 40: goto L_0x03bd;
                case 41: goto L_0x03c6;
                case 42: goto L_0x03d5;
                case 43: goto L_0x03e4;
                case 44: goto L_0x03f5;
                case 45: goto L_0x0021;
                case 46: goto L_0x0005;
                case 47: goto L_0x03f8;
                case 48: goto L_0x0411;
                case 49: goto L_0x043b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r2 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r2
        L_0x000e:
            X.GVD r1 = X.C25745DrH.A00
            java.lang.Object r0 = r13.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.DrH r2 = r1.A01(r0)
            if (r2 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0021:
            java.lang.Object r0 = r13.A00
            java.lang.Object r2 = X.C86144wL.A0j(r0)
            return r2
        L_0x0028:
            java.lang.Object r2 = r13.A00
            X.1YZ r2 = (X.AnonymousClass1YZ) r2
            X.0Oa r0 = r2.A03
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            android.app.Application r0 = r0.getApplication()
            X.C04220Ms.A06(r0)
            X.3xR r2 = new X.3xR
            r2.<init>(r0, r1)
            return r2
        L_0x0043:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.6pj r2 = new X.6pj
            r2.<init>(r0)
            return r2
        L_0x004d:
            java.lang.Object r0 = r13.A00
            X.6pj r0 = (X.C112516pj) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318625707070111(0x8107990000129f, double:3.031383368293996E-306)
            java.lang.Boolean r2 = X.C63803iN.A05(r2, r3, r0)
            return r2
        L_0x005f:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.AYd r2 = new X.AYd
            r2.<init>(r0)
            return r2
        L_0x0069:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tT r2 = new X.7tT
            r2.<init>(r0)
            return r2
        L_0x0073:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.3AA r2 = new X.3AA
            r2.<init>(r0)
            return r2
        L_0x007d:
            java.lang.Object r3 = r13.A00
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            boolean r0 = X.AnonymousClass7JZ.A03(r3)
            if (r0 == 0) goto L_0x008f
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x0089:
            X.76B r2 = new X.76B
            r2.<init>(r0)
            return r2
        L_0x008f:
            boolean r0 = X.AnonymousClass7JZ.A01(r3)
            if (r0 != 0) goto L_0x00a5
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311942738412323(0x81018500070323, double:3.027157032004656E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x0089
        L_0x00a5:
            X.76B r2 = new X.76B
            r2.<init>()
            return r2
        L_0x00ab:
            java.lang.Object r0 = r13.A00
            X.6mE r0 = (X.C110766mE) r0
            com.instagram.service.session.UserSession r3 = r0.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945340132356(0x82068c00270c04, double:3.208658632999121E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x00c1:
            java.lang.Object r0 = r13.A00
            X.6mE r0 = (X.C110766mE) r0
            com.instagram.service.session.UserSession r3 = r0.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945340197893(0x82068c00280c05, double:3.208658633040567E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x00d3:
            java.lang.Object r3 = r13.A00
            X.6mE r3 = (X.C110766mE) r3
            com.instagram.service.session.UserSession r0 = r3.A02
            X.49q r2 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r1 = X.D2R.A0y
            java.lang.Class r0 = r3.getClass()
            android.content.SharedPreferences r2 = r2.A02(r1, r0)
            return r2
        L_0x00e8:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339018237(0x82068c00160bfd, double:3.208658632294548E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x00fe:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339083774(0x82068c00170bfe, double:3.208658632335994E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x0110:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339149311(0x82068c00180bff, double:3.2086586323774396E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x0122:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339214848(0x82068c00190c00, double:3.2086586324188855E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0138:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339280385(0x82068c001a0c01, double:3.2086586324603313E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x014a:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339476994(0x82068c001d0c02, double:3.2086586325846677E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0160:
            java.lang.Object r0 = r13.A00
            X.6sX r0 = (X.C114006sX) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945339542531(0x82068c001e0c03, double:3.2086586326261135E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x0172:
            java.lang.Object r3 = r13.A00
            X.6sX r3 = (X.C114006sX) r3
            com.instagram.service.session.UserSession r0 = r3.A01
            X.49q r2 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r1 = X.D2R.A0y
            java.lang.Class r0 = r3.getClass()
            android.content.SharedPreferences r2 = r2.A02(r1, r0)
            return r2
        L_0x0187:
            java.lang.Object r0 = r13.A00
            X.6ql r0 = (X.C113116ql) r0
            com.instagram.service.session.UserSession r3 = r0.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945338952700(0x82068c00150bfc, double:3.208658632253102E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x019d:
            java.lang.Object r0 = r13.A00
            X.6ql r0 = (X.C113116ql) r0
            com.instagram.service.session.UserSession r3 = r0.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945338297339(0x82068c000b0bfb, double:3.208658631838649E-306)
            java.lang.Long r2 = X.C63803iN.A07(r2, r3, r0)
            return r2
        L_0x01af:
            java.lang.Object r0 = r13.A00
            X.6ql r0 = (X.C113116ql) r0
            com.instagram.service.session.UserSession r3 = r0.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36598945338231802(0x82068c000a0bfa, double:3.208658631797203E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01c5:
            java.lang.Object r3 = r13.A00
            X.6ql r3 = (X.C113116ql) r3
            com.instagram.service.session.UserSession r0 = r3.A06
            X.49q r2 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r1 = X.D2R.A0y
            java.lang.Class r0 = r3.getClass()
            android.content.SharedPreferences r2 = r2.A02(r1, r0)
            return r2
        L_0x01da:
            java.lang.Object r6 = r13.A00
            X.5ix r6 = (X.C92625ix) r6
            java.util.List r10 = X.C92625ix.A00(r6)
            java.lang.String r7 = ","
            r8 = 0
            r2 = 0
            r12 = 62
            r9 = r8
            r11 = r8
            java.lang.String r1 = X.AnonymousClass00J.A0H(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "moduleList"
            kotlin.Pair r5 = X.C18180wK.A0p(r0, r1)
            java.util.List r0 = X.C92625ix.A00(r6)
            java.util.Iterator r3 = r0.iterator()
        L_0x01fc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = "in_app_browser_v2"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0211
            goto L_0x01fc
        L_0x020f:
            java.lang.String r1 = ""
        L_0x0211:
            java.lang.String r0 = "srcModule:"
            kotlin.Pair r4 = X.C18180wK.A0p(r0, r1)
            java.util.List r0 = X.C92625ix.A00(r6)
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x025e
            java.util.List r0 = X.C92625ix.A00(r6)
            java.lang.Object r1 = r0.get(r2)
        L_0x0229:
            java.lang.String r0 = "lastModuleName"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A09
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "currentTab"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A0A
            java.lang.Object r0 = r0.getValue()
            X.753 r0 = (X.AnonymousClass753) r0
            android.os.Bundle r1 = r0.A00
            r0 = 84
            java.lang.String r0 = X.I17.A00(r0)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "rawClickSource"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r5, r4, r3, r2, r0}
            java.util.Map r2 = X.AnonymousClass4WJ.A0H(r0)
            return r2
        L_0x025e:
            java.lang.String r1 = ""
            goto L_0x0229
        L_0x0261:
            java.lang.Object r2 = r13.A00
            X.5ix r2 = (X.C92625ix) r2
            java.lang.String r0 = r2.A03()
            if (r0 == 0) goto L_0x026e
            java.lang.String r2 = "ad_click"
            return r2
        L_0x026e:
            X.8mf r0 = r2.A00
            java.util.Set r4 = r0.ATW()
            java.util.List r0 = X.C92625ix.A00(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x027c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x028f
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = "in_app_browser_v2"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0291
            goto L_0x027c
        L_0x028f:
            java.lang.String r1 = ""
        L_0x0291:
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x02c5
            X.8mf r0 = r2.A00
            java.util.Set r1 = r0.ATW()
            java.util.List r0 = X.C92625ix.A00(r2)
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x02c8
            java.util.List r0 = X.C92625ix.A00(r2)
            java.lang.Object r0 = X.C18240wQ.A0b(r0)
        L_0x02af:
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x02c5
            X.0Oa r0 = r2.A09
            java.lang.String r1 = X.C18200wM.A0q(r0)
            java.lang.String r0 = "SHOPPING"
            if (r1 == 0) goto L_0x02cb
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02cb
        L_0x02c5:
            java.lang.String r2 = "shops"
            return r2
        L_0x02c8:
            java.lang.String r0 = ""
            goto L_0x02af
        L_0x02cb:
            X.0Oa r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            X.753 r0 = (X.AnonymousClass753) r0
            android.os.Bundle r1 = r0.A00
            r0 = 84
            java.lang.String r0 = X.I17.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            X.C04220Ms.A06(r2)
            return r2
        L_0x02e3:
            java.lang.Object r0 = r13.A00
            X.5ix r0 = (X.C92625ix) r0
            com.instagram.service.session.UserSession r0 = r0.A04
            X.KK7.A00(r0)
            java.lang.String r2 = ""
            return r2
        L_0x02ef:
            java.lang.Object r0 = r13.A00
            X.5ix r0 = (X.C92625ix) r0
            X.L3B r0 = r0.A00
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            android.os.Bundle r0 = r0.A0B
            X.753 r2 = new X.753
            r2.<init>(r0)
            return r2
        L_0x02ff:
            java.lang.Object r0 = r13.A00
            X.7jl r0 = (X.C128537jl) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            goto L_0x0330
        L_0x0306:
            java.lang.Object r0 = r13.A00
            X.7jl r0 = (X.C128537jl) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878805406777516(0x830514000300ac, double:3.385643266051557E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            return r2
        L_0x0318:
            java.lang.Object r0 = r13.A00
            X.7jl r0 = (X.C128537jl) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878805407105198(0x830514000800ae, double:3.385643266258784E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            return r2
        L_0x032a:
            java.lang.Object r0 = r13.A00
            X.7jm r0 = (X.C128547jm) r0
            com.instagram.service.session.UserSession r3 = r0.A01
        L_0x0330:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878805407039661(0x830514000700ad, double:3.3856432662173383E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto L_0x0345
            X.84Y r2 = X.AnonymousClass84Y.A00
            return r2
        L_0x0345:
            java.lang.String r0 = ","
            java.util.List r0 = X.C81074n3.A07(r2, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            return r2
        L_0x0351:
            java.lang.Object r0 = r13.A00
            X.7jm r0 = (X.C128547jm) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878805406777516(0x830514000300ac, double:3.385643266051557E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            return r2
        L_0x0363:
            java.lang.Object r0 = r13.A00
            X.7jm r0 = (X.C128547jm) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36878805407105198(0x830514000800ae, double:3.385643266258784E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            return r2
        L_0x0375:
            java.lang.Object r0 = r13.A00
            X.5jD r0 = (X.AnonymousClass5jD) r0
            X.AnonymousClass7KT.A02(r0)
            X.0YY r1 = r0.A0F
            if (r1 == 0) goto L_0x0385
            java.lang.String r0 = "CONNECT_FAILURE"
            r1.invoke(r0)
        L_0x0385:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0388:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.42G r2 = new X.42G
            r2.<init>(r0)
            return r2
        L_0x0392:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.495 r2 = new X.495
            r2.<init>(r0)
            return r2
        L_0x039c:
            java.lang.Object r1 = r13.A00
            X.8n9 r1 = (X.C146958n9) r1
            kotlin.Unit r2 = kotlin.Unit.A00
            X.1jB r0 = X.C86164wN.A0R(r2)
            r1.resumeWith(r0)
            return r2
        L_0x03aa:
            java.lang.Object r0 = r13.A00
            android.os.Bundle r2 = X.C18230wP.A0D(r0)
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x03bd:
            java.lang.Object r0 = r13.A00
            android.os.Bundle r2 = X.C18230wP.A0D(r0)
            r0 = 808(0x328, float:1.132E-42)
            goto L_0x0400
        L_0x03c6:
            java.lang.Object r0 = r13.A00
            android.os.Bundle r2 = X.C18230wP.A0D(r0)
            java.lang.String r1 = "origin"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L_0x03d5:
            java.lang.Object r0 = r13.A00
            X.1bp r0 = (X.C23041bp) r0
            X.0Oa r0 = r0.A0M
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.495 r2 = X.AnonymousClass2O7.A00(r0)
            return r2
        L_0x03e4:
            java.lang.Object r0 = r13.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 1182(0x49e, float:1.656E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.Boolean r2 = X.C18210wN.A0Q(r1, r0)
            return r2
        L_0x03f5:
            java.lang.Object r2 = r13.A00
            return r2
        L_0x03f8:
            java.lang.Object r0 = r13.A00
            android.os.Bundle r2 = X.C18230wP.A0D(r0)
            r0 = 809(0x329, float:1.134E-42)
        L_0x0400:
            java.lang.String r1 = X.C18170wI.A00(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x040f
            java.lang.Boolean r2 = X.C18210wN.A0Q(r2, r1)
            return r2
        L_0x040f:
            r2 = 0
            return r2
        L_0x0411:
            java.lang.Object r1 = r13.A00
            X.1bp r1 = (X.C23041bp) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0Oa r0 = r1.A0M
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r1.A0I
            java.lang.String r5 = X.C86114wI.A0r(r0)
            X.0Oa r0 = r1.A0K
            java.lang.Object r0 = r0.getValue()
            boolean r7 = X.AnonymousClass0wJ.A1X(r0)
            X.0Oa r0 = r1.A0G
            java.lang.String r6 = X.C86114wI.A0r(r0)
            X.3xq r2 = new X.3xq
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x043b:
            java.lang.Object r0 = r13.A00
            X.4tk[] r0 = (X.C84714tk[]) r0
            int r0 = r0.length
            java.lang.Object[] r2 = new java.lang.Object[r0]
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48.invoke():java.lang.Object");
    }
}
