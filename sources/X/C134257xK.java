package X;

import android.app.Activity;
import android.graphics.RectF;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;

/* renamed from: X.7xK  reason: invalid class name and case insensitive filesystem */
public final class C134257xK implements C0E {
    public Activity A00;
    public Product A01;
    public UserSession A02;
    public String A03;
    public String A04;

    public final void CKQ(AnonymousClass3XX r1, boolean z) {
    }

    public final void CKR() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final H1T AQs() {
        H1T A0O = C18180wK.A0O(this.A02);
        A0O.A0T(AnonymousClass000.A00(148), this.A04);
        A0O.A0O("merchant_id", this.A03);
        A0O.A0O(I17.A00(603), String.valueOf(C09860go.A08(this.A00)));
        A0O.A0R(AnonymousClass000.A00(212), false);
        A0O.A0B(C156259Mn.class, C1185771l.class);
        return A0O;
    }

    public final /* bridge */ /* synthetic */ void CKS(C85814vo r7, boolean z, boolean z2) {
        UserSession userSession = this.A02;
        this.A01 = C17547AEh.A00(userSession, (C156259Mn) r7, (C2Q) null).B3W();
        Activity activity = this.A00;
        int A08 = C09860go.A08(activity);
        float A07 = (float) C09860go.A07(activity);
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A07, (float) A08, A07);
        C18416Af4 af4 = new C18416Af4(activity, this.A01, userSession);
        af4.A01 = rectF;
        af4.A00();
    }

    public C134257xK(Activity activity, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A04 = str;
        this.A03 = str2;
    }
}
