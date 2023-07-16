package X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape333S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.7gs  reason: invalid class name and case insensitive filesystem */
public final class C127287gs implements C27927Evd {
    public final C25812DsR A00;
    public final UserSession A01;
    public final View A02;

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public static void A00(C127287gs r5) {
        float f = (float) r5.A00.A09.A00;
        View view = r5.A02;
        view.setTranslationY(AnonymousClass0hF.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (-view.getHeight())));
        int i = 0;
        if (f == 1.0f) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C127287gs(View view, UserSession userSession) {
        double d;
        this.A01 = userSession;
        View requireViewById = view.requireViewById(R.id.privacy_message);
        this.A02 = requireViewById;
        requireViewById.addOnLayoutChangeListener(new IDxCListenerShape333S0100000_2_I2(this, 1));
        C25812DsR A022 = COK.A00().A02();
        A022.A06 = true;
        A022.A0E(this);
        this.A00 = A022;
        C86104wH.A1C(view.requireViewById(R.id.privacy_message_dismiss_button), 84, this);
        if (C18190wL.A1X(C28161tl.A04(userSession), "archive_map_privacy_banner_dismissed")) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        A022.A09(d);
    }

    public final void CLi(C25812DsR dsR) {
        A00(this);
    }
}
