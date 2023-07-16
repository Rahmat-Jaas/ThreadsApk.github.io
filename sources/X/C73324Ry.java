package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;

/* renamed from: X.4Ry  reason: invalid class name and case insensitive filesystem */
public final class C73324Ry implements Runnable {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ IDxACallbackShape111S0100000_1_I2 A01;

    public C73324Ry(Uri uri, IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2) {
        this.A01 = iDxACallbackShape111S0100000_1_I2;
        this.A00 = uri;
    }

    public final void run() {
        Fragment fragment = (Fragment) this.A01.A00;
        FragmentActivity activity = fragment.getActivity();
        Intent A04 = C62333Yi.A01().A04(activity, this.A00);
        A04.addFlags(335544320);
        String string = fragment.requireArguments().getString("short_url");
        if (!TextUtils.isEmpty(string)) {
            A04.putExtra("short_url", string);
        }
        C10650ih.A02(activity, A04);
    }
}
