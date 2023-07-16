package X;

import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87a  reason: invalid class name and case insensitive filesystem */
public abstract class C1372687a implements AnonymousClass8sP {
    public final AnonymousClass8sP A00;
    public final AnonymousClass8sP A01;

    public final Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        C147118nQ AAF = decoder.AAF(getDescriptor());
        Object obj = AnonymousClass6ZD.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        while (true) {
            int AGx = AAF.AGx(getDescriptor());
            if (AGx == -1) {
                AAF.AKG(getDescriptor());
                if (obj2 == obj) {
                    throw new C97616Cb("Element 'key' is missing");
                } else if (obj3 == obj) {
                    throw new C97616Cb("Element 'value' is missing");
                } else if (this instanceof C141568bq) {
                    return C18180wK.A0p(obj2, obj3);
                } else {
                    return new AnonymousClass4Tn(obj2, obj3);
                }
            } else if (AGx == 0) {
                obj2 = AAF.AHC((Object) null, this.A00, getDescriptor(), 0);
            } else if (AGx == 1) {
                obj3 = AAF.AHC((Object) null, this.A01, getDescriptor(), 1);
            } else {
                throw new C97616Cb(C04220Ms.A01("Invalid index: ", Integer.valueOf(AGx)));
            }
        }
    }

    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        C04220Ms.A0B(encoder, 0);
        C146588mU AAG = encoder.AAG(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        AnonymousClass8sP r2 = this.A00;
        boolean z = this instanceof C141568bq;
        if (z) {
            Pair pair = (Pair) obj;
            C04220Ms.A0B(pair, 0);
            key = pair.A00;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            C04220Ms.A0B(entry, 0);
            key = entry.getKey();
        }
        AAG.AJz(key, r2, descriptor, 0);
        SerialDescriptor descriptor2 = getDescriptor();
        AnonymousClass8sP r22 = this.A01;
        if (z) {
            Pair pair2 = (Pair) obj;
            C04220Ms.A0B(pair2, 0);
            value = pair2.A01;
        } else {
            Map.Entry entry2 = (Map.Entry) obj;
            C04220Ms.A0B(entry2, 0);
            value = entry2.getValue();
        }
        AAG.AJz(value, r22, descriptor2, 1);
        AAG.AKG(getDescriptor());
    }

    public C1372687a(AnonymousClass8sP r1, AnonymousClass8sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
