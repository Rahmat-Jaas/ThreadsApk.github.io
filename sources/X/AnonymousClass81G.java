package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.81G  reason: invalid class name */
public final class AnonymousClass81G implements Runnable {
    public final /* synthetic */ C129647mF A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81G(C129647mF r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            C129647mF r3 = this.A00;
            C142238eQ r1 = r3.A00;
            Object A04 = this.A01.A04();
            AnonymousClass7mM r12 = (AnonymousClass7mM) r1;
            FirebaseInstanceId firebaseInstanceId = r12.A00;
            String str = r12.A01;
            String str2 = r12.A02;
            String str3 = (String) A04;
            AnonymousClass7EE r4 = FirebaseInstanceId.A08;
            String A05 = firebaseInstanceId.A04.A05();
            synchronized (r4) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject A0y = C18230wP.A0y();
                    A0y.put("token", str3);
                    A0y.put("appVersion", A05);
                    A0y.put("timestamp", currentTimeMillis);
                    String obj = A0y.toString();
                    if (obj != null) {
                        SharedPreferences.Editor edit = r4.A01.edit();
                        edit.putString(AnonymousClass7EE.A01(str, str2), obj);
                        edit.commit();
                    }
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 24);
                    A0s.append("Failed to encode token: ");
                    Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s));
                }
            }
            C105166cz r0 = new C105166cz(str3);
            AnonymousClass7HU r13 = new AnonymousClass7HU();
            r13.A0B(r0);
            Executor executor = C103456Zg.A01;
            r13.A09(r3, executor);
            r13.A08(r3, executor);
            AnonymousClass7HU.A01(r3, r13, executor);
        } catch (AnonymousClass88O e2) {
            e = e2;
            boolean z = e.getCause() instanceof Exception;
            C129647mF r14 = this.A00;
            if (z) {
                e = (Exception) e.getCause();
            }
            r14.ByD(e);
        } catch (CancellationException unused) {
            this.A00.Bnw();
        } catch (Exception e3) {
            this.A00.ByD(e3);
        }
    }
}
