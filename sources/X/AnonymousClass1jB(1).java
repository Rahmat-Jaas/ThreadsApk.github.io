package X;

import kotlin.Unit;

/* renamed from: X.1jB  reason: invalid class name */
public final class AnonymousClass1jB extends C62903b6 {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1jB) && C04220Ms.A0I(this.A00, ((AnonymousClass1jB) obj).A00));
    }

    public static AnonymousClass2L8 A00(Object obj) {
        return (AnonymousClass2L8) ((AnonymousClass1jB) obj).A00;
    }

    public static AnonymousClass1jB A01() {
        return new AnonymousClass1jB(Unit.A00);
    }

    public static AnonymousClass1jB A02(Object obj) {
        return new AnonymousClass1jB(((AnonymousClass1jB) obj).A00.toString());
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public AnonymousClass1jB(Object obj) {
        this.A00 = obj;
    }
}
