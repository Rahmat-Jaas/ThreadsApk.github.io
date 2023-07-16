package X;

import android.os.Bundle;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1mc  reason: invalid class name */
public final class AnonymousClass1mc extends AnonymousClass0gG {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ SignedOutFragmentActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mc(Bundle bundle, SignedOutFragmentActivity signedOutFragmentActivity) {
        super(758);
        this.A01 = signedOutFragmentActivity;
        this.A00 = bundle;
    }

    public final void run() {
        AnonymousClass7M8 r0;
        SignedOutFragmentActivity signedOutFragmentActivity = this.A01;
        AnonymousClass38Y r3 = signedOutFragmentActivity.A03;
        synchronized (r3) {
            r0 = r3.A00;
            if (r0 == null) {
                r0 = AnonymousClass3SL.A00(r3.A01.getApplicationContext(), "onetap_prefs");
                r3.A00 = r0;
            }
        }
        Map<String, ?> all = r0.getAll();
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(all);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (!C18200wM.A0p(A0o).equals("AccountCachingHelper.FACEBOOK_USER_ID")) {
                try {
                    C57863Ct parseFromJson = C50472t3.parseFromJson(C18180wK.A0L(C18230wP.A0u(A0o)));
                    String str = parseFromJson.A05;
                    String str2 = parseFromJson.A03;
                    C27151s3 r6 = new C27151s3(parseFromJson.A00, parseFromJson.A01, str, str2, parseFromJson.A04);
                    A0y.put(r6.A00, r6);
                } catch (IOException e) {
                    C10450iM.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
                }
            }
        }
        signedOutFragmentActivity.runOnUiThread(new C73194Rh(this, A0y.isEmpty()));
    }
}
