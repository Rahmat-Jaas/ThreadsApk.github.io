package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
public final class C26131q6 extends AnonymousClass3VG {
    public int A00 = 0;
    public String A01 = null;
    public String A02 = null;

    public final void A04(String str, String str2, String str3) {
        this.A01 = str2;
        this.A02 = str3;
        if (str.equals("PHOTO_MEDIA_PREVIEW_PICKER") || str.equals("PHOTO_SETTINGS")) {
            C59713Ma.A01(this.A06, true);
        }
        this.A05 = str;
        C63643hy.A04(new AnonymousClass4P3(this));
    }

    public C26131q6(Activity activity, C10300i6 r3) {
        super(activity, r3);
    }

    public C26131q6(Fragment fragment, C10300i6 r3) {
        super(fragment, r3);
    }
}
