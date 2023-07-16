package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4I1  reason: invalid class name */
public final class AnonymousClass4I1 implements C82924qU {
    public final Context A00;
    public final Fragment A01;

    public final void BN1(Uri uri, Bundle bundle) {
        FragmentActivity activity;
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A002 = AnonymousClass000.A00(825);
        if (packageManager == null || packageManager.getLaunchIntentForPackage(A002) == null) {
            C09650fs.A01(context, A002, uri.getQueryParameter("referrer"));
            return;
        }
        Intent A0B = C18190wL.A0B("fb-pma://login");
        Fragment fragment = this.A01;
        if (fragment.isAdded() && (activity = fragment.getActivity()) != null) {
            C10650ih.A0A(activity, A0B);
        }
    }

    public AnonymousClass4I1(Context context, Fragment fragment) {
        this.A00 = context;
        this.A01 = fragment;
    }
}
