package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;

/* renamed from: X.0zM  reason: invalid class name and case insensitive filesystem */
public final class C19140zM extends I60 {
    public I1V A00;
    public String A01;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A00();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle extras;
        int A02 = C14030oh.A02(862053173);
        super.onCreate(bundle);
        this.A01 = requireArguments().getString("arg_session_id");
        if (this.A00 == null) {
            FragmentActivity requireActivity = requireActivity();
            Intent intent = requireActivity.getIntent();
            int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            if (!AnonymousClass3XO.A01.contains(Integer.valueOf(intExtra)) || intExtra < 20140701) {
                extras = intent.getExtras();
            } else {
                extras = intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
            }
            String string = extras.getString("action");
            Bundle bundle2 = extras.getBundle("params");
            if (C62843aw.A04(string)) {
                requireActivity.finish();
                i = 1653268638;
                C14030oh.A09(i, A02);
            }
            String str = null;
            AccessToken A002 = C62603aO.A00(this.A01);
            if (A002 == null && (str = C60943Re.A02) == null) {
                throw new AnonymousClass4VW("Attempted to create a builder without a valid access token or a valid default Application ID.");
            }
            if (bundle2 == null) {
                bundle2 = C18180wK.A06();
            }
            C67523zh r2 = new C67523zh(this);
            if (A002 != null) {
                bundle2.putString("app_id", A002.A01);
                bundle2.putString("access_token", A002.A02);
            } else {
                bundle2.putString("app_id", str);
            }
            this.A00 = new I1V(requireActivity, bundle2, r2, string);
        }
        i = -205204690;
        C14030oh.A09(i, A02);
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(-2083391980);
        if (this.A02 != null && getRetainInstance()) {
            this.A02.setDismissMessage((Message) null);
        }
        super.onDestroyView();
        C14030oh.A09(-634950780, A02);
    }

    public final Dialog A0C(Bundle bundle) {
        return this.A00;
    }
}
