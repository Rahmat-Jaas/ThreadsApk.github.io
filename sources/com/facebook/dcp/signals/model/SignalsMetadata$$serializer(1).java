package com.facebook.dcp.signals.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c0;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class SignalsMetadata$$serializer implements C28173Ezj {
    public static final SignalsMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public SignalsMetadata deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new SignalsMetadata((List) obj, i, str);
            } else if (AGx == 0) {
                str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (AGx == 1) {
                obj = AAF.AHC(obj, AnonymousClass8c0.A00(SignalMetadata$$serializer.INSTANCE), pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (X.C04220Ms.A0I(r5.A01, X.C18180wK.A0n(new com.facebook.dcp.signals.model.SignalMetadata((com.facebook.dcp.model.DcpData) null, (com.facebook.dcp.model.Type) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 262143, 0, 0, 0, false))) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r6 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r2.AJz(r5.A01, X.AnonymousClass8c0.A00(com.facebook.dcp.signals.model.SignalMetadata$$serializer.INSTANCE), r3, r4 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r2.AKG(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r23, com.facebook.dcp.signals.model.SignalsMetadata r24) {
        /*
            r22 = this;
            r12 = 0
            r0 = r23
            r5 = r24
            boolean r4 = X.AnonymousClass0wJ.A1Z(r0, r5)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r3 = descriptor
            X.8mU r2 = r0.AAG(r3)
            boolean r6 = X.C86114wI.A1Y(r3, r2)
            if (r6 != 0) goto L_0x001f
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "0.0.0"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0035
        L_0x001f:
            java.lang.String r0 = r5.A00
            r2.AK3(r0, r3, r12)
            if (r6 == 0) goto L_0x0035
        L_0x0026:
            com.facebook.dcp.signals.model.SignalMetadata$$serializer r0 = com.facebook.dcp.signals.model.SignalMetadata$$serializer.INSTANCE
            X.8c0 r1 = X.AnonymousClass8c0.A00(r0)
            java.util.List r0 = r5.A01
            r2.AJz(r0, r1, r3, r4)
        L_0x0031:
            r2.AKG(r3)
            return
        L_0x0035:
            java.util.List r1 = r5.A01
            r7 = 0
            r15 = 0
            r14 = 262143(0x3ffff, float:3.6734E-40)
            com.facebook.dcp.signals.model.SignalMetadata r6 = new com.facebook.dcp.signals.model.SignalMetadata
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r12
            r17 = r15
            r19 = r15
            r21 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21)
            java.util.List r0 = X.C18180wK.A0n(r6)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.signals.model.SignalsMetadata$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.signals.model.SignalsMetadata):void");
    }

    static {
        SignalsMetadata$$serializer signalsMetadata$$serializer = new SignalsMetadata$$serializer();
        INSTANCE = signalsMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.signals.model.SignalsMetadata", signalsMetadata$$serializer, 2);
        pluginGeneratedSerialDescriptor.A00(ClientCookie.VERSION_ATTR, true);
        pluginGeneratedSerialDescriptor.A00("signalMetadatas", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{AnonymousClass87g.A00, AnonymousClass8c0.A00(SignalMetadata$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
