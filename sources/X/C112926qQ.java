package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.6qQ  reason: invalid class name and case insensitive filesystem */
public final class C112926qQ {
    public final String A00;
    public final long A01 = System.currentTimeMillis();
    public final String A02;
    public final String A03 = Thread.currentThread().getName();
    public final Throwable A04;
    public final Object[] A05;

    public C112926qQ(String str, String str2, Throwable th, Object[] objArr) {
        this.A00 = str;
        this.A04 = th;
        this.A02 = str2;
        this.A05 = objArr;
    }

    public final String toString() {
        try {
            JSONObject A0y = C18230wP.A0y();
            StringBuilder A0r = C18200wM.A0r();
            if (!TextUtils.isEmpty("UploadProtocol")) {
                A0r.append("UploadProtocol");
                A0r.append(": ");
            }
            A0r.append(String.format(Locale.ROOT, this.A02, this.A05));
            C86164wN.A1H(A0r, "content", A0y);
            Throwable th = this.A04;
            if (th != null) {
                A0y.put("traces", Log.getStackTraceString(th));
            }
            A0y.put("time", this.A01);
            A0y.put("thread", this.A03);
            A0y.put("process", Process.myPid());
            return A0y.toString();
        } catch (Exception e) {
            return String.format(Locale.ROOT, "Invalid log: %s", new Object[]{e.getMessage()});
        }
    }
}
