package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ls  reason: invalid class name and case insensitive filesystem */
public final class C03970Ls {
    public static final AnonymousClass0Ln A00;

    static {
        AnonymousClass0Ln r1 = null;
        try {
            r1 = (AnonymousClass0Ln) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r1 == null) {
            r1 = new AnonymousClass0Ln();
        }
        A00 = r1;
    }

    public static AnonymousClass0AD A00(Class cls) {
        C02230Ai r4 = new C02230Ai(cls);
        List emptyList = Collections.emptyList();
        C04220Ms.A0B(emptyList, 2);
        return new AnonymousClass0AD(emptyList, (AnonymousClass0AD) null, r4, 0);
    }

    public static AnonymousClass0AD A01(Class cls, AnonymousClass0FL r6, AnonymousClass0FL r7) {
        C02230Ai r4 = new C02230Ai(cls);
        List asList = Arrays.asList(new AnonymousClass0FL[]{r6, r7});
        C04220Ms.A0B(asList, 2);
        return new AnonymousClass0AD(asList, (AnonymousClass0AD) null, r4, 0);
    }
}
