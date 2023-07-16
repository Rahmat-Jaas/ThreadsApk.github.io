package X;

import android.content.Context;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7it  reason: invalid class name and case insensitive filesystem */
public final class C128107it implements C146928n6 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C128107it) && C04220Ms.A0I(this.A00, ((C128107it) obj).A00));
    }

    public final String toString() {
        return AnonymousClass00U.A0M("StaticTextStringResource(text=", this.A00, ')');
    }

    public static C128107it A01(String str) {
        return new C128107it(str);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A06(this.A00);
    }

    public C128107it(String str) {
        this.A00 = str;
    }

    public static C128107it A00(TreeJNI treeJNI, String str) {
        return new C128107it(treeJNI.getStringValue(str));
    }

    public final CharSequence BEM(Context context) {
        return this.A00;
    }
}
