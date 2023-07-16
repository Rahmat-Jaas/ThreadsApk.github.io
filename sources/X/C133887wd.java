package X;

import android.app.Activity;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.7wd  reason: invalid class name and case insensitive filesystem */
public final class C133887wd implements C82924qU {
    public Activity A00;
    public AnonymousClass06E A01;
    public C11630kW A02;
    public UserSession A03;

    public static void A00(BKU bku, C133887wd r12) {
        Activity activity = r12.A00;
        float A08 = (float) C09860go.A08(activity);
        float A07 = (float) C09860go.A07(activity);
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A08, A07);
        rectF.offsetTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A07);
        RectF rectF2 = rectF;
        C18865Ame.A01(activity, rectF, rectF2, bku, r12.A03, r12.A02.getModuleName(), 0, true);
    }

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("business_id");
        String queryParameter2 = uri.getQueryParameter("media_id");
        UserSession userSession = this.A03;
        if (userSession.multipleAccountHelper.A0E(queryParameter) != null && queryParameter2 != null) {
            C19462Awj A012 = C19462Awj.A01(userSession);
            BKU A05 = A012.A05(queryParameter2);
            if (A05 == null) {
                Activity activity = this.A00;
                C18330wh r3 = new C18330wh(activity);
                C18330wh.A02(activity, r3, 2131830080);
                C32165H8c A032 = C19482Ax5.A03(userSession, queryParameter2);
                A032.A00 = new IDxACallbackShape16S0300000_2_I2(6, this, r3, A012);
                C31155GhB.A01(activity, this.A01, A032);
                return;
            }
            A00(A05, this);
        }
    }

    public C133887wd(Activity activity, AnonymousClass06E r2, C11630kW r3, UserSession userSession) {
        this.A00 = activity;
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
