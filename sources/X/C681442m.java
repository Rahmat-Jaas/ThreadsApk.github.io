package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C681442m implements C82284pN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C681442m(Context context, Fragment fragment, UserSession userSession, String str) {
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
        this.A03 = str;
    }

    public final void Bll() {
        Context context = this.A00;
        Fragment fragment = this.A01;
        UserSession userSession = this.A02;
        String str = this.A03;
        Intent A04 = C18250wR.A04(context, FbConnectPageActivity.class);
        C18230wP.A12(A04, userSession);
        A04.putExtra("entry_point", str);
        C18230wP.A0O().A0B(A04, fragment, 132);
    }
}
