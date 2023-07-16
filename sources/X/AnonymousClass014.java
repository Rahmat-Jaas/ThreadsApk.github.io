package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.014  reason: invalid class name */
public abstract class AnonymousClass014 implements IVerboseDebuggable {
    public static final AnonymousClass0K9 A05 = new AnonymousClass0K9("ActivityLifecycleCodes");
    public AnonymousClass012 A00 = AnonymousClass012.A08;
    public AnonymousClass01Q[] A01 = null;
    public final Class A02;
    public final String A03;
    public final AnonymousClass01Q[] A04;

    public final void A00(StringBuilder sb) {
        AnonymousClass01Q[] r3 = this.A04;
        AnonymousClass01Q[] r1 = this.A01;
        if (r1 != null) {
            sb.append("Proccessed codes");
            r3 = r1;
        } else {
            sb.append("Potential codes");
        }
        sb.append(": [");
        for (AnonymousClass01Q r7 : r3) {
            if (r7 != null) {
                StringBuilder sb2 = new StringBuilder("Lifecycle ");
                sb2.append(AnonymousClass0KF.A00(r7.A07));
                sb2.append(" Code: ");
                String str = "<Needs Processing>";
                if (r7.A03()) {
                    sb2.append(r7.A00());
                    sb2.append(" ");
                    if (r7.A03 && r7.A00 != -19842) {
                        str = "certain";
                    } else if (r7.A02) {
                        str = r7.A01 != -19842 ? "sketchy" : "guessed";
                    }
                } else if (r7.A02) {
                    str = "Unknown";
                }
                sb2.append(str);
                sb.append(sb2.toString());
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass0KF.A00(this.A03));
        sb.append(" ");
        sb.append(this.A00.A03);
        sb.append(" ");
        A00(sb);
        return sb.toString();
    }

    public AnonymousClass014(String str, AnonymousClass01Q... r3) {
        this.A03 = str;
        this.A04 = r3;
        this.A02 = r3.getClass();
    }
}
