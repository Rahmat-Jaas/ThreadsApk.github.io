package X;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Unit;

/* renamed from: X.77z  reason: invalid class name and case insensitive filesystem */
public final class C1200077z {
    public AnonymousClass7A8 A00;
    public Object A01;
    public boolean A02;
    public boolean A03;

    public static Unit A00(Object obj) {
        AnonymousClass75Q r1 = (AnonymousClass75Q) obj;
        C04220Ms.A0B(r1, 0);
        AnonymousClass7A8 r0 = AnonymousClass7A8.A0A;
        r1.A00 = r0;
        C1200077z r12 = r1.A01;
        r12.A00 = r0;
        r12.A03 = true;
        return Unit.A00;
    }

    public final C115106uW A01() {
        AnonymousClass7A8 r4 = this.A00;
        if (r4 == null) {
            Object obj = this.A01;
            if (obj instanceof Integer) {
                r4 = AnonymousClass7A8.A06;
            } else if (obj instanceof int[]) {
                r4 = AnonymousClass7A8.A05;
            } else if (obj instanceof Long) {
                r4 = AnonymousClass7A8.A08;
            } else if (obj instanceof long[]) {
                r4 = AnonymousClass7A8.A07;
            } else if (obj instanceof Float) {
                r4 = AnonymousClass7A8.A04;
            } else if (obj instanceof float[]) {
                r4 = AnonymousClass7A8.A03;
            } else if (obj instanceof Boolean) {
                r4 = AnonymousClass7A8.A02;
            } else if (obj instanceof boolean[]) {
                r4 = AnonymousClass7A8.A01;
            } else if ((obj instanceof String) || obj == null) {
                r4 = AnonymousClass7A8.A0A;
            } else if (!(obj instanceof Object[]) || !(obj instanceof String[])) {
                Class<?> cls = obj.getClass();
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    C04220Ms.A0A(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = cls.getComponentType();
                        if (componentType2 != null) {
                            r4 = new AnonymousClass596(componentType2);
                        } else {
                            throw C18210wN.A0W("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        }
                    }
                }
                if (cls.isArray()) {
                    Class<?> componentType3 = cls.getComponentType();
                    C04220Ms.A0A(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = cls.getComponentType();
                        if (componentType4 != null) {
                            r4 = new AnonymousClass598(componentType4);
                        } else {
                            throw C18210wN.A0W("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        }
                    }
                }
                if (obj instanceof Parcelable) {
                    r4 = new AnonymousClass597(cls);
                } else if (obj instanceof Enum) {
                    r4 = new AnonymousClass594(cls);
                } else if (obj instanceof Serializable) {
                    r4 = new AnonymousClass599(cls);
                } else {
                    throw C18190wL.A0a(AnonymousClass00U.A0V("Object of type ", cls.getName(), " is not supported for navigation arguments."));
                }
            } else {
                r4 = AnonymousClass7A8.A09;
            }
        }
        return new C115106uW(r4, this.A01, this.A03, this.A02);
    }
}
