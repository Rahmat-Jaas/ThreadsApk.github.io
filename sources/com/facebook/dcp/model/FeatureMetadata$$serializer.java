package com.facebook.dcp.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c0;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C39068Km0;
import X.C86114wI;
import X.J5B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class FeatureMetadata$$serializer implements C28173Ezj {
    public static final FeatureMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public FeatureMetadata deserialize(Decoder decoder) {
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
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new FeatureMetadata((DcpData) obj7, (FeatureSource) obj5, (LogLevel) obj3, (Type) obj, str, str2, (String) obj4, (String) obj2, (List) obj6, i, i2, i3);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    obj7 = AAF.AHB(obj7, DcpData$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    obj6 = AAF.AHC(obj6, AnonymousClass8c0.A00(AnonymousClass87g.A00), pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    obj5 = AAF.AHC(obj5, new C39060Kls("com.facebook.dcp.model.FeatureSource", FeatureSource.values()), pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = AAF.AH6(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    obj3 = AAF.AHC(obj3, LogLevel$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = AAF.AHH(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj4 = AAF.AHB(obj4, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    obj2 = AAF.AHB(obj2, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i3 = AAF.AH6(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r7 != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (X.C04220Ms.A0I(r10.A0A, X.AnonymousClass0ZV.A00) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r4.AJz(r10.A0A, X.AnonymousClass8c0.A00(X.AnonymousClass87g.A00), r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r7 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r10.A04 == com.facebook.dcp.model.FeatureSource.PREFER_CLIENT) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r4.AJz(r10.A04, new X.C39060Kls("com.facebook.dcp.model.FeatureSource", com.facebook.dcp.model.FeatureSource.values()), r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r7 != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r10.A01 == 30) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r4.AJv(r2, 5, r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r7 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (X.C04220Ms.A0I(r10.A05, new com.facebook.dcp.model.LogLevel(0)) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r4.AJz(r10.A05, com.facebook.dcp.model.LogLevel$$serializer.INSTANCE, r2, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r7 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (X.C04220Ms.A0I(r10.A09, "") != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        r4.AK3(r10.A09, r2, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r7 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r10.A00 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        r4.AJy(r10.A00, X.AnonymousClass87g.A00, r2, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        if (r7 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        if (r10.A07 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r4.AJy(r10.A07, X.AnonymousClass87g.A00, r2, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        if (r7 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r10.A02 == 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r4.AJv(r2, 10, r10.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        r4.AKG(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r10.A06 != com.facebook.dcp.model.Type.STRING) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        if (X.C04220Ms.A0I(r10.A03, X.C86114wI.A0J()) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r7 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r4.AJz(r10.A06, X.C86114wI.A0y(), r2, r6 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r7 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r4.AJy(r10.A03, com.facebook.dcp.model.DcpData$$serializer.INSTANCE, r2, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.dcp.model.FeatureMetadata r10) {
        /*
            r8 = this;
            r3 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r9, r10)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r2 = descriptor
            X.8mU r4 = r9.AAG(r2)
            r5 = 2
            boolean r7 = X.C86114wI.A1Y(r2, r4)
            if (r7 != 0) goto L_0x001c
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "1"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00cc
        L_0x001c:
            java.lang.String r0 = r10.A08
            r4.AK3(r0, r2, r3)
            if (r7 == 0) goto L_0x00cc
        L_0x0023:
            X.Kls r1 = X.C86114wI.A0y()
            com.facebook.dcp.model.Type r0 = r10.A06
            r4.AJz(r0, r1, r2, r6)
            if (r7 == 0) goto L_0x00d4
        L_0x002e:
            com.facebook.dcp.model.DcpData$$serializer r1 = com.facebook.dcp.model.DcpData$$serializer.INSTANCE
            com.facebook.dcp.model.DcpData r0 = r10.A03
            r4.AJy(r0, r1, r2, r5)
        L_0x0035:
            r5 = 3
            if (r7 != 0) goto L_0x0042
            java.util.List r1 = r10.A0A
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004d
        L_0x0042:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r10.A0A
            r4.AJz(r0, r1, r2, r5)
        L_0x004d:
            r6 = 4
            if (r7 != 0) goto L_0x0056
            com.facebook.dcp.model.FeatureSource r1 = r10.A04
            com.facebook.dcp.model.FeatureSource r0 = com.facebook.dcp.model.FeatureSource.PREFER_CLIENT
            if (r1 == r0) goto L_0x0066
        L_0x0056:
            com.facebook.dcp.model.FeatureSource[] r5 = com.facebook.dcp.model.FeatureSource.values()
            java.lang.String r0 = "com.facebook.dcp.model.FeatureSource"
            X.Kls r1 = new X.Kls
            r1.<init>(r0, r5)
            com.facebook.dcp.model.FeatureSource r0 = r10.A04
            r4.AJz(r0, r1, r2, r6)
        L_0x0066:
            r5 = 5
            if (r7 != 0) goto L_0x006f
            int r1 = r10.A01
            r0 = 30
            if (r1 == r0) goto L_0x0074
        L_0x006f:
            int r0 = r10.A01
            r4.AJv(r2, r5, r0)
        L_0x0074:
            r5 = 6
            if (r7 != 0) goto L_0x0084
            com.facebook.dcp.model.LogLevel r1 = r10.A05
            com.facebook.dcp.model.LogLevel r0 = new com.facebook.dcp.model.LogLevel
            r0.<init>(r3)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x008b
        L_0x0084:
            com.facebook.dcp.model.LogLevel$$serializer r1 = com.facebook.dcp.model.LogLevel$$serializer.INSTANCE
            com.facebook.dcp.model.LogLevel r0 = r10.A05
            r4.AJz(r0, r1, r2, r5)
        L_0x008b:
            r3 = 7
            if (r7 != 0) goto L_0x0098
            java.lang.String r1 = r10.A09
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x009d
        L_0x0098:
            java.lang.String r0 = r10.A09
            r4.AK3(r0, r2, r3)
        L_0x009d:
            r3 = 8
            if (r7 != 0) goto L_0x00a5
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x00ac
        L_0x00a5:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r10.A00
            r4.AJy(r0, r1, r2, r3)
        L_0x00ac:
            r3 = 9
            if (r7 != 0) goto L_0x00b4
            java.lang.String r0 = r10.A07
            if (r0 == 0) goto L_0x00bb
        L_0x00b4:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r10.A07
            r4.AJy(r0, r1, r2, r3)
        L_0x00bb:
            r1 = 10
            if (r7 != 0) goto L_0x00c3
            int r0 = r10.A02
            if (r0 == 0) goto L_0x00c8
        L_0x00c3:
            int r0 = r10.A02
            r4.AJv(r2, r1, r0)
        L_0x00c8:
            r4.AKG(r2)
            return
        L_0x00cc:
            com.facebook.dcp.model.Type r1 = r10.A06
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.STRING
            if (r1 == r0) goto L_0x00d4
            goto L_0x0023
        L_0x00d4:
            com.facebook.dcp.model.DcpData r1 = r10.A03
            com.facebook.dcp.model.DcpData r0 = X.C86114wI.A0J()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0035
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.FeatureMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.FeatureMetadata):void");
    }

    static {
        FeatureMetadata$$serializer featureMetadata$$serializer = new FeatureMetadata$$serializer();
        INSTANCE = featureMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.FeatureMetadata", featureMetadata$$serializer, 11);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00("type", true);
        pluginGeneratedSerialDescriptor.A00("defaultValue", true);
        pluginGeneratedSerialDescriptor.A00("inputSignalList", true);
        pluginGeneratedSerialDescriptor.A00("source", true);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInDays", true);
        pluginGeneratedSerialDescriptor.A00("logLevel", true);
        pluginGeneratedSerialDescriptor.A00("transformerName", true);
        pluginGeneratedSerialDescriptor.A00("purpose", true);
        pluginGeneratedSerialDescriptor.A00("access", true);
        pluginGeneratedSerialDescriptor.A00("collectionDelay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r2 = AnonymousClass87g.A00;
        C39060Kls A0y = C86114wI.A0y();
        AnonymousClass8sP A00 = J5B.A00(DcpData$$serializer.INSTANCE);
        AnonymousClass8c0 A002 = AnonymousClass8c0.A00(r2);
        C39060Kls kls = new C39060Kls("com.facebook.dcp.model.FeatureSource", FeatureSource.values());
        C39068Km0 km0 = C39068Km0.A00;
        return new AnonymousClass8sP[]{r2, A0y, A00, A002, kls, km0, LogLevel$$serializer.INSTANCE, r2, J5B.A00(r2), J5B.A00(r2), km0};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
