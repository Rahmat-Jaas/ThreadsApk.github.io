package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.HashMap;

/* renamed from: X.0sG  reason: invalid class name and case insensitive filesystem */
public final class C15970sG {
    public BroadcastReceiver A00;
    public C14380pJ A01;
    public final Context A02;
    public final C12710mM A03;
    public final C12830mZ A04;
    public final FbnsServiceDelegate A05;
    public final String A06;

    public C15970sG(C12710mM r3, C12830mZ r4, FbnsServiceDelegate fbnsServiceDelegate) {
        Context applicationContext = fbnsServiceDelegate.A01.getApplicationContext();
        String A002 = C18140wF.A00(AnonymousClass006.A01);
        this.A02 = applicationContext;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = A002;
        this.A05 = fbnsServiceDelegate;
    }

    public final C14380pJ A01() {
        C14380pJ r2 = this.A01;
        if (r2 != null) {
            return r2;
        }
        C14380pJ r22 = new C14380pJ(this.A02, this.A04, AnonymousClass00U.A0N(this.A06, "FBNS_LITE", '_'));
        this.A01 = r22;
        return r22;
    }

    public static C14810qC A00(Intent intent, C09740gb r9, C15970sG r10, String str) {
        String str2 = intent.getPackage();
        if (str2 == null) {
            str2 = "";
        }
        if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction()) || "com.facebook.rti.fbns.intent.RECEIVE_RTC".equals(intent.getAction()) || "com.facebook.rti.fbns.intent.RECEIVE_VR".equals(intent.getAction())) {
            FbnsServiceDelegate fbnsServiceDelegate = r10.A05;
            C12710mM r0 = r10.A03;
            r0.A02(intent);
            C14810qC r1 = new C14810qC(C12730mO.A00, C12610mC.A00(intent, r0, str2));
            if (C14650pt.A01(r1.A01)) {
                return r1;
            }
            fbnsServiceDelegate.A0e(r9, str2, "secure broadcast failed", (String) null, "Error: secure-broadcast failed", str);
            return r1;
        }
        Integer num = AnonymousClass006.A00;
        String A0L = AnonymousClass00U.A0L("Invalid action ", intent.getAction());
        A0L.getClass();
        return new C14810qC(new C12760mR(A0L), num);
    }

    public final void A02(C14810qC r16, String str, String str2) {
        C09740gb r1;
        String str3 = str;
        C09740gb A002 = A01().A00(str3);
        if (A002.A01()) {
            FbnsServiceDelegate fbnsServiceDelegate = this.A05;
            C18160wH r2 = (C18160wH) A002.A00();
            C09740gb r3 = r2.A01;
            C09740gb r12 = r2.A03;
            String obj = r16.toString();
            long j = r2.A00;
            if (r12.A01()) {
                Long valueOf = Long.valueOf(System.currentTimeMillis() - ((Number) r12.A00()).longValue());
                valueOf.getClass();
                r1 = new C12760mR(valueOf);
            } else {
                r1 = C12730mO.A00;
            }
            String str4 = r2.A04;
            fbnsServiceDelegate.A03.Bb6(AnonymousClass00U.A0L("Error: Fail to deliver notifId = ", str3));
            String str5 = str2;
            if (r1.A01()) {
                C16600tN r6 = fbnsServiceDelegate.A09;
                String packageName = fbnsServiceDelegate.A01.getApplicationContext().getPackageName();
                r6.A01("fbns_e2e_latency", new String[]{ClientCookie.DISCARD_ATTR, packageName, str5}, ((Number) r1.A00()).longValue());
            }
            fbnsServiceDelegate.A09.A01("fbns_latency", new String[]{ClientCookie.DISCARD_ATTR, fbnsServiceDelegate.A01.getApplicationContext().getPackageName(), str5}, j);
            HashMap hashMap = new HashMap();
            if (r3.A01()) {
                hashMap.put("l", String.valueOf(r3.A00()));
            }
            hashMap.put("src", str4);
            FbnsServiceDelegate.A02(fbnsServiceDelegate, ClientCookie.DISCARD_ATTR, str3, str5, obj, hashMap, j);
        }
    }
}
