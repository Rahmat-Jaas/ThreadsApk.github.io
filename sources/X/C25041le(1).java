package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.redex.IDxCListenerShape8S0210000_1_I2;

/* renamed from: X.1le  reason: invalid class name and case insensitive filesystem */
public final class C25041le extends FR1 {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ AnonymousClass1x7 A02;
    public final /* synthetic */ AnonymousClass4MC A03;

    public final int getRunnableId() {
        return 438;
    }

    public C25041le(AnonymousClass1x7 r1, AnonymousClass4MC r2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = z;
        this.A00 = z2;
    }

    public final void A02(Exception exc) {
        if (this.A00) {
            AnonymousClass1x7 r6 = this.A02;
            AnonymousClass4MC r5 = this.A03;
            boolean z = this.A01;
            C25828Dsm A0W = C18190wL.A0W(r6.getContext());
            A0W.A0L(2131821684);
            A0W.A0K(2131821683);
            A0W.A0P(new IDxCListenerShape8S0210000_1_I2(4, (Object) r5, (Object) r6, z), 2131821685);
            A0W.A0O(new IDxCListenerShape8S0210000_1_I2(3, (Object) r5, (Object) r6, z), 2131823054);
            AnonymousClass0wJ.A1K(A0W);
        }
        C10450iM.A07("omvp_app_updates", exc);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (this.A03 == null) {
            AnonymousClass1x7 r3 = this.A02;
            r3.A01.A00.getBoolean("oxp_allow_app_updates", true);
            r3.A01.A00.getBoolean("oxp_show_app_update_available_notifications", true);
            r3.A01.A00.getBoolean("oxp_show_app_update_installed_notifications", true);
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            AnonymousClass1x7 r0 = this.A02;
            AnonymousClass3TJ r5 = r0.A00;
            ContentResolver contentResolver = r0.getContext().getContentResolver();
            Uri A0G = C18220wO.A0G(r5.A06);
            ContentValues contentValues = new ContentValues();
            contentValues.put("auto_updates", Integer.valueOf(r5.A02 ? 1 : 0));
            Boolean bool = r5.A00;
            if (bool != null) {
                contentValues.put("has_mobile_data_consent", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            contentValues.put("notif_update_available", Integer.valueOf(r5.A04 ? 1 : 0));
            contentValues.put("notif_update_installed", Integer.valueOf(r5.A05 ? 1 : 0));
            String str = r5.A01;
            if (str == null) {
                contentValues.putNull("rollout_token");
            } else {
                contentValues.put("rollout_token", str);
            }
            contentValues.put("terms_of_service_accepted", Integer.valueOf(r5.A03 ? 1 : 0));
            if (contentResolver.update(A0G, contentValues, (String) null, (String[]) null) >= 0) {
                return null;
            }
            throw C18180wK.A0a("Failed to update settings");
        } catch (IllegalStateException e) {
            this.A02.getActivity().runOnUiThread(new C73254Rr(this, e));
            return null;
        }
    }
}
