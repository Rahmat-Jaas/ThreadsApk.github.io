package com.facebook.dcp.model;

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
import X.C39068Km0;
import X.C39069Km1;
import X.C86114wI;
import X.J5B;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.common.dextricks.Constants;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class DcpData$$serializer implements C28173Ezj {
    public static final DcpData$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public DcpData deserialize(Decoder decoder) {
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
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new DcpData((Type) obj3, str, (String) obj2, (String) obj8, (List) obj, (List) obj7, (List) obj9, (Map) obj6, (Map) obj5, (Map) obj4, d, i2, i, i3, j, z);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                    break;
                case 1:
                    i = AAF.AH6(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                    break;
                case 2:
                    obj3 = AAF.AHC(obj3, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 3);
                    i2 |= 8;
                    break;
                case 4:
                    d = AAF.AGw(pluginGeneratedSerialDescriptor, 4);
                    i2 |= 16;
                    break;
                case 5:
                    obj2 = AAF.AHB(obj2, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 5);
                    i2 |= 32;
                    break;
                case 6:
                    z = AAF.AGq(pluginGeneratedSerialDescriptor, 6);
                    i2 |= 64;
                    break;
                case 7:
                    obj = AAF.AHC(obj, AnonymousClass8c0.A00(C39069Km1.A00), pluginGeneratedSerialDescriptor, 7);
                    i2 |= 128;
                    break;
                case 8:
                    obj7 = AAF.AHC(obj7, AnonymousClass8c0.A00(C39066Kly.A00), pluginGeneratedSerialDescriptor, 8);
                    i2 |= 256;
                    break;
                case 9:
                    obj9 = AAF.AHC(obj9, AnonymousClass8c0.A00(AnonymousClass87g.A00), pluginGeneratedSerialDescriptor, 9);
                    i2 |= 512;
                    break;
                case 10:
                    obj6 = AAF.AHC(obj6, AnonymousClass8c5.A01(), pluginGeneratedSerialDescriptor, 10);
                    i2 |= 1024;
                    break;
                case 11:
                    obj5 = AAF.AHC(obj5, AnonymousClass8c5.A00(), pluginGeneratedSerialDescriptor, 11);
                    i2 |= 2048;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    AnonymousClass87g r0 = AnonymousClass87g.A00;
                    obj4 = AAF.AHC(obj4, new AnonymousClass8c5(r0, r0), pluginGeneratedSerialDescriptor, 12);
                    i2 |= 4096;
                    break;
                case 13:
                    obj8 = AAF.AHB(obj8, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 13);
                    i2 |= 8192;
                    break;
                case 14:
                    i3 = AAF.AH6(pluginGeneratedSerialDescriptor, 14);
                    i2 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r8 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r11.A03 == -1) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r5.AJx(r6, 3, r11.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r8 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (java.lang.Double.compare(r11.A00, -0.0d) == 0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r5.AJr(r6, r11.A00, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r8 != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r11.A07 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r5.AJy(r11.A07, X.AnonymousClass87g.A00, r6, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r8 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r11.A0E == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        r5.AJo(r6, 6, r11.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r8 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (X.C04220Ms.A0I(r11.A09, X.AnonymousClass0ZV.A00) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r5.AJz(r11.A09, X.AnonymousClass8c0.A00(X.C39069Km1.A00), r6, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r8 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        if (X.C04220Ms.A0I(r11.A08, X.AnonymousClass0ZV.A00) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r5.AJz(r11.A08, X.AnonymousClass8c0.A00(X.C39066Kly.A00), r6, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        if (r8 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        if (X.C04220Ms.A0I(r11.A0A, X.AnonymousClass0ZV.A00) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        r5.AJz(r11.A0A, X.AnonymousClass8c0.A00(X.AnonymousClass87g.A00), r6, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r8 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (X.C86134wK.A1Y(r11.A0C) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        r5.AJz(r11.A0C, X.AnonymousClass8c5.A01(), r6, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r8 != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        if (X.C86134wK.A1Y(r11.A0B) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        r5.AJz(r11.A0B, X.AnonymousClass8c5.A00(), r6, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        if (r8 != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        if (X.C86134wK.A1Y(r11.A0D) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        r0 = X.AnonymousClass87g.A00;
        r5.AJz(r11.A0D, new X.AnonymousClass8c5(r0, r0), r6, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r8 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
        if (r8 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        if (r11.A05 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r5.AJy(r11.A05, X.AnonymousClass87g.A00, r6, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        if (r8 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r11.A01 == 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        r5.AJv(r6, 14, r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0117, code lost:
        r5.AKG(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r5.AJv(r6, r3 ? 1 : 0, r11.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011d, code lost:
        if (r11.A02 != r3) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0125, code lost:
        if (r11.A04 == com.facebook.dcp.model.Type.DOUBLE) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r8 == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r5.AJz(r11.A04, X.C86114wI.A0y(), r6, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r10, com.facebook.dcp.model.DcpData r11) {
        /*
            r9 = this;
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r10, r11)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r6 = descriptor
            X.8mU r5 = r10.AAG(r6)
            r2 = 2
            boolean r8 = X.C86114wI.A1Y(r6, r5)
            if (r8 != 0) goto L_0x001c
            java.lang.String r1 = r11.A06
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x011b
        L_0x001c:
            java.lang.String r0 = r11.A06
            r5.AK3(r0, r6, r4)
            if (r8 == 0) goto L_0x011b
        L_0x0023:
            int r0 = r11.A02
            r5.AJv(r6, r3, r0)
            if (r8 == 0) goto L_0x0121
        L_0x002a:
            X.Kls r1 = X.C86114wI.A0y()
            com.facebook.dcp.model.Type r0 = r11.A04
            r5.AJz(r0, r1, r6, r2)
        L_0x0033:
            r7 = 3
            if (r8 != 0) goto L_0x003e
            long r3 = r11.A03
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
        L_0x003e:
            long r0 = r11.A03
            r5.AJx(r6, r7, r0)
        L_0x0043:
            r4 = 4
            if (r8 != 0) goto L_0x0050
            double r2 = r11.A00
            r0 = -9223372036854775808
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 == 0) goto L_0x0055
        L_0x0050:
            double r0 = r11.A00
            r5.AJr(r6, r0, r4)
        L_0x0055:
            r2 = 5
            if (r8 != 0) goto L_0x005c
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L_0x0063
        L_0x005c:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r11.A07
            r5.AJy(r0, r1, r6, r2)
        L_0x0063:
            r1 = 6
            if (r8 != 0) goto L_0x006a
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x006f
        L_0x006a:
            boolean r0 = r11.A0E
            r5.AJo(r6, r1, r0)
        L_0x006f:
            r2 = 7
            if (r8 != 0) goto L_0x007c
            java.util.List r1 = r11.A09
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0087
        L_0x007c:
            X.Km1 r0 = X.C39069Km1.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A09
            r5.AJz(r0, r1, r6, r2)
        L_0x0087:
            r2 = 8
            if (r8 != 0) goto L_0x0095
            java.util.List r1 = r11.A08
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00a0
        L_0x0095:
            X.Kly r0 = X.C39066Kly.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A08
            r5.AJz(r0, r1, r6, r2)
        L_0x00a0:
            r2 = 9
            if (r8 != 0) goto L_0x00ae
            java.util.List r1 = r11.A0A
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00b9
        L_0x00ae:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r11.A0A
            r5.AJz(r0, r1, r6, r2)
        L_0x00b9:
            r2 = 10
            if (r8 != 0) goto L_0x00c5
            java.util.Map r0 = r11.A0C
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00ce
        L_0x00c5:
            X.8c5 r1 = X.AnonymousClass8c5.A01()
            java.util.Map r0 = r11.A0C
            r5.AJz(r0, r1, r6, r2)
        L_0x00ce:
            r2 = 11
            if (r8 != 0) goto L_0x00da
            java.util.Map r0 = r11.A0B
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00e3
        L_0x00da:
            X.8c5 r1 = X.AnonymousClass8c5.A00()
            java.util.Map r0 = r11.A0B
            r5.AJz(r0, r1, r6, r2)
        L_0x00e3:
            r2 = 12
            if (r8 != 0) goto L_0x00ef
            java.util.Map r0 = r11.A0D
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x00fb
        L_0x00ef:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c5 r1 = new X.8c5
            r1.<init>(r0, r0)
            java.util.Map r0 = r11.A0D
            r5.AJz(r0, r1, r6, r2)
        L_0x00fb:
            r2 = 13
            if (r8 != 0) goto L_0x0103
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x010a
        L_0x0103:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r11.A05
            r5.AJy(r0, r1, r6, r2)
        L_0x010a:
            r1 = 14
            if (r8 != 0) goto L_0x0112
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0117
        L_0x0112:
            int r0 = r11.A01
            r5.AJv(r6, r1, r0)
        L_0x0117:
            r5.AKG(r6)
            return
        L_0x011b:
            int r0 = r11.A02
            if (r0 == r3) goto L_0x0121
            goto L_0x0023
        L_0x0121:
            com.facebook.dcp.model.Type r1 = r11.A04
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.DOUBLE
            if (r1 == r0) goto L_0x0033
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.DcpData$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.DcpData):void");
    }

    static {
        DcpData$$serializer dcpData$$serializer = new DcpData$$serializer();
        INSTANCE = dcpData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.DcpData", dcpData$$serializer, 15);
        pluginGeneratedSerialDescriptor.A00("id", true);
        C86114wI.A1O(ClientCookie.VERSION_ATTR, pluginGeneratedSerialDescriptor);
        pluginGeneratedSerialDescriptor.A00("longMap", true);
        pluginGeneratedSerialDescriptor.A00("doubleMap", true);
        pluginGeneratedSerialDescriptor.A00("stringMap", true);
        pluginGeneratedSerialDescriptor.A00("error", true);
        pluginGeneratedSerialDescriptor.A00("timestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r0 = AnonymousClass87g.A00;
        C39068Km0 km0 = C39068Km0.A00;
        C39060Kls A0y = C86114wI.A0y();
        C39069Km1 km1 = C39069Km1.A00;
        C39066Kly kly = C39066Kly.A00;
        return new AnonymousClass8sP[]{r0, km0, A0y, km1, kly, J5B.A00(r0), C39063Klv.A00, AnonymousClass8c0.A00(km1), AnonymousClass8c0.A00(kly), AnonymousClass8c0.A00(r0), AnonymousClass8c5.A02(r0, km1), AnonymousClass8c5.A02(r0, kly), new AnonymousClass8c5(r0, r0), J5B.A00(r0), km0};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
