package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JS  reason: invalid class name */
public final class AnonymousClass4JS implements C82924qU {
    public final Context A00;
    public final Handler A01 = AnonymousClass0wJ.A0F();
    public final FragmentActivity A02;
    public final AnonymousClass06E A03;
    public final UserSession A04;
    public final boolean A05;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter;
        Context context;
        AnonymousClass06E r3;
        C32165H8c A032;
        int i;
        if (bundle != null) {
            queryParameter = bundle.getString("custom_param_phone_number");
        } else {
            queryParameter = uri.getQueryParameter("phone");
        }
        if (!uri.getBooleanQueryParameter("autoconfirm", false) || !this.A05) {
            context = this.A00;
            r3 = this.A03;
            A032 = C63503hc.A03(this.A04, queryParameter);
            i = 4;
        } else {
            context = this.A00;
            r3 = this.A03;
            A032 = C63503hc.A01(context, this.A04, AnonymousClass006.A01, queryParameter);
            i = 3;
        }
        A032.A00 = new IDxACallbackShape4S1100000_1_I2(queryParameter, this, i);
        C31155GhB.A01(context, r3, A032);
    }

    public AnonymousClass4JS(Context context, FragmentActivity fragmentActivity, AnonymousClass06E r4, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = r4;
        this.A04 = userSession;
        this.A05 = C63443hU.A05(context);
    }
}
