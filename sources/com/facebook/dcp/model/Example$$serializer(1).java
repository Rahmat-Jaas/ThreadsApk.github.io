package com.facebook.dcp.model;

import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8c4;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C147118nQ;
import X.C28173Ezj;
import java.util.HashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class Example$$serializer implements C28173Ezj {
    public static final Example$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public Example deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        Object obj2 = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new Example((ExampleContext) obj, str, (HashMap) obj2, i);
            } else if (AGx == 0) {
                str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (AGx == 1) {
                obj = AAF.AHC(obj, ExampleContext$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (AGx == 2) {
                obj2 = AAF.AHC(obj2, new AnonymousClass8c4(AnonymousClass87g.A00, FeatureData$$serializer.INSTANCE), pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (X.C04220Ms.A0I(r10.A00, com.facebook.dcp.model.ExampleContext.A05) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (X.C04220Ms.A0I(r10.A02, X.AnonymousClass0wJ.A0y()) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r5 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r4.AJz(r10.A00, com.facebook.dcp.model.ExampleContext$$serializer.INSTANCE, r3, r6 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r5 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r4.AJz(r10.A02, new X.AnonymousClass8c4(X.AnonymousClass87g.A00, com.facebook.dcp.model.FeatureData$$serializer.INSTANCE), r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r4.AKG(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.dcp.model.Example r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r9, r10)
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r3 = descriptor
            X.8mU r4 = r9.AAG(r3)
            r2 = 2
            boolean r5 = X.C86114wI.A1Y(r3, r4)
            if (r5 != 0) goto L_0x001c
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "identity"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x003e
        L_0x001c:
            java.lang.String r0 = r10.A01
            r4.AK3(r0, r3, r7)
            if (r5 == 0) goto L_0x003e
        L_0x0023:
            com.facebook.dcp.model.ExampleContext$$serializer r1 = com.facebook.dcp.model.ExampleContext$$serializer.INSTANCE
            com.facebook.dcp.model.ExampleContext r0 = r10.A00
            r4.AJz(r0, r1, r3, r6)
            if (r5 == 0) goto L_0x0049
        L_0x002c:
            X.87g r5 = X.AnonymousClass87g.A00
            com.facebook.dcp.model.FeatureData$$serializer r0 = com.facebook.dcp.model.FeatureData$$serializer.INSTANCE
            X.8c4 r1 = new X.8c4
            r1.<init>(r5, r0)
            java.util.HashMap r0 = r10.A02
            r4.AJz(r0, r1, r3, r2)
        L_0x003a:
            r4.AKG(r3)
            return
        L_0x003e:
            com.facebook.dcp.model.ExampleContext r1 = r10.A00
            com.facebook.dcp.model.ExampleContext r0 = com.facebook.dcp.model.ExampleContext.A05
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0049
            goto L_0x0023
        L_0x0049:
            java.util.HashMap r1 = r10.A02
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dcp.model.Example$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.dcp.model.Example):void");
    }

    static {
        Example$$serializer example$$serializer = new Example$$serializer();
        INSTANCE = example$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.Example", example$$serializer, 3);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00("exampleContext", true);
        pluginGeneratedSerialDescriptor.A00("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        AnonymousClass87g r3 = AnonymousClass87g.A00;
        return new AnonymousClass8sP[]{r3, ExampleContext$$serializer.INSTANCE, new AnonymousClass8c4(r3, FeatureData$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
