package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.42o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C681642o implements C82284pN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C63873iU A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C681642o(Context context, Fragment fragment, C63873iU r3, UserSession userSession, boolean z) {
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragment;
        this.A04 = z;
        this.A02 = r3;
    }

    public final void Bll() {
        Context context = this.A00;
        UserSession userSession = this.A03;
        C67243zD.A01(context, this.A01, this.A02, userSession, this.A04);
    }
}
