package com.facebook.dcp.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c5;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C39066Kly;
import X.C39069Km1;
import X.C86114wI;
import X.C86124wJ;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class DcpContext$$serializer implements C28173Ezj {
    public static final DcpContext$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public DcpContext deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        C04220Ms.A0B(decoder2, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder2.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new DcpContext((Type) obj, str, (Map) obj2, (Map) obj3, (Map) obj4, i);
            } else if (AGx == 0) {
                str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (AGx == 1) {
                obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (AGx == 2) {
                obj2 = AAF.AHC(obj2, AnonymousClass8c5.A01(), pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else if (AGx == 3) {
                obj3 = AAF.AHC(obj3, AnonymousClass8c5.A00(), pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            } else if (AGx == 4) {
                AnonymousClass87g r1 = AnonymousClass87g.A00;
                obj4 = AAF.AHC(obj4, new AnonymousClass8c5(r1, r1), pluginGeneratedSerialDescriptor, 4);
                i |= 16;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r5 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.C04220Ms.A0I(r10.A02, X.C18220wO.A0y()) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r3.AJz(r10.A02, X.AnonymousClass8c5.A00(), r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r5 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (X.C04220Ms.A0I(r10.A04, X.C18220wO.A0y()) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r0 = X.AnonymousClass87g.A00;
        r3.AJz(r10.A04, new X.AnonymousClass8c5(r0, r0), r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        r3.AKG(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r10.A00 != com.facebook.dcp.model.Type.SERVER_CONTEXT) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (X.C04220Ms.A0I(r10.A03, X.C18220wO.A0y()) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r5 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r3.AJz(r10.A00, X.C86114wI.A0y(), r2, r6 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r5 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r3.AJz(r10.A03, X.AnonymousClass8c5.A01(), r2, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.dcp.model.DcpContext r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r9, r10)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r2 = descriptor
            X.8mU r3 = r9.AAG(r2)
            r4 = 2
            boolean r5 = X.C86114wI.A1Y(r2, r3)
            if (r5 != 0) goto L_0x001c
            java.lang.String r1 = r10.A01
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x006e
        L_0x001c:
            java.lang.String r0 = r10.A01
            r3.AK3(r0, r2, r7)
            if (r5 == 0) goto L_0x006e
        L_0x0023:
            X.Kls r1 = X.C86114wI.A0y()
            com.facebook.dcp.model.Type r0 = r10.A00
            r3.AJz(r0, r1, r2, r6)
            if (r5 == 0) goto L_0x0075
        L_0x002e:
            X.8c5 r1 = X.AnonymousClass8c5.A01()
            java.util.Map r0 = r10.A03
            r3.AJz(r0, r1, r2, r4)
        L_0x0037:
            r4 = 3
            if (r5 != 0) goto L_0x0046
            java.util.Map r1 = r10.A02
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004f
        L_0x0046:
            X.8c5 r1 = X.AnonymousClass8c5.A00()
            java.util.Map r0 = r10.A02
            r3.AJz(r0, r1, r2, r4)
        L_0x004f:
            r4 = 4
            if (r5 != 0) goto L_0x005e
            java.util.Map r1 = r10.A04
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x006a
        L_0x005e:
            X.87g r0 = X.AnonymousClass87g.A00
            X.8c5 r1 = new X.8c5
            r1.<init>(r0, r0)
            java.util.Map r0 = r10.A04
            r3.AJz(r0, r1, r2, r4)
        L_0x006a:
            r3.AKG(r2)
            return
        L_0x006e:
            com.facebook.dcp.model.Type r1 = r10.A00
            com.facebook.dcp.model.Type r0 = com.facebook.dcp.model.Type.SERVER_CONTEXT
            if (r1 == r0) goto L_0x0075
            goto L_0x0023
        L_0x0075:
            java.util.Map r1 = r10.A03
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.DcpContext$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.DcpContext):void");
    }

    static {
        DcpContext$$serializer dcpContext$$serializer = new DcpContext$$serializer();
        INSTANCE = dcpContext$$serializer;
        descriptor = C86124wJ.A18("com.facebook.dcp.model.DcpContext", dcpContext$$serializer);
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r4 = AnonymousClass87g.A00;
        return new AnonymousClass8sP[]{r4, C86114wI.A0y(), AnonymousClass8c5.A02(r4, C39069Km1.A00), AnonymousClass8c5.A02(r4, C39066Kly.A00), new AnonymousClass8c5(r4, r4)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
