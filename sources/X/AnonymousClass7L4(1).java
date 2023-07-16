package X;

import android.animation.TypeEvaluator;

/* renamed from: X.7L4  reason: invalid class name */
public final class AnonymousClass7L4 implements TypeEvaluator {
    public static Integer A00(float f, float f2, float f3, float f4) {
        return Integer.valueOf((Math.round(((float) Math.pow((double) f2, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f * 255.0f) << 24) | (Math.round(((float) Math.pow((double) f3, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) f4, 0.45454545454545453d)) * 255.0f));
    }

    public static Object A01(float f, Object obj, Object obj2) {
        int A04 = AnonymousClass0wJ.A04(obj);
        float f2 = ((float) ((A04 >> 24) & 255)) / 255.0f;
        int A042 = AnonymousClass0wJ.A04(obj2);
        float pow = (float) Math.pow((double) (((float) ((A04 >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((A04 >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (A04 & 255)) / 255.0f), 2.2d);
        return A00(f2 + (((((float) ((A042 >> 24) & 255)) / 255.0f) - f2) * f), pow + ((((float) Math.pow((double) (((float) ((A042 >> 16) & 255)) / 255.0f), 2.2d)) - pow) * f), pow2 + ((((float) Math.pow((double) (((float) ((A042 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * f), pow3 + (f * (((float) Math.pow((double) (((float) (A042 & 255)) / 255.0f), 2.2d)) - pow3)));
    }

    public final Object evaluate(float f, Object obj, Object obj2) {
        int A04 = AnonymousClass0wJ.A04(obj);
        float f2 = ((float) ((A04 >> 24) & 255)) / 255.0f;
        int A042 = AnonymousClass0wJ.A04(obj2);
        float pow = (float) Math.pow((double) (((float) ((A04 >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((A04 >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (A04 & 255)) / 255.0f), 2.2d);
        return A00(f2 + (((((float) ((A042 >> 24) & 255)) / 255.0f) - f2) * f), pow + ((((float) Math.pow((double) (((float) ((A042 >> 16) & 255)) / 255.0f), 2.2d)) - pow) * f), pow2 + ((((float) Math.pow((double) (((float) ((A042 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * f), pow3 + (f * (((float) Math.pow((double) (((float) (A042 & 255)) / 255.0f), 2.2d)) - pow3)));
    }
}
