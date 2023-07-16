package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2Ii  reason: invalid class name and case insensitive filesystem */
public final class C34122Ii {
    public static final Object A00(AnonymousClass601 r8) {
        C04220Ms.A0B(r8, 1);
        Fragment A01 = C63913ic.A01(r8);
        PackageManager packageManager = A01.requireContext().getPackageManager();
        C04220Ms.A06(packageManager);
        C10300i6 A0F = C63913ic.A0F(r8);
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18304746888631252L) || !new C36477JWz(A01.requireContext().getApplicationContext(), packageManager).A02(18) || packageManager.getComponentEnabledSetting(new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity")) != 1) {
            C18190wL.A10();
            AnonymousClass0wJ.A19(new AnonymousClass1x7(), C63913ic.A05(r8), A0F);
            return null;
        }
        FragmentActivity requireActivity = A01.requireActivity();
        Intent A05 = C18250wR.A05(AnonymousClass30A.A00);
        A05.setComponent(new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"));
        A05.putExtra("package_name", requireActivity.getPackageName());
        try {
            C16420t2.A00().A0A(AnonymousClass30C.A00).A09(requireActivity, A05);
            return null;
        } catch (ActivityNotFoundException e) {
            C10450iM.A07("Failed to launch App-Update-Settings activity within AppManage", e);
            return null;
        }
    }
}
