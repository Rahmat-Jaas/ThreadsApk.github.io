package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape4S1210000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1210000_I2(Object obj, Object obj2, String str, int i, boolean z) {
        super(0);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
        this.A00 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x08eb, code lost:
        if ((r11 - java.lang.Long.parseLong(r7.getString(r5))) >= (r0 * 60)) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0915, code lost:
        X.C121547Gq.A01(r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0918, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d7, code lost:
        if ((r11 - java.lang.Long.parseLong(r15.getString(r9))) >= (r0 * 60)) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x02ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0371 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0340 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r33 = this;
            r8 = r33
            int r0 = r8.A04
            switch(r0) {
                case 0: goto L_0x088c;
                case 1: goto L_0x05ed;
                case 2: goto L_0x0117;
                case 3: goto L_0x00e4;
                case 4: goto L_0x0082;
                case 5: goto L_0x0107;
                case 6: goto L_0x0053;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r8.A01
            X.3H0 r0 = (X.AnonymousClass3H0) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            java.lang.Object r1 = r8.A00
            X.0kW r1 = (X.C11630kW) r1
            r0 = 2
            X.C04220Ms.A0B(r1, r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x003c
            java.lang.String r2 = r8.A02
            X.0nS r1 = X.C13330nS.A01(r1, r3)
            java.lang.String r0 = "instagram_shopping_auto_highlight_enabled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1995(0x7cb, float:2.796E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "m_pk"
            r1.A0T(r0, r2)
        L_0x0036:
            r1.Bb4()
        L_0x0039:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x003c:
            X.0nS r1 = X.C13330nS.A01(r1, r3)
            java.lang.String r0 = "instagram_shopping_auto_highlight_disabled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1994(0x7ca, float:2.794E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0039
            goto L_0x0036
        L_0x0053:
            java.lang.Object r1 = r8.A01
            X.65B r1 = (X.AnonymousClass65B) r1
            X.AnonymousClass65B.A03(r1)
            X.Ah2 r2 = r1.A03
            java.lang.Object r0 = r8.A00
            X.9CN r0 = (X.AnonymousClass9CN) r0
            java.lang.Long r0 = r0.A02
            java.lang.String r4 = java.lang.String.valueOf(r0)
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x007f
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r3 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
        L_0x006c:
            X.C2W r0 = r1.A04
            java.lang.String r5 = X.C86124wJ.A0x(r0)
            java.lang.String r6 = X.C86104wH.A0t(r0, r5)
            X.C04220Ms.A0A(r6)
            java.lang.String r7 = r8.A02
            r2.A03(r3, r4, r5, r6, r7)
            goto L_0x0039
        L_0x007f:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r3 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            goto L_0x006c
        L_0x0082:
            java.lang.Object r4 = r8.A01
            X.EGu r4 = (X.C26469EGu) r4
            X.EyY r3 = r4.A00
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x00e1
            java.lang.Integer r0 = X.AnonymousClass006.A0U
        L_0x008e:
            X.DnY r2 = new X.DnY
            r2.<init>(r0)
            java.lang.Object r6 = r8.A00
            X.E96 r6 = (X.E96) r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2 r1 = r6.A01
            int r0 = r6.A00
            r2.A01(r1, r0)
            X.C25581DoH.A01(r3, r2)
            java.lang.String r5 = r8.A02
            X.627 r6 = (X.AnonymousClass627) r6
            boolean r0 = r6.A03
            r2 = 1
            r0 = r0 ^ 1
            r6.A00(r0)
            X.CBa r0 = r4.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2 r1 = r6.A01
            X.C18210wN.A0n(r2, r5, r1)
            com.instagram.mediakit.repository.MediaKitRepository r0 = r0.A06
            r0.A09(r1, r5, r2)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0039
            r3 = 2131830609(0x7f112751, float:1.929422E38)
            r0 = 2131837219(0x7f114123, float:1.9307627E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 31
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r0.<init>(r6, r4, r5, r1)
            X.Dbt r1 = new X.Dbt
            r1.<init>(r2, r0, r3)
            X.EJW r0 = new X.EJW
            r0.<init>(r1)
            X.EpQ[] r0 = new X.C27557EpQ[]{r0}
            X.C26469EGu.A00(r4, r0)
            goto L_0x0039
        L_0x00e1:
            java.lang.Integer r0 = X.AnonymousClass006.A0T
            goto L_0x008e
        L_0x00e4:
            java.lang.Object r2 = r8.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0102
            r0 = 1384(0x568, float:1.94E-42)
            java.lang.String r1 = X.C18170wI.A00(r0)
            java.lang.String r0 = "self_profile_switcher"
        L_0x00f4:
            X.C33472Fv.A00(r2, r1, r0)
            java.lang.Object r1 = r8.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r8.A02
            r1.invoke(r0)
            goto L_0x0039
        L_0x0102:
            java.lang.String r1 = "profile"
            java.lang.String r0 = "other_profile_switcher"
            goto L_0x00f4
        L_0x0107:
            java.lang.String r3 = r8.A02
            java.lang.Object r2 = r8.A01
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r8.A03
            r0 = 16
            X.3Xd r4 = new X.3Xd
            r4.<init>(r3, r2, r0, r1)
            return r4
        L_0x0117:
            java.lang.Object r7 = r8.A01
            X.78M r7 = (X.AnonymousClass78M) r7
            java.lang.String r9 = r8.A02
            X.7DX r0 = r7.A08
            r6 = 0
            X.8nP r10 = X.AnonymousClass7DX.A00(r0, r9)
            if (r10 == 0) goto L_0x05e5
            X.7Gq r5 = r7.A05
            r24 = 0
            r23 = 6
            java.lang.String r3 = "looked_up_mobile_config"
            r2 = 1
            r1 = r24
            r0 = r23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r3, r1, r0, r2)
            X.68S r4 = X.AnonymousClass68S.TRAIN
            r5.A02(r4, r0, r9)
            java.lang.String r1 = r10.BI4()
            java.lang.String r0 = r10.BI5()
            X.5IK r3 = new X.5IK
            r3.<init>(r9, r1, r0)
            java.lang.String r0 = r3.A00
            r32 = r0
            java.lang.String r1 = "use_case_name"
            r2 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r1, r0, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
            java.lang.String r0 = r3.A02
            r31 = r0
            java.lang.String r1 = "use_case_version"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r1, r0, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "use_case_tag"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
            boolean r13 = r8.A03
            java.lang.String r1 = java.lang.String.valueOf(r13)
            r0 = 477(0x1dd, float:6.68E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
            X.74k r0 = r7.A00
            X.7DX r0 = r0.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            com.facebook.dcp.model.UseCaseMetadata r0 = (com.facebook.dcp.model.UseCaseMetadata) r0
            r14 = 0
            if (r0 == 0) goto L_0x0292
            com.facebook.dcp.model.TrainerMetadata r0 = r0.A06
            if (r0 == 0) goto L_0x0292
            long r0 = r0.A02
        L_0x019a:
            java.lang.String r25 = "last_training_key_"
            r22 = 95
            r12 = r25
            r11 = r22
            r10 = r32
            r9 = r31
            java.lang.String r9 = X.AnonymousClass00U.A0X(r12, r10, r9, r11)
            if (r13 == 0) goto L_0x01b8
            int r10 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x01b8
        L_0x01b0:
            java.lang.String r1 = "too early for training"
            X.5F6 r0 = new X.5F6
            r0.<init>(r1)
            throw r0
        L_0x01b8:
            X.8nC r15 = r7.A01
            X.7do r15 = (X.C125677do) r15
            boolean r10 = X.C125677do.A01(r15, r9)
            if (r10 == 0) goto L_0x01d9
            long r11 = X.C18190wL.A07()
            X.C04220Ms.A0B(r9, r6)
            java.lang.String r9 = r15.getString(r9)
            long r9 = java.lang.Long.parseLong(r9)
            long r11 = r11 - r9
            r9 = 60
            long r0 = r0 * r9
            int r9 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x01b0
        L_0x01d9:
            X.74k r0 = r7.A00
            X.7DX r0 = r0.A00
            java.util.HashMap r0 = r0.A00
            java.lang.Object r9 = r0.get(r3)
            com.facebook.dcp.model.UseCaseMetadata r9 = (com.facebook.dcp.model.UseCaseMetadata) r9
            if (r9 == 0) goto L_0x05dd
            com.facebook.dcp.model.TrainerMetadata r0 = r9.A06
            r30 = r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x05d5
            java.lang.String r11 = "looked_up_usecase_metadata"
            r10 = 1
            r1 = r24
            r0 = r23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r11, r1, r0, r10)
            X.C121547Gq.A00(r4, r3, r0, r5)
            java.lang.Object r8 = r8.A00
            java.util.List r8 = (java.util.List) r8
            X.6py r1 = r7.A04
            java.lang.String r0 = r9.A0A
            r16 = r1
            r17 = r4
            r18 = r32
            r19 = r31
            r20 = r0
            r21 = r8
            com.facebook.dcp.model.ServerFeaturesResponse r10 = r16.A00(r17, r18, r19, r20, r21)
            java.lang.String r11 = "extracted_server_features"
            r8 = 1
            r1 = r24
            r0 = r23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r11, r1, r0, r8)
            X.C121547Gq.A00(r4, r3, r0, r5)
            X.6pV r1 = r7.A02
            java.lang.String r0 = r3.A01
            r29 = r0
            r1.A00(r10, r4, r9, r0)
            java.util.List r0 = r10.A00
            java.util.Map r11 = com.facebook.dcp.model.Example.Companion.A01(r0)
            java.lang.String r1 = "extracted_example_context"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2
            r0.<init>(r1, r6, r11)
            X.C121547Gq.A00(r4, r3, r0, r5)
            X.780 r1 = r7.A03
            r0 = r29
            com.facebook.dcp.model.ServerFeaturesResponse r0 = r1.A00(r10, r4, r9, r0)
            java.util.List r12 = r0.A00
            java.lang.String r10 = "extracted_features"
            java.util.Map r1 = com.facebook.dcp.model.Example.Companion.A00(r12)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2
            r0.<init>(r10, r6, r1)
            X.C121547Gq.A00(r4, r3, r0, r5)
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r18 = r12.iterator()
        L_0x025c:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0296
            java.lang.Object r12 = r18.next()
            r0 = r12
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            java.util.HashMap r14 = r0.A02
            java.lang.String r13 = "2474"
            java.lang.Object r0 = r14.get(r13)
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            if (r0 == 0) goto L_0x0281
            long r0 = r0.A01
            r16 = 0
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x0281
        L_0x027d:
            r11.add(r12)
            goto L_0x025c
        L_0x0281:
            java.lang.Object r0 = r14.get(r13)
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            if (r0 == 0) goto L_0x025c
            long r0 = r0.A01
            r13 = 1
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x025c
            goto L_0x027d
        L_0x0292:
            r0 = 0
            goto L_0x019a
        L_0x0296:
            com.facebook.dcp.model.ServerFeaturesResponse r0 = new com.facebook.dcp.model.ServerFeaturesResponse
            r0.<init>(r11)
            java.util.List r0 = r0.A00
            r28 = r0
            int r1 = r28.size()
            java.lang.String r21 = " examples available for training"
            r0 = r21
            java.lang.String r1 = X.AnonymousClass00U.A02(r1, r0)
            java.lang.String r0 = "filter_features"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r8)
            X.C121547Gq.A00(r4, r3, r0, r5)
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x05cd
            X.6bv r0 = r7.A06
            X.6bw r13 = r0.A00
            r0 = r30
            r13.A00 = r0
            java.util.ArrayList r20 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r19 = r28.iterator()
        L_0x02ca:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r14 = r19.next()
            r0 = r14
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            X.C04220Ms.A0B(r0, r6)
            java.util.HashMap r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02f3
            java.lang.String r1 = "empty feature map provided for validation"
        L_0x02e4:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r0.<init>((int) r6, (java.lang.String) r1, (boolean) r6)
        L_0x02e9:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x02ca
            r0 = r20
            r0.add(r14)
            goto L_0x02ca
        L_0x02f3:
            com.facebook.dcp.model.TrainerMetadata r0 = r13.A00
            if (r0 == 0) goto L_0x03c7
            java.lang.String r18 = "trainerMetadata"
            java.util.Map r0 = r0.A07
            boolean r0 = X.C86164wN.A1R(r0)
            if (r0 == 0) goto L_0x03c7
            java.util.Iterator r17 = X.AnonymousClass0wJ.A0z(r1)
        L_0x0305:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x03c7
            java.util.Map$Entry r0 = X.C18180wK.A0o(r17)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r12 = r0.getValue()
            com.facebook.dcp.model.FeatureData r12 = (com.facebook.dcp.model.FeatureData) r12
            com.facebook.dcp.model.TrainerMetadata r0 = r13.A00
            if (r0 == 0) goto L_0x03ce
            java.util.Map r0 = r0.A06
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x0305
            com.facebook.dcp.model.TrainerMetadata r0 = r13.A00
            if (r0 == 0) goto L_0x03ce
            java.util.Map r0 = r0.A07
            java.lang.Object r1 = r0.get(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0305
            X.C04220Ms.A0B(r12, r8)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0305
            java.util.Iterator r16 = r1.iterator()
        L_0x0340:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0305
            java.lang.Object r11 = r16.next()
            com.facebook.dcp.model.DcpRule r11 = (com.facebook.dcp.model.DcpRule) r11
            com.facebook.dcp.model.Type r0 = r11.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x03aa
            if (r1 == r8) goto L_0x0399
            r0 = 5
            if (r1 == r0) goto L_0x038e
            r0 = r23
            if (r1 != r0) goto L_0x0340
            double r0 = r12.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            com.facebook.dcp.model.DcpData r0 = r11.A00
            java.util.List r10 = r0.A08
        L_0x0367:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0375
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0375
        L_0x0371:
            java.lang.String r1 = "training rule execution failed"
            goto L_0x02e4
        L_0x0375:
            java.util.Iterator r10 = r10.iterator()
        L_0x0379:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0371
            java.lang.Object r0 = r10.next()
            int r0 = r1.compareTo(r0)
            boolean r0 = X.C98756Gu.A00(r11, r0)
            if (r0 == 0) goto L_0x0379
            goto L_0x0340
        L_0x038e:
            long r0 = r12.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            com.facebook.dcp.model.DcpData r0 = r11.A00
            java.util.List r10 = r0.A09
            goto L_0x0367
        L_0x0399:
            double r0 = r12.A00
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            com.facebook.dcp.model.DcpData r0 = r11.A00
            double r0 = r0.A00
            r26 = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r26)
            goto L_0x03ba
        L_0x03aa:
            long r0 = r12.A01
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            com.facebook.dcp.model.DcpData r0 = r11.A00
            long r0 = r0.A03
            r26 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r26)
        L_0x03ba:
            int r0 = r10.compareTo(r0)
            boolean r0 = X.C98756Gu.A00(r11, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0340
            goto L_0x0371
        L_0x03c7:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r0.<init>(r6, r8)
            goto L_0x02e9
        L_0x03ce:
            X.C04220Ms.A0E(r18)
            r1 = 0
            throw r1
        L_0x03d3:
            com.facebook.dcp.model.ServerFeaturesResponse r1 = new com.facebook.dcp.model.ServerFeaturesResponse
            r0 = r20
            r1.<init>(r0)
            java.util.List r10 = r1.A00
            int r1 = r10.size()
            r0 = r21
            java.lang.String r1 = X.AnonymousClass00U.A02(r1, r0)
            java.lang.String r0 = "training_data_validation_complete"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r8)
            X.C121547Gq.A00(r4, r3, r0, r5)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x05c5
            X.6bx r0 = r7.A07
            r21 = r0
            long r0 = r9.A01
            r19 = r0
            r0 = r28
            X.C04220Ms.A0B(r0, r8)
            java.util.Iterator r18 = r28.iterator()
        L_0x0406:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x04d1
            java.lang.Object r9 = r18.next()
            com.facebook.dcp.model.Example r9 = (com.facebook.dcp.model.Example) r9
            X.C04220Ms.A0B(r9, r8)
            X.6qU r11 = new X.6qU
            r0 = r19
            r11.<init>(r0)
            java.util.HashMap r0 = r9.A02
            java.util.Iterator r14 = X.C18190wL.A0u(r0)
        L_0x0422:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x04a2
            java.util.Map$Entry r10 = X.C18180wK.A0o(r14)
            java.lang.Object r0 = r10.getValue()
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            com.facebook.dcp.model.Type r0 = r0.A02
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x0484
            if (r1 == r6) goto L_0x045b
            r0 = 2
            if (r1 != r0) goto L_0x04ba
            java.lang.Object r0 = r10.getValue()
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            java.lang.String r12 = r0.A04
            if (r12 == 0) goto L_0x0422
            java.lang.String r0 = X.C18200wM.A0p(r10)
            long r9 = java.lang.Long.parseLong(r0)
            com.google.common.collect.ImmutableMap$Builder r1 = r11.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1.put(r0, r12)
            goto L_0x0422
        L_0x045b:
            java.lang.Object r1 = r10.getKey()
            java.lang.String r0 = "2474"
            boolean r9 = X.C04220Ms.A0I(r1, r0)
            java.lang.String r0 = X.C18200wM.A0p(r10)
            long r16 = java.lang.Long.parseLong(r0)
            java.lang.Object r0 = r10.getValue()
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            long r0 = r0.A01
            if (r9 == 0) goto L_0x0482
            com.google.common.collect.ImmutableMap$Builder r13 = r11.A03
            java.lang.Long r12 = java.lang.Long.valueOf(r16)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x049e
        L_0x0482:
            double r9 = (double) r0
            goto L_0x0494
        L_0x0484:
            java.lang.String r0 = X.C18200wM.A0p(r10)
            long r16 = java.lang.Long.parseLong(r0)
            java.lang.Object r0 = r10.getValue()
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            double r9 = r0.A00
        L_0x0494:
            com.google.common.collect.ImmutableMap$Builder r13 = r11.A01
            java.lang.Long r12 = java.lang.Long.valueOf(r16)
            java.lang.Double r0 = java.lang.Double.valueOf(r9)
        L_0x049e:
            r13.put(r12, r0)
            goto L_0x0422
        L_0x04a2:
            X.77m r10 = r11.A00()
            r0 = r21
            X.0Oa r0 = r0.A00
            java.lang.Object r9 = r0.getValue()
            com.facebook.papaya.store.PapayaStore r9 = (com.facebook.papaya.store.PapayaStore) r9
            r0 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            r10.A00(r9, r0)
            goto L_0x0406
        L_0x04ba:
            java.lang.String r0 = "Currently not support storing of type "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r0 = r10.getValue()
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            com.facebook.dcp.model.Type r0 = r0.A02
            java.lang.String r0 = X.C18200wM.A0m(r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x04d1:
            r0 = r30
            com.facebook.dcp.model.LogLevel r0 = r0.A05
            int r0 = r0.A00
            int r0 = r0 >> 7
            r0 = r0 & 1
            if (r0 != r8) goto L_0x0559
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r28.iterator()
        L_0x04e5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x050a
            java.lang.Object r12 = r14.next()
            r0 = r12
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            java.util.HashMap r1 = r0.A02
            java.lang.String r0 = "2474"
            java.lang.Object r0 = r1.get(r0)
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            if (r0 == 0) goto L_0x04e5
            long r0 = r0.A01
            r10 = 1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x04e5
            r13.add(r12)
            goto L_0x04e5
        L_0x050a:
            int r0 = r13.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "positive_labels_count"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r28.iterator()
        L_0x0523:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0548
            java.lang.Object r12 = r14.next()
            r0 = r12
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0
            java.util.HashMap r1 = r0.A02
            java.lang.String r0 = "2474"
            java.lang.Object r0 = r1.get(r0)
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0
            if (r0 == 0) goto L_0x0523
            long r0 = r0.A01
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0523
            r13.add(r12)
            goto L_0x0523
        L_0x0548:
            int r0 = r13.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "negative_labels_count"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r0, r1, r2, r6)
            X.C121547Gq.A00(r4, r3, r0, r5)
        L_0x0559:
            java.lang.String r2 = "stored_examples"
            java.util.Map r1 = com.facebook.dcp.model.Example.Companion.A00(r28)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2
            r0.<init>(r2, r6, r1)
            X.C121547Gq.A00(r4, r3, r0, r5)
            X.0Oa r0 = r7.A09
            java.lang.Object r2 = r0.getValue()
            X.6g6 r2 = (X.C107076g6) r2
            X.7DX r0 = r2.A00
            java.util.HashMap r1 = r0.A00
            r0 = r29
            java.lang.Object r1 = r1.get(r0)
            X.8lj r1 = (X.C146148lj) r1
            if (r1 == 0) goto L_0x05b9
            X.8mE r0 = r2.A01
            r0.CwR(r1)
            java.lang.String r2 = "submit_executor"
            r1 = r24
            r0 = r23
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r0 = X.C86134wK.A0N(r2, r1, r0, r8)
            X.C121547Gq.A00(r4, r3, r0, r5)
            r3 = r25
            r2 = r22
            r1 = r32
            r0 = r31
            java.lang.String r5 = X.AnonymousClass00U.A0X(r3, r1, r0, r2)
            long r3 = X.C18190wL.A07()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 30
            long r1 = r2.toMillis(r0)
            X.C04220Ms.A0B(r5, r6)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r15.CYP(r5, r0, r1)
            java.lang.String r0 = "training_complete"
            X.3Rk r4 = new X.3Rk
            r4.<init>(r0)
            return r4
        L_0x05b9:
            java.lang.String r1 = "no executor for local use case id "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            X.5F5 r0 = new X.5F5
            r0.<init>(r1)
            throw r0
        L_0x05c5:
            java.lang.String r0 = "no training example to submit"
            X.5F6 r1 = new X.5F6
            r1.<init>(r0)
            throw r1
        L_0x05cd:
            java.lang.String r1 = "no training example to submit"
            X.5F6 r0 = new X.5F6
            r0.<init>(r1)
            throw r0
        L_0x05d5:
            java.lang.String r1 = "training not enabled in trainer metadata"
            X.5F6 r0 = new X.5F6
            r0.<init>(r1)
            throw r0
        L_0x05dd:
            java.lang.String r1 = "trainer metadata not found"
            X.5F6 r0 = new X.5F6
            r0.<init>(r1)
            throw r0
        L_0x05e5:
            java.lang.String r1 = "trainer mobile config not found"
            X.5F6 r0 = new X.5F6
            r0.<init>(r1)
            throw r0
        L_0x05ed:
            java.lang.Object r5 = r8.A01
            X.791 r5 = (X.AnonymousClass791) r5
            X.74n r0 = r5.A00()
            java.util.HashMap r0 = r0.A00
            java.lang.String r3 = r8.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.dcp.signals.model.SignalMetadata r1 = (com.facebook.dcp.signals.model.SignalMetadata) r1
            if (r1 == 0) goto L_0x0880
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0805
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x0805
            X.6bu r8 = r5.A04
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            long r1 = java.lang.Long.parseLong(r3)
            r6 = 100000000(0x5f5e100, double:4.94065646E-316)
            long r1 = r1 + r6
            java.lang.String r6 = "Not able to retrieve set."
            X.6HZ r7 = new X.6HZ
            r7.<init>()
            com.google.common.collect.RegularImmutableSet r4 = com.google.common.collect.RegularImmutableSet.A03
            com.facebook.papaya.store.Query$Builder r0 = new com.facebook.papaya.store.Query$Builder
            r0.<init>(r1)
            r0.nativeSetPropertyIds(r4)
            com.facebook.papaya.store.Query r0 = r0.nativeBuild()     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            X.6gJ r4 = new X.6gJ     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            r4.<init>(r7, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            X.0Oa r0 = r8.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            com.facebook.papaya.store.PapayaStore r1 = (com.facebook.papaya.store.PapayaStore) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            com.facebook.papaya.store.Query r0 = r4.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            com.google.common.util.concurrent.ListenableFuture r2 = r1.read(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            r0 = 2
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r1 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            r1.<init>(r4, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            X.6Ba r0 = X.C97356Ba.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            com.google.common.util.concurrent.ListenableFuture r0 = X.C34497IYj.A00(r1, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            X.6gK r0 = (X.C107186gK) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0652 }
            goto L_0x0659
        L_0x0652:
            r1 = move-exception
            java.lang.String r0 = "SignalsDatabase"
            X.AnonymousClass0LU.A0F(r0, r6, r1)
            r0 = 0
        L_0x0659:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            if (r0 == 0) goto L_0x0825
            com.facebook.papaya.store.RecordSet r9 = r0.A00
            int r18 = r9.size()
            r8 = 0
        L_0x0666:
            r0 = r18
            if (r8 >= r0) goto L_0x0825
            java.util.LinkedHashMap r17 = X.C18220wO.A0y()
            java.util.LinkedHashMap r10 = X.C18220wO.A0y()
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            r6 = 0
            com.facebook.papaya.store.Record r1 = r9.get(r8)
            X.77m r0 = new X.77m
            r0.<init>(r1)
            com.facebook.papaya.store.Record r0 = r0.A00
            r11 = -10
            com.google.common.collect.ImmutableMap r1 = r0.mPropertyMap
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object r2 = r1.get(r0)
            com.facebook.papaya.store.Property r2 = (com.facebook.papaya.store.Property) r2
            if (r2 == 0) goto L_0x0801
            X.68w r1 = r2.type
            X.68w r0 = X.C973168w.MAPPED_FLOAT
            if (r1 != r0) goto L_0x0801
            java.lang.Object r1 = r2.value
            java.util.Map r1 = (java.util.Map) r1
        L_0x069c:
            X.C04220Ms.A06(r1)
            int r0 = r1.size()
            java.util.ArrayList r12 = X.C18240wQ.A0k(r0)
            java.util.Iterator r13 = X.AnonymousClass0wJ.A0z(r1)
        L_0x06ab:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x06d3
            java.util.Map$Entry r1 = X.C18180wK.A0o(r13)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r1.getValue()
            double r0 = X.C86124wJ.A00(r0)
            float r2 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r7.put(r11, r0)
            kotlin.Unit r0 = kotlin.Unit.A00
            r12.add(r0)
            goto L_0x06ab
        L_0x06d3:
            com.facebook.papaya.store.Record r1 = r9.get(r8)
            X.77m r0 = new X.77m
            r0.<init>(r1)
            com.facebook.papaya.store.Record r0 = r0.A00
            r11 = -9
            com.google.common.collect.ImmutableMap r1 = r0.mPropertyMap
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object r2 = r1.get(r0)
            com.facebook.papaya.store.Property r2 = (com.facebook.papaya.store.Property) r2
            if (r2 == 0) goto L_0x072b
            X.68w r1 = r2.type
            X.68w r0 = X.C973168w.MAPPED_INT
            if (r1 != r0) goto L_0x072b
            java.lang.Object r1 = r2.value
            java.util.Map r1 = (java.util.Map) r1
        L_0x06f8:
            X.C04220Ms.A06(r1)
            int r0 = r1.size()
            java.util.ArrayList r11 = X.C18240wQ.A0k(r0)
            java.util.Iterator r12 = X.AnonymousClass0wJ.A0z(r1)
        L_0x0707:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x072e
            java.util.Map$Entry r1 = X.C18180wK.A0o(r12)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r1.getValue()
            X.C04220Ms.A06(r1)
            r0 = r17
            r0.put(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.A00
            r11.add(r0)
            goto L_0x0707
        L_0x072b:
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            goto L_0x06f8
        L_0x072e:
            com.facebook.papaya.store.Record r1 = r9.get(r8)
            X.77m r0 = new X.77m
            r0.<init>(r1)
            com.facebook.papaya.store.Record r0 = r0.A00
            r11 = -11
            com.google.common.collect.ImmutableMap r1 = r0.mPropertyMap
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object r2 = r1.get(r0)
            com.facebook.papaya.store.Property r2 = (com.facebook.papaya.store.Property) r2
            if (r2 == 0) goto L_0x07c0
            X.68w r1 = r2.type
            X.68w r0 = X.C973168w.MAPPED_STRING
            if (r1 != r0) goto L_0x07c0
            java.lang.Object r1 = r2.value
            java.util.Map r1 = (java.util.Map) r1
        L_0x0753:
            X.C04220Ms.A06(r1)
            int r0 = r1.size()
            java.util.ArrayList r13 = X.C18240wQ.A0k(r0)
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r1)
        L_0x0762:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07c3
            java.util.Map$Entry r15 = X.C18180wK.A0o(r16)
            java.lang.Object r0 = r15.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x07ad
            long r1 = r0.longValue()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x07ad
            X.Kq4 r14 = X.C36975Ji8.A03
            java.lang.Object r12 = r15.getValue()
            X.C04220Ms.A06(r12)
            java.lang.String r12 = (java.lang.String) r12
            X.76V r15 = r14.A02
            java.lang.Class<com.facebook.dcp.model.DcpContext> r0 = com.facebook.dcp.model.DcpContext.class
            X.0Ai r11 = X.C18210wN.A0l(r0)
            java.util.List r6 = java.util.Collections.emptyList()
            boolean r2 = X.C18200wM.A1Z(r6)
            r1 = 0
            X.0AD r0 = new X.0AD
            r0.<init>(r6, r1, r11, r2)
            X.8sP r0 = X.AnonymousClass72C.A00(r0, r15)
            java.lang.Object r6 = r14.A00(r12, r0)
        L_0x07a7:
            kotlin.Unit r0 = kotlin.Unit.A00
            r13.add(r0)
            goto L_0x0762
        L_0x07ad:
            java.lang.Object r0 = r15.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r15.getValue()
            X.C04220Ms.A06(r0)
            r10.put(r1, r0)
            goto L_0x07a7
        L_0x07c0:
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            goto L_0x0753
        L_0x07c3:
            com.facebook.papaya.store.Record r1 = r9.get(r8)
            X.77m r0 = new X.77m
            r0.<init>(r1)
            com.facebook.papaya.store.Record r0 = r0.A00
            java.lang.String r11 = r0.mName
            com.facebook.papaya.store.Record r1 = r9.get(r8)
            X.77m r0 = new X.77m
            r0.<init>(r1)
            com.facebook.papaya.store.Record r0 = r0.A00
            long r1 = r0.mTimestamp
            com.facebook.dcp.model.DcpContext r6 = (com.facebook.dcp.model.DcpContext) r6
            r23 = 0
            java.util.Map r27 = X.AnonymousClass4WJ.A0A()
            com.facebook.dcp.signals.model.SignalResult r0 = new com.facebook.dcp.signals.model.SignalResult
            r22 = r11
            r24 = r17
            r25 = r7
            r26 = r10
            r28 = r1
            r19 = r0
            r20 = r6
            r21 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.add(r0)
            int r8 = r8 + 1
            goto L_0x0666
        L_0x0801:
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            goto L_0x069c
        L_0x0805:
            java.lang.Object r7 = r8.A00
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.68S r6 = X.AnonymousClass68S.SIGNAL_STORE_COLLECT
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            X.7Gq r2 = r5.A02
            kotlin.jvm.internal.KtLambdaShape4S1210000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape4S1210000_I2
            r8 = r1
            r9 = r5
            r10 = r7
            r11 = r3
            r12 = r0
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r0 = "no_use_case"
            java.lang.Object r4 = X.C98666Gl.A00(r6, r2, r4, r0, r1)
            java.util.List r4 = (java.util.List) r4
            goto L_0x0835
        L_0x0825:
            int r1 = r4.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0835
            r1 = 5
            com.facebook.redex.IDxComparatorShape95S0000000_2_I2 r0 = new com.facebook.redex.IDxComparatorShape95S0000000_2_I2
            r0.<init>(r1)
            X.C001300p.A0y(r4, r0)
        L_0x0835:
            X.7DX r0 = r5.A06
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0873
            r0 = 1
            X.C04220Ms.A0B(r4, r0)
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            java.util.Iterator r3 = r4.iterator()
        L_0x084b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x086b
            java.lang.Object r2 = r3.next()
            com.facebook.dcp.signals.model.SignalResult r2 = (com.facebook.dcp.signals.model.SignalResult) r2
            java.util.Map r1 = r2.A06
            java.lang.String r0 = "100002"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x084b
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x084b
            r6.put(r1, r2)
            goto L_0x084b
        L_0x086b:
            java.util.Collection r0 = r6.values()
            java.util.List r4 = X.AnonymousClass00J.A0N(r0)
        L_0x0873:
            X.7Gq r2 = r5.A02
            java.lang.String r0 = "extracted_signal"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2
            r1.<init>((java.lang.String) r0, (java.util.List) r4)
            X.68S r0 = X.AnonymousClass68S.SIGNAL_STORE_EXTRACT
            goto L_0x0915
        L_0x0880:
            java.lang.String r0 = "no signal metadata for signal with id "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r3)
            X.5F3 r0 = new X.5F3
            r0.<init>(r1)
            throw r0
        L_0x088c:
            java.lang.Object r10 = r8.A01
            X.791 r10 = (X.AnonymousClass791) r10
            X.7DX r0 = r10.A05
            java.lang.String r2 = r8.A02
            r9 = 0
            X.C04220Ms.A0B(r2, r9)
            java.util.HashMap r0 = r0.A00
            java.lang.Object r6 = r0.get(r2)
            X.8gX r6 = (X.C143328gX) r6
            boolean r4 = r8.A03
            X.74n r0 = r10.A00()
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
            com.facebook.dcp.signals.model.SignalMetadata r0 = (com.facebook.dcp.signals.model.SignalMetadata) r0
            r11 = 0
            if (r0 == 0) goto L_0x09a1
            long r0 = r0.A04
        L_0x08b4:
            java.lang.String r3 = "last_signal_collect_key_"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r3, r2)
            if (r4 == 0) goto L_0x08cc
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x08cc
        L_0x08c0:
            java.lang.String r0 = "too early to collect signal with id "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            X.5F3 r0 = new X.5F3
            r0.<init>(r1)
            throw r0
        L_0x08cc:
            X.8nC r7 = r10.A01
            X.7do r7 = (X.C125677do) r7
            boolean r4 = X.C125677do.A01(r7, r5)
            if (r4 == 0) goto L_0x08ed
            long r11 = X.C18190wL.A07()
            X.C04220Ms.A0B(r5, r9)
            java.lang.String r4 = r7.getString(r5)
            long r4 = java.lang.Long.parseLong(r4)
            long r11 = r11 - r4
            r4 = 60
            long r0 = r0 * r4
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x08c0
        L_0x08ed:
            X.74n r0 = r10.A00()
            java.util.HashMap r0 = r0.A00
            java.lang.Object r11 = r0.get(r2)
            com.facebook.dcp.signals.model.SignalMetadata r11 = (com.facebook.dcp.signals.model.SignalMetadata) r11
            if (r11 == 0) goto L_0x09a5
            if (r6 != 0) goto L_0x0919
            java.lang.String r1 = X.AnonymousClass791.A09
            java.lang.String r0 = "no signal collector for signal with id "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            X.AnonymousClass0LU.A0C(r1, r0)
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x090a:
            X.7Gq r2 = r10.A02
            java.lang.String r0 = "collected_signal"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2
            r1.<init>((java.lang.String) r0, (java.util.List) r4)
            X.68S r0 = X.AnonymousClass68S.SIGNAL_STORE_COLLECT
        L_0x0915:
            X.C121547Gq.A01(r0, r1, r2)
            return r4
        L_0x0919:
            java.lang.Object r4 = r6.ADZ(r11)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r13 = r8.A00
            com.facebook.dcp.model.DcpContext r13 = (com.facebook.dcp.model.DcpContext) r13
            if (r13 == 0) goto L_0x097b
            X.C04220Ms.A0B(r4, r9)
            java.util.ArrayList r0 = X.C18200wM.A0s(r4)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0934:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x097b
            java.lang.Object r1 = r16.next()
            com.facebook.dcp.signals.model.SignalResult r1 = (com.facebook.dcp.signals.model.SignalResult) r1
            java.lang.String r12 = r1.A03
            java.lang.String r0 = r1.A04
            r18 = r0
            java.util.Map r14 = r1.A06
            java.util.Map r8 = r1.A05
            java.util.Map r6 = r1.A08
            java.util.Map r5 = r1.A07
            java.lang.String r0 = r1.A02
            r17 = r0
            long r0 = r1.A00
            X.C04220Ms.A0B(r12, r9)
            X.AnonymousClass0wJ.A1Q(r14, r8)
            r15 = 4
            X.C18190wL.A1S(r6, r15, r5)
            com.facebook.dcp.signals.model.SignalResult r15 = new com.facebook.dcp.signals.model.SignalResult
            r24 = r6
            r25 = r5
            r26 = r0
            r20 = r18
            r21 = r17
            r22 = r14
            r23 = r8
            r17 = r15
            r18 = r13
            r19 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.add(r15)
            goto L_0x0934
        L_0x097b:
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x0985
            int r0 = r11.A01
            long r0 = (long) r0
            r10.A01(r0, r2, r4)
        L_0x0985:
            java.lang.String r3 = X.AnonymousClass00U.A0L(r3, r2)
            long r5 = X.C18190wL.A07()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 30
            long r1 = r2.toMillis(r0)
            X.C04220Ms.A0B(r3, r9)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r7.CYP(r3, r0, r1)
            goto L_0x090a
        L_0x09a1:
            r0 = 0
            goto L_0x08b4
        L_0x09a5:
            java.lang.String r0 = "no signal metadata for signal with id "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r2)
            X.5F3 r0 = new X.5F3
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S1210000_I2.invoke():java.lang.Object");
    }
}
