package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape73S0300000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wZ  reason: invalid class name */
public final class AnonymousClass1wZ extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "SavingToGalleryFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "saving_to_gallery";
    }

    public static void A0B(AnonymousClass1wZ r2, boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A03(r2.A00), "save_captured_videos", z);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r2, r2.A00), "instagram_setting_save_captured_videos_clicked"), 1991);
        A0I.A0T("enabled", Boolean.toString(z));
        A0I.Bb4();
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131827937);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(956750143);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(907002040, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-1504446146);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SharedPreferences sharedPreferences = AnonymousClass3WS.A01(this.A00).A00;
        AnonymousClass4MC.A08(new IDxCListenerShape73S0300000_1_I2(5, this, AnonymousClass006.A00, AnonymousClass3WS.A01(this.A00)), A0v, 2131835181, sharedPreferences.getBoolean("save_original_photos", true));
        C63293hC.A00(this, A0v, 2131832078);
        AnonymousClass4MC.A08(new IDxCListenerShape73S0300000_1_I2(5, this, AnonymousClass006.A01, AnonymousClass3WS.A01(this.A00)), A0v, 2131835187, sharedPreferences.getBoolean("save_posted_photos", true));
        AnonymousClass4MC.A08(new IDxCListenerShape73S0300000_1_I2(5, this, AnonymousClass006.A0C, AnonymousClass3WS.A01(this.A00)), A0v, 2131835188, sharedPreferences.getBoolean("save_captured_videos", true));
        C63293hC.A00(this, A0v, 2131837844);
        setItems(A0v);
        C14030oh.A09(-207396806, A02);
    }
}
