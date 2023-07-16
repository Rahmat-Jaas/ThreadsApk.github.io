package com.facebook.dcp.model;

import X.AnonymousClass6D1;
import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c0;
import X.AnonymousClass8c5;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C39063Klv;
import X.C39066Kly;
import X.C39069Km1;
import X.C86114wI;
import X.J5B;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class FeatureData$$serializer implements C28173Ezj {
    public static final FeatureData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r8 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (java.lang.Double.compare(r11.A00, -1.0d) == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r6.AJr(r5, r11.A00, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r8 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r11.A04 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r6.AJy(r11.A04, X.AnonymousClass87g.A00, r5, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r8 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r11.A0D == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r6.AJo(r5, 5, r11.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r8 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (X.C04220Ms.A0I(r11.A07, X.AnonymousClass0ZV.A00) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r6.AJz(r11.A07, X.AnonymousClass8c0.A00(X.C39069Km1.A00), r5, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r8 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (X.C04220Ms.A0I(r11.A06, X.AnonymousClass0ZV.A00) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r6.AJz(r11.A06, X.AnonymousClass8c0.A00(X.C39066Kly.A00), r5, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r8 != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (X.C04220Ms.A0I(r11.A08, X.AnonymousClass0ZV.A00) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r6.AJz(r11.A08, X.AnonymousClass8c0.A00(X.AnonymousClass87g.A00), r5, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r8 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (X.C04220Ms.A0I(r11.A05, X.AnonymousClass0ZV.A00) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r6.AJz(r11.A05, X.AnonymousClass8c0.A00(X.C39063Klv.A00), r5, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        if (r8 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if (X.C86134wK.A1Y(r11.A0B) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        r6.AJz(r11.A0B, X.AnonymousClass8c5.A01(), r5, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r8 != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        if (X.C86134wK.A1Y(r11.A0A) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        r6.AJz(r11.A0A, X.AnonymousClass8c5.A00(), r5, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        if (r8 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f5, code lost:
        if (X.C86134wK.A1Y(r11.A0C) != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f7, code lost:
        r0 = X.AnonymousClass87g.A00;
        r6.AJz(r11.A0C, new X.AnonymousClass8c5(r0, r0), r5, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r8 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r8 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        if (X.C86134wK.A1Y(r11.A09) != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        r6.AJz(r11.A09, X.AnonymousClass8c5.A02(X.AnonymousClass87g.A00, X.C39063Klv.A00), r5, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
        r6.AKG(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0124, code lost:
        if (r11.A02 != com.facebook.dcp.model.Type.DOUBLE) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        if (r11.A01 == -1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r6.AJz(r11.A02, X.C86114wI.A0y(), r5, r2 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r8 == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r6.AJx(r5, 2, r11.A01);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r10, com.facebook.dcp.model.FeatureData r11) {
        /*
            r9 = this;
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r10, r11)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r5 = descriptor
            X.8mU r6 = r10.AAG(r5)
            r7 = 2
            boolean r8 = X.C86114wI.A1Y(r5, r6)
            if (r8 != 0) goto L_0x001c
            java.lang.String r1 = r11.A03
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0120
        L_0x001c:
            java.lang.String r0 = r11.A03
            r6.AK3(r0, r5, r3)
            if (r8 == 0) goto L_0x0120
        L_0x0023:
            X.Kls r1 = X.C86114wI.A0y()
            com.facebook.dcp.model.Type r0 = r11.A02
            r6.AJz(r0, r1, r5, r2)
            if (r8 == 0) goto L_0x0128
        L_0x002e:
            long r0 = r11.A01
            r6.AJx(r5, r7, r0)
        L_0x0033:
            r4 = 3
            if (r8 != 0) goto L_0x0040
            double r2 = r11.A00
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 == 0) goto L_0x0045
        L_0x0040:
            double r0 = r11.A00
            r6.AJr(r5, r0, r4)
        L_0x0045:
            r2 = 4
            if (r8 != 0) goto L_0x004c
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0053
        L_0x004c:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r11.A04
            r6.AJy(r0, r1, r5, r2)
        L_0x0053:
            r1 = 5
            if (r8 != 0) goto L_0x005a
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x005f
        L_0x005a:
            boolean r0 = r11.A0D
            r6.AJo(r5, r1, r0)
        L_0x005f:
            r2 = 6
            if (r8 != 0) goto L_0x006c
            java.util.List r1 = r11.A07
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0077
        L_0x006c:
            X.Km1 r0 = X.C39069Km1.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A07
            r6.AJz(r0, r1, r5, r2)
        L_0x0077:
            r2 = 7
            if (r8 != 0) goto L_0x0084
            java.util.List r1 = r11.A06
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x008f
        L_0x0084:
            X.Kly r0 = X.C39066Kly.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A06
            r6.AJz(r0, r1, r5, r2)
        L_0x008f:
            r2 = 8
            if (r8 != 0) goto L_0x009d
            java.util.List r1 = r11.A08
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00a8
        L_0x009d:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A08
            r6.AJz(r0, r1, r5, r2)
        L_0x00a8:
            r2 = 9
            if (r8 != 0) goto L_0x00b6
            java.util.List r1 = r11.A05
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00c1
        L_0x00b6:
            X.Klv r0 = X.C39063Klv.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A05
            r6.AJz(r0, r1, r5, r2)
        L_0x00c1:
            r2 = 10
            if (r8 != 0) goto L_0x00cd
            java.util.Map r0 = r11.A0B
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00d6
        L_0x00cd:
            X.8c5 r1 = X.AnonymousClass8c5.A01()
            java.util.Map r0 = r11.A0B
            r6.AJz(r0, r1, r5, r2)
        L_0x00d6:
            r2 = 11
            if (r8 != 0) goto L_0x00e2
            java.util.Map r0 = r11.A0A
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00eb
        L_0x00e2:
            X.8c5 r1 = X.AnonymousClass8c5.A00()
            java.util.Map r0 = r11.A0A
            r6.AJz(r0, r1, r5, r2)
        L_0x00eb:
            r2 = 12
            if (r8 != 0) goto L_0x00f7
            java.util.Map r0 = r11.A0C
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x0103
        L_0x00f7:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c5 r1 = new X.8c5
            r1.<init>(r0, r0)
            java.util.Map r0 = r11.A0C
            r6.AJz(r0, r1, r5, r2)
        L_0x0103:
            r2 = 13
            if (r8 != 0) goto L_0x010f
            java.util.Map r0 = r11.A09
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x011c
        L_0x010f:
            X.87g r1 = X.AnonymousClass87g.A00
            X.Klv r0 = X.C39063Klv.A00
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r11.A09
            r6.AJz(r0, r1, r5, r2)
        L_0x011c:
            r6.AKG(r5)
            return
        L_0x0120:
            com.facebook.dcp.model.Type r1 = r11.A02
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.DOUBLE
            if (r1 == r0) goto L_0x0128
            goto L_0x0023
        L_0x0128:
            long r3 = r11.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.FeatureData$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.FeatureData):void");
    }

    static {
        FeatureData$$serializer featureData$$serializer = new FeatureData$$serializer();
        INSTANCE = featureData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.FeatureData", featureData$$serializer, 14);
        C86114wI.A1O("id", pluginGeneratedSerialDescriptor);
        pluginGeneratedSerialDescriptor.A00("booleanList", true);
        pluginGeneratedSerialDescriptor.A00("longMap", true);
        pluginGeneratedSerialDescriptor.A00("doubleMap", true);
        pluginGeneratedSerialDescriptor.A00("stringMap", true);
        pluginGeneratedSerialDescriptor.A00("booleanMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r0 = AnonymousClass87g.A00;
        C39060Kls A0y = C86114wI.A0y();
        C39069Km1 km1 = C39069Km1.A00;
        C39066Kly kly = C39066Kly.A00;
        AnonymousClass8sP A00 = J5B.A00(r0);
        C39063Klv klv = C39063Klv.A00;
        return new AnonymousClass8sP[]{r0, A0y, km1, kly, A00, klv, AnonymousClass8c0.A00(km1), AnonymousClass8c0.A00(kly), AnonymousClass8c0.A00(r0), AnonymousClass8c0.A00(klv), AnonymousClass8c5.A02(r0, km1), AnonymousClass8c5.A02(r0, kly), new AnonymousClass8c5(r0, r0), AnonymousClass8c5.A02(r0, klv)};
    }

    public FeatureData deserialize(Decoder decoder) {
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
        Object obj8 = null;
        Object obj9 = null;
        long j = 0;
        double d = 0.0d;
        int i = 0;
        boolean z = false;
        Object obj10 = null;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new FeatureData((Type) obj, str, (String) obj10, (List) obj3, (List) obj2, (List) obj9, (List) obj7, (Map) obj8, (Map) obj6, (Map) obj5, (Map) obj4, (AnonymousClass6D1) null, d, i, j, z);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d = AAF.AGw(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    obj10 = AAF.AHB(obj10, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    obj3 = AAF.AHC(obj3, AnonymousClass8c0.A00(C39069Km1.A00), pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    obj2 = AAF.AHC(obj2, AnonymousClass8c0.A00(C39066Kly.A00), pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj9 = AAF.AHC(obj9, AnonymousClass8c0.A00(AnonymousClass87g.A00), pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    obj7 = AAF.AHC(obj7, AnonymousClass8c0.A00(C39063Klv.A00), pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    obj8 = AAF.AHC(obj8, AnonymousClass8c5.A01(), pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    obj6 = AAF.AHC(obj6, AnonymousClass8c5.A00(), pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    AnonymousClass87g r0 = AnonymousClass87g.A00;
                    obj5 = AAF.AHC(obj5, new AnonymousClass8c5(r0, r0), pluginGeneratedSerialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    obj4 = AAF.AHC(obj4, AnonymousClass8c5.A02(AnonymousClass87g.A00, C39063Klv.A00), pluginGeneratedSerialDescriptor, 13);
                    i |= 8192;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
