package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.3GW  reason: invalid class name */
public final class AnonymousClass3GW {
    public static AnonymousClass3GW A00;

    public final C697449w A00(C10300i6 r3) {
        return (C697449w) C18180wK.A0c(r3, C697449w.class, 11);
    }

    public final void A01(Context context, Uri uri, C10300i6 r6) {
        if (!Boolean.parseBoolean(uri.getQueryParameter("native_flow"))) {
            C10450iM.A03("Checkpoint Uri", AnonymousClass00U.A0L("Expect param native_flow = true in Uri but got Uri = ", uri.toString()));
        }
        C62123Xf r1 = new C62123Xf(uri.getQueryParameter("api_path"), uri.getQueryParameter("challenge_context"));
        C697449w A002 = A00.A00(r6);
        if (A002 != null) {
            A002.A02(context, r1);
        }
    }
}
