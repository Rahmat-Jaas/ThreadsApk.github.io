package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.reflect.Field;

/* renamed from: X.01Q  reason: invalid class name */
public abstract class AnonymousClass01Q implements IVerboseDebuggable {
    public static final AnonymousClass0K9 A09 = new AnonymousClass0K9("ActivityLifecycleCode");
    public int A00 = -19842;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public abstract Class A01(C03190Eu r1, C03410If r2);

    public abstract Field A02(C03410If r1, Class cls, String str);

    public final int A00() {
        int i = this.A00;
        if (i != -19842) {
            return i;
        }
        int i2 = this.A01;
        if (i2 == -19842) {
            return this.A04;
        }
        return i2;
    }

    public final boolean A03() {
        if (this.A01 != -19842 || ((this.A03 && this.A00 != -19842) || this.A04 != -19842)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lifecycle ");
        sb.append(AnonymousClass0KF.A00(this.A07));
        sb.append(" Code: ");
        String str = "<Needs Processing>";
        if (A03()) {
            sb.append(A00());
            sb.append(" ");
            if (this.A03 && this.A00 != -19842) {
                str = "certain";
            } else if (this.A02) {
                str = this.A01 != -19842 ? "sketchy" : "guessed";
            }
        } else if (this.A02) {
            str = "Unknown";
        }
        sb.append(str);
        return sb.toString();
    }

    public AnonymousClass01Q(String str, String str2, String str3, int i, boolean z) {
        this.A07 = str;
        this.A04 = i;
        this.A06 = str2;
        this.A08 = z;
        this.A05 = str3;
        this.A01 = i;
        this.A03 = false;
        this.A02 = false;
    }
}
