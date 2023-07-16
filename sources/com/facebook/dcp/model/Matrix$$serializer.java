package com.facebook.dcp.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass6ZC;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C141528bl;
import X.C141648by;
import X.C146588mU;
import X.C147118nQ;
import X.C18210wN;
import X.C28173Ezj;
import X.MXM;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

public final class Matrix$$serializer implements C28173Ezj {
    public static final Matrix$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Matrix$$serializer matrix$$serializer = new Matrix$$serializer();
        INSTANCE = matrix$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.facebook.dcp.model.Matrix", matrix$$serializer, 1);
        pluginGeneratedSerialDescriptor.A00("matrixInternal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public AnonymousClass8sP[] childSerializers() {
        return new AnonymousClass8sP[]{new C141648by(C18210wN.A0l(float[].class), MXM.A00)};
    }

    public Matrix deserialize(Decoder decoder) {
        Class<float[]> cls = float[].class;
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        Object obj = null;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new Matrix((float[][]) obj, i);
            } else if (AGx == 0) {
                obj = AAF.AHC(obj, new C141648by(C18210wN.A0l(cls), MXM.A00), pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
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

    public void serialize(Encoder encoder, Matrix matrix) {
        boolean A1Y = AnonymousClass0wJ.A1Y(encoder, matrix);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        C04220Ms.A0B(pluginGeneratedSerialDescriptor, 2);
        AAG.AJz(matrix.A00, new C141648by(C18210wN.A0l(float[].class), MXM.A00), pluginGeneratedSerialDescriptor, A1Y ? 1 : 0);
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }
}
