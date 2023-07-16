package X;

import kotlin.Triple;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87b  reason: invalid class name */
public final class AnonymousClass87b implements AnonymousClass8sP {
    public final AnonymousClass8sP A00;
    public final AnonymousClass8sP A01;
    public final AnonymousClass8sP A02;
    public final SerialDescriptor A03 = C25601Dob.A01("kotlin.Triple", new KtLambdaShape166S0100000_I2_21(this, 45), new SerialDescriptor[0]);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C04220Ms.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = this.A03;
        C147118nQ AAF = decoder.AAF(serialDescriptor);
        Object obj = AnonymousClass6ZD.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        Object obj4 = obj;
        while (true) {
            int AGx = AAF.AGx(serialDescriptor);
            if (AGx == -1) {
                AAF.AKG(serialDescriptor);
                if (obj2 == obj) {
                    throw new C97616Cb("Element 'first' is missing");
                } else if (obj3 == obj) {
                    throw new C97616Cb("Element 'second' is missing");
                } else if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                } else {
                    throw new C97616Cb("Element 'third' is missing");
                }
            } else if (AGx == 0) {
                obj2 = AAF.AHC((Object) null, this.A00, serialDescriptor, 0);
            } else if (AGx == 1) {
                obj3 = AAF.AHC((Object) null, this.A01, serialDescriptor, 1);
            } else if (AGx == 2) {
                obj4 = AAF.AHC((Object) null, this.A02, serialDescriptor, 2);
            } else {
                throw new C97616Cb(C04220Ms.A01("Unexpected index ", Integer.valueOf(AGx)));
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(encoder, triple);
        SerialDescriptor serialDescriptor = this.A03;
        C146588mU AAG = encoder.AAG(serialDescriptor);
        AAG.AJz(triple.A00, this.A00, serialDescriptor, 0);
        AAG.AJz(triple.A01, this.A01, serialDescriptor, A1Z ? 1 : 0);
        AAG.AJz(triple.A02, this.A02, serialDescriptor, 2);
        AAG.AKG(serialDescriptor);
    }

    public AnonymousClass87b(AnonymousClass8sP r4, AnonymousClass8sP r5, AnonymousClass8sP r6) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }
}
