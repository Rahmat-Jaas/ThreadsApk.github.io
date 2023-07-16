package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.1XV  reason: invalid class name */
public final class AnonymousClass1XV extends C19130zL {
    public String A00 = "";

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            C10450iM.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_error_code", 1);
            C37412JrW.A04(requireActivity(), C170689vP.AD_DESTINATION_APP_STORE, this.A00);
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException th;
        String string;
        AnonymousClass05M r0;
        int A02 = C14030oh.A02(-22516741);
        super.onCreate(bundle);
        try {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (string = bundle2.getString("EXTRA_URL")) == null) {
                th = C18180wK.A0a("Received url is empty");
                C14030oh.A09(-499854164, A02);
            } else {
                this.A00 = string;
                Intent A0B = C18230wP.A0B();
                A0B.setComponent(new ComponentName("com.facebook.katana", "com.facebook.googleplaystore.GooglePlaystoreOverlayExternalActivity"));
                A0B.putExtra("IG_GPS_AD_CONTENT", this.A00);
                C16420t2 r6 = C10650ih.A00;
                synchronized (r6) {
                    try {
                        AnonymousClass05M r5 = r6.A00;
                        if (r5 == null) {
                            r5 = new AnonymousClass05M(r6.A0B(), r6.A0F, r6.A0E);
                            r6.A00 = r5;
                        }
                        r0 = new AnonymousClass05M(r5.A00, "IG_GOOGLE_PLAYSTORE_FRAGMENT", r5.A03, r5.A02);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (!r0.A0B(A0B, this, 0)) {
                    C10450iM.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_activity_not_launched", 1);
                    C37412JrW.A04(requireActivity(), C170689vP.AD_DESTINATION_APP_STORE, this.A00);
                } else {
                    C10450iM.A04("ig_fb_google_play_store_overlay_fragment", "launched", 1);
                }
                C14030oh.A09(-2140105867, A02);
                return;
            }
            throw th;
        } catch (C010004l | ActivityNotFoundException | IllegalAccessException | IllegalStateException | NullPointerException e) {
            C10450iM.A08("ig_fb_google_play_store_overlay_fragment", e);
            C37412JrW.A04(requireActivity(), C170689vP.AD_DESTINATION_APP_STORE, this.A00);
            C14030oh.A09(-199764421, A02);
        }
    }
}
