package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigFetcherHandler;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3zr  reason: invalid class name and case insensitive filesystem */
public final class C67623zr implements MobileConfigFetcher {
    public static Map A02;
    public boolean A00;
    public C10300i6 A01;

    public final void fetch(String str, String str2, Map map, MobileConfigFetcherHandler mobileConfigFetcherHandler, String str3) {
        Integer num;
        String A0r = C18220wO.A0r(str2, A02);
        if (A0r == null) {
            mobileConfigFetcherHandler.onComplete(false, AnonymousClass00U.A0L("Unknown endpoint:", str2));
            return;
        }
        H1T h1t = new H1T(this.A01);
        if ("get".equals(C18240wQ.A0g(str))) {
            num = AnonymousClass006.A0N;
        } else {
            num = AnonymousClass006.A01;
        }
        h1t.A0F(num);
        h1t.A0J(A0r);
        h1t.A0O(str2, "");
        h1t.A09(AnonymousClass1U7.A01);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            h1t.A0O(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
        }
        C32165H8c A0Q = C18190wL.A0Q(h1t);
        A0Q.A00 = new IDxACallbackShape2S1200000_1_I2(mobileConfigFetcherHandler, this, A0r, 3);
        A0Q.onStart();
        C25611nx r1 = new C25611nx(A0Q, this, A0Q.A0A);
        if (!this.A00 || EndToEnd.isRunningEndToEndTest() || str2.equals("mobileconfig_emergency_push")) {
            AnonymousClass0gN.A00().AKp(r1);
        } else {
            GQH.A03.CwT(r1);
        }
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A02 = A0y;
        A0y.put(MobileConfigBisection.BISECT_DIR, "launcher/mobileconfig/");
        A02.put("mobileconfigsessionless", "launcher/mobileconfig/");
        A02.put("mobileconfiglogging", "launcher/mobileconfiglogging/");
        A02.put("mobileconfig_qe_info", "launcher/mobileconfigqeinfo/");
        A02.put("mobileconfig_troubleshooting", "launcher/troubleshooting/");
        A02.put("mobileconfig_task_import", "launcher/mobileconfigtaskimport/");
        A02.put("mobileconfig_emergency_push", "launcher/sync_ep_config/");
    }

    public C67623zr(C10300i6 r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }
}
