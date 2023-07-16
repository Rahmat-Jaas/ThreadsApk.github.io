package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.7pJ  reason: invalid class name */
public final class AnonymousClass7pJ implements C39667Kxm {
    public final Activity A00;
    public final Fragment A01;
    public final ClipsCelebrationReshareViewModel A02;
    public final BKU A03;
    public final UserSession A04;

    public final void BNF() {
    }

    public final void BNZ() {
        Fragment fragment = this.A01;
        float A08 = (float) C09860go.A08(fragment.getContext());
        float A07 = (float) C09860go.A07(fragment.getContext());
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A08, A07);
        UserSession userSession = this.A04;
        rectF.offsetTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A07);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321859817512002L)) {
            throw C18210wN.A0W("getFragmentFactory");
        }
        RectF rectF2 = rectF;
        C18865Ame.A00(this.A00, rectF, rectF2, (C171799zz) null, this.A02, this.A03, userSession, (File) null, "celebration", 0, 5632, false, false);
    }

    public AnonymousClass7pJ(Activity activity, Fragment fragment, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, BKU bku, UserSession userSession) {
        this.A04 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A03 = bku;
        this.A02 = clipsCelebrationReshareViewModel;
    }
}
