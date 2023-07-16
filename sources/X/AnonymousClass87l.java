package X;

import com.instagram.wellbeing.upsells.constants.UnlikeData;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: X.87l  reason: invalid class name */
public final class AnonymousClass87l implements C28173Ezj {
    public static final AnonymousClass87l A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        C147118nQ AAF = decoder.AAF(pluginGeneratedSerialDescriptor);
        String str = null;
        Object obj = null;
        long j = 0;
        int i = 0;
        while (true) {
            int AGx = AAF.AGx(pluginGeneratedSerialDescriptor);
            if (AGx == -1) {
                AAF.AKG(pluginGeneratedSerialDescriptor);
                return new UnlikeData(i, str, (String) obj, j);
            } else if (AGx == 0) {
                j = AAF.AH9(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (AGx == 1) {
                str = AAF.AHH(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (AGx == 2) {
                obj = AAF.AHB(obj, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                throw new C141528bl(AGx);
            }
        }
    }

    static {
        AnonymousClass87l r3 = new AnonymousClass87l();
        A00 = r3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.instagram.wellbeing.upsells.constants.UnlikeData", r3, 3);
        pluginGeneratedSerialDescriptor.A00("timestamp", false);
        pluginGeneratedSerialDescriptor.A00("mediaId", false);
        pluginGeneratedSerialDescriptor.A00("authorId", false);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public final AnonymousClass8sP[] childSerializers() {
        C39069Km1 km1 = C39069Km1.A00;
        AnonymousClass87g r1 = AnonymousClass87g.A00;
        return new AnonymousClass8sP[]{km1, r1, J5B.A00(r1)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        UnlikeData unlikeData = (UnlikeData) obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(encoder, unlikeData);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        C146588mU AAG = encoder.AAG(pluginGeneratedSerialDescriptor);
        C04220Ms.A0B(pluginGeneratedSerialDescriptor, 2);
        AAG.AJx(pluginGeneratedSerialDescriptor, 0, unlikeData.A00);
        AAG.AK3(unlikeData.A02, pluginGeneratedSerialDescriptor, A1Z ? 1 : 0);
        AAG.AJy(unlikeData.A01, AnonymousClass87g.A00, pluginGeneratedSerialDescriptor, 2);
        AAG.AKG(pluginGeneratedSerialDescriptor);
    }

    public final AnonymousClass8sP[] typeParametersSerializers() {
        return AnonymousClass6ZC.A00;
    }
}
