package com.facebook.dcp.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass6ZC;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C146588mU;
import X.C147118nQ;
import X.C28173Ezj;
import X.C39068Km0;
import X.C86114wI;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class LogLevel$$serializer implements C28173Ezj {
    public static final LogLevel$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public LogLevel deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        int i = 0;
        int i2 = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new LogLevel(i2, i);
            } else if (AGx == 0) {
                i = AAF.AH6(pluginGeneratedSerialDescriptor, 0);
                i2 |= 1;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    static {
        LogLevel$$serializer logLevel$$serializer = new LogLevel$$serializer();
        INSTANCE = logLevel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.LogLevel", logLevel$$serializer, 1);
        pluginGeneratedSerialDescriptor.A00("level", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{C39068Km0.A00};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }

    public void serialize(Encoder encoder, LogLevel logLevel) {
        boolean A1Y = AnonymousClass0wJ.A1Y(encoder, logLevel);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        if (C86114wI.A1Y(pluginGeneratedSerialDescriptor, AAG) || logLevel.A00 != 0) {
            AAG.AJv(pluginGeneratedSerialDescriptor, A1Y ? 1 : 0, logLevel.A00);
        }
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }
}
