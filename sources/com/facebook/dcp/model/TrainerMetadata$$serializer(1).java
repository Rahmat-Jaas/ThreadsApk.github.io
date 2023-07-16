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
import X.C39060Kls;
import X.C39063Klv;
import X.C39069Km1;
import X.C86144wL;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class TrainerMetadata$$serializer implements C28173Ezj {
    public static final TrainerMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public TrainerMetadata deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        C04220Ms.A0B(decoder2, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder2.AAF(pluginGeneratedSerialDescriptor);
        Object obj = null;
        long j = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        boolean z = false;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new TrainerMetadata((ExampleSource) obj2, (LogLevel) obj4, (Map) obj, (Map) obj3, i, j2, j3, j, j4, z);
                case 0:
                    obj = AAF.AHC(obj, AnonymousClass8c5.A02(AnonymousClass87g.A00, C1372987e.A00), pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    obj3 = AAF.AHC(obj3, AnonymousClass8c5.A02(C1372987e.A00, AnonymousClass8c0.A00(DcpRule$$serializer.INSTANCE)), pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    obj2 = AAF.AHC(obj2, new C39060Kls("com.facebook.dcp.model.ExampleSource", ExampleSource.values()), pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = AAF.AH9(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j3 = AAF.AH9(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j4 = AAF.AH9(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj4 = AAF.AHC(obj4, LogLevel$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r9 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r12.A04 == com.facebook.dcp.model.ExampleSource.COMBINE) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r7.AJz(r12.A04, new X.C39060Kls("com.facebook.dcp.model.ExampleSource", com.facebook.dcp.model.ExampleSource.values()), r5, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r9 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r12.A03 == 600) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r7.AJx(r5, 4, r12.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r9 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r12.A01 == 3600) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        r7.AJx(r5, 5, r12.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r9 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r12.A02 == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r7.AJx(r5, 6, r12.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r9 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r12.A00 == 30) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r7.AJx(r5, 7, r12.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (r9 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (X.C04220Ms.A0I(r12.A05, new com.facebook.dcp.model.LogLevel(0)) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r7.AJz(r12.A05, com.facebook.dcp.model.LogLevel$$serializer.INSTANCE, r5, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r7.AKG(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (X.C86134wK.A1Y(r12.A07) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        if (r12.A08 == r3) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r9 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r7.AJz(r12.A07, X.AnonymousClass8c5.A02(X.C1372987e.A00, X.AnonymousClass8c0.A00(com.facebook.dcp.model.DcpRule$$serializer.INSTANCE)), r5, r3 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r9 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r7.AJo(r5, 2, r12.A08);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r11, com.facebook.dcp.model.TrainerMetadata r12) {
        /*
            r10 = this;
            r6 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r12)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r5 = descriptor
            X.8mU r7 = r11.AAG(r5)
            r2 = 2
            boolean r9 = X.C86114wI.A1Y(r5, r7)
            if (r9 != 0) goto L_0x001a
            java.util.Map r0 = r12.A06
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00b6
        L_0x001a:
            X.87g r1 = X.AnonymousClass87g.A00
            X.87e r0 = X.C1372987e.A00
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r12.A06
            r7.AJz(r0, r1, r5, r6)
            if (r9 == 0) goto L_0x00b6
        L_0x0029:
            X.87e r1 = X.C1372987e.A00
            com.facebook.dcp.model.DcpRule$$serializer r0 = com.facebook.dcp.model.DcpRule$$serializer.INSTANCE
            X.8c0 r0 = X.AnonymousClass8c0.A00(r0)
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r12.A07
            r7.AJz(r0, r1, r5, r3)
            if (r9 == 0) goto L_0x00c0
        L_0x003c:
            boolean r0 = r12.A08
            r7.AJo(r5, r2, r0)
        L_0x0041:
            r3 = 3
            if (r9 != 0) goto L_0x004a
            com.facebook.dcp.model.ExampleSource r1 = r12.A04
            com.facebook.dcp.model.ExampleSource r0 = com.facebook.dcp.model.ExampleSource.COMBINE
            if (r1 == r0) goto L_0x005a
        L_0x004a:
            com.facebook.dcp.model.ExampleSource[] r2 = com.facebook.dcp.model.ExampleSource.values()
            java.lang.String r0 = "com.facebook.dcp.model.ExampleSource"
            X.Kls r1 = new X.Kls
            r1.<init>(r0, r2)
            com.facebook.dcp.model.ExampleSource r0 = r12.A04
            r7.AJz(r0, r1, r5, r3)
        L_0x005a:
            r8 = 4
            if (r9 != 0) goto L_0x0065
            long r3 = r12.A03
            r1 = 600(0x258, double:2.964E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
        L_0x0065:
            long r0 = r12.A03
            r7.AJx(r5, r8, r0)
        L_0x006a:
            r8 = 5
            if (r9 != 0) goto L_0x0075
            long r1 = r12.A01
            r3 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
        L_0x0075:
            long r0 = r12.A01
            r7.AJx(r5, r8, r0)
        L_0x007a:
            r8 = 6
            if (r9 != 0) goto L_0x0085
            long r1 = r12.A02
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
        L_0x0085:
            long r0 = r12.A02
            r7.AJx(r5, r8, r0)
        L_0x008a:
            r8 = 7
            if (r9 != 0) goto L_0x0095
            long r1 = r12.A00
            r3 = 30
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
        L_0x0095:
            long r0 = r12.A00
            r7.AJx(r5, r8, r0)
        L_0x009a:
            r2 = 8
            if (r9 != 0) goto L_0x00ab
            com.facebook.dcp.model.LogLevel r1 = r12.A05
            com.facebook.dcp.model.LogLevel r0 = new com.facebook.dcp.model.LogLevel
            r0.<init>(r6)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00b2
        L_0x00ab:
            com.facebook.dcp.model.LogLevel$$serializer r1 = com.facebook.dcp.model.LogLevel$$serializer.INSTANCE
            com.facebook.dcp.model.LogLevel r0 = r12.A05
            r7.AJz(r0, r1, r5, r2)
        L_0x00b2:
            r7.AKG(r5)
            return
        L_0x00b6:
            java.util.Map r0 = r12.A07
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00c0
            goto L_0x0029
        L_0x00c0:
            boolean r0 = r12.A08
            if (r0 == r3) goto L_0x0041
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.TrainerMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.TrainerMetadata):void");
    }

    static {
        TrainerMetadata$$serializer trainerMetadata$$serializer = new TrainerMetadata$$serializer();
        INSTANCE = trainerMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.TrainerMetadata", trainerMetadata$$serializer, 9);
        pluginGeneratedSerialDescriptor.A00("features", true);
        pluginGeneratedSerialDescriptor.A00("trainerRules", true);
        pluginGeneratedSerialDescriptor.A00("isEnabled", true);
        C86144wL.A1S("exampleSource", pluginGeneratedSerialDescriptor);
        pluginGeneratedSerialDescriptor.A00("cacheTtlInDays", true);
        pluginGeneratedSerialDescriptor.A00("logLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r0 = AnonymousClass87g.A00;
        C1372987e r1 = C1372987e.A00;
        AnonymousClass8c5 A02 = AnonymousClass8c5.A02(r0, r1);
        AnonymousClass8c5 A022 = AnonymousClass8c5.A02(r1, AnonymousClass8c0.A00(DcpRule$$serializer.INSTANCE));
        C39063Klv klv = C39063Klv.A00;
        C39060Kls kls = new C39060Kls("com.facebook.dcp.model.ExampleSource", ExampleSource.values());
        C39069Km1 km1 = C39069Km1.A00;
        return new AnonymousClass8sP[]{A02, A022, klv, kls, km1, km1, km1, km1, LogLevel$$serializer.INSTANCE};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
