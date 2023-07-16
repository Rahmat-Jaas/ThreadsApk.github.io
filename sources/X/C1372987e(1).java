package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.mapbox.geojson.Feature;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87e  reason: invalid class name and case insensitive filesystem */
public final class C1372987e implements AnonymousClass8sP {
    public static final C1372987e A00 = new C1372987e();
    public static final SerialDescriptor A01 = C25601Dob.A02(Feature.TYPE, C39228Kpv.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        List A07 = C81074n3.A07(decoder.AHG(), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        return new AnonymousClass5I2(C18190wL.A0p(A07, 0), Integer.parseInt(C18190wL.A0p(A07, 1)));
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass5I2 r5 = (AnonymousClass5I2) obj;
        AnonymousClass0wJ.A1N(encoder, r5);
        encoder.AK2(AnonymousClass00U.A0D(r5.A01, BasicHeaderValueParser.ELEM_DELIMITER, r5.A00));
    }
}
