package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.53r  reason: invalid class name and case insensitive filesystem */
public abstract class C876753r extends C111366nD {
    public long A00 = AnonymousClass7JK.A01;
    public Shader A01;

    public final Shader A01(long j) {
        float A012;
        float A02;
        float A013;
        float A022;
        if (!(this instanceof C876653q)) {
            return ((C876553p) this).A00;
        }
        C876653q r4 = (C876653q) this;
        long j2 = r4.A01;
        if (AnonymousClass7KC.A01(j2) == Float.POSITIVE_INFINITY) {
            A012 = AnonymousClass7JK.A02(j);
        } else {
            A012 = AnonymousClass7KC.A01(j2);
        }
        if (AnonymousClass7KC.A02(j2) == Float.POSITIVE_INFINITY) {
            A02 = AnonymousClass7JK.A00(j);
        } else {
            A02 = AnonymousClass7KC.A02(j2);
        }
        long j3 = r4.A00;
        if (AnonymousClass7KC.A01(j3) == Float.POSITIVE_INFINITY) {
            A013 = AnonymousClass7JK.A02(j);
        } else {
            A013 = AnonymousClass7KC.A01(j3);
        }
        if (AnonymousClass7KC.A02(j3) == Float.POSITIVE_INFINITY) {
            A022 = AnonymousClass7JK.A00(j);
        } else {
            A022 = AnonymousClass7KC.A02(j3);
        }
        List list = r4.A02;
        long A0C = C86104wH.A0C(A012, A02);
        long A0C2 = C86104wH.A0C(A013, A022);
        if (list.size() >= 2) {
            float A014 = AnonymousClass7KC.A01(A0C);
            float A023 = AnonymousClass7KC.A02(A0C);
            float A015 = AnonymousClass7KC.A01(A0C2);
            float A024 = AnonymousClass7KC.A02(A0C2);
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = C121657He.A01(((AnonymousClass7KE) list.get(i)).A00);
            }
            return new LinearGradient(A014, A023, A015, A024, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        throw C18190wL.A0a("colors must have length of at least 2 if colorStops is omitted.");
    }
}
