package com.facebook.dcp.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c0;
import X.AnonymousClass8c5;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C1372987e;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39063Klv;
import X.C39069Km1;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.common.dextricks.Constants;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class UseCaseMetadata$$serializer implements C28173Ezj {
    public static final UseCaseMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public UseCaseMetadata deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        C04220Ms.A0B(decoder2, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder2.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new UseCaseMetadata((DcpContext) obj7, (DcpContext) obj5, (DcpContext) obj4, (PredictorMetadata) obj, (TrainerMetadata) obj6, str, str4, str5, str2, str3, (List) obj3, (Map) obj2, i, j2, j, z2, z);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str4 = AAF.AHH(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str5 = AAF.AHH(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = AAF.AHH(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = AAF.AHH(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = AAF.AGq(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = AAF.AH9(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj3 = AAF.AHC(obj3, AnonymousClass8c0.A00(AnonymousClass87g.A00), pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    obj2 = AAF.AHC(obj2, AnonymousClass8c5.A02(C1372987e.A00, FeatureMetadata$$serializer.INSTANCE), pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    obj = AAF.AHC(obj, PredictorMetadata$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    obj6 = AAF.AHC(obj6, TrainerMetadata$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    obj7 = AAF.AHC(obj7, DcpContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    obj5 = AAF.AHC(obj5, DcpContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 13);
                    i |= 8192;
                    break;
                case 14:
                    obj4 = AAF.AHC(obj4, DcpContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 14);
                    i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    break;
                case 15:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 15);
                    i |= 32768;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r11 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (X.C04220Ms.A0I(r0.A08, "default_model_name") != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r2.AK3(r0.A08, r1, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r11 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (X.C04220Ms.A0I(r0.A09, "1.0") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r2.AK3(r0.A09, r1, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r11 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r0.A0F == r3) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r2.AJo(r1, 5, r0.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r11 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r0.A01 == -1) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        r2.AJx(r1, 6, r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r11 != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r0.A0E == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r2.AJo(r1, 7, r0.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r11 != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (X.C04220Ms.A0I(r0.A0C, X.AnonymousClass0ZV.A00) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r2.AJz(r0.A0C, X.AnonymousClass8c0.A00(X.AnonymousClass87g.A00), r1, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r11 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (X.C86134wK.A1Y(r0.A0D) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r2.AJz(r0.A0D, X.AnonymousClass8c5.A02(X.C1372987e.A00, com.facebook.dcp.model.FeatureMetadata$$serializer.INSTANCE), r1, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r11 != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e5, code lost:
        if (X.C04220Ms.A0I(r0.A05, new com.facebook.dcp.model.PredictorMetadata(com.facebook.dcp.model.ExampleSource.COMBINE, new com.facebook.dcp.model.LogLevel(0), "model_name", "asset_name", X.AnonymousClass4WJ.A0A(), 0.5d, 1.0d, 0, 600, 3600, 0, 0, 0, false, r3, false)) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        r2.AJz(r0.A05, com.facebook.dcp.model.PredictorMetadata$$serializer.INSTANCE, r1, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        if (r11 != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        if (X.C04220Ms.A0I(r0.A06, new com.facebook.dcp.model.TrainerMetadata((com.facebook.dcp.model.ExampleSource) null, (com.facebook.dcp.model.LogLevel) null, (java.util.Map) null, (java.util.Map) null, 511, 0, 0, 0, false)) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        r2.AJz(r0.A06, com.facebook.dcp.model.TrainerMetadata$$serializer.INSTANCE, r1, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r11 != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0121, code lost:
        if (X.C04220Ms.A0I(r0.A04, com.facebook.dcp.model.DcpContext.A05) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0123, code lost:
        r2.AJz(r0.A04, com.facebook.dcp.model.DcpContext$$serializer.INSTANCE, r1, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r11 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012c, code lost:
        if (r11 != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0136, code lost:
        if (X.C04220Ms.A0I(r0.A03, com.facebook.dcp.model.DcpContext.A05) != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0138, code lost:
        r2.AJz(r0.A03, com.facebook.dcp.model.DcpContext$$serializer.INSTANCE, r1, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r11 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (X.C04220Ms.A0I(r0.A02, com.facebook.dcp.model.DcpContext.A05) != false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014d, code lost:
        r2.AJz(r0.A02, com.facebook.dcp.model.DcpContext$$serializer.INSTANCE, r1, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r2.AK3(r0.A0B, r1, r3 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0156, code lost:
        if (r11 != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015e, code lost:
        if (r0.A00 == 30) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0160, code lost:
        r2.AJx(r1, 15, r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0165, code lost:
        r2.AKG(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0171, code lost:
        if (X.C04220Ms.A0I(r0.A0B, "test") == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017d, code lost:
        if (X.C04220Ms.A0I(r0.A0A, "") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r11 == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r2.AK3(r0.A0A, r1, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r38, com.facebook.dcp.model.UseCaseMetadata r39) {
        /*
            r37 = this;
            r6 = 0
            r2 = r38
            r0 = r39
            boolean r3 = X.AnonymousClass0wJ.A1Z(r2, r0)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r1 = descriptor
            X.8mU r2 = r2.AAG(r1)
            r7 = 2
            boolean r11 = X.C86114wI.A1Y(r1, r2)
            if (r11 != 0) goto L_0x0020
            java.lang.String r5 = r0.A07
            java.lang.String r4 = "1"
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0169
        L_0x0020:
            java.lang.String r4 = r0.A07
            r2.AK3(r4, r1, r6)
            if (r11 == 0) goto L_0x0169
        L_0x0027:
            java.lang.String r4 = r0.A0B
            r2.AK3(r4, r1, r3)
            if (r11 == 0) goto L_0x0175
        L_0x002e:
            java.lang.String r4 = r0.A0A
            r2.AK3(r4, r1, r7)
        L_0x0033:
            r7 = 3
            if (r11 != 0) goto L_0x0040
            java.lang.String r5 = r0.A08
            java.lang.String r4 = "default_model_name"
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0045
        L_0x0040:
            java.lang.String r4 = r0.A08
            r2.AK3(r4, r1, r7)
        L_0x0045:
            r7 = 4
            if (r11 != 0) goto L_0x0052
            java.lang.String r5 = r0.A09
            java.lang.String r4 = "1.0"
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0057
        L_0x0052:
            java.lang.String r4 = r0.A09
            r2.AK3(r4, r1, r7)
        L_0x0057:
            r5 = 5
            if (r11 != 0) goto L_0x005e
            boolean r4 = r0.A0F
            if (r4 == r3) goto L_0x0063
        L_0x005e:
            boolean r4 = r0.A0F
            r2.AJo(r1, r5, r4)
        L_0x0063:
            r10 = 6
            if (r11 != 0) goto L_0x006e
            long r4 = r0.A01
            r8 = -1
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0073
        L_0x006e:
            long r4 = r0.A01
            r2.AJx(r1, r10, r4)
        L_0x0073:
            r5 = 7
            if (r11 != 0) goto L_0x007a
            boolean r4 = r0.A0E
            if (r4 == 0) goto L_0x007f
        L_0x007a:
            boolean r4 = r0.A0E
            r2.AJo(r1, r5, r4)
        L_0x007f:
            r7 = 8
            if (r11 != 0) goto L_0x008d
            java.util.List r5 = r0.A0C
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0098
        L_0x008d:
            X.87g r4 = X.AnonymousClass87g.A00
            X.8c0 r5 = X.AnonymousClass8c0.A00(r4)
            java.util.List r4 = r0.A0C
            r2.AJz(r4, r5, r1, r7)
        L_0x0098:
            r7 = 9
            if (r11 != 0) goto L_0x00a4
            java.util.Map r4 = r0.A0D
            boolean r4 = X.C86134wK.A1Y(r4)
            if (r4 != 0) goto L_0x00b1
        L_0x00a4:
            X.87e r5 = X.C1372987e.A00
            com.facebook.dcp.model.FeatureMetadata$$serializer r4 = com.facebook.dcp.model.FeatureMetadata$$serializer.INSTANCE
            X.8c5 r5 = X.AnonymousClass8c5.A02(r5, r4)
            java.util.Map r4 = r0.A0D
            r2.AJz(r4, r5, r1, r7)
        L_0x00b1:
            r5 = 10
            if (r11 != 0) goto L_0x00e7
            com.facebook.dcp.model.PredictorMetadata r4 = r0.A05
            java.util.Map r17 = X.AnonymousClass4WJ.A0A()
            java.lang.String r15 = "model_name"
            r22 = 0
            java.lang.String r16 = "asset_name"
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.facebook.dcp.model.ExampleSource r13 = com.facebook.dcp.model.ExampleSource.COMBINE
            r24 = 600(0x258, double:2.964E-321)
            r26 = 3600(0xe10, double:1.7786E-320)
            com.facebook.dcp.model.LogLevel r14 = new com.facebook.dcp.model.LogLevel
            r14.<init>(r6)
            com.facebook.dcp.model.PredictorMetadata r12 = new com.facebook.dcp.model.PredictorMetadata
            r28 = r22
            r30 = r22
            r32 = r22
            r34 = r6
            r35 = r3
            r36 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35, r36)
            boolean r3 = X.C04220Ms.A0I(r4, r12)
            if (r3 != 0) goto L_0x00ee
        L_0x00e7:
            com.facebook.dcp.model.PredictorMetadata$$serializer r4 = com.facebook.dcp.model.PredictorMetadata$$serializer.INSTANCE
            com.facebook.dcp.model.PredictorMetadata r3 = r0.A05
            r2.AJz(r3, r4, r1, r5)
        L_0x00ee:
            r5 = 11
            if (r11 != 0) goto L_0x010e
            com.facebook.dcp.model.TrainerMetadata r3 = r0.A06
            r13 = 0
            r18 = 0
            r17 = 511(0x1ff, float:7.16E-43)
            com.facebook.dcp.model.TrainerMetadata r12 = new com.facebook.dcp.model.TrainerMetadata
            r14 = r13
            r15 = r13
            r16 = r13
            r20 = r18
            r22 = r18
            r24 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24)
            boolean r3 = X.C04220Ms.A0I(r3, r12)
            if (r3 != 0) goto L_0x0115
        L_0x010e:
            com.facebook.dcp.model.TrainerMetadata$$serializer r4 = com.facebook.dcp.model.TrainerMetadata$$serializer.INSTANCE
            com.facebook.dcp.model.TrainerMetadata r3 = r0.A06
            r2.AJz(r3, r4, r1, r5)
        L_0x0115:
            r5 = 12
            if (r11 != 0) goto L_0x0123
            com.facebook.dcp.model.DcpContext r4 = r0.A04
            com.facebook.dcp.model.DcpContext r3 = com.facebook.dcp.model.DcpContext.A05
            boolean r3 = X.C04220Ms.A0I(r4, r3)
            if (r3 != 0) goto L_0x012a
        L_0x0123:
            com.facebook.dcp.model.DcpContext$$serializer r4 = com.facebook.dcp.model.DcpContext$$serializer.INSTANCE
            com.facebook.dcp.model.DcpContext r3 = r0.A04
            r2.AJz(r3, r4, r1, r5)
        L_0x012a:
            r5 = 13
            if (r11 != 0) goto L_0x0138
            com.facebook.dcp.model.DcpContext r4 = r0.A03
            com.facebook.dcp.model.DcpContext r3 = com.facebook.dcp.model.DcpContext.A05
            boolean r3 = X.C04220Ms.A0I(r4, r3)
            if (r3 != 0) goto L_0x013f
        L_0x0138:
            com.facebook.dcp.model.DcpContext$$serializer r4 = com.facebook.dcp.model.DcpContext$$serializer.INSTANCE
            com.facebook.dcp.model.DcpContext r3 = r0.A03
            r2.AJz(r3, r4, r1, r5)
        L_0x013f:
            r5 = 14
            if (r11 != 0) goto L_0x014d
            com.facebook.dcp.model.DcpContext r4 = r0.A02
            com.facebook.dcp.model.DcpContext r3 = com.facebook.dcp.model.DcpContext.A05
            boolean r3 = X.C04220Ms.A0I(r4, r3)
            if (r3 != 0) goto L_0x0154
        L_0x014d:
            com.facebook.dcp.model.DcpContext$$serializer r4 = com.facebook.dcp.model.DcpContext$$serializer.INSTANCE
            com.facebook.dcp.model.DcpContext r3 = r0.A02
            r2.AJz(r3, r4, r1, r5)
        L_0x0154:
            r8 = 15
            if (r11 != 0) goto L_0x0160
            long r6 = r0.A00
            r4 = 30
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0165
        L_0x0160:
            long r3 = r0.A00
            r2.AJx(r1, r8, r3)
        L_0x0165:
            r2.AKG(r1)
            return
        L_0x0169:
            java.lang.String r5 = r0.A0B
            java.lang.String r4 = "test"
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0175
            goto L_0x0027
        L_0x0175:
            java.lang.String r5 = r0.A0A
            java.lang.String r4 = ""
            boolean r4 = X.C04220Ms.A0I(r5, r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.UseCaseMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.UseCaseMetadata):void");
    }

    static {
        UseCaseMetadata$$serializer useCaseMetadata$$serializer = new UseCaseMetadata$$serializer();
        INSTANCE = useCaseMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.UseCaseMetadata", useCaseMetadata$$serializer, 16);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00(ClientCookie.VERSION_ATTR, true);
        pluginGeneratedSerialDescriptor.A00("purpose", true);
        pluginGeneratedSerialDescriptor.A00("modelName", true);
        pluginGeneratedSerialDescriptor.A00("modelVersion", true);
        pluginGeneratedSerialDescriptor.A00("isEnabled", true);
        pluginGeneratedSerialDescriptor.A00("papayaFeatureGroupId", true);
        pluginGeneratedSerialDescriptor.A00("isDftFeatureExtractionEnabled", true);
        pluginGeneratedSerialDescriptor.A00("signalIds", true);
        pluginGeneratedSerialDescriptor.A00("features", true);
        pluginGeneratedSerialDescriptor.A00("predictorMetadata", true);
        pluginGeneratedSerialDescriptor.A00("trainerMetadata", true);
        pluginGeneratedSerialDescriptor.A00("signalsContext", true);
        pluginGeneratedSerialDescriptor.A00("featuresContext", true);
        pluginGeneratedSerialDescriptor.A00("extrasContext", true);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInDays", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r2 = AnonymousClass87g.A00;
        C39063Klv klv = C39063Klv.A00;
        C39069Km1 km1 = C39069Km1.A00;
        AnonymousClass8c0 A00 = AnonymousClass8c0.A00(r2);
        AnonymousClass8c5 A02 = AnonymousClass8c5.A02(C1372987e.A00, FeatureMetadata$$serializer.INSTANCE);
        PredictorMetadata$$serializer predictorMetadata$$serializer = PredictorMetadata$$serializer.INSTANCE;
        TrainerMetadata$$serializer trainerMetadata$$serializer = TrainerMetadata$$serializer.INSTANCE;
        DcpContext$$serializer dcpContext$$serializer = DcpContext$$serializer.INSTANCE;
        return new AnonymousClass8sP[]{r2, r2, r2, r2, r2, klv, km1, klv, A00, A02, predictorMetadata$$serializer, trainerMetadata$$serializer, dcpContext$$serializer, dcpContext$$serializer, dcpContext$$serializer, km1};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
