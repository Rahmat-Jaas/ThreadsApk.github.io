package com.facebook.dcp.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass6ZC;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C146588mU;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39060Kls;
import X.C86114wI;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class DcpRule$$serializer implements C28173Ezj {
    public static final DcpRule$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public DcpRule deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new DcpRule((DcpData) obj3, (DcpRuleType) obj2, (Type) obj, i);
            } else if (AGx == 0) {
                obj2 = AAF.AHC(obj2, new C39060Kls("com.facebook.dcp.model.DcpRuleType", DcpRuleType.values()), pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (AGx == 1) {
                obj3 = AAF.AHC(obj3, DcpData$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (AGx == 2) {
                obj = AAF.AHC(obj, new C39060Kls("com.facebook.dcp.model.Type", Type.values()), pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    public void serialize(Encoder encoder, DcpRule dcpRule) {
        boolean A1Z = AnonymousClass0wJ.A1Z(encoder, dcpRule);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        C04220Ms.A0B(pluginGeneratedSerialDescriptor, 2);
        AAG.AJz(dcpRule.A01, new C39060Kls("com.facebook.dcp.model.DcpRuleType", DcpRuleType.values()), pluginGeneratedSerialDescriptor, 0);
        AAG.AJz(dcpRule.A00, DcpData$$serializer.INSTANCE, pluginGeneratedSerialDescriptor, A1Z ? 1 : 0);
        AAG.AJz(dcpRule.A02, C86114wI.A0y(), pluginGeneratedSerialDescriptor, 2);
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }

    static {
        DcpRule$$serializer dcpRule$$serializer = new DcpRule$$serializer();
        INSTANCE = dcpRule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.DcpRule", dcpRule$$serializer, 3);
        pluginGeneratedSerialDescriptor.A00("dcpRuleType", false);
        pluginGeneratedSerialDescriptor.A00("dcpData", false);
        pluginGeneratedSerialDescriptor.A00("valueType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{new C39060Kls("com.facebook.dcp.model.DcpRuleType", DcpRuleType.values()), DcpData$$serializer.INSTANCE, C86114wI.A0y()};
    }
}
