package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape27S0100000_I2_7 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape27S0100000_I2_7(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015f, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ea, code lost:
        r2 = X.C63803iN.A0C(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f3, code lost:
        if (r2.length() != 0) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f7, code lost:
        return com.google.common.collect.RegularImmutableSet.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0202, code lost:
        return com.google.common.collect.ImmutableSet.A02(X.C81074n3.A07(r2, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0261, code lost:
        r2.D7w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0474, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x0042;
                case 2: goto L_0x004c;
                case 3: goto L_0x007f;
                case 4: goto L_0x009f;
                case 5: goto L_0x00af;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00c7;
                case 8: goto L_0x0134;
                case 9: goto L_0x013d;
                case 10: goto L_0x0146;
                case 11: goto L_0x014f;
                case 12: goto L_0x0160;
                case 13: goto L_0x0163;
                case 14: goto L_0x0005;
                case 15: goto L_0x016a;
                case 16: goto L_0x0198;
                case 17: goto L_0x01bb;
                case 18: goto L_0x01c5;
                case 19: goto L_0x01cf;
                case 20: goto L_0x01dd;
                case 21: goto L_0x0203;
                case 22: goto L_0x020d;
                case 23: goto L_0x0217;
                case 24: goto L_0x0226;
                case 25: goto L_0x0230;
                case 26: goto L_0x023a;
                case 27: goto L_0x024f;
                case 28: goto L_0x0256;
                case 29: goto L_0x0266;
                case 30: goto L_0x028c;
                case 31: goto L_0x034c;
                case 32: goto L_0x0356;
                case 33: goto L_0x0364;
                case 34: goto L_0x0025;
                case 35: goto L_0x0381;
                case 36: goto L_0x0025;
                case 37: goto L_0x03e9;
                case 38: goto L_0x0160;
                case 39: goto L_0x0163;
                case 40: goto L_0x0005;
                case 41: goto L_0x03fd;
                case 42: goto L_0x0423;
                case 43: goto L_0x0437;
                case 44: goto L_0x0160;
                case 45: goto L_0x0163;
                case 46: goto L_0x0005;
                case 47: goto L_0x044b;
                case 48: goto L_0x0469;
                case 49: goto L_0x0475;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r4 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r0 = r11.A00
            X.7Dc r0 = (X.C120917Dc) r0
            X.39V r0 = r0.A00
            if (r0 == 0) goto L_0x047f
            X.0Oe r0 = r0.A02
            java.lang.Object r4 = r0.get()
            if (r4 != 0) goto L_0x000d
            java.lang.String r0 = "Provider is not available in the configuration"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0025:
            java.lang.Object r1 = r11.A00
            X.5xc r1 = (X.AnonymousClass5xc) r1
            android.os.Bundle r0 = r1.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r3 = X.AnonymousClass6LK.A00(r0)
            X.0Oa r0 = r1.A00
            java.lang.Object r2 = r0.getValue()
            X.7Jo r2 = (X.C122027Jo) r2
            java.lang.Integer r1 = X.AnonymousClass006.A1C
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            X.C122027Jo.A01(r2, r3, r1, r0)
            goto L_0x0472
        L_0x0042:
            java.lang.Object r0 = r11.A00
            X.545 r0 = (X.AnonymousClass545) r0
            X.7MC r4 = new X.7MC
            r4.<init>(r0)
            return r4
        L_0x004c:
            java.lang.Object r1 = r11.A00
            X.5xX r1 = (X.AnonymousClass5xX) r1
            android.content.Context r0 = r1.requireContext()
            X.AgL r3 = X.C150388wA.A00(r0)
            X.0Oa r2 = r1.A07
            java.lang.String r1 = X.C18200wM.A0q(r2)
            X.60C r0 = new X.60C
            r0.<init>(r1)
            r3.A01(r0)
            X.603 r0 = new X.603
            r0.<init>()
            r3.A01(r0)
            java.lang.String r1 = X.C18200wM.A0q(r2)
            X.60B r0 = new X.60B
            r0.<init>(r1)
            r3.A01(r0)
            X.8wA r4 = r3.A00()
            return r4
        L_0x007f:
            java.lang.Object r3 = r11.A00
            X.5xX r3 = (X.AnonymousClass5xX) r3
            X.0Oa r0 = r3.A0D
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.3ED r1 = (X.AnonymousClass3ED) r1
            X.0Oa r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            X.7DY r4 = new X.7DY
            r4.<init>(r1, r3, r2, r0)
            return r4
        L_0x009f:
            java.lang.Object r1 = r11.A00
            X.5xX r1 = (X.AnonymousClass5xX) r1
            X.0Oa r0 = r1.A0D
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3ED r4 = new X.3ED
            r4.<init>(r1, r0)
            return r4
        L_0x00af:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            goto L_0x015b
        L_0x00bd:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "content_variant"
            goto L_0x015b
        L_0x00c7:
            java.lang.Object r6 = r11.A00
            X.5xX r6 = (X.AnonymousClass5xX) r6
            X.0Oa r0 = r6.A09
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "experiment_name"
            kotlin.Pair r5 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A0A
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "image_asset"
            kotlin.Pair r4 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "content_variant"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A0B
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "primary_cta_variant"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            X.0Oa r0 = r6.A0C
            java.lang.Object r1 = r0.getValue()
            r0 = 493(0x1ed, float:6.91E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r5, r4, r3, r2, r0}
            java.util.Map r0 = X.AnonymousClass4WJ.A0I(r0)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x011b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012f
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x011b
            X.C18210wN.A1Q(r3, r1)
            goto L_0x011b
        L_0x012f:
            java.util.Map r4 = X.C03940Lk.A02(r3)
            return r4
        L_0x0134:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "experiment_name"
            goto L_0x015b
        L_0x013d:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "image_asset"
            goto L_0x015b
        L_0x0146:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "primary_cta_variant"
            goto L_0x015b
        L_0x014f:
            java.lang.Object r0 = r11.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 493(0x1ed, float:6.91E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
        L_0x015b:
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0160:
            java.lang.Object r4 = r11.A00
            return r4
        L_0x0163:
            java.lang.Object r0 = r11.A00
            java.lang.Object r4 = X.C86144wL.A0j(r0)
            return r4
        L_0x016a:
            java.lang.Object r1 = r11.A00
            X.5xX r1 = (X.AnonymousClass5xX) r1
            X.0Oa r0 = r1.A0D
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r1.A09
            java.lang.String r6 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A0A
            java.lang.String r7 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A07
            java.lang.String r8 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A0B
            java.lang.String r9 = X.C18200wM.A0q(r0)
            X.0Oa r0 = r1.A0C
            java.lang.String r10 = X.C18200wM.A0q(r0)
            X.7bi r4 = new X.7bi
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0198:
            java.lang.Object r3 = r11.A00
            X.5xX r3 = (X.AnonymousClass5xX) r3
            X.0Oa r0 = r3.A06
            java.lang.Object r2 = r0.getValue()
            X.3ED r2 = (X.AnonymousClass3ED) r2
            X.0Oa r0 = r3.A0D
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r3.A0G
            java.lang.Object r0 = r0.getValue()
            X.GbW r0 = (X.C30938GbW) r0
            X.C04220Ms.A06(r0)
            X.6gw r4 = new X.6gw
            r4.<init>(r2, r0, r1)
            return r4
        L_0x01bb:
            java.lang.Object r0 = r11.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.JOg r4 = new X.JOg
            r4.<init>(r0)
            return r4
        L_0x01c5:
            java.lang.Object r0 = r11.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.K10 r4 = new X.K10
            r4.<init>(r0)
            return r4
        L_0x01cf:
            java.lang.Object r0 = r11.A00
            X.K10 r0 = (X.K10) r0
            X.0i6 r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36876121052151909(0x8302a300020065, double:3.3839456693772944E-306)
            goto L_0x01ea
        L_0x01dd:
            java.lang.Object r0 = r11.A00
            X.K10 r0 = (X.K10) r0
            X.0i6 r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36876121052282982(0x8302a300040066, double:3.3839456694601855E-306)
        L_0x01ea:
            java.lang.String r2 = X.C63803iN.A0C(r2, r3, r0)
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto L_0x01f8
            com.google.common.collect.RegularImmutableSet r4 = com.google.common.collect.RegularImmutableSet.A03
            return r4
        L_0x01f8:
            java.lang.String r0 = ","
            java.util.List r0 = X.C81074n3.A07(r2, r0, r1)
            com.google.common.collect.ImmutableSet r4 = com.google.common.collect.ImmutableSet.A02(r0)
            return r4
        L_0x0203:
            java.lang.Object r0 = r11.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.41u r4 = new X.41u
            r4.<init>(r0)
            return r4
        L_0x020d:
            java.lang.Object r0 = r11.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.6kl r4 = new X.6kl
            r4.<init>(r0)
            return r4
        L_0x0217:
            android.content.Context r1 = X.C10600ic.A00
            X.C04220Ms.A06(r1)
            java.lang.Object r0 = r11.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.H5X r4 = new X.H5X
            r4.<init>(r1, r0)
            return r4
        L_0x0226:
            java.lang.Object r0 = r11.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.KGd r4 = new X.KGd
            r4.<init>(r0)
            return r4
        L_0x0230:
            java.lang.Object r0 = r11.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.KGe r4 = new X.KGe
            r4.<init>(r0)
            return r4
        L_0x023a:
            java.lang.Object r3 = r11.A00
            X.0i6 r3 = (X.C10300i6) r3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36316877655379316(0x81060200000d74, double:3.030277893365898E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            X.J9I r4 = new X.J9I
            r4.<init>(r0)
            return r4
        L_0x024f:
            java.lang.Object r2 = r11.A00
            X.8m8 r2 = (X.C146368m8) r2
            X.5z3 r0 = X.AnonymousClass5z3.A00
            goto L_0x0261
        L_0x0256:
            java.lang.Object r2 = r11.A00
            X.8m8 r2 = (X.C146368m8) r2
            X.5sZ r1 = X.AnonymousClass5sZ.A00
            X.5z1 r0 = new X.5z1
            r0.<init>(r1)
        L_0x0261:
            r2.D7w(r0)
            goto L_0x0472
        L_0x0266:
            X.LoD r4 = new X.LoD
            r4.<init>()
            r0 = 36602325477297994(0x82099f00070f4a, double:3.2107962453533906E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            long r1 = X.C07960cV.A00(r0)
            int r0 = (int) r1
            r4.A00 = r0
            java.lang.Object r0 = r11.A00
            X.IaY r0 = (X.C34561IaY) r0
            X.0Oa r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r4.A02 = r0
            return r4
        L_0x028c:
            r0 = 36320880566213001(0x8109a600141989, double:3.0328093502955483E-306)
            boolean r4 = X.C18210wN.A1S(r0)
            X.6p1 r3 = new X.6p1
            r3.<init>()
            r0 = 36883830519038305(0x8309a6000b0161, double:3.3888211672797827E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            java.lang.String r0 = X.C07960cV.A03(r0)
            r3.A01 = r0
            java.lang.Integer r2 = X.AnonymousClass006.A00
            if (r4 == 0) goto L_0x0300
            r0 = 36320880566278538(0x8109a60015198a, double:3.032809350336994E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A01
            r0 = 36320880565885316(0x8109a6000f1984, double:3.032809350088319E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 36320880566016390(0x8109a600111986, double:3.032809350171211E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            r0 = 36320880565950853(0x8109a600101985, double:3.032809350129765E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            r0 = 36320880565819779(0x8109a6000e1983, double:3.032809350046873E-306)
        L_0x02ea:
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            int r2 = r3.A00
            java.lang.String r1 = r3.A01
            X.6gG r0 = new X.6gG
            r0.<init>(r2, r1)
            X.7sQ r4 = new X.7sQ
            r4.<init>(r0)
            return r4
        L_0x0300:
            r0 = 36320880565295486(0x8109a60006197e, double:3.032809349715308E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A01
            r0 = 36320880565098875(0x8109a60003197b, double:3.0328093495909705E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 36320880564967801(0x8109a600011979, double:3.032809349508079E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            r0 = 36320880565033338(0x8109a60002197a, double:3.032809349549525E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            r0 = 36320880565229949(0x8109a60005197d, double:3.032809349673862E-306)
            boolean r0 = X.C18210wN.A1S(r0)
            r3.A00(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0j
            r0 = 36320880566081927(0x8109a600121987, double:3.0328093502126566E-306)
            goto L_0x02ea
        L_0x034c:
            java.lang.Object r0 = r11.A00
            X.6qY r0 = (X.C113006qY) r0
            X.7zb r4 = new X.7zb
            r4.<init>(r0)
            return r4
        L_0x0356:
            java.lang.Object r0 = r11.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            java.lang.String r0 = r0.getUserId()
            X.KUq r4 = new X.KUq
            r4.<init>(r0)
            return r4
        L_0x0364:
            java.lang.Object r0 = r11.A00
            X.7gt r0 = (X.C127297gt) r0
            X.DsR r2 = r0.A02
            X.C04220Ms.A06(r2)
            X.DrU r0 = X.C127297gt.A04
            r2.A0D(r0)
            r0 = 1
            r2.A06 = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A09(r0)
            r0 = 0
            r2.A0A(r0)
            goto L_0x0472
        L_0x0381:
            java.lang.Object r5 = r11.A00
            X.5xc r5 = (X.AnonymousClass5xc) r5
            android.os.Bundle r0 = r5.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r3 = X.AnonymousClass6LK.A00(r0)
            X.0Oa r0 = r5.A00
            java.lang.Object r2 = r0.getValue()
            X.7Jo r2 = (X.C122027Jo) r2
            java.lang.Integer r1 = X.AnonymousClass006.A1C
            java.lang.Integer r0 = X.AnonymousClass006.A04
            X.C122027Jo.A01(r2, r3, r1, r0)
            X.0Oa r4 = r5.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r4)
            java.lang.String r1 = r0.getUserId()
            java.lang.String r0 = "target_id"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r1)
            java.lang.String r1 = "timeframe"
            java.lang.String r0 = "TWO_YEARS"
            kotlin.Pair r2 = X.C18180wK.A0p(r1, r0)
            java.lang.String r1 = "initial_media_product_type"
            java.lang.String r0 = "CLIPS"
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r2, r0}
            java.util.HashMap r3 = X.AnonymousClass4WJ.A09(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r4)
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            java.lang.String r0 = "com.instagram.insights.account.media_grid.gifts.container"
            X.3iE r1 = X.C63743iE.A02(r0, r3)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r0)
            X.1c8 r0 = X.C62853b1.A02(r0, r1)
            r2.A03 = r0
            r2.A07()
            goto L_0x0472
        L_0x03e9:
            java.lang.Object r2 = r11.A00
            X.5xc r2 = (X.AnonymousClass5xc) r2
            X.0Oa r0 = r2.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.appreciation.analytics.LoggingData r0 = X.C117526yp.A01(r2)
            X.7Jo r4 = new X.7Jo
            r4.<init>(r0, r2, r1)
            return r4
        L_0x03fd:
            java.lang.Object r4 = r11.A00
            X.5xc r4 = (X.AnonymousClass5xc) r4
            X.0Oa r0 = r4.A01
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r4.A00
            java.lang.Object r2 = r0.getValue()
            X.7Jo r2 = (X.C122027Jo) r2
            com.instagram.appreciation.analytics.LoggingData r0 = X.C117526yp.A01(r4)
            java.lang.String r1 = r0.A01
            android.os.Bundle r0 = r4.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r0 = X.AnonymousClass6LK.A00(r0)
            X.7bU r4 = new X.7bU
            r4.<init>(r2, r0, r3, r1)
            return r4
        L_0x0423:
            java.lang.Object r2 = r11.A00
            X.5xZ r2 = (X.AnonymousClass5xZ) r2
            X.0Oa r0 = r2.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.appreciation.analytics.LoggingData r0 = X.C117526yp.A01(r2)
            X.7Jo r4 = new X.7Jo
            r4.<init>(r0, r2, r1)
            return r4
        L_0x0437:
            java.lang.Object r2 = r11.A00
            X.5xM r2 = (X.AnonymousClass5xM) r2
            X.0Oa r0 = r2.A0C
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.appreciation.analytics.LoggingData r0 = X.C117526yp.A01(r2)
            X.7Jo r4 = new X.7Jo
            r4.<init>(r0, r2, r1)
            return r4
        L_0x044b:
            java.lang.Object r3 = r11.A00
            X.62L r3 = (X.AnonymousClass62L) r3
            X.0Oa r0 = r3.A0C
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r3.A01
            java.lang.Object r1 = r0.getValue()
            X.7Jo r1 = (X.C122027Jo) r1
            com.instagram.appreciation.analytics.LoggingData r0 = X.C117526yp.A01(r3)
            java.lang.String r0 = r0.A01
            X.7bK r4 = new X.7bK
            r4.<init>(r1, r2, r0)
            return r4
        L_0x0469:
            java.lang.Object r0 = r11.A00
            X.60S r0 = (X.AnonymousClass60S) r0
            X.0ZU r0 = r0.A02
            r0.invoke()
        L_0x0472:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0475:
            java.lang.Object r0 = r11.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7pP r4 = new X.7pP
            r4.<init>(r0)
            return r4
        L_0x047f:
            java.lang.String r0 = "W3C Client SDK has not been configured yet"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7.invoke():java.lang.Object");
    }
}
