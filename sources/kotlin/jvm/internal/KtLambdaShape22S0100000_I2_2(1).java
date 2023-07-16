package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape22S0100000_I2_2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape22S0100000_I2_2(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0228, code lost:
        r28 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x022b, code lost:
        r5 = 0;
        r33 = r0.getDoubleValue("float_value");
        r35 = 32751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0236, code lost:
        r5 = (long) r0.getIntValue("int_value");
        r33 = 0.0d;
        r35 = 32759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0241, code lost:
        r26 = new com.facebook.dcp.model.DcpData((com.facebook.dcp.model.Type) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, r33, r35, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0258, code lost:
        r26 = new com.facebook.dcp.model.DcpData((com.facebook.dcp.model.Type) null, (java.lang.String) null, r0.getStringValue("string_value"), (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0d, 32735, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0277, code lost:
        r32 = r0.getStringList("string_list");
        X.C04220Ms.A06(r32);
        r26 = new com.facebook.dcp.model.DcpData((com.facebook.dcp.model.Type) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, r32, 0.0d, 32255, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0299, code lost:
        r0 = r0.getIntList("int32_list");
        X.C04220Ms.A06(r0);
        r5 = X.AnonymousClass0wJ.A0x(r0, 10);
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b2, code lost:
        if (r6.hasNext() == false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b4, code lost:
        X.C86144wL.A1U(r5, (long) X.AnonymousClass0wJ.A04(r6.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c1, code lost:
        r26 = new com.facebook.dcp.model.DcpData((com.facebook.dcp.model.Type) null, (java.lang.String) null, (java.lang.String) null, r5, (java.util.List) null, (java.util.List) null, 0.0d, 32639, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d8, code lost:
        r31 = r0.getDoubleList("double_list");
        X.C04220Ms.A06(r31);
        r26 = new com.facebook.dcp.model.DcpData((com.facebook.dcp.model.Type) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r31, (java.util.List) null, 0.0d, 32511, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02fa, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x059a, code lost:
        if (r5.getReturnType().equals(r1) != false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x059c, code lost:
        r0 = java.lang.reflect.Modifier.isPublic(r5.getModifiers());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05a4, code lost:
        if (r0 == false) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05a6, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05ab, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0717, code lost:
        r0 = r1.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x071b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0721, code lost:
        return r0.A01.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017f, code lost:
        r24 = X.C86134wK.A0o(r2);
        r25 = r2.getStringValue(ch.boye.httpclientandroidlib.cookie.ClientCookie.VERSION_ATTR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0189, code lost:
        if (r25 != null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018b, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018d, code lost:
        r5 = r2.getTreeValue("base", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0191, code lost:
        if (r5 == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0193, code lost:
        r0 = r5.getTreeValue(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Base.Default.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019b, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019d, code lost:
        if (r0 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a3, code lost:
        switch(r23.ordinal()) {
            case 0: goto L_0x0236;
            case 1: goto L_0x022b;
            case 2: goto L_0x0258;
            case 3: goto L_0x01a6;
            case 4: goto L_0x0277;
            case 5: goto L_0x0299;
            case 6: goto L_0x02d8;
            default: goto L_0x01a6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a6, code lost:
        r27 = r2.getIntValue("collection_delay");
        r26 = r2.getStringValue("purpose");
        r1 = r2.getTreeValue("cache", com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Cache.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        if (r1 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bc, code lost:
        r0 = r1.getStringValue("cache_ttl_in_days");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        if (r0 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c4, code lost:
        r28 = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c8, code lost:
        r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Time.class;
        r6 = r2.getTreeValue("time", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d0, code lost:
        if (r6 == null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d2, code lost:
        r5 = r6.getStringValue("time_out_in_seconds");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d8, code lost:
        if (r5 == null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01da, code lost:
        r30 = java.lang.Long.parseLong(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01de, code lost:
        r6 = r2.getTreeValue("time", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e2, code lost:
        if (r6 == null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e4, code lost:
        r5 = r6.getStringValue("refresh_interval_in_seconds");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ea, code lost:
        if (r5 == null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r32 = java.lang.Long.parseLong(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f0, code lost:
        r1 = r2.getTreeValue("time", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f4, code lost:
        if (r1 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f6, code lost:
        r0 = r1.getStringValue("schedule_interval_in_minutes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fc, code lost:
        if (r0 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fe, code lost:
        r34 = java.lang.Long.parseLong(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0208, code lost:
        if (r2.hasFieldValue("real_time") == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020a, code lost:
        r36 = r2.getBooleanValue("real_time");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021c, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021f, code lost:
        r34 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0222, code lost:
        r32 = 3600;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0225, code lost:
        r30 = 600;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r38 = this;
            r2 = r38
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x03a9;
                case 1: goto L_0x0722;
                case 2: goto L_0x03b7;
                case 3: goto L_0x03c5;
                case 4: goto L_0x03e1;
                case 5: goto L_0x0007;
                case 6: goto L_0x03ee;
                case 7: goto L_0x0404;
                case 8: goto L_0x0007;
                case 9: goto L_0x040f;
                case 10: goto L_0x041b;
                case 11: goto L_0x0424;
                case 12: goto L_0x046f;
                case 13: goto L_0x049b;
                case 14: goto L_0x050d;
                case 15: goto L_0x053f;
                case 16: goto L_0x0573;
                case 17: goto L_0x05ac;
                case 18: goto L_0x05b8;
                case 19: goto L_0x0012;
                case 20: goto L_0x05c3;
                case 21: goto L_0x05cd;
                case 22: goto L_0x05d4;
                case 23: goto L_0x05f2;
                case 24: goto L_0x05fc;
                case 25: goto L_0x0644;
                case 26: goto L_0x0658;
                case 27: goto L_0x0662;
                case 28: goto L_0x066e;
                case 29: goto L_0x067b;
                case 30: goto L_0x0688;
                case 31: goto L_0x0696;
                case 32: goto L_0x06a1;
                case 33: goto L_0x06ae;
                case 34: goto L_0x06c0;
                case 35: goto L_0x06ca;
                case 36: goto L_0x06d9;
                case 37: goto L_0x06e3;
                case 38: goto L_0x06ed;
                case 39: goto L_0x0703;
                case 40: goto L_0x070f;
                case 41: goto L_0x0724;
                case 42: goto L_0x072f;
                case 43: goto L_0x0025;
                case 44: goto L_0x073a;
                case 45: goto L_0x0744;
                case 46: goto L_0x0756;
                case 47: goto L_0x076c;
                case 48: goto L_0x078c;
                case 49: goto L_0x079f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A00
            X.EfE r1 = (X.C27178EfE) r1
            r0 = 0
            r1.AC7(r0)
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0011:
            return r2
        L_0x0012:
            java.lang.Object r1 = r2.A00
            X.7h3 r1 = (X.C127397h3) r1
            r0 = 41
            X.6jp r2 = r1.A0L(r0)
            if (r2 != 0) goto L_0x0011
            java.lang.String r0 = "Server should have ensured that the Tooltip Container always has on-visibility-update."
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x0025:
            java.lang.Object r3 = r2.A00
            X.6lS r3 = (X.C110306lS) r3
            X.6by r0 = r3.A03
            X.0cE r5 = r0.A00
            r20 = 1
            if (r5 == 0) goto L_0x03a5
            r0 = 36319231297655794(0x810826000313f2, double:3.031766346218899E-306)
            boolean r1 = r5.ATr(r0)
            r0 = r20
            if (r1 != r0) goto L_0x03a5
            X.6bt r0 = r3.A02
            X.8nC r2 = r0.A00
            java.lang.String r1 = "signals_metadata_key"
            r0 = r2
            X.7do r0 = (X.C125677do) r0
            boolean r0 = X.C125677do.A01(r0, r1)
            if (r0 == 0) goto L_0x03a5
            X.Kq4 r4 = X.C36975Ji8.A03
            java.lang.String r2 = r2.getString(r1)
            X.76V r1 = r4.A02
            java.lang.Class<com.facebook.dcp.signals.model.SignalsMetadata> r0 = com.facebook.dcp.signals.model.SignalsMetadata.class
            java.lang.Object r0 = X.C18240wQ.A0a(r0, r2, r4, r1)
            com.facebook.dcp.signals.model.SignalsMetadata r0 = (com.facebook.dcp.signals.model.SignalsMetadata) r0
            java.lang.String r4 = r0.A00
        L_0x005f:
            r12 = 1
            if (r5 == 0) goto L_0x03a2
            r0 = 36319231297655794(0x810826000313f2, double:3.031766346218899E-306)
            boolean r1 = r5.ATr(r0)
            if (r1 != r12) goto L_0x03a2
        L_0x006d:
            if (r12 == 0) goto L_0x010d
            X.6bt r0 = r3.A02
            r5 = 0
            X.C04220Ms.A0B(r4, r5)
            X.8nC r7 = r0.A00
            java.lang.String r2 = "full_response_metadata_"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r2, r4)
            r0 = r7
            X.7do r0 = (X.C125677do) r0
            boolean r0 = X.C125677do.A01(r0, r1)
            if (r0 == 0) goto L_0x010d
            X.Kq4 r6 = X.C36975Ji8.A03
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r4)
            java.lang.String r2 = r7.getString(r0)
            X.76V r1 = r6.A02
            java.lang.Class<com.facebook.dcp.signals.model.MetadataResponse> r0 = com.facebook.dcp.signals.model.MetadataResponse.class
            java.lang.Object r2 = X.C18240wQ.A0a(r0, r2, r6, r1)
            com.facebook.dcp.signals.model.MetadataResponse r2 = (com.facebook.dcp.signals.model.MetadataResponse) r2
            X.7Gq r8 = r3.A01
            r7 = 0
            r6 = 6
            java.lang.String r1 = "read_from_cache"
            r0 = r20
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r1, r7, r6, r0)
            X.68S r0 = X.AnonymousClass68S.SIGNAL_STORE_METADATA_FETCH
            X.C121547Gq.A01(r0, r1, r8)
        L_0x00ab:
            java.lang.String r0 = "0.0.0"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x00e3
            com.facebook.dcp.signals.model.SignalsMetadata r0 = r2.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "-1"
            boolean r0 = X.C86144wL.A1X(r1, r0)
            if (r0 != 0) goto L_0x00e3
            X.6bt r0 = r3.A02
            X.8nC r4 = r0.A00
            java.lang.String r1 = "signals_metadata_key"
            r0 = r4
            X.7do r0 = (X.C125677do) r0
            boolean r0 = X.C125677do.A01(r0, r1)
            if (r0 == 0) goto L_0x00e3
            X.Kq4 r3 = X.C36975Ji8.A03
            java.lang.String r2 = r4.getString(r1)
            X.76V r1 = r3.A02
            java.lang.Class<com.facebook.dcp.signals.model.SignalsMetadata> r0 = com.facebook.dcp.signals.model.SignalsMetadata.class
            java.lang.Object r0 = X.C18240wQ.A0a(r0, r2, r3, r1)
            com.facebook.dcp.signals.model.SignalsMetadata r0 = (com.facebook.dcp.signals.model.SignalsMetadata) r0
            com.facebook.dcp.signals.model.MetadataResponse r2 = new com.facebook.dcp.signals.model.MetadataResponse
            r2.<init>(r0)
        L_0x00e3:
            X.C04220Ms.A0B(r2, r5)
            com.facebook.dcp.signals.model.SignalsMetadata r0 = r2.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "-1"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "invalid signals metadata version -1"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r1.<init>((int) r5, (java.lang.String) r0, (boolean) r5)
        L_0x00f9:
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r1.A00
            X.5F4 r1 = new X.5F4
            r1.<init>(r0)
            throw r1
        L_0x0105:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r0 = r20
            r1.<init>(r5, r0)
            goto L_0x00f9
        L_0x010d:
            X.6oy r0 = r3.A00
            r2 = 0
            X.8gY r0 = r0.A00(r2, r4)
            if (r0 == 0) goto L_0x0124
            com.facebook.pando.TreeJNI r5 = X.C685344e.A03(r0)
            if (r5 == 0) goto L_0x0124
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.class
            java.lang.String r0 = "on_device_fl_metadata(input_params:{\"client_signal_metadata_version\":$client_signal_metadata_version,\"usecases\":$usecases})"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r0, r1)
        L_0x0124:
            r19 = 0
            if (r2 == 0) goto L_0x02fe
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.class
            java.lang.String r0 = "signal_metadata"
            com.facebook.pando.TreeJNI r7 = r2.getTreeValue(r0, r1)
            if (r7 == 0) goto L_0x02fe
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata$Signals> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.class
            java.lang.String r0 = "signals"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r7, r1, r0)
            r9 = 10
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r11 = r0.iterator()
        L_0x0144:
            boolean r0 = r11.hasNext()
            java.lang.String r5 = "0.0.0"
            if (r0 == 0) goto L_0x0307
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r11)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata$Signals$Base> r10 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Base.class
            java.lang.String r6 = "base"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r6, r10)
            if (r1 == 0) goto L_0x0163
            java.lang.String r0 = "type"
            int r0 = r1.getIntValue(r0)
            switch(r0) {
                case 1: goto L_0x017d;
                case 2: goto L_0x017a;
                case 3: goto L_0x0177;
                case 4: goto L_0x0174;
                case 5: goto L_0x0171;
                case 6: goto L_0x016e;
                case 7: goto L_0x016b;
                default: goto L_0x0163;
            }
        L_0x0163:
            java.lang.String r0 = "Invalid default data type"
            X.6Bi r1 = new X.6Bi
            r1.<init>(r0)
            throw r1
        L_0x016b:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.DOUBLE_LIST
            goto L_0x017f
        L_0x016e:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.LONG_LIST
            goto L_0x017f
        L_0x0171:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.STRING_LIST
            goto L_0x017f
        L_0x0174:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.STRING
            goto L_0x017f
        L_0x0177:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.BOOLEAN
            goto L_0x017f
        L_0x017a:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.LONG
            goto L_0x017f
        L_0x017d:
            com.facebook.dcp.model.Type r23 = com.facebook.dcp.model.Type.DOUBLE
        L_0x017f:
            java.lang.String r24 = X.C86134wK.A0o(r2)
            java.lang.String r0 = "version"
            java.lang.String r25 = r2.getStringValue(r0)
            if (r25 != 0) goto L_0x018d
            r25 = r5
        L_0x018d:
            com.facebook.pando.TreeJNI r5 = r2.getTreeValue(r6, r10)
            if (r5 == 0) goto L_0x02fa
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata$Signals$Base$Default> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Base.Default.class
            java.lang.String r0 = "default"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r0, r1)
        L_0x019b:
            r22 = 0
            if (r0 == 0) goto L_0x01a6
            int r1 = r23.ordinal()
            switch(r1) {
                case 0: goto L_0x0236;
                case 1: goto L_0x022b;
                case 2: goto L_0x0258;
                case 3: goto L_0x01a6;
                case 4: goto L_0x0277;
                case 5: goto L_0x0299;
                case 6: goto L_0x02d8;
                default: goto L_0x01a6;
            }
        L_0x01a6:
            java.lang.String r0 = "collection_delay"
            int r27 = r2.getIntValue(r0)
            java.lang.String r0 = "purpose"
            java.lang.String r26 = r2.getStringValue(r0)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata$Signals$Cache> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Cache.class
            java.lang.String r0 = "cache"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0228
            java.lang.String r0 = "cache_ttl_in_days"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x0228
            int r28 = java.lang.Integer.parseInt(r0)
        L_0x01c8:
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl$OnDeviceFlMetadata$SignalMetadata$Signals$Time> r1 = com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.SignalMetadata.Signals.Time.class
            java.lang.String r0 = "time"
            com.facebook.pando.TreeJNI r6 = r2.getTreeValue(r0, r1)
            if (r6 == 0) goto L_0x0225
            java.lang.String r5 = "time_out_in_seconds"
            java.lang.String r5 = r6.getStringValue(r5)
            if (r5 == 0) goto L_0x0225
            long r30 = java.lang.Long.parseLong(r5)
        L_0x01de:
            com.facebook.pando.TreeJNI r6 = r2.getTreeValue(r0, r1)
            if (r6 == 0) goto L_0x0222
            java.lang.String r5 = "refresh_interval_in_seconds"
            java.lang.String r5 = r6.getStringValue(r5)
            if (r5 == 0) goto L_0x0222
            long r32 = java.lang.Long.parseLong(r5)
        L_0x01f0:
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x021f
            java.lang.String r0 = "schedule_interval_in_minutes"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x021f
            long r34 = java.lang.Long.parseLong(r0)
        L_0x0202:
            java.lang.String r0 = "real_time"
            boolean r1 = r2.hasFieldValue(r0)
            if (r1 == 0) goto L_0x021c
            boolean r36 = r2.getBooleanValue(r0)
        L_0x020e:
            r29 = 28912(0x70f0, float:4.0514E-41)
            com.facebook.dcp.signals.model.SignalMetadata r0 = new com.facebook.dcp.signals.model.SignalMetadata
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36)
            r8.add(r0)
            goto L_0x0144
        L_0x021c:
            r36 = 0
            goto L_0x020e
        L_0x021f:
            r34 = 0
            goto L_0x0202
        L_0x0222:
            r32 = 3600(0xe10, double:1.7786E-320)
            goto L_0x01f0
        L_0x0225:
            r30 = 600(0x258, double:2.964E-321)
            goto L_0x01de
        L_0x0228:
            r28 = 30
            goto L_0x01c8
        L_0x022b:
            r5 = 0
            java.lang.String r1 = "float_value"
            double r33 = r0.getDoubleValue(r1)
            r35 = 32751(0x7fef, float:4.5894E-41)
            goto L_0x0241
        L_0x0236:
            java.lang.String r1 = "int_value"
            int r0 = r0.getIntValue(r1)
            long r5 = (long) r0
            r33 = 0
            r35 = 32759(0x7ff7, float:4.5905E-41)
        L_0x0241:
            com.facebook.dcp.model.DcpData r22 = new com.facebook.dcp.model.DcpData
            r26 = r22
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r31 = r19
            r32 = r19
            r36 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36)
            goto L_0x01a6
        L_0x0258:
            r36 = 0
            r33 = 0
            java.lang.String r1 = "string_value"
            java.lang.String r29 = r0.getStringValue(r1)
            r35 = 32735(0x7fdf, float:4.5872E-41)
            com.facebook.dcp.model.DcpData r22 = new com.facebook.dcp.model.DcpData
            r26 = r22
            r27 = r19
            r28 = r19
            r30 = r19
            r31 = r19
            r32 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36)
            goto L_0x01a6
        L_0x0277:
            r36 = 0
            r33 = 0
            java.lang.String r1 = "string_list"
            com.google.common.collect.ImmutableList r32 = r0.getStringList(r1)
            X.C04220Ms.A06(r32)
            r35 = 32255(0x7dff, float:4.5199E-41)
            com.facebook.dcp.model.DcpData r22 = new com.facebook.dcp.model.DcpData
            r26 = r22
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r31 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36)
            goto L_0x01a6
        L_0x0299:
            r36 = 0
            r33 = 0
            java.lang.String r1 = "int32_list"
            com.google.common.collect.ImmutableList r0 = r0.getIntList(r1)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r6 = r0.iterator()
        L_0x02ae:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r6.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            long r0 = (long) r0
            X.C86144wL.A1U(r5, r0)
            goto L_0x02ae
        L_0x02c1:
            r35 = 32639(0x7f7f, float:4.5737E-41)
            com.facebook.dcp.model.DcpData r22 = new com.facebook.dcp.model.DcpData
            r26 = r22
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r5
            r31 = r19
            r32 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36)
            goto L_0x01a6
        L_0x02d8:
            r36 = 0
            r33 = 0
            java.lang.String r1 = "double_list"
            com.google.common.collect.ImmutableList r31 = r0.getDoubleList(r1)
            X.C04220Ms.A06(r31)
            r35 = 32511(0x7eff, float:4.5558E-41)
            com.facebook.dcp.model.DcpData r22 = new com.facebook.dcp.model.DcpData
            r26 = r22
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r32 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36)
            goto L_0x01a6
        L_0x02fa:
            r0 = r19
            goto L_0x019b
        L_0x02fe:
            r2 = 2
            java.lang.String r1 = "-1"
            com.facebook.dcp.signals.model.SignalsMetadata r0 = new com.facebook.dcp.signals.model.SignalsMetadata
            r0.<init>((java.lang.String) r1, (int) r2)
            goto L_0x0315
        L_0x0307:
            java.lang.String r0 = "version"
            java.lang.String r0 = r7.getStringValue(r0)
            if (r0 == 0) goto L_0x0310
            r5 = r0
        L_0x0310:
            com.facebook.dcp.signals.model.SignalsMetadata r0 = new com.facebook.dcp.signals.model.SignalsMetadata
            r0.<init>((java.lang.String) r5, (java.util.List) r8)
        L_0x0315:
            com.facebook.dcp.signals.model.MetadataResponse r2 = new com.facebook.dcp.signals.model.MetadataResponse
            r2.<init>(r0)
            r5 = 0
            com.facebook.dcp.signals.model.SignalsMetadata r11 = r2.A00
            java.lang.String r10 = r11.A00
            java.lang.String r9 = "-1"
            boolean r0 = X.C04220Ms.A0I(r10, r9)
            if (r0 == 0) goto L_0x039a
            java.lang.String r0 = "invalid signals metadata version -1"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r8 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r8.<init>((int) r5, (java.lang.String) r0, (boolean) r5)
        L_0x032e:
            X.7Gq r0 = r3.A01
            r21 = r0
            r7 = 6
            java.lang.String r6 = "fetched_from_server"
            r1 = r20
            r0 = r19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r6, r0, r7, r1)
            X.68S r6 = X.AnonymousClass68S.SIGNAL_STORE_METADATA_FETCH
            r0 = r21
            r0.A02(r6, r1, r4)
            if (r12 == 0) goto L_0x00ab
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00ab
            X.6bt r0 = r3.A02
            X.C04220Ms.A0B(r4, r5)
            X.8nC r8 = r0.A00
            java.lang.String r0 = "full_response_metadata_"
            java.lang.String r15 = X.AnonymousClass00U.A0L(r0, r4)
            X.Kq4 r13 = X.C36975Ji8.A03
            X.76V r12 = r13.A02
            java.lang.Class<com.facebook.dcp.signals.model.MetadataResponse> r0 = com.facebook.dcp.signals.model.MetadataResponse.class
            java.lang.String r18 = X.C18210wN.A0d(r0, r2, r13, r12)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 15
            long r16 = r14.toMillis(r0)
            r14 = r18
            r0 = r16
            r8.CYP(r15, r14, r0)
            boolean r0 = X.C86144wL.A1X(r10, r9)
            if (r0 == 0) goto L_0x0389
            java.lang.Class<com.facebook.dcp.signals.model.SignalsMetadata> r0 = com.facebook.dcp.signals.model.SignalsMetadata.class
            java.lang.String r11 = X.C18210wN.A0d(r0, r11, r13, r12)
            java.lang.String r10 = "signals_metadata_key"
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r0 = 30
            long r0 = r9.toMillis(r0)
            r8.CYP(r10, r11, r0)
        L_0x0389:
            java.lang.String r8 = "write_to_cache"
            r1 = r20
            r0 = r19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r8, r0, r7, r1)
            r0 = r21
            X.C121547Gq.A01(r6, r1, r0)
            goto L_0x00ab
        L_0x039a:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r8 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r0 = r20
            r8.<init>(r5, r0)
            goto L_0x032e
        L_0x03a2:
            r12 = 0
            goto L_0x006d
        L_0x03a5:
            java.lang.String r4 = "0.0.0"
            goto L_0x005f
        L_0x03a9:
            java.lang.Object r0 = r2.A00
            X.7KG r0 = (X.AnonymousClass7KG) r0
            android.content.Context r1 = r0.A0E
            X.78h r0 = r0.A07
            X.75m r2 = new X.75m
            r2.<init>(r1, r0)
            return r2
        L_0x03b7:
            java.lang.Object r0 = r2.A00
            X.7EZ r0 = (X.AnonymousClass7EZ) r0
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0722
            r0 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r1, r0)
            return r2
        L_0x03c5:
            java.lang.Object r0 = r2.A00
            android.content.Context r0 = (android.content.Context) r0
            X.58x r2 = new X.58x
            r2.<init>(r0)
            X.78h r1 = r2.A07
            X.59A r0 = new X.59A
            r0.<init>()
            r1.A01(r0)
            X.59B r0 = new X.59B
            r0.<init>()
            r1.A01(r0)
            return r2
        L_0x03e1:
            java.lang.Object r0 = r2.A00
            X.6bR r0 = (X.C104226bR) r0
            X.6uj r0 = r0.A00
            boolean r0 = r0.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x03ee:
            java.lang.Object r2 = r2.A00
            X.59f r2 = (X.C885759f) r2
            X.6bR r0 = r2.A01
            X.86V r1 = new X.86V
            r1.<init>(r2)
            X.6uj r0 = r0.A00
            r0.A01(r1)
            r0.A02()
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0404:
            java.lang.Object r1 = r2.A00
            X.56i r1 = (X.C880256i) r1
            r0 = 1
            X.C880256i.A00(r1, r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x040f:
            java.lang.Object r0 = r2.A00
            androidx.paging.PagingDataDiffer r0 = (androidx.paging.PagingDataDiffer) r0
            X.4wF r0 = r0.A0A
            kotlin.Unit r2 = kotlin.Unit.A00
            r0.D7t(r2)
            return r2
        L_0x041b:
            java.lang.Object r0 = r2.A00
            X.7JN r0 = (X.AnonymousClass7JN) r0
            X.Exi r2 = r0.createNewStatement()
            return r2
        L_0x0424:
            java.lang.Object r5 = r2.A00
            X.7cT r5 = (X.C125117cT) r5
            java.lang.String r4 = r5.A03
            if (r4 == 0) goto L_0x0459
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0459
            android.content.Context r3 = r5.A01
            java.io.File r0 = r3.getNoBackupFilesDir()
            X.C04220Ms.A06(r0)
            java.io.File r0 = X.C86154wM.A0U(r0, r4)
            java.lang.String r10 = r0.getAbsolutePath()
            X.6bU r9 = new X.6bU
            r9.<init>()
            X.7A7 r1 = r5.A02
            boolean r0 = r5.A05
            X.4x9 r2 = new X.4x9
            r6 = r2
            r7 = r3
            r8 = r1
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0453:
            boolean r0 = r5.A00
            r2.setWriteAheadLoggingEnabled(r0)
            return r2
        L_0x0459:
            android.content.Context r3 = r5.A01
            X.6bU r9 = new X.6bU
            r9.<init>()
            X.7A7 r1 = r5.A02
            boolean r0 = r5.A05
            X.4x9 r2 = new X.4x9
            r6 = r2
            r7 = r3
            r8 = r1
            r10 = r4
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0453
        L_0x046f:
            java.lang.Object r4 = r2.A00
            X.7yR r4 = (X.C134827yR) r4
            int r0 = r4.A00
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r3 = 32
            java.math.BigInteger r2 = r0.shiftLeft(r3)
            int r0 = r4.A01
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r0 = r2.or(r0)
            java.math.BigInteger r2 = r0.shiftLeft(r3)
            int r0 = r4.A02
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r2 = r2.or(r0)
            return r2
        L_0x049b:
            java.lang.Object r1 = r2.A00
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.String r0 = "androidx.window.extensions.layout.FoldingFeature"
            java.lang.Class r5 = r1.loadClass(r0)
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getBounds"
            java.lang.reflect.Method r2 = r5.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getType"
            java.lang.reflect.Method r4 = r5.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getState"
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)
            X.C04220Ms.A06(r2)
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            X.0Ai r0 = X.C18210wN.A0l(r0)
            java.lang.Class r1 = X.AnonymousClass724.A00(r0)
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05a7
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x05a7
            X.C04220Ms.A06(r4)
            java.lang.Class r2 = java.lang.Integer.TYPE
            X.0Ai r0 = X.C18210wN.A0l(r2)
            java.lang.Class r1 = X.AnonymousClass724.A00(r0)
            java.lang.Class r0 = r4.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05a7
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x05a7
            X.C04220Ms.A06(r5)
            X.0Ai r0 = X.C18210wN.A0l(r2)
            java.lang.Class r1 = X.AnonymousClass724.A00(r0)
            goto L_0x0592
        L_0x050d:
            java.lang.Object r4 = r2.A00
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            java.lang.String r0 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r2 = r4.loadClass(r0)
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getWindowLayoutComponent"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r1)
            java.lang.String r0 = "androidx.window.extensions.layout.WindowLayoutComponent"
            java.lang.Class r1 = r4.loadClass(r0)
            X.C04220Ms.A06(r2)
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x05a7
            X.C04220Ms.A06(r1)
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.equals(r1)
            goto L_0x05a4
        L_0x053f:
            java.lang.Object r1 = r2.A00
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.String r0 = "androidx.window.extensions.layout.WindowLayoutComponent"
            java.lang.Class r5 = r1.loadClass(r0)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r3 = 0
            java.lang.Class<java.util.function.Consumer> r4 = java.util.function.Consumer.class
            java.lang.Class[] r1 = new java.lang.Class[]{r0, r4}
            java.lang.String r0 = "addWindowLayoutInfoListener"
            java.lang.reflect.Method r2 = r5.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[]{r4}
            java.lang.String r0 = "removeWindowLayoutInfoListener"
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)
            X.C04220Ms.A06(r2)
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x05a7
            X.C04220Ms.A06(r5)
            goto L_0x059c
        L_0x0573:
            java.lang.Object r4 = r2.A00
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            java.lang.String r0 = "androidx.window.extensions.WindowExtensionsProvider"
            java.lang.Class r2 = r4.loadClass(r0)
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getWindowExtensions"
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r0, r1)
            java.lang.String r0 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r1 = r4.loadClass(r0)
            X.C04220Ms.A06(r5)
            X.C04220Ms.A06(r1)
        L_0x0592:
            java.lang.Class r0 = r5.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05a7
        L_0x059c:
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
        L_0x05a4:
            if (r0 == 0) goto L_0x05a7
            r3 = 1
        L_0x05a7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            return r2
        L_0x05ac:
            java.lang.Object r1 = r2.A00
            X.6qE r1 = (X.C112806qE) r1
            X.3HX r0 = r1.A03
            X.78A r2 = new X.78A
            r2.<init>(r1, r0)
            return r2
        L_0x05b8:
            java.lang.Object r1 = r2.A00
            X.7h3 r1 = (X.C127397h3) r1
            r0 = 45
            X.6jp r2 = r1.A0L(r0)
            return r2
        L_0x05c3:
            java.lang.Object r0 = r2.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.Gnn r2 = new X.Gnn
            r2.<init>(r0)
            return r2
        L_0x05cd:
            java.lang.Object r0 = r2.A00
            X.C18240wQ.A1G(r0)
            r2 = 0
            return r2
        L_0x05d4:
            java.lang.Object r0 = r2.A00
            com.facebook.browser.lite.extensions.commercecheckout.instagram.IGShopsLiteMessageHandler r0 = (com.facebook.browser.lite.extensions.commercecheckout.instagram.IGShopsLiteMessageHandler) r0
            X.L3B r0 = r0.A02
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            android.view.View r1 = r0.A0D
            r0 = 2131307135(0x7f092a7f, float:1.8232489E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x05ef
            X.7z7 r0 = new X.7z7
            r0.<init>(r1)
            X.C1189172u.A00(r0)
        L_0x05ef:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x05f2:
            java.lang.Object r0 = r2.A00
            X.5EZ r0 = (X.AnonymousClass5EZ) r0
            X.7cW r2 = new X.7cW
            r2.<init>(r0)
            return r2
        L_0x05fc:
            X.0gE r0 = X.AnonymousClass0gE.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r0.A00
            java.lang.Object r4 = r2.A00
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Class<X.7tR> r2 = X.C132157tR.class
            r1 = 25
            kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2
            r0.<init>(r4, r1)
            java.lang.Object r3 = r4.A01(r2, r0)
            X.7tR r3 = (X.C132157tR) r3
            java.lang.Class<X.H87> r2 = X.H87.class
            r1 = 26
            kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2
            r0.<init>(r4, r1)
            java.lang.Object r0 = r4.A01(r2, r0)
            X.H87 r0 = (X.H87) r0
            X.0IB r10 = X.C10450iM.A00()
            X.C04220Ms.A06(r10)
            X.Grx r11 = X.AnonymousClass3WK.A01(r4)
            X.FA3 r9 = X.FA3.A01(r4)
            X.C04220Ms.A06(r9)
            X.7tU r2 = new X.7tU
            r6 = r2
            r7 = r3
            r8 = r0
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r2
        L_0x0644:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49q r1 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r0 = X.D2R.A09
            android.content.SharedPreferences r0 = r1.A01(r0)
            X.7tR r2 = new X.7tR
            r2.<init>(r0)
            return r2
        L_0x0658:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.H87 r2 = new X.H87
            r2.<init>(r0)
            return r2
        L_0x0662:
            X.3Vx r1 = X.C61823Vx.A01
            if (r1 == 0) goto L_0x0722
            java.lang.Object r0 = r2.A00
            X.7tx r0 = (X.C132477tx) r0
            com.instagram.service.session.UserSession r0 = r0.A02
            goto L_0x0717
        L_0x066e:
            java.lang.Object r0 = r2.A00
            X.7tx r0 = (X.C132477tx) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            android.content.Context r0 = r0.A00
            X.7u0 r2 = X.C98596Ge.A00(r0, r1)
            return r2
        L_0x067b:
            java.lang.Object r0 = r2.A00
            X.7tx r0 = (X.C132477tx) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            android.content.Context r0 = r0.A00
            X.7ty r2 = X.C98726Gr.A00(r0, r1)
            return r2
        L_0x0688:
            java.lang.Object r0 = r2.A00
            X.7u0 r0 = (X.C132507u0) r0
            X.7gS r1 = r0.A02
            X.5FA r0 = r0.A01
            X.6g6 r2 = new X.6g6
            r2.<init>(r0, r1)
            return r2
        L_0x0696:
            X.3Vx r1 = X.C61823Vx.A01
            if (r1 == 0) goto L_0x0722
            java.lang.Object r0 = r2.A00
            X.7u0 r0 = (X.C132507u0) r0
            com.instagram.service.session.UserSession r0 = r0.A03
            goto L_0x0717
        L_0x06a1:
            java.lang.Object r0 = r2.A00
            X.7u0 r0 = (X.C132507u0) r0
            com.instagram.service.session.UserSession r1 = r0.A03
            java.lang.String r0 = "dcp"
            com.facebook.papaya.store.PapayaStore r2 = X.AnonymousClass6HW.A00(r1, r0)
            return r2
        L_0x06ae:
            java.lang.Object r0 = r2.A00
            X.7u0 r0 = (X.C132507u0) r0
            X.0Oa r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.0cE r0 = (X.C07810cE) r0
            X.5FB r2 = new X.5FB
            r2.<init>(r0)
            return r2
        L_0x06c0:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7ta r2 = new X.7ta
            r2.<init>(r0)
            return r2
        L_0x06ca:
            java.lang.Object r1 = r2.A00
            X.8nR r1 = (X.C147128nR) r1
            X.6Gw r0 = new X.6Gw
            r0.<init>()
            X.781 r2 = new X.781
            r2.<init>(r1, r0)
            return r2
        L_0x06d9:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7ti r2 = new X.7ti
            r2.<init>(r0)
            return r2
        L_0x06e3:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tj r2 = new X.7tj
            r2.<init>(r0)
            return r2
        L_0x06ed:
            java.lang.Object r2 = r2.A00
            X.7tj r2 = (X.C132337tj) r2
            X.0Oa r0 = r2.A04
            java.lang.Object r3 = r0.getValue()
            X.6bs r3 = (X.C104496bs) r3
            X.78l r1 = r2.A01
            X.7Gq r0 = r2.A00
            X.6is r2 = new X.6is
            r2.<init>(r0, r3, r1)
            return r2
        L_0x0703:
            java.lang.Object r0 = r2.A00
            X.7tj r0 = (X.C132337tj) r0
            com.instagram.service.session.UserSession r0 = r0.A02
            X.6bs r2 = new X.6bs
            r2.<init>(r0)
            return r2
        L_0x070f:
            X.3Vx r1 = X.C61823Vx.A01
            if (r1 == 0) goto L_0x0722
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
        L_0x0717:
            X.3Ie r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0722
            X.3Xz r0 = r0.A01
            X.3zp r2 = r0.A00
            return r2
        L_0x0722:
            r2 = 0
            return r2
        L_0x0724:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7ta r0 = X.C98676Gm.A00(r0)
            X.7Gq r2 = r0.A00
            return r2
        L_0x072f:
            java.lang.Object r1 = r2.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.String r0 = "dcp_signals"
            com.facebook.papaya.store.PapayaStore r2 = X.AnonymousClass6HW.A00(r1, r0)
            return r2
        L_0x073a:
            java.lang.Object r0 = r2.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7eS r2 = new X.7eS
            r2.<init>(r0)
            return r2
        L_0x0744:
            java.lang.Object r0 = r2.A00
            X.7tr r0 = (X.C132417tr) r0
            X.0Oa r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.8k1 r0 = (X.C145188k1) r0
            X.7e1 r2 = new X.7e1
            r2.<init>(r0)
            return r2
        L_0x0756:
            java.lang.Object r2 = r2.A00
            X.0i6 r2 = (X.C10300i6) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70 r1 = new kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70
            r1.<init>(r2, r0)
            java.lang.Class<X.49n> r0 = X.C696649n.class
            java.lang.Object r2 = r2.A01(r0, r1)
            return r2
        L_0x076c:
            java.lang.Object r1 = r2.A00
            X.7tr r1 = (X.C132417tr) r1
            X.0Oa r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.7eS r0 = (X.C126027eS) r0
            boolean r0 = r0.BZw()
            if (r0 == 0) goto L_0x0785
            X.0Oa r0 = r1.A04
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0785:
            X.0Oa r0 = r1.A0A
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x078c:
            java.lang.Object r0 = r2.A00
            X.7tr r0 = (X.C132417tr) r0
            X.0Oa r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.6bo r0 = (X.C104456bo) r0
            X.Joc r0 = r0.A00
            X.7do r2 = X.C125677do.A00(r0)
            return r2
        L_0x079f:
            java.lang.Object r0 = r2.A00
            X.7tr r0 = (X.C132417tr) r0
            X.0Oa r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            X.Joc r0 = (X.C37295Joc) r0
            X.6bo r2 = new X.6bo
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2.invoke():java.lang.Object");
    }
}
