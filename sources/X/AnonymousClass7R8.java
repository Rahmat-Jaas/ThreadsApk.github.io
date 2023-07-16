package X;

import android.view.View;
import com.facebookpay.msc.settings.viewmodel.SettingsViewModel;

/* renamed from: X.7R8  reason: invalid class name */
public final class AnonymousClass7R8 implements View.OnClickListener {
    public final /* synthetic */ SettingsViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass7R8(SettingsViewModel settingsViewModel, String str, String str2) {
        this.A00 = settingsViewModel;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1447475628);
        SettingsViewModel settingsViewModel = this.A00;
        String str = this.A02;
        String str2 = this.A01;
        C04220Ms.A0B(str2, 1);
        SettingsViewModel.A03(settingsViewModel, "user_click_payouthub_atomic", str2, str, (String) null, (String) null, (String) null, (String) null, 120);
        C880756q r1 = settingsViewModel.A03;
        AnonymousClass7Kz.A0P();
        AnonymousClass7JD.A02(r1, new C128357jR(str));
        C14030oh.A0C(1370527218, A05);
    }
}
