package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape16S0200000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape16S0200000_I2(int i, Object obj, Object obj2) {
        super(0);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v73, types: [X.8n9, X.Ew2, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03bd, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (X.AnonymousClass0wJ.A1X(X.C86144wL.A0j(r3.A01)) != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0559, code lost:
        r0 = X.AnonymousClass7KC.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0566, code lost:
        return X.C86124wJ.A0O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07e1, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        X.C25237DiI.A00(r2, r2, X.C86164wN.A0o(r1, r2, r0), r3, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r43 = this;
            r3 = r43
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x03c0;
                case 1: goto L_0x0025;
                case 2: goto L_0x03cb;
                case 3: goto L_0x03db;
                case 4: goto L_0x03ab;
                case 5: goto L_0x0007;
                case 6: goto L_0x03ab;
                case 7: goto L_0x0007;
                case 8: goto L_0x0041;
                case 9: goto L_0x03fb;
                case 10: goto L_0x0511;
                case 11: goto L_0x0420;
                case 12: goto L_0x0567;
                case 13: goto L_0x058f;
                case 14: goto L_0x059d;
                case 15: goto L_0x05ba;
                case 16: goto L_0x05c3;
                case 17: goto L_0x05dc;
                case 18: goto L_0x05eb;
                case 19: goto L_0x05fb;
                case 20: goto L_0x0622;
                case 21: goto L_0x062f;
                case 22: goto L_0x065b;
                case 23: goto L_0x0726;
                case 24: goto L_0x0733;
                case 25: goto L_0x0740;
                case 26: goto L_0x0759;
                case 27: goto L_0x076f;
                case 28: goto L_0x0783;
                case 29: goto L_0x07a0;
                case 30: goto L_0x07c5;
                case 31: goto L_0x07d3;
                case 32: goto L_0x07e2;
                case 33: goto L_0x0800;
                case 34: goto L_0x080e;
                case 35: goto L_0x081c;
                case 36: goto L_0x0062;
                case 37: goto L_0x082a;
                case 38: goto L_0x0838;
                case 39: goto L_0x0846;
                case 40: goto L_0x0854;
                case 41: goto L_0x08d4;
                case 42: goto L_0x08e2;
                case 43: goto L_0x08fc;
                case 44: goto L_0x090a;
                case 45: goto L_0x0918;
                case 46: goto L_0x0922;
                case 47: goto L_0x0938;
                case 48: goto L_0x096a;
                case 49: goto L_0x0980;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A01
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            java.lang.Object r3 = r3.A00
            X.4qz r3 = (X.C83224qz) r3
            boolean r0 = r1.AVo()
            if (r0 == 0) goto L_0x03bd
            r2 = 0
            r0 = 7
        L_0x0017:
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
        L_0x001f:
            r0 = 1
        L_0x0020:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0024:
            return r2
        L_0x0025:
            java.lang.Object r0 = r3.A00
            X.8pE r0 = (X.C147368pE) r0
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x001f
            java.lang.Object r0 = r3.A01
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
            goto L_0x001f
        L_0x0041:
            java.lang.Object r2 = r3.A00
            if (r2 != 0) goto L_0x0024
            java.lang.Object r0 = r3.A01
            X.7YC r0 = (X.AnonymousClass7YC) r0
            X.8mM r1 = r0.A01
            if (r1 == 0) goto L_0x0996
            boolean r0 = r1.BRS()
            if (r0 == 0) goto L_0x0996
            long r0 = r1.BCI()
            long r2 = X.AnonymousClass7FV.A02(r0)
            long r0 = X.AnonymousClass7KC.A03
            X.7F6 r2 = X.AnonymousClass6EY.A00(r0, r2)
            return r2
        L_0x0062:
            java.lang.Object r2 = r3.A01
            X.6lu r2 = (X.C110566lu) r2
            java.lang.Object r0 = r3.A00
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r4 = X.C18200wM.A0u()
            java.util.Iterator r7 = r0.iterator()
        L_0x0072:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r6 = X.C18180wK.A0k(r7)
            X.7DX r0 = r2.A03
            X.8nP r5 = X.AnonymousClass7DX.A00(r0, r6)
            if (r5 == 0) goto L_0x0998
            java.lang.String r3 = r5.BI4()
            java.lang.String r0 = r5.BI5()
            X.5IK r1 = new X.5IK
            r1.<init>(r6, r3, r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0098
            r4.add(r1)
        L_0x0098:
            java.lang.String r3 = r5.B2c()
            java.lang.String r0 = r5.B2d()
            X.5IK r1 = new X.5IK
            r1.<init>(r6, r3, r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0072
            r4.add(r1)
            goto L_0x0072
        L_0x00ad:
            java.lang.String r5 = ","
            X.8Mg r9 = X.C138998Mg.A00
            r6 = 0
            r3 = 0
            r10 = 30
            r7 = r6
            r8 = r4
            java.lang.String r1 = X.AnonymousClass00J.A0H(r5, r6, r7, r8, r9, r10)
            java.util.HashSet r9 = X.C18200wM.A0u()
            java.util.HashMap r17 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r13 = r4.iterator()
        L_0x00c7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r8 = r13.next()
            X.5IK r8 = (X.AnonymousClass5IK) r8
            X.74l r0 = r2.A01
            X.C04220Ms.A0B(r8, r3)
            java.lang.String r12 = r8.A00
            java.lang.String r11 = r8.A02
            r10 = 95
            java.lang.String r7 = "_metadata"
            java.lang.String r5 = X.AnonymousClass00U.A0W(r12, r11, r7, r10)
            X.8nC r4 = r0.A00
            r0 = r4
            X.7do r0 = (X.C125677do) r0
            boolean r0 = X.C125677do.A01(r0, r5)
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = X.AnonymousClass00U.A0W(r12, r11, r7, r10)
            X.Kq4 r7 = X.C36975Ji8.A03
            java.lang.String r5 = r4.getString(r0)
            X.76V r4 = r7.A02
            java.lang.Class<com.facebook.dcp.model.UseCaseMetadata> r0 = com.facebook.dcp.model.UseCaseMetadata.class
            java.lang.Object r4 = X.C18240wQ.A0a(r0, r5, r7, r4)
            r0 = r17
            r0.put(r8, r4)
            goto L_0x00c7
        L_0x0107:
            r9.add(r8)
            goto L_0x00c7
        L_0x010b:
            X.6by r0 = r2.A04
            X.0cE r0 = r0.A00
            r7 = 1
            if (r0 == 0) goto L_0x027c
            r4 = 36319231297655794(0x810826000313f2, double:3.031766346218899E-306)
            boolean r0 = r0.ATr(r4)
            if (r0 != r7) goto L_0x027c
        L_0x011d:
            if (r7 == 0) goto L_0x0182
            X.74l r10 = r2.A01
            X.8nC r8 = r10.A00
            java.lang.String r4 = X.C1193074l.A00(r10, r1)
            r0 = r8
            X.7do r0 = (X.C125677do) r0
            boolean r0 = X.C125677do.A01(r0, r4)
            if (r0 == 0) goto L_0x0182
            X.Kq4 r5 = X.C36975Ji8.A03
            java.lang.String r0 = X.C1193074l.A00(r10, r1)
            java.lang.String r4 = r8.getString(r0)
            X.76V r1 = r5.A02
            java.lang.Class<com.facebook.dcp.model.MetadataResponse> r0 = com.facebook.dcp.model.MetadataResponse.class
            java.lang.Object r9 = X.C18240wQ.A0a(r0, r4, r5, r1)
            com.facebook.dcp.model.MetadataResponse r9 = (com.facebook.dcp.model.MetadataResponse) r9
            X.7Gq r5 = r2.A02
            r4 = 6
            java.lang.String r1 = "read_from_cache"
            r0 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r1, r6, r4, r0)
            X.68S r0 = X.AnonymousClass68S.DCP_METADATA_FETCH
            X.C121547Gq.A01(r0, r1, r5)
        L_0x0153:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0284
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.Map r0 = r9.A00
            r6.putAll(r0)
            java.util.Iterator r5 = X.AnonymousClass0wJ.A0z(r17)
        L_0x0166:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x027f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r6.get(r4)
            if (r0 != 0) goto L_0x0166
            r6.put(r4, r1)
            goto L_0x0166
        L_0x0182:
            boolean r0 = r9.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x01a2
            java.util.Map r0 = X.AnonymousClass4WJ.A0A()
            com.facebook.dcp.model.MetadataResponse r9 = new com.facebook.dcp.model.MetadataResponse
            r9.<init>(r0)
            X.7Gq r5 = r2.A02
            r4 = 6
            java.lang.String r1 = "skip_network_call_all_use_cases_cached"
            r0 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r1, r6, r4, r0)
            X.68S r0 = X.AnonymousClass68S.DCP_METADATA_FETCH
            X.C121547Gq.A01(r0, r1, r5)
            goto L_0x0153
        L_0x01a2:
            X.6oy r11 = r2.A00
            java.util.List r0 = X.AnonymousClass00J.A0N(r9)
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x01b0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = r12.next()
            X.5IK r0 = (X.AnonymousClass5IK) r0
            java.lang.String r10 = r0.A00
            java.lang.String r8 = r0.A02
            r5 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            r0.<init>(r10, r8, r5)
            r13.add(r0)
            goto L_0x01b0
        L_0x01ca:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r13)
            java.lang.String r0 = "10000"
            X.8gY r0 = r11.A00(r5, r0)
            X.775 r8 = X.AnonymousClass6XA.A00
            if (r0 == 0) goto L_0x01e8
            com.facebook.pando.TreeJNI r5 = X.C685344e.A03(r0)
            if (r5 == 0) goto L_0x01e8
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata> r4 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.class
            java.lang.String r0 = "on_device_fl_metadata(input_params:{\"client_signal_metadata_version\":$client_signal_metadata_version,\"usecases\":$usecases})"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)
            com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata r4 = (com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata) r4
        L_0x01e8:
            X.7DX r0 = r2.A03
            com.facebook.dcp.model.MetadataResponse r9 = r8.A01(r0, r4, r9)
            java.util.Map r0 = r9.A00
            r16 = r0
            boolean r0 = r16.isEmpty()
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "no use case metadata"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r5.<init>((int) r3, (java.lang.String) r0, (boolean) r3)
        L_0x01ff:
            X.7Gq r0 = r2.A02
            r18 = r0
            r12 = 6
            java.lang.String r0 = "fetched_from_server"
            r11 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r4 = X.C86134wK.A0N(r0, r6, r12, r11)
            X.68S r10 = X.AnonymousClass68S.DCP_METADATA_FETCH
            java.lang.String r8 = "no_use_case"
            r0 = r18
            r0.A02(r10, r4, r8)
            if (r7 == 0) goto L_0x0153
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0153
            X.74l r0 = r2.A01
            X.8nC r7 = r0.A00
            java.lang.String r14 = X.C1193074l.A00(r0, r1)
            X.Kq4 r5 = X.C36975Ji8.A03
            X.76V r4 = r5.A02
            java.lang.Class<com.facebook.dcp.model.MetadataResponse> r0 = com.facebook.dcp.model.MetadataResponse.class
            java.lang.String r13 = X.C18210wN.A0d(r0, r9, r5, r4)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 15
            long r0 = r15.toMillis(r0)
            r7.CYP(r14, r13, r0)
            java.util.Iterator r16 = X.C86104wH.A14(r16)
        L_0x023b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r1 = r16.next()
            com.facebook.dcp.model.UseCaseMetadata r1 = (com.facebook.dcp.model.UseCaseMetadata) r1
            X.C04220Ms.A0B(r1, r3)
            java.lang.String r15 = r1.A07
            java.lang.String r14 = r1.A0B
            r13 = 95
            java.lang.String r0 = "_metadata"
            java.lang.String r14 = X.AnonymousClass00U.A0W(r15, r14, r0, r13)
            java.lang.Class<com.facebook.dcp.model.UseCaseMetadata> r0 = com.facebook.dcp.model.UseCaseMetadata.class
            java.lang.String r13 = X.C18210wN.A0d(r0, r1, r5, r4)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.DAYS
            long r0 = r1.A00
            long r0 = r15.toMillis(r0)
            r7.CYP(r14, r13, r0)
            goto L_0x023b
        L_0x0268:
            r0 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r5.<init>(r3, r0)
            goto L_0x01ff
        L_0x026f:
            java.lang.String r0 = "write_to_cache"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r0, r6, r12, r11)
            r0 = r18
            r0.A02(r10, r1, r8)
            goto L_0x0153
        L_0x027c:
            r7 = 0
            goto L_0x011d
        L_0x027f:
            com.facebook.dcp.model.MetadataResponse r9 = new com.facebook.dcp.model.MetadataResponse
            r9.<init>(r6)
        L_0x0284:
            java.util.HashMap r17 = X.AnonymousClass0wJ.A0y()
            java.util.Map r0 = r9.A00
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r0)
        L_0x028e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0382
            java.util.Map$Entry r0 = X.C18180wK.A0o(r16)
            java.lang.Object r4 = r0.getKey()
            X.5IK r4 = (X.AnonymousClass5IK) r4
            java.lang.Object r5 = r0.getValue()
            com.facebook.dcp.model.UseCaseMetadata r5 = (com.facebook.dcp.model.UseCaseMetadata) r5
            X.7DX r1 = r2.A03
            java.lang.String r0 = r4.A01
            X.8nP r1 = X.AnonymousClass7DX.A00(r1, r0)
            if (r1 == 0) goto L_0x037b
            boolean r0 = r1.B2Z()
            if (r0 == 0) goto L_0x037b
            com.facebook.dcp.model.PredictorMetadata r6 = r5.A05
            java.lang.String r9 = r1.B2X()
            long r28 = r1.B2Y()
            java.lang.String r8 = r1.B2W()
            boolean r40 = r1.B2U()
            long r30 = r1.B2b()
            long r34 = r1.B2a()
            java.util.Map r7 = r6.A0C
            r24 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r6.A00
            r21 = r0
            boolean r0 = r6.A0D
            r20 = r0
            boolean r0 = r6.A0F
            r19 = r0
            com.facebook.dcp.model.ExampleSource r0 = r6.A08
            long r14 = r6.A05
            long r12 = r6.A03
            long r10 = r6.A02
            com.facebook.dcp.model.LogLevel r1 = r6.A09
            X.C04220Ms.A0B(r7, r3)
            r6 = 1
            X.C18180wK.A1P(r9, r6, r8)
            r6 = 9
            X.C04220Ms.A0B(r0, r6)
            r6 = 15
            X.C04220Ms.A0B(r1, r6)
            com.facebook.dcp.model.PredictorMetadata r18 = new com.facebook.dcp.model.PredictorMetadata
            r23 = r7
            r26 = r21
            r32 = r14
            r36 = r12
            r38 = r10
            r41 = r20
            r42 = r19
            r19 = r0
            r20 = r1
            r21 = r9
            r22 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r38, r40, r41, r42)
            java.lang.String r0 = r5.A07
            r25 = r0
            java.lang.String r15 = r5.A0B
            java.lang.String r12 = r5.A0A
            java.lang.String r11 = r5.A08
            java.lang.String r10 = r5.A09
            boolean r0 = r5.A0F
            r39 = r0
            long r0 = r5.A01
            r34 = r0
            boolean r0 = r5.A0E
            r38 = r0
            java.util.List r14 = r5.A0C
            java.util.Map r13 = r5.A0D
            com.facebook.dcp.model.TrainerMetadata r9 = r5.A06
            com.facebook.dcp.model.DcpContext r8 = r5.A04
            com.facebook.dcp.model.DcpContext r7 = r5.A03
            com.facebook.dcp.model.DcpContext r6 = r5.A02
            long r0 = r5.A00
            r36 = r0
            r0 = r25
            X.C04220Ms.A0B(r0, r3)
            X.AnonymousClass0wJ.A1O(r15, r12)
            X.AnonymousClass0wJ.A1R(r11, r10)
            r0 = 8
            X.C86114wI.A1I(r14, r0, r13)
            r0 = 11
            X.C04220Ms.A0B(r9, r0)
            r0 = 12
            X.C86124wJ.A1A(r0, r8, r7, r6)
            com.facebook.dcp.model.UseCaseMetadata r5 = new com.facebook.dcp.model.UseCaseMetadata
            r19 = r5
            r20 = r8
            r21 = r7
            r22 = r6
            r23 = r18
            r24 = r9
            r26 = r15
            r27 = r12
            r28 = r11
            r29 = r10
            r30 = r14
            r31 = r13
            r32 = r34
            r34 = r36
            r36 = r39
            r37 = r38
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)
        L_0x037b:
            r0 = r17
            r0.put(r4, r5)
            goto L_0x028e
        L_0x0382:
            com.facebook.dcp.model.MetadataResponse r2 = new com.facebook.dcp.model.MetadataResponse
            r0 = r17
            r2.<init>(r0)
            java.util.Map r0 = r2.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03a4
            java.lang.String r0 = "no use case metadata"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r1.<init>((int) r3, (java.lang.String) r0, (boolean) r3)
        L_0x0398:
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r1.A00
            X.5Ez r1 = new X.5Ez
            r1.<init>(r0)
            throw r1
        L_0x03a4:
            r0 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r1.<init>(r3, r0)
            goto L_0x0398
        L_0x03ab:
            java.lang.Object r1 = r3.A01
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            java.lang.Object r3 = r3.A00
            X.4qz r3 = (X.C83224qz) r3
            boolean r0 = r1.AVn()
            if (r0 == 0) goto L_0x03bd
            r2 = 0
            r0 = 6
            goto L_0x0017
        L_0x03bd:
            r0 = 0
            goto L_0x0020
        L_0x03c0:
            java.lang.Object r1 = r3.A00
            X.8m8 r1 = (X.C146368m8) r1
            java.lang.Object r0 = r3.A01
            r1.D7w(r0)
            goto L_0x07df
        L_0x03cb:
            java.lang.Object r1 = r3.A00
            X.77X r1 = (X.AnonymousClass77X) r1
            X.8LW r0 = X.AnonymousClass8LW.A00
            r1.A00(r0)
            java.lang.Object r0 = r3.A01
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            return r2
        L_0x03db:
            java.lang.Object r1 = r3.A01
            X.8lw r1 = (X.C146268lw) r1
            boolean r0 = r1.AVo()
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r0 = r3.A00
            X.8p8 r0 = (X.C147308p8) r0
            int r0 = r0.getItemCount()
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
        L_0x03f1:
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            return r2
        L_0x03f6:
            float r1 = r1.AbV()
            goto L_0x03f1
        L_0x03fb:
            java.lang.Object r6 = r3.A00
            X.7HD r6 = (X.AnonymousClass7HD) r6
            long r4 = r6.A00
            java.lang.Object r3 = r3.A01
            X.8pE r3 = (X.C147368pE) r3
            long r1 = X.AnonymousClass7HD.A00(r3)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x041b
            X.7Ia r1 = r6.A02
            X.7HD r0 = X.C86154wM.A0I(r3)
            X.7Ia r0 = r0.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x07df
        L_0x041b:
            r3.CrC(r6)
            goto L_0x07df
        L_0x0420:
            java.lang.Object r9 = r3.A01
            X.7Ii r9 = (X.C121827Ii) r9
            java.lang.Object r0 = r3.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.6t4 r0 = (X.C114336t4) r0
            long r3 = r0.A00
            r11 = 0
            X.C04220Ms.A0B(r9, r11)
            X.8pE r13 = r9.A0H
            int r0 = X.C134747yH.A01(r13)
            r2 = 1
            if (r0 == 0) goto L_0x0559
            X.8pE r0 = r9.A0F
            java.lang.Object r0 = r0.getValue()
            X.678 r0 = (X.AnonymousClass678) r0
            r1 = -1
            if (r0 == 0) goto L_0x0559
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0559
            r7 = 2
            if (r0 == r11) goto L_0x0503
            if (r0 == r2) goto L_0x0503
            if (r0 != r7) goto L_0x050c
            long r0 = X.AnonymousClass7HD.A00(r13)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
        L_0x045d:
            int r5 = (int) r0
            X.8nB r0 = r9.A07
            int r1 = r0.CVm(r5)
            X.6qu r0 = r9.A02
            if (r0 == 0) goto L_0x0559
            X.7Gf r0 = X.C147368pE.A00(r0)
            if (r0 == 0) goto L_0x0559
            X.7AW r10 = r0.A02
            X.6qu r0 = r9.A02
            if (r0 == 0) goto L_0x0559
            X.6sY r0 = r0.A00
            if (r0 == 0) goto L_0x0559
            X.7yH r0 = r0.A05
            int r0 = r0.length()
            int r0 = r0 + -1
            X.8bH r0 = X.AnonymousClass8bH.A02(r11, r0)
            int r8 = X.AnonymousClass8bI.A06(r0, r1)
            X.7F6 r0 = r10.A09(r8)
            long r16 = r0.A01()
            X.6qu r0 = r9.A02
            if (r0 == 0) goto L_0x0559
            X.8mM r6 = r0.A01
            if (r6 == 0) goto L_0x0559
            X.7Gf r0 = X.C147368pE.A00(r0)
            if (r0 == 0) goto L_0x0559
            X.8mM r5 = r0.A01
            if (r5 == 0) goto L_0x0559
            X.8pE r0 = r9.A0E
            java.lang.Object r0 = r0.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            if (r0 == 0) goto L_0x0559
            long r0 = r0.A00
            long r0 = r5.Bay(r6, r0)
            float r9 = X.AnonymousClass7KC.A01(r0)
            int r0 = r10.A04(r8)
            int r12 = r10.A05(r0)
            int r8 = r10.A06(r0, r2)
            long r0 = X.AnonymousClass7HD.A00(r13)
            r15 = 32
            long r0 = r0 >> r15
            int r14 = (int) r0
            long r0 = X.AnonymousClass7HD.A00(r13)
            int r0 = X.C86104wH.A08(r0)
            boolean r0 = X.C86134wK.A1X(r14, r0)
            float r2 = X.AnonymousClass6EA.A00(r10, r12, r2, r0)
            float r0 = X.AnonymousClass6EA.A00(r10, r8, r11, r0)
            float r1 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r2, r0)
            float r2 = X.AnonymousClass8bI.A01(r9, r1, r0)
            float r1 = X.C86124wJ.A01(r9, r2)
            long r3 = r3 >> r15
            int r0 = (int) r3
            int r0 = r0 / r7
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0559
            float r0 = X.AnonymousClass7KC.A02(r16)
            long r0 = X.C86104wH.A0C(r2, r0)
            long r0 = r6.Bay(r5, r0)
            goto L_0x0562
        L_0x0503:
            long r0 = X.AnonymousClass7HD.A00(r13)
            r5 = 32
            long r0 = r0 >> r5
            goto L_0x045d
        L_0x050c:
            X.4VZ r1 = X.AnonymousClass4VZ.A00()
            throw r1
        L_0x0511:
            java.lang.Object r7 = r3.A01
            X.7F8 r7 = (X.AnonymousClass7F8) r7
            java.lang.Object r0 = r3.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.6t4 r0 = (X.C114336t4) r0
            long r2 = r0.A00
            r6 = 0
            X.C04220Ms.A0B(r7, r6)
            X.8pE r0 = r7.A08
            java.lang.Object r5 = r0.getValue()
            X.6u3 r5 = (X.C114886u3) r5
            if (r5 == 0) goto L_0x0559
            X.8pE r0 = r7.A0C
            java.lang.Object r1 = r0.getValue()
            X.678 r1 = (X.AnonymousClass678) r1
            r0 = -1
            if (r1 == 0) goto L_0x0559
            int r4 = r1.ordinal()
            if (r4 == r0) goto L_0x0559
            r1 = 1
            if (r4 == r1) goto L_0x0552
            r0 = 2
            if (r4 == r0) goto L_0x055c
            if (r4 == r6) goto L_0x054b
            X.4VZ r1 = X.AnonymousClass4VZ.A00()
            throw r1
        L_0x054b:
            java.lang.String r0 = "SelectionContainer does not support cursor"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x0552:
            X.6u2 r0 = r5.A01
            long r0 = X.AnonymousClass7FK.A00(r0, r7, r2, r1)
            goto L_0x0562
        L_0x0559:
            long r0 = X.AnonymousClass7KC.A02
            goto L_0x0562
        L_0x055c:
            X.6u2 r0 = r5.A00
            long r0 = X.AnonymousClass7FK.A00(r0, r7, r2, r6)
        L_0x0562:
            X.7KC r2 = X.C86124wJ.A0O(r0)
            return r2
        L_0x0567:
            java.lang.Object r4 = r3.A00
            X.6b7 r4 = (X.C104026b7) r4
            androidx.compose.material.SwipeableV2State r0 = r4.A00
            X.0YY r1 = r0.A0D
            X.66m r0 = X.C967366m.Closed
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x058a
            java.lang.Object r3 = r3.A01
            X.4qz r3 = (X.C83224qz) r3
            r2 = 0
            r0 = 11
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
        L_0x058a:
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x058f:
            java.lang.Object r1 = r3.A01
            X.66m r1 = (X.C967366m) r1
            java.lang.Object r0 = r3.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.6b7 r2 = new X.6b7
            r2.<init>(r1, r0)
            return r2
        L_0x059d:
            r4 = 0
            java.lang.Object r2 = r3.A01
            X.6iW r2 = (X.C108536iW) r2
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x07df
            java.util.List r1 = r2.A02
            r0 = 46
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r0 = X.C86154wM.A0z(r4, r0)
            X.C000300e.A0v(r0, r1)
            X.8ff r0 = r2.A00
            if (r0 == 0) goto L_0x07df
            r0.invalidate()
            goto L_0x07df
        L_0x05ba:
            java.lang.Object r0 = r3.A01
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.AnonymousClass7W3.A0k(r0)
            goto L_0x07df
        L_0x05c3:
            java.lang.Object r4 = r3.A01
            X.84Z r4 = (X.AnonymousClass84Z) r4
            java.lang.Object r3 = r3.A00
            X.8p9 r3 = (X.C147318p9) r3
            int r2 = r4.size()
            r1 = 0
        L_0x05d0:
            if (r1 >= r2) goto L_0x07df
            java.lang.Object r0 = r4.A01(r1)
            r3.CZW(r0)
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05dc:
            java.lang.Object r0 = r3.A01
            X.78y r0 = (X.AnonymousClass78y) r0
            X.0YY r1 = r0.A07
            java.lang.Object r0 = r3.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            X.C121637Hc.A03(r0, r1)
            goto L_0x07df
        L_0x05eb:
            java.lang.Object r1 = r3.A00
            X.0MJ r1 = (X.AnonymousClass0MJ) r1
            java.lang.Object r0 = r3.A01
            X.53d r0 = (X.C875353d) r0
            X.8n8 r0 = r0.A06()
            r1.A00 = r0
            goto L_0x07df
        L_0x05fb:
            java.lang.Object r4 = r3.A00
            X.8pV r4 = (X.C147538pV) r4
            X.8pS r4 = (X.C147508pS) r4
            java.lang.Object r2 = r3.A01
            X.53X r2 = (X.AnonymousClass53X) r2
            X.7Ws r4 = (X.C123387Ws) r4
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.7ZH r1 = r4.A00
            r1.A00 = r2
            r0 = 0
            r1.A01 = r0
            X.0YY r0 = r4.A01
            r0.invoke(r1)
            X.6bG r0 = r1.A01
            if (r0 != 0) goto L_0x07df
            java.lang.String r0 = "DrawResult not defined, did you forget to call onDraw?"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x0622:
            java.lang.Object r1 = r3.A01
            X.54T r1 = (X.AnonymousClass54T) r1
            java.lang.Object r0 = r3.A00
            X.8mg r0 = (X.C146678mg) r0
            X.AnonymousClass54T.A04(r0, r1)
            goto L_0x07df
        L_0x062f:
            java.lang.Object r1 = r3.A01
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            X.50l r0 = r1.getAndroidViewsHandler$ui_release()
            java.lang.Object r3 = r3.A00
            android.view.View r3 = (android.view.View) r3
            r0.removeViewInLayout(r3)
            X.50l r0 = r1.getAndroidViewsHandler$ui_release()
            java.util.HashMap r2 = r0.A01
            X.50l r0 = r1.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.A00
            java.lang.Object r1 = r0.remove(r3)
            java.util.Map r0 = X.C03940Lk.A02(r2)
            r0.remove(r1)
            r0 = 0
            r3.setImportantForAccessibility(r0)
            goto L_0x07df
        L_0x065b:
            java.lang.Object r6 = r3.A00
            X.7YM r6 = (X.AnonymousClass7YM) r6
            X.6pO r5 = r6.A00
            X.6pO r4 = r6.A01
            java.lang.Float r7 = r6.A02
            java.lang.Float r8 = r6.A03
            r2 = 0
            if (r5 == 0) goto L_0x0723
            if (r7 == 0) goto L_0x0723
            X.0ZU r0 = r5.A01
            java.lang.Object r0 = r0.invoke()
            float r1 = X.C18240wQ.A00(r0)
            float r0 = r7.floatValue()
            float r1 = r1 - r0
        L_0x067b:
            if (r4 == 0) goto L_0x0720
            if (r8 == 0) goto L_0x0720
            X.0ZU r0 = r4.A01
            java.lang.Object r0 = r0.invoke()
            float r7 = X.C18240wQ.A00(r0)
            float r0 = r8.floatValue()
            float r7 = r7 - r0
        L_0x068e:
            r9 = 1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x06b1
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x06b1
        L_0x0697:
            if (r5 == 0) goto L_0x06a3
            X.0ZU r0 = r5.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r6.A02 = r0
        L_0x06a3:
            if (r4 == 0) goto L_0x07df
            X.0ZU r0 = r4.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r6.A03 = r0
            goto L_0x07df
        L_0x06b1:
            java.lang.Object r3 = r3.A01
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r3
            int r0 = r6.A04
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r3, r0)
            r2 = 2048(0x800, float:2.87E-42)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x06d1
            boolean r0 = r3.A0S()
            if (r0 == 0) goto L_0x06d1
            android.view.accessibility.AccessibilityEvent r0 = r3.A0Q(r8, r2)
            r0.setContentChangeTypes(r9)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r0, r3)
        L_0x06d1:
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r2 = r3.A0Q(r8, r0)
            if (r5 == 0) goto L_0x06f5
            X.0ZU r0 = r5.A01
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (int) r0
            r2.setScrollX(r0)
            X.0ZU r0 = r5.A00
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (int) r0
            r2.setMaxScrollX(r0)
        L_0x06f5:
            if (r4 == 0) goto L_0x0713
            X.0ZU r0 = r4.A01
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (int) r0
            r2.setScrollY(r0)
            X.0ZU r0 = r4.A00
            java.lang.Object r0 = r0.invoke()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (int) r0
            r2.setMaxScrollY(r0)
        L_0x0713:
            int r1 = (int) r1
            int r0 = (int) r7
            r2.setScrollDeltaX(r1)
            r2.setScrollDeltaY(r0)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r2, r3)
            goto L_0x0697
        L_0x0720:
            r7 = 0
            goto L_0x068e
        L_0x0723:
            r1 = 0
            goto L_0x067b
        L_0x0726:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r3.A00
            com.facebook.redex.IDxCListenerShape201S0200000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape201S0200000_2_I2) r0
            r1.removeOnAttachStateChangeListener(r0)
            goto L_0x07df
        L_0x0733:
            java.lang.Object r1 = r3.A00
            X.062 r1 = (X.AnonymousClass062) r1
            java.lang.Object r0 = r3.A01
            X.065 r0 = (X.AnonymousClass065) r0
            r1.A08(r0)
            goto L_0x07df
        L_0x0740:
            java.lang.Object r2 = r3.A00
            X.8pE r2 = (X.C147368pE) r2
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r0 + 1
            java.lang.Object r0 = r3.A01
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            int r1 = r1 % r0
            X.C147368pE.A03(r2, r1)
            goto L_0x07df
        L_0x0759:
            X.4Uq r6 = X.C73874Uq.A00
            X.8bg r5 = X.C1370685y.A01()
            java.lang.Object r4 = r3.A01
            java.lang.Object r3 = r3.A00
            r2 = 0
            r0 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.C146958n9) r2, (int) r0)
            r0 = 2
            X.C25237DiI.A00(r2, r5, r1, r6, r0)
            goto L_0x07df
        L_0x076f:
            java.lang.Object r0 = r3.A01
            X.6tX r0 = (X.C114586tX) r0
            java.lang.Object r2 = r3.A00
            X.7Zx r2 = (X.C123917Zx) r2
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            X.7F7 r0 = r0.A00()
            r0.A08(r2, r1)
            goto L_0x07df
        L_0x0783:
            java.lang.Object r5 = r3.A00
            X.EgD r5 = (X.C27219EgD) r5
            java.lang.Object r1 = r3.A01
            X.768 r1 = (X.AnonymousClass768) r1
            X.6hh r0 = r1.A00
            com.instagram.service.session.UserSession r4 = r0.A00
            java.lang.String r3 = r0.A01
            X.4qz r2 = r1.A02
            X.8v3 r1 = r1.A01
            com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r0 = new com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource
            r0.<init>(r1, r4, r3, r2)
            X.59f r2 = new X.59f
            r2.<init>(r0, r5)
            return r2
        L_0x07a0:
            java.lang.Object r4 = r3.A01
            X.76c r4 = (X.C1196076c) r4
            java.lang.Object r3 = r3.A00
            X.7h3 r3 = (X.C127397h3) r3
            X.0Oa r1 = r4.A02
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x07df
            java.lang.Object r2 = r1.getValue()
            X.6jp r2 = (X.C109326jp) r2
            X.3VO r1 = X.AnonymousClass3VO.A00()
            r0 = 0
            X.3iY r1 = X.C86154wM.A0R(r1, r3, r0)
            X.3HX r0 = r4.A01
            X.C122047Jt.A03(r0, r3, r1, r2)
            goto L_0x07df
        L_0x07c5:
            java.lang.Object r4 = r3.A01
            X.76c r4 = (X.C1196076c) r4
            java.lang.Object r2 = r3.A00
            X.7h3 r2 = (X.C127397h3) r2
            r1 = 0
            r0 = 1
            X.C1196076c.A00(r4, r2, r1, r0)
            goto L_0x07df
        L_0x07d3:
            java.lang.Object r2 = r3.A01
            X.76c r2 = (X.C1196076c) r2
            java.lang.Object r1 = r3.A00
            X.7h3 r1 = (X.C127397h3) r1
            r0 = 0
            X.C1196076c.A00(r2, r1, r0, r0)
        L_0x07df:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x07e2:
            java.lang.Object r0 = r3.A01
            X.76c r0 = (X.C1196076c) r0
            X.3HX r2 = r0.A01
            java.lang.Object r1 = r3.A00
            X.7h3 r1 = (X.C127397h3) r1
            r0 = 43
            X.7h3 r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x07f9
            java.lang.Object r2 = X.AnonymousClass7K7.A03(r2, r0)
            return r2
        L_0x07f9:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x0800:
            java.lang.Object r1 = r3.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r3.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tx r2 = new X.7tx
            r2.<init>(r1, r0)
            return r2
        L_0x080e:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7u0 r2 = new X.7u0
            r2.<init>(r1, r0)
            return r2
        L_0x081c:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7th r2 = new X.7th
            r2.<init>(r1, r0)
            return r2
        L_0x082a:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7ty r2 = new X.7ty
            r2.<init>(r1, r0)
            return r2
        L_0x0838:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7u3 r2 = new X.7u3
            r2.<init>(r1, r0)
            return r2
        L_0x0846:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7tr r2 = new X.7tr
            r2.<init>(r1, r0)
            return r2
        L_0x0854:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r6 = r3.A01
            X.7tr r6 = (X.C132417tr) r6
            X.0Oa r7 = r6.A03
            java.lang.Object r0 = r7.getValue()
            X.7eS r0 = (X.C126027eS) r0
            X.0cE r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x087d
            r0 = 2342167226970939769(0x20810caf002a2179, double:4.069162180599528E-152)
            boolean r0 = r2.ATr(r0)
            if (r0 != r4) goto L_0x087d
            X.0Oa r0 = r6.A0C
            java.lang.Object r0 = r0.getValue()
            r5.add(r0)
        L_0x087d:
            java.lang.Object r0 = r7.getValue()
            X.7eS r0 = (X.C126027eS) r0
            X.0cE r2 = r0.A00
            if (r2 == 0) goto L_0x0897
            r0 = 2342167226971070843(0x20810caf002c217b, double:4.069162180710667E-152)
            boolean r0 = r2.ATr(r0)
            if (r0 != r4) goto L_0x0897
            X.7dz r0 = r6.A01
            r5.add(r0)
        L_0x0897:
            java.lang.Object r0 = r7.getValue()
            X.7eS r0 = (X.C126027eS) r0
            X.0cE r2 = r0.A00
            if (r2 == 0) goto L_0x08b1
            r0 = 2342167226971005306(0x20810caf002b217a, double:4.0691621806550974E-152)
            boolean r0 = r2.ATr(r0)
            if (r0 != r4) goto L_0x08b1
            X.8k1 r0 = r6.A00
            r5.add(r0)
        L_0x08b1:
            X.68S r4 = X.AnonymousClass68S.FEATURES_AGGREGATION
            java.lang.Object r2 = r3.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Class<X.7tc> r1 = X.C132267tc.class
            r0 = 12
            java.lang.Object r0 = X.C86124wJ.A0n(r2, r1, r0)
            X.7tc r0 = (X.C132267tc) r0
            java.util.List r0 = r0.A00
            X.7Gq r1 = new X.7Gq
            r1.<init>(r0)
            java.lang.String r0 = "All"
            X.7dz r2 = new X.7dz
            r2.<init>(r4, r1, r0, r5)
            return r2
        L_0x08d4:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7td r2 = new X.7td
            r2.<init>(r1, r0)
            return r2
        L_0x08e2:
            java.lang.Object r4 = r3.A01
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Object r2 = r3.A00
            X.AnonymousClass0wJ.A1N(r4, r2)
            java.lang.Class<X.7tr> r1 = X.C132417tr.class
            r0 = 39
            java.lang.Object r0 = X.C86124wJ.A0o(r4, r1, r2, r0)
            X.7tr r0 = (X.C132417tr) r0
            X.0Oa r0 = r0.A07
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x08fc:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7tk r2 = new X.7tk
            r2.<init>(r1, r0)
            return r2
        L_0x090a:
            java.lang.Object r1 = r3.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            X.7u2 r2 = new X.7u2
            r2.<init>(r1, r0)
            return r2
        L_0x0918:
            java.lang.Object r0 = r3.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7te r2 = new X.7te
            r2.<init>(r0)
            return r2
        L_0x0922:
            java.lang.Object r4 = r3.A01
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Object r2 = r3.A00
            X.AnonymousClass0wJ.A1N(r4, r2)
            java.lang.Class<X.7te> r1 = X.C132287te.class
            r0 = 45
            java.lang.Object r0 = X.C86124wJ.A0o(r4, r1, r2, r0)
            X.7te r0 = (X.C132287te) r0
            X.8k1 r2 = r0.A00
            return r2
        L_0x0938:
            java.lang.Object r4 = r3.A00
            java.lang.Object r3 = r3.A01
            X.0i6 r3 = (X.C10300i6) r3
            r0 = 0
            if (r4 == 0) goto L_0x0956
            X.C04220Ms.A0B(r3, r0)
            java.lang.Class<X.7tS> r2 = X.C132167tS.class
            r1 = 44
            kotlin.jvm.internal.KtLambdaShape23S0100000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape23S0100000_I2_3
            r0.<init>(r4, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.7tS r0 = (X.C132167tS) r0
            X.8n5 r2 = r0.A00
            return r2
        L_0x0956:
            X.C04220Ms.A0B(r3, r0)
            java.lang.Class<X.7tm> r2 = X.C132367tm.class
            r1 = 2
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.7tm r0 = (X.C132367tm) r0
            X.8n5 r2 = r0.A00
            return r2
        L_0x096a:
            java.lang.Object r0 = r3.A01
            X.Lu1 r0 = (X.Lu1) r0
            java.lang.Object r0 = r0.A02
            X.86D r0 = (X.AnonymousClass86D) r0
            X.6c6 r2 = r0.A00
            java.lang.Object r1 = r3.A00
            kotlin.Function r1 = (kotlin.Function) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A00 = r1
            r2 = 0
            return r2
        L_0x0980:
            java.lang.Object r0 = r3.A01
            X.Lu1 r0 = (X.Lu1) r0
            java.lang.Object r0 = r0.A02
            X.86O r0 = (X.AnonymousClass86O) r0
            X.6c6 r2 = r0.A00
            java.lang.Object r1 = r3.A00
            kotlin.Function r1 = (kotlin.Function) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A00 = r1
            r2 = 0
            return r2
        L_0x0996:
            r2 = 0
            return r2
        L_0x0998:
            java.lang.String r0 = "no config for "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r6)
            X.5Ez r1 = new X.5Ez
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape16S0200000_I2.invoke():java.lang.Object");
    }
}
