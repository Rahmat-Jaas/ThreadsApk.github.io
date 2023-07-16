package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4II  reason: invalid class name */
public final class AnonymousClass4II implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public AnonymousClass4II(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        UserSession userSession = this.A01;
        FragmentActivity activity = this.A00.getActivity();
        String string = A06.getString("entry_point");
        if (TextUtils.isEmpty(string)) {
            string = "deep_link";
        }
        UserSession A02 = C05030Qo.A02(userSession);
        C62883b4.A04();
        C04220Ms.A0B(string, 0);
        Bundle A062 = C18180wK.A06();
        C22971bh r2 = new C22971bh();
        A062.putString("entry_point", string);
        r2.setArguments(A062);
        C18190wL.A13(r2.requireArguments(), A02.token);
        C25786Drz A0Q = C18180wK.A0Q(activity, userSession);
        A0Q.A07 = "BusinessObjectives";
        A0Q.A03 = r2;
        A0Q.A05();
    }
}
