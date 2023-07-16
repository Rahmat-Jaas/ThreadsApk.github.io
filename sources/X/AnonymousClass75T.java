package X;

import java.util.Map;

/* renamed from: X.75T  reason: invalid class name */
public final class AnonymousClass75T {
    public final Map A00 = C18220wO.A0y();
    public final Map A01 = C18220wO.A0y();

    public static final Object A00(C145818l8 r3, AnonymousClass5IZ r4, Class cls) {
        C98936Hm r0;
        if (r3 == null) {
            Object obj = r4.A01.get(cls);
            if (obj != null) {
                return obj;
            }
            C145818l8 r2 = null;
            try {
                Object obj2 = cls.getDeclaredField("CONVERTER").get((Object) null);
                C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.facebook.djinni.msys.infra.McfReference.McfTypeConverter<T of com.facebook.rp.platform.statemanagement.rpstate.RpStateKt.getConverter>");
                r2 = (C145818l8) obj2;
            } catch (NoSuchFieldException unused) {
            }
            if (r2 == null || (r0 = r4.A00) == null) {
                return null;
            }
            return ((C91155fg) r0).A01.A01(r2);
        }
        C98936Hm r02 = r4.A00;
        if (r02 != null) {
            return ((C91155fg) r02).A01.A01(r3);
        }
        return null;
    }
}
