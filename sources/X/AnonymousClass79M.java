package X;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Function;

/* renamed from: X.79M  reason: invalid class name */
public final class AnonymousClass79M {
    public final String A00;
    public final Function A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79M) {
                AnonymousClass79M r5 = (AnonymousClass79M) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass79M r1, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        accessibilityNodeInfoCompat.A08(new C008103m(i, (CharSequence) r1.A00));
    }

    public final int hashCode() {
        int i = 0;
        int A07 = C18220wO.A07(this.A00) * 31;
        Function function = this.A01;
        if (function != null) {
            i = function.hashCode();
        }
        return A07 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AccessibilityAction(label=");
        A0s.append(this.A00);
        A0s.append(I17.A00(68));
        return C86104wH.A0y(this.A01, A0s);
    }

    public AnonymousClass79M(String str, Function function) {
        this.A00 = str;
        this.A01 = function;
    }
}
