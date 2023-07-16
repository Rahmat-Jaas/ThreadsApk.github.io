package com.facebook.dcp.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c5;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C1372987e;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C39063Klv;
import X.C39066Kly;
import X.C39069Km1;
import X.C86144wL;
import com.facebook.common.dextricks.Constants;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class PredictorMetadata$$serializer implements C28173Ezj {
    public static final PredictorMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public PredictorMetadata deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        C04220Ms.A0B(decoder2, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder2.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        long j = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new PredictorMetadata((ExampleSource) obj, (LogLevel) obj2, str, str2, (Map) obj3, d2, d, i, j, j4, j5, j3, j6, j2, z, z2, z3);
                case 0:
                    obj3 = AAF.AHC(obj3, AnonymousClass8c5.A02(AnonymousClass87g.A00, C1372987e.A00), pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = AAF.AHH(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    d2 = AAF.AGw(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    d = AAF.AGw(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z2 = AAF.AGq(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = AAF.AGq(pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.ExampleSource", ExampleSource.values()), pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    j4 = AAF.AH9(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    j5 = AAF.AH9(pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    j3 = AAF.AH9(pluginGeneratedSerialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    j6 = AAF.AH9(pluginGeneratedSerialDescriptor, 13);
                    i |= 8192;
                    break;
                case 14:
                    j2 = AAF.AH9(pluginGeneratedSerialDescriptor, 14);
                    i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    break;
                case 15:
                    obj2 = AAF.AHC(obj2, LogLevel$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 15);
                    i |= 32768;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r15.A04 == 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r6.AJx(r4, 2, r15.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r12 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (X.C04220Ms.A0I(r15.A0A, "asset_name") != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r6.AK3(r15.A0A, r4, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r12 != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (java.lang.Double.compare(r15.A01, 0.5d) == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r6.AJr(r4, r15.A01, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r12 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (java.lang.Double.compare(r15.A00, 1.0d) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r6.AJr(r4, r15.A00, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r12 != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r15.A0E == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        r6.AJo(r4, 6, r15.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r12 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r15.A0D == r5) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        r6.AJo(r4, 7, r15.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r12 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r15.A0F == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        r6.AJo(r4, 8, r15.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r12 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a0, code lost:
        if (r15.A08 == com.facebook.dcp.model.ExampleSource.COMBINE) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        r6.AJz(r15.A08, new X.C39060Kls("com.facebook.dcp.model.ExampleSource", com.facebook.dcp.model.ExampleSource.values()), r4, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r12 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bc, code lost:
        if (r15.A07 == 600) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00be, code lost:
        r6.AJx(r4, 10, r15.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c5, code lost:
        if (r12 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        if (r15.A05 == 3600) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cf, code lost:
        r6.AJx(r4, 11, r15.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r12 != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r12 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dc, code lost:
        if (r15.A06 == 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00de, code lost:
        r6.AJx(r4, 12, r15.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        if (r12 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00eb, code lost:
        if (r15.A03 == 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ed, code lost:
        r6.AJx(r4, 13, r15.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f4, code lost:
        if (r12 != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r6.AK3(r15.A0B, r4, r5 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fa, code lost:
        if (r15.A02 == 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        r6.AJx(r4, 14, r15.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0103, code lost:
        if (r12 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0110, code lost:
        if (X.C04220Ms.A0I(r15.A09, new com.facebook.dcp.model.LogLevel(0)) != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0112, code lost:
        r6.AJz(r15.A09, com.facebook.dcp.model.LogLevel$$serializer.INSTANCE, r4, 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0119, code lost:
        r6.AKG(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0125, code lost:
        if (X.C04220Ms.A0I(r15.A0B, "model_name") == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r12 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r14, com.facebook.dcp.model.PredictorMetadata r15) {
        /*
            r13 = this;
            r7 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r14, r15)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r4 = descriptor
            X.8mU r6 = r14.AAG(r4)
            r3 = 2
            boolean r12 = X.C86114wI.A1Y(r4, r6)
            if (r12 != 0) goto L_0x001a
            java.util.Map r0 = r15.A0C
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x011d
        L_0x001a:
            X.87g r1 = X.AnonymousClass87g.A00
            X.87e r0 = X.C1372987e.A00
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r15.A0C
            r6.AJz(r0, r1, r4, r7)
            if (r12 == 0) goto L_0x011d
        L_0x0029:
            java.lang.String r0 = r15.A0B
            r6.AK3(r0, r4, r5)
        L_0x002e:
            r10 = 0
            if (r12 != 0) goto L_0x0038
            long r0 = r15.A04
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x003d
        L_0x0038:
            long r0 = r15.A04
            r6.AJx(r4, r3, r0)
        L_0x003d:
            r2 = 3
            if (r12 != 0) goto L_0x004a
            java.lang.String r1 = r15.A0A
            java.lang.String r0 = "asset_name"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            java.lang.String r0 = r15.A0A
            r6.AK3(r0, r4, r2)
        L_0x004f:
            r8 = 4
            if (r12 != 0) goto L_0x005c
            double r2 = r15.A01
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 == 0) goto L_0x0061
        L_0x005c:
            double r0 = r15.A01
            r6.AJr(r4, r0, r8)
        L_0x0061:
            r8 = 5
            if (r12 != 0) goto L_0x006e
            double r2 = r15.A00
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 == 0) goto L_0x0073
        L_0x006e:
            double r0 = r15.A00
            r6.AJr(r4, r0, r8)
        L_0x0073:
            r1 = 6
            if (r12 != 0) goto L_0x007a
            boolean r0 = r15.A0E
            if (r0 == 0) goto L_0x007f
        L_0x007a:
            boolean r0 = r15.A0E
            r6.AJo(r4, r1, r0)
        L_0x007f:
            r1 = 7
            if (r12 != 0) goto L_0x0086
            boolean r0 = r15.A0D
            if (r0 == r5) goto L_0x008b
        L_0x0086:
            boolean r0 = r15.A0D
            r6.AJo(r4, r1, r0)
        L_0x008b:
            r1 = 8
            if (r12 != 0) goto L_0x0093
            boolean r0 = r15.A0F
            if (r0 == 0) goto L_0x0098
        L_0x0093:
            boolean r0 = r15.A0F
            r6.AJo(r4, r1, r0)
        L_0x0098:
            r3 = 9
            if (r12 != 0) goto L_0x00a2
            com.facebook.dcp.model.ExampleSource r1 = r15.A08
            com.facebook.dcp.model.ExampleSource r0 = com.facebook.dcp.model.ExampleSource.COMBINE
            if (r1 == r0) goto L_0x00b2
        L_0x00a2:
            com.facebook.dcp.model.ExampleSource[] r2 = com.facebook.dcp.model.ExampleSource.values()
            java.lang.String r0 = "com.facebook.dcp.model.ExampleSource"
            X.Kls r1 = new X.Kls
            r1.<init>(r0, r2)
            com.facebook.dcp.model.ExampleSource r0 = r15.A08
            r6.AJz(r0, r1, r4, r3)
        L_0x00b2:
            r3 = 10
            if (r12 != 0) goto L_0x00be
            long r1 = r15.A07
            r8 = 600(0x258, double:2.964E-321)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
        L_0x00be:
            long r0 = r15.A07
            r6.AJx(r4, r3, r0)
        L_0x00c3:
            r3 = 11
            if (r12 != 0) goto L_0x00cf
            long r1 = r15.A05
            r8 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
        L_0x00cf:
            long r0 = r15.A05
            r6.AJx(r4, r3, r0)
        L_0x00d4:
            r3 = 12
            if (r12 != 0) goto L_0x00de
            long r1 = r15.A06
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
        L_0x00de:
            long r0 = r15.A06
            r6.AJx(r4, r3, r0)
        L_0x00e3:
            r3 = 13
            if (r12 != 0) goto L_0x00ed
            long r1 = r15.A03
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
        L_0x00ed:
            long r0 = r15.A03
            r6.AJx(r4, r3, r0)
        L_0x00f2:
            r3 = 14
            if (r12 != 0) goto L_0x00fc
            long r1 = r15.A02
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
        L_0x00fc:
            long r0 = r15.A02
            r6.AJx(r4, r3, r0)
        L_0x0101:
            r2 = 15
            if (r12 != 0) goto L_0x0112
            com.facebook.dcp.model.LogLevel r1 = r15.A09
            com.facebook.dcp.model.LogLevel r0 = new com.facebook.dcp.model.LogLevel
            r0.<init>(r7)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0119
        L_0x0112:
            com.facebook.dcp.model.LogLevel$$serializer r1 = com.facebook.dcp.model.LogLevel$$serializer.INSTANCE
            com.facebook.dcp.model.LogLevel r0 = r15.A09
            r6.AJz(r0, r1, r4, r2)
        L_0x0119:
            r6.AKG(r4)
            return
        L_0x011d:
            java.lang.String r1 = r15.A0B
            java.lang.String r0 = "model_name"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.PredictorMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.PredictorMetadata):void");
    }

    static {
        PredictorMetadata$$serializer predictorMetadata$$serializer = new PredictorMetadata$$serializer();
        INSTANCE = predictorMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.PredictorMetadata", predictorMetadata$$serializer, 16);
        pluginGeneratedSerialDescriptor.A00("features", true);
        pluginGeneratedSerialDescriptor.A00("modelName", true);
        pluginGeneratedSerialDescriptor.A00("modelVersion", true);
        pluginGeneratedSerialDescriptor.A00("modelAssetName", true);
        pluginGeneratedSerialDescriptor.A00("modelPositiveThreshold", true);
        pluginGeneratedSerialDescriptor.A00("defaultConfidence", true);
        pluginGeneratedSerialDescriptor.A00("isEnabled", true);
        pluginGeneratedSerialDescriptor.A00("isCacheEnabled", true);
        pluginGeneratedSerialDescriptor.A00("isLoggingEnabled", true);
        C86144wL.A1S("exampleSource", pluginGeneratedSerialDescriptor);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInMinutes", true);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInDays", true);
        pluginGeneratedSerialDescriptor.A00("logLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r3 = AnonymousClass87g.A00;
        AnonymousClass8c5 A02 = AnonymousClass8c5.A02(r3, C1372987e.A00);
        C39069Km1 km1 = C39069Km1.A00;
        C39066Kly kly = C39066Kly.A00;
        C39063Klv klv = C39063Klv.A00;
        return new AnonymousClass8sP[]{A02, r3, km1, r3, kly, kly, klv, klv, klv, new C39060Kls("com.facebook.dcp.model.ExampleSource", ExampleSource.values()), km1, km1, km1, km1, km1, LogLevel$$serializer.INSTANCE};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
