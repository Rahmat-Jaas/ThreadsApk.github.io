package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Locale;

/* renamed from: X.3HI  reason: invalid class name */
public final class AnonymousClass3HI {
    public ConnectivityManager A00;
    public String A01;
    public final Context A02;
    public final boolean A03;

    public final String A00() {
        NetworkInfo activeNetworkInfo;
        String typeName;
        String str = this.A01;
        if (str != null) {
            return str;
        }
        if (this.A00 == null) {
            try {
                this.A00 = (ConnectivityManager) this.A02.getSystemService("connectivity");
            } catch (NullPointerException unused) {
            }
        }
        ConnectivityManager connectivityManager = this.A00;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (typeName = activeNetworkInfo.getTypeName()) == null) {
            return "UNKNOWN";
        }
        if (!this.A03) {
            return typeName;
        }
        this.A01 = typeName.toUpperCase(Locale.US);
        return typeName;
    }

    public final boolean A01() {
        NetworkInfo activeNetworkInfo;
        String str = this.A01;
        if (str != null) {
            return str.equals("WIFI");
        }
        if (this.A00 == null) {
            try {
                this.A00 = (ConnectivityManager) this.A02.getSystemService("connectivity");
            } catch (NullPointerException unused) {
            }
        }
        ConnectivityManager connectivityManager = this.A00;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass3HI(Context context, boolean z) {
        AnonymousClass0SJ.A00(context);
        this.A02 = context;
        this.A03 = z;
    }
}
