package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0pS  reason: invalid class name and case insensitive filesystem */
public abstract class C14460pS implements C03650Kd {
    public AnonymousClass0EF A00;
    public final AnonymousClass0L5 A01;
    public final Integer A02;
    public final Context A03;
    public final C12800mV A04;
    public volatile String A05;
    public volatile String A06;

    public abstract String A00();

    public abstract String A01();

    public abstract void A05(String str, String str2);

    public final boolean A06(String str) {
        if (str != null) {
            if (!str.startsWith("https://")) {
                str = AnonymousClass00U.A0L("https://", str);
            }
            try {
                Uri A012 = C15430rJ.A01(str);
                for (String str2 : A02()) {
                    String host = A012.getHost();
                    if (host != null && (host.equalsIgnoreCase(str2) || host.endsWith(AnonymousClass00U.A0L(".", str2)))) {
                        return true;
                    }
                }
                return false;
            } catch (SecurityException unused) {
                return false;
            }
        }
        return true;
    }

    public Set A02() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"facebook.com", "workplace.com", "pushnotifs.com"})));
    }

    public void A03() {
        if (this.A00 == null) {
            String A002 = A00();
            AnonymousClass0EF r4 = new AnonymousClass0EF((C16210sf) new C14440pQ(this), A002);
            this.A00 = r4;
            this.A03.registerReceiver(r4, new IntentFilter(A002), "com.facebook.permission.prod.FB_APP_COMMUNICATION", (Handler) null);
        }
    }

    public final void A04() {
        AnonymousClass0EF r1 = this.A00;
        if (r1 != null) {
            try {
                this.A03.unregisterReceiver(r1);
            } catch (IllegalArgumentException e) {
                AnonymousClass0LU.A0H(A01(), "Failed to unregister broadcast receiver", e);
            }
            this.A00 = null;
        }
    }

    public C14460pS(Context context, C12800mV r2, AnonymousClass0L5 r3, Integer num) {
        this.A03 = context;
        this.A01 = r3;
        this.A02 = num;
        this.A04 = r2;
    }

    public final String AQd() {
        return this.A05;
    }

    public final String AwU() {
        return this.A06;
    }
}
