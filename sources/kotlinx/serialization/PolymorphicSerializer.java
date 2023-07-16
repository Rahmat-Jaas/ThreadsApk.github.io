package kotlinx.serialization;

import X.AnonymousClass006;
import X.AnonymousClass0OY;
import X.AnonymousClass0W7;
import X.AnonymousClass0ZV;
import X.C04530Oa;
import X.C1372787c;
import X.C18190wL;
import X.C86104wH;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape144S0100000_I2_124;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class PolymorphicSerializer extends C1372787c {
    public List A00 = AnonymousClass0ZV.A00;
    public final AnonymousClass0W7 A01;
    public final C04530Oa A02 = AnonymousClass0OY.A01(AnonymousClass006.A01, new KtLambdaShape144S0100000_I2_124(this, 5));

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public final String toString() {
        return C86104wH.A0y(this.A01, C18190wL.A0s("kotlinx.serialization.PolymorphicSerializer(baseClass: "));
    }

    public PolymorphicSerializer(AnonymousClass0W7 r4) {
        this.A01 = r4;
    }
}
