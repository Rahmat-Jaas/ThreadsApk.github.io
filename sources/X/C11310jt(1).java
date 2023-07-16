package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0jt  reason: invalid class name and case insensitive filesystem */
public final class C11310jt implements C11630kW, C10390iG {
    public static C11310jt A08 = null;
    public static final Collection A09 = new ConcurrentLinkedQueue();
    public static final String __redex_internal_original_name = "ConnectionChangeReporter";
    public BroadcastReceiver A00;
    public boolean A01;
    public IntentFilter A02;
    public NetworkInfo A03;
    public boolean A04;
    public final Context A05;
    public final AnonymousClass0g7 A06 = new AnonymousClass0g7(1926548712, false);
    public volatile NetworkInfo A07;

    public static NetworkInfo A00(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("getActiveNetworkInfo caught Exception: ");
            sb.append(e);
            C10450iM.A03(__redex_internal_original_name, sb.toString());
            return null;
        }
    }

    public final String getModuleName() {
        return "device";
    }

    public static synchronized void A01() {
        synchronized (C11310jt.class) {
            if (A08 == null) {
                A08 = new C11310jt(C10600ic.A00);
            }
        }
    }

    public C11310jt(Context context) {
        this.A05 = context;
        C691847d.A02(this);
        this.A07 = A00(context);
    }

    public static void A02(Context context, C11310jt r4) {
        NetworkInfo A002 = A00(context);
        r4.A07 = A002;
        SystemClock.elapsedRealtime();
        if (A002 != null && A002.getState() == NetworkInfo.State.DISCONNECTED) {
            r4.A04 = true;
        }
        NetworkInfo networkInfo = r4.A03;
        if (networkInfo != null ? A002 != null && networkInfo.getType() == A002.getType() && networkInfo.getSubtype() == A002.getSubtype() : A002 == null) {
            if (!r4.A04) {
                return;
            }
        }
        r4.A03 = A002;
        Collection<C09500fc> collection = A09;
        if (!collection.isEmpty()) {
            for (C09500fc onConnectionChanged : collection) {
                onConnectionChanged.onConnectionChanged(A002);
            }
        }
        r4.A04 = false;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(169579005);
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            this.A06.execute(new C09520fe(broadcastReceiver, this));
        }
        this.A01 = true;
        C14030oh.A0A(-825813907, A032);
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(-1067350842);
        this.A01 = false;
        A02(this.A05, this);
        if (this.A00 == null) {
            this.A00 = new IDxBReceiverShape6S0100000_I2(this, 12);
        }
        if (this.A02 == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.A02 = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        IntentFilter intentFilter2 = this.A02;
        this.A06.execute(new C09510fd(this.A00, intentFilter2, this));
        C14030oh.A0A(1108421915, A032);
    }
}
