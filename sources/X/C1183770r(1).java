package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.70r  reason: invalid class name and case insensitive filesystem */
public final class C1183770r {
    public static final String A00(int i, int i2) {
        StringWriter A0d = C18230wP.A0d();
        try {
            MMp A04 = C18987Aon.A00.A04(A0d);
            A04.A0I();
            A04.A0N(i);
            A04.A0N(i2);
            A04.A0F();
            A04.close();
        } catch (IOException e) {
            AnonymousClass0LU.A0G("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        return C18190wL.A0n(A0d);
    }

    public static final String A01(int i, int i2) {
        StringWriter A0d = C18230wP.A0d();
        try {
            MMp A04 = C18987Aon.A00.A04(A0d);
            A04.A0I();
            A04.A0Y(String.valueOf(i));
            A04.A0Y(String.valueOf(i2));
            A04.A0F();
            A04.close();
        } catch (IOException e) {
            AnonymousClass0LU.A0G("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        return C18190wL.A0n(A0d);
    }
}
