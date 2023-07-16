package X;

import android.os.Build;
import java.util.Set;

/* renamed from: X.7cX  reason: invalid class name and case insensitive filesystem */
public abstract class C125147cX implements C141978db {
    public static final Set A02 = C18200wM.A0u();
    public final String A00;
    public final String A01;

    public boolean A00() {
        if ((this instanceof AnonymousClass5CG) || (this instanceof AnonymousClass5CF) || (this instanceof AnonymousClass5CE) || !(this instanceof AnonymousClass5CD)) {
            return true;
        }
        return false;
    }

    public boolean A01() {
        Set set = AnonymousClass6X3.A00;
        String str = this.A01;
        if (set.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (("eng".equals(str2) || "userdebug".equals(str2)) && set.contains(AnonymousClass00U.A0L(str, ":dev"))) {
            return true;
        }
        return false;
    }

    public C125147cX(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        A02.add(this);
    }
}
