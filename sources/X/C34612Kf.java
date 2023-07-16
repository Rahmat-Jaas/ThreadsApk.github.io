package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2Kf  reason: invalid class name and case insensitive filesystem */
public final class C34612Kf {
    public static void A00(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        Intent A00 = C62333Yi.A00(fragmentActivity);
        Uri.Builder A0E = C18220wO.A0E("instagram://story-camera");
        if (str != null) {
            A0E.appendQueryParameter("effect_id", str);
        }
        if (str2 != null) {
            A0E.appendQueryParameter("test_link_crypto_hash", str2);
        }
        if (str3 != null) {
            A0E.appendQueryParameter("test_link_revision_id", str3);
        }
        A00.setData(A0E.build());
        C10650ih.A02(fragmentActivity, A00);
    }
}
