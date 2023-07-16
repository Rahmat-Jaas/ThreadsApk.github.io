package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87g  reason: invalid class name */
public final class AnonymousClass87g implements AnonymousClass8sP {
    public static final AnonymousClass87g A00 = new AnonymousClass87g();
    public static final SerialDescriptor A01 = new AnonymousClass87h("kotlin.String", C39228Kpv.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        return decoder.AHG();
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        AnonymousClass0wJ.A1N(encoder, str);
        encoder.AK2(str);
    }
}
