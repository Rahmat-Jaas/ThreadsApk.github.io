package com.facebook.dcp.signals.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c0;
import X.AnonymousClass8c5;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39067Klz;
import X.C39069Km1;
import X.J5B;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.DcpContext$$serializer;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class SignalResult$$serializer implements C28173Ezj {
    public static final SignalResult$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public SignalResult deserialize(Decoder decoder) {
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
        long j = 0;
        int i = 0;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            switch (AGx) {
                case -1:
                    AAF.AKG(pluginGeneratedSerialDescriptor);
                    return new SignalResult((DcpContext) obj, str, (String) obj6, (String) obj2, (Map) obj7, (Map) obj5, (Map) obj3, (Map) obj4, i, j);
                case 0:
                    str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    obj6 = AAF.AHB(obj6, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    obj7 = AAF.AHC(obj7, AnonymousClass8c5.A01(), pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    obj5 = AAF.AHC(obj5, AnonymousClass8c5.A02(AnonymousClass87g.A00, C39067Klz.A00), pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    AnonymousClass87g r0 = AnonymousClass87g.A00;
                    obj3 = AAF.AHC(obj3, new AnonymousClass8c5(r0, r0), pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    AnonymousClass87g r1 = AnonymousClass87g.A00;
                    obj4 = AAF.AHC(obj4, AnonymousClass8c5.A02(r1, AnonymousClass8c0.A00(r1)), pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    obj2 = AAF.AHB(obj2, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j = AAF.AH9(pluginGeneratedSerialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    obj = AAF.AHB(obj, DcpContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r9 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (X.C86134wK.A1Y(r12.A05) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r3.AJz(r12.A05, X.AnonymousClass8c5.A02(X.AnonymousClass87g.A00, X.C39067Klz.A00), r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r9 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (X.C86134wK.A1Y(r12.A08) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = X.AnonymousClass87g.A00;
        r3.AJz(r12.A08, new X.AnonymousClass8c5(r0, r0), r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r9 != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (X.C86134wK.A1Y(r12.A07) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r1 = X.AnonymousClass87g.A00;
        r3.AJz(r12.A07, X.AnonymousClass8c5.A02(r1, X.AnonymousClass8c0.A00(r1)), r2, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r9 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r12.A02 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r3.AJy(r12.A02, X.AnonymousClass87g.A00, r2, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r9 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r12.A00 == 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r3.AJx(r2, 7, r12.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r9 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r12.A01 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r3.AJy(r12.A01, com.facebook.dcp.model.DcpContext$$serializer.INSTANCE, r2, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3.AKG(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r12.A04 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (X.C86134wK.A1Y(r12.A06) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r9 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r3.AJy(r12.A04, X.AnonymousClass87g.A00, r2, r5 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r9 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r3.AJz(r12.A06, X.AnonymousClass8c5.A01(), r2, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r11, com.facebook.dcp.signals.model.SignalResult r12) {
        /*
            r10 = this;
            r6 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r11, r12)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r2 = descriptor
            X.8mU r3 = r11.AAG(r2)
            r4 = 2
            boolean r9 = X.C86114wI.A1Y(r2, r3)
            if (r9 != 0) goto L_0x001c
            java.lang.String r1 = r12.A03
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00af
        L_0x001c:
            java.lang.String r0 = r12.A03
            r3.AK3(r0, r2, r6)
            if (r9 == 0) goto L_0x00af
        L_0x0023:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r12.A04
            r3.AJy(r0, r1, r2, r5)
            if (r9 == 0) goto L_0x00b5
        L_0x002c:
            X.8c5 r1 = X.AnonymousClass8c5.A01()
            java.util.Map r0 = r12.A06
            r3.AJz(r0, r1, r2, r4)
        L_0x0035:
            r4 = 3
            if (r9 != 0) goto L_0x0040
            java.util.Map r0 = r12.A05
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x004d
        L_0x0040:
            X.87g r1 = X.AnonymousClass87g.A00
            X.Klz r0 = X.C39067Klz.A00
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r12.A05
            r3.AJz(r0, r1, r2, r4)
        L_0x004d:
            r4 = 4
            if (r9 != 0) goto L_0x0058
            java.util.Map r0 = r12.A08
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x0064
        L_0x0058:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c5 r1 = new X.8c5
            r1.<init>(r0, r0)
            java.util.Map r0 = r12.A08
            r3.AJz(r0, r1, r2, r4)
        L_0x0064:
            r4 = 5
            if (r9 != 0) goto L_0x006f
            java.util.Map r0 = r12.A07
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x007e
        L_0x006f:
            X.87g r1 = X.AnonymousClass87g.A00
            X.8c0 r0 = X.AnonymousClass8c0.A00(r1)
            X.8c5 r1 = X.AnonymousClass8c5.A02(r1, r0)
            java.util.Map r0 = r12.A07
            r3.AJz(r0, r1, r2, r4)
        L_0x007e:
            r4 = 6
            if (r9 != 0) goto L_0x0085
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L_0x008c
        L_0x0085:
            X.87g r1 = X.AnonymousClass87g.A00
            java.lang.String r0 = r12.A02
            r3.AJy(r0, r1, r2, r4)
        L_0x008c:
            r8 = 7
            if (r9 != 0) goto L_0x0097
            long r6 = r12.A00
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
        L_0x0097:
            long r0 = r12.A00
            r3.AJx(r2, r8, r0)
        L_0x009c:
            r4 = 8
            if (r9 != 0) goto L_0x00a4
            com.facebook.dcp.model.DcpContext r0 = r12.A01
            if (r0 == 0) goto L_0x00ab
        L_0x00a4:
            com.facebook.dcp.model.DcpContext$$serializer r1 = com.facebook.dcp.model.DcpContext$$serializer.INSTANCE
            com.facebook.dcp.model.DcpContext r0 = r12.A01
            r3.AJy(r0, r1, r2, r4)
        L_0x00ab:
            r3.AKG(r2)
            return
        L_0x00af:
            java.lang.String r0 = r12.A04
            if (r0 == 0) goto L_0x00b5
            goto L_0x0023
        L_0x00b5:
            java.util.Map r0 = r12.A06
            boolean r0 = X.C86134wK.A1Y(r0)
            if (r0 != 0) goto L_0x0035
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.signals.model.SignalResult$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.signals.model.SignalResult):void");
    }

    static {
        SignalResult$$serializer signalResult$$serializer = new SignalResult$$serializer();
        INSTANCE = signalResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.signals.model.SignalResult", signalResult$$serializer, 9);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00(FXPFAccessLibraryDebugFragment.NAME, true);
        pluginGeneratedSerialDescriptor.A00("longs", true);
        pluginGeneratedSerialDescriptor.A00("floats", true);
        pluginGeneratedSerialDescriptor.A00("strings", true);
        pluginGeneratedSerialDescriptor.A00("stringLists", true);
        pluginGeneratedSerialDescriptor.A00("error", true);
        pluginGeneratedSerialDescriptor.A00("timestampInMillis", true);
        pluginGeneratedSerialDescriptor.A00("dcpContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r1 = AnonymousClass87g.A00;
        AnonymousClass8sP A00 = J5B.A00(r1);
        C39069Km1 km1 = C39069Km1.A00;
        return new AnonymousClass8sP[]{r1, A00, AnonymousClass8c5.A02(r1, km1), AnonymousClass8c5.A02(r1, C39067Klz.A00), new AnonymousClass8c5(r1, r1), AnonymousClass8c5.A02(r1, AnonymousClass8c0.A00(r1)), J5B.A00(r1), km1, J5B.A00(DcpContext$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
