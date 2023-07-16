package X;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.4wh  reason: invalid class name and case insensitive filesystem */
public final class C86224wh extends Fragment {
    public static final Handler A03 = AnonymousClass0wJ.A0F();
    public C144608im A00;
    public String[] A01 = new String[0];
    public boolean A02;

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED")) {
            String[] strArr = this.A01;
            if (strArr == null) {
                str = "PermissionRequestFragment";
                str2 = "permission cannot be null";
            } else if (strArr.length > 0) {
                requestPermissions(strArr, 0);
                this.A02 = true;
                return;
            } else {
                str = "PermissionRequestFragment";
                str2 = "permission cannot be empty";
            }
            C10450iM.A03(str, str2);
            Activity activity = getActivity();
            if (activity != null) {
                activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C971568d r0;
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                r0 = C971568d.GRANTED;
            } else if (shouldShowRequestPermissionRationale(str)) {
                r0 = C971568d.DENIED;
            } else {
                r0 = C971568d.DENIED_DONT_ASK_AGAIN;
            }
            A0y.put(str, r0);
        }
        C971568d r1 = C971568d.DENIED_DONT_ASK_AGAIN;
        String A002 = AnonymousClass000.A00(292);
        if (r1.equals(A0y.get(A002)) && C971568d.GRANTED.equals(A0y.get(AnonymousClass000.A00(48)))) {
            A0y.put(A002, C971568d.DENIED);
        }
        A03.post(new C1360381c(this, A0y));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED", this.A02);
    }
}
