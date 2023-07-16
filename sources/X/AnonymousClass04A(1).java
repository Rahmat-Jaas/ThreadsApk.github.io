package X;

import android.util.SparseArray;
import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.04A  reason: invalid class name */
public enum AnonymousClass04A implements IVerboseDebuggable {
    A0K("UNDEFINED", -1, (String) null),
    A0J("PRE_ON_CREATE", 0, (String) null),
    A0C("ON_CREATE", 1, (String) null),
    A0H("ON_START", 2, (String) null),
    A0G("ON_RESUME", 3, "android.app.servertransaction.ResumeActivityItem"),
    A0E("ON_PAUSE", 4, "android.app.servertransaction.PauseActivityItem"),
    A0I("ON_STOP", 5, "android.app.servertransaction.StopActivityItem"),
    A0D("ON_DESTROY", 6, "android.app.servertransaction.DestroyActivityItem"),
    A0F("ON_RESTART", 7, (String) null);
    
    public static int A05 = -1;
    public static SparseArray A06;
    public static Class A07;
    public static boolean A08;
    public static AnonymousClass04A[] A09;
    public static final AnonymousClass0K9 A0A = null;
    public int A00;
    public boolean A01;
    public final int A02;
    public final String A03;
    public final String A04;

    /* access modifiers changed from: public */
    static {
        A0A = new AnonymousClass0K9("AospActivityLifecycleItemInfo");
    }

    public final int A00(C03410If r12) {
        int i;
        Integer num;
        if (this.A01) {
            return this.A00;
        }
        String str = this.A04;
        C03410If r5 = r12;
        if (str != null) {
            if (!A08) {
                Class A0E2 = r12.A0E("android.app.servertransaction.ActivityLifecycleItem");
                A07 = A0E2;
                if (A0E2 == null) {
                    A0A.A07("Could not find base activity lifecycle android.app.servertransaction.ActivityLifecycleItem", new Object[0]);
                }
                A08 = true;
            }
            Class cls = A07;
            if (cls != null) {
                try {
                    i = r12.A0H(C03400Id.LikelyHidden, cls, (Class) null, str).getInt((Object) null);
                    if (Integer.valueOf(i) != null) {
                        this.A00 = i;
                        this.A01 = true;
                        return i;
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        String str2 = this.A03;
        if (str2 != null) {
            try {
                Object A0G2 = r12.A0G(str2, new Object[0], "android.app.servertransaction.ActivityLifecycleItem");
                if (!(A0G2 == null || (num = (Integer) r5.A0J(C03400Id.LikelyHidden, A0G2.getClass(), Integer.TYPE, "getTargetState", new Class[0]).invoke(A0G2, new Object[0])) == null)) {
                    i = num.intValue();
                    this.A00 = i;
                    this.A01 = true;
                    return i;
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        i = this.A02;
        this.A00 = i;
        this.A01 = true;
        return i;
    }

    public final String toString() {
        String str;
        if (this.A01) {
            str = Integer.toString(this.A00);
        } else {
            str = "not yet inited";
        }
        return AnonymousClass00U.A0h("Lifecycle ", name(), "(", str, ")");
    }

    /* access modifiers changed from: public */
    AnonymousClass04A(String str, int i, String str2) {
        this.A02 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = false;
    }
}
