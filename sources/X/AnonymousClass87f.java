package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87f  reason: invalid class name */
public final class AnonymousClass87f implements AnonymousClass8sP {
    public static final AnonymousClass87f A00 = new AnonymousClass87f();
    public static final SerialDescriptor A01 = C25601Dob.A02("UseCase", C39228Kpv.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        List A07 = C81074n3.A07(decoder.AHG(), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        return new AnonymousClass5IK(C18190wL.A0p(A07, 0), C18190wL.A0p(A07, 1), C18190wL.A0p(A07, 2));
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass5IK r6 = (AnonymousClass5IK) obj;
        AnonymousClass0wJ.A1N(encoder, r6);
        encoder.AK2(AnonymousClass00U.A0Y(r6.A01, r6.A00, r6.A02, BasicHeaderValueParser.ELEM_DELIMITER, BasicHeaderValueParser.ELEM_DELIMITER));
    }
}
