package X;

import java.util.Arrays;

/* renamed from: X.8AQ  reason: invalid class name */
public class AnonymousClass8AQ extends AnonymousClass8AR {
    public static final float[] A0H(float[] fArr, int i, int i2) {
        C102556Vq.A00(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C04220Ms.A06(copyOfRange);
        return copyOfRange;
    }

    public static final void A0G(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        AnonymousClass0wJ.A1N(objArr, objArr2);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }
}
