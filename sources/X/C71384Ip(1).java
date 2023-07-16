package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.4Ip  reason: invalid class name and case insensitive filesystem */
public final class C71384Ip implements C82924qU {
    public final C34640IcN A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        HashMap hashMap;
        String queryParameter = uri.getQueryParameter("bloks_app_id");
        String queryParameter2 = uri.getQueryParameter("params");
        C18330wh r0 = null;
        if (queryParameter2 != null) {
            try {
                hashMap = AnonymousClass2LR.A00(C04690Os.A02.A04(this.A01, queryParameter2));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            hashMap = null;
        }
        C34640IcN icN = this.A00;
        FragmentActivity activity = icN.getActivity();
        if (activity != null) {
            r0 = C18330wh.A00(activity);
            C13950oZ.A00(r0);
        }
        AnonymousClass4A9 A002 = C63263h8.A00(this.A01, queryParameter, hashMap);
        AnonymousClass4A9.A01(A002, r0, this, 13);
        icN.schedule(A002);
    }

    public C71384Ip(Fragment fragment, UserSession userSession) {
        this.A00 = (C34640IcN) fragment;
        this.A01 = userSession;
    }
}
