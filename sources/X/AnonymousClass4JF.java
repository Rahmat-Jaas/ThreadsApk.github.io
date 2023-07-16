package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JF  reason: invalid class name */
public final class AnonymousClass4JF implements C82924qU {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        FragmentActivity activity;
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A002 = AnonymousClass000.A00(825);
        if (packageManager.getLaunchIntentForPackage(A002) != null) {
            String A17 = AnonymousClass0wJ.A0Y(this.A02).A17();
            if (A17 != null) {
                str = StringFormatUtil.formatStrLocaleSafe("fb-pma://pages/inbox/{#%s}", (Object) A17);
            } else {
                str = "fb-pma://login";
            }
            Intent A0B = C18190wL.A0B(str);
            Fragment fragment = this.A01;
            if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
                C10650ih.A0A(activity, A0B);
                return;
            }
            return;
        }
        C09650fs.A01(context, A002, uri.getQueryParameter("referrer"));
    }

    public AnonymousClass4JF(Context context, Fragment fragment, UserSession userSession) {
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
    }
}
