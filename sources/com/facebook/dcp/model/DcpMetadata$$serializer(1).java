package com.facebook.dcp.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass6ZC;
import X.AnonymousClass87g;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C146588mU;
import X.C147118nQ;
import X.C28173Ezj;
import X.C86114wI;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class DcpMetadata$$serializer implements C28173Ezj {
    public static final DcpMetadata$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public DcpMetadata deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new DcpMetadata(str, i);
            } else if (AGx == 0) {
                str = AAF.AHH(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    static {
        DcpMetadata$$serializer dcpMetadata$$serializer = new DcpMetadata$$serializer();
        INSTANCE = dcpMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.DcpMetadata", dcpMetadata$$serializer, 1);
        pluginGeneratedSerialDescriptor.A00(ClientCookie.VERSION_ATTR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{AnonymousClass87g.A00};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }

    public void serialize(Encoder encoder, DcpMetadata dcpMetadata) {
        boolean A1Y = AnonymousClass0wJ.A1Y(encoder, dcpMetadata);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        if (C86114wI.A1Y(pluginGeneratedSerialDescriptor, AAG) || !C04220Ms.A0I(dcpMetadata.A00, "0.1")) {
            AAG.AK3(dcpMetadata.A00, pluginGeneratedSerialDescriptor, A1Y ? 1 : 0);
        }
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }
}
