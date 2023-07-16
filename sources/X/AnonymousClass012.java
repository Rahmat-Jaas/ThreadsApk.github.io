package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.012  reason: invalid class name */
public enum AnonymousClass012 implements IVerboseDebuggable {
    A07(new AnonymousClass0QP(r4, new AnonymousClass0QQ(HttpStatus.SC_SWITCHING_PROTOCOLS, "PAUSE_ACTIVITY"), new AnonymousClass0QQ(HttpStatus.SC_PROCESSING, "PAUSE_ACTIVITY_FINISHING")), "ON_PAUSE", "on pause", 4),
    A08("undefined", 8);
    
    public static int A04 = -1;
    public static final AnonymousClass0K9 A05 = null;
    public final AnonymousClass04A A00;
    public final AnonymousClass0QV A01;
    public final AnonymousClass0QP A02;
    public final String A03;

    /* access modifiers changed from: public */
    AnonymousClass012(String str, int i) {
        this(r8, (AnonymousClass0QV) null, (AnonymousClass0QP) null, r9, str, i);
    }

    /* access modifiers changed from: public */
    static {
        A05 = new AnonymousClass0K9("ActivityLifecycleState");
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("[ActivityLifecycleState ");
        sb.append(AnonymousClass0KF.A00(name()));
        sb.append(" - ");
        sb.append(this.A03);
        sb.append("\n LifeCycle: \n");
        AnonymousClass04A r1 = this.A00;
        if (r1 != null) {
            if (r1.A01) {
                str2 = Integer.toString(r1.A00);
            } else {
                str2 = "not yet inited";
            }
            str = AnonymousClass00U.A0h("Lifecycle ", r1.name(), "(", str2, ")");
        } else {
            str = "<N/A>";
        }
        sb.append(str);
        sb.append("\n What Codes [Maybe ");
        AnonymousClass0QP r12 = this.A02;
        sb.append(r12.A04.length);
        sb.append(" items]: [ \n");
        r12.A00(sb);
        sb.append("\n Binder Codes [Maybe ");
        AnonymousClass0QV r13 = this.A01;
        sb.append(r13.A04.length);
        sb.append(" items]: [ \n");
        r13.A00(sb);
        sb.append(" \n ]");
        return sb.toString();
    }

    /* access modifiers changed from: public */
    AnonymousClass012(AnonymousClass0QP r4, String str, String str2, int i) {
        this.A03 = str2;
        this.A00 = r2;
        r4 = r4 == null ? new AnonymousClass0QP(new AnonymousClass0QQ[0]) : r4;
        this.A02 = r4;
        r3 = r3 == null ? new AnonymousClass0QV(new AnonymousClass0QW[0]) : r3;
        this.A01 = r3;
        r4.A00 = this;
        r3.A00 = this;
    }
}
