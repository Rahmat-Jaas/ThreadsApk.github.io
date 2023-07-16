package com.facebook.dcp.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass6ZC;
import X.AnonymousClass8c0;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C146588mU;
import X.C147118nQ;
import X.C28173Ezj;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class DcpDataList$$serializer implements C28173Ezj {
    public static final DcpDataList$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public DcpDataList deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        Object obj = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new DcpDataList((List) obj, i);
            } else if (AGx == 0) {
                obj = AAF.AHC(obj, AnonymousClass8c0.A00(DcpData$$serializer.INSTANCE), pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    static {
        DcpDataList$$serializer dcpDataList$$serializer = new DcpDataList$$serializer();
        INSTANCE = dcpDataList$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.DcpDataList", dcpDataList$$serializer, 1);
        pluginGeneratedSerialDescriptor.A00("dataList", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{AnonymousClass8c0.A00(DcpData$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }

    public void serialize(Encoder encoder, DcpDataList dcpDataList) {
        boolean A1Y = AnonymousClass0wJ.A1Y(encoder, dcpDataList);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        C04220Ms.A0B(pluginGeneratedSerialDescriptor, 2);
        AAG.AJz(dcpDataList.A00, AnonymousClass8c0.A00(DcpData$$serializer.INSTANCE), pluginGeneratedSerialDescriptor, A1Y ? 1 : 0);
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }
}
