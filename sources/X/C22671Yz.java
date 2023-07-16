package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Yz  reason: invalid class name and case insensitive filesystem */
public final class C22671Yz extends C34640IcN implements DialogInterface.OnCancelListener, C83404rK, C81414nk {
    public static final String __redex_internal_original_name = "ShareTable$FbShareFragment";
    public boolean A00;
    public ShareLaterMedia A01;
    public UserSession A02;

    public final void BpC(String str) {
        this.A00 = true;
        AnonymousClass3LY.A00(this.A02).CWx(new AnonymousClass46V(true, str));
    }

    public final String getModuleName() {
        return "share_to_fb_page";
    }

    public final void CDp(Context context, AnonymousClass06E r4, UserSession userSession) {
        C67163yy.A00(context, r4, new IDxACallbackShape35S0200000_1_I2(51, this, userSession), userSession);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (!this.A00) {
            AnonymousClass3LY.A00(this.A02).CWx(new AnonymousClass46V(false, (String) null));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 132) {
            intent.getClass();
            String stringExtra = intent.getStringExtra("page_name");
            if (stringExtra != null) {
                ShareLaterMedia shareLaterMedia = this.A01;
                if (shareLaterMedia != null) {
                    AnonymousClass2AI.A04.A05(shareLaterMedia, true);
                }
                BpC(stringExtra);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1074342361);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0wJ.A0W(this);
        this.A01 = (ShareLaterMedia) requireArguments().getParcelable("ShareLaterMedia.SHARE_LATER_MEDIA");
        C14030oh.A09(848609757, A022);
    }
}
