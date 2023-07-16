package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.StringTreeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bE  reason: invalid class name and case insensitive filesystem */
public final class C07260bE implements AnonymousClass0PC, AnonymousClass0MF {
    public static C07260bE A03;
    public final C04100Mg A00;
    public final AnonymousClass0Q4 A01;
    public final List A02 = new ArrayList();

    public final void Bkt() {
    }

    public final void Bkw() {
        A00((String) null, (String) null, (WeakReference) null);
    }

    public final void A00(String str, String str2, WeakReference weakReference) {
        String str3;
        if (str == null || str.equals("")) {
            str = "empty";
        }
        if (str2 == null || str2.equals("")) {
            str2 = "empty";
        }
        C06040Xk r6 = this.A01.A03;
        C002801h.A02(r6, "Did you call SessionManager.init()?");
        Object obj = r6.A01;
        synchronized (obj) {
            r6.A0D(str, 3, 80);
            r6.A06(System.currentTimeMillis());
        }
        synchronized (obj) {
            if (str2.length() < 80) {
                r6.A0D(str2, 85, 80);
                str3 = "";
            } else {
                String substring = str2.substring(0, 80);
                str3 = str2.substring(80);
                r6.A0D(substring, 85, 80);
            }
            r6.A0D(str3, 622, StringTreeSet.MAX_SYMBOL_COUNT);
            r6.A06(System.currentTimeMillis());
        }
        AnonymousClass0Z2 r2 = AnonymousClass0MI.A04;
        if (r2 != null) {
            r2.A03 = str;
            if (!str.contains("@")) {
                if (!str.equals("")) {
                    r2.A00(AnonymousClass00U.A0L("@", str));
                }
                r2.A02 = str2;
                SystemClock.uptimeMillis();
            } else {
                throw new IllegalStateException("Navigation modules can't contain '@'");
            }
        }
        synchronized (AnonymousClass0MI.class) {
            if (!str2.equals(AnonymousClass0MI.A05)) {
                AnonymousClass0MI.A05 = str2;
                AnonymousClass0MI.A03.execute(new AnonymousClass0M9(str, str2, weakReference, new HashSet(AnonymousClass0MI.A01)));
            }
        }
        C04170Mn r3 = new C04170Mn((Throwable) null);
        r3.A02(AnonymousClass0MU.A1j, Long.valueOf(SystemClock.uptimeMillis()));
        C04100Mg r1 = this.A00;
        r1.A07(r3, AnonymousClass0ND.CRITICAL_REPORT, this);
        r1.A07(r3, AnonymousClass0ND.LARGE_REPORT, this);
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onEndpointChanged");
        }
    }

    public C07260bE(C04100Mg r2, AnonymousClass0Q4 r3) {
        this.A01 = r3;
        this.A00 = r2;
        AnonymousClass0MI.A04(this, false);
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.NAVIGATION;
    }

    public final void start() {
        A03 = this;
    }
}
