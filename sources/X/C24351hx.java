package X;

import android.content.Context;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1hx  reason: invalid class name and case insensitive filesystem */
public final class C24351hx extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C63873iU A01;
    public final /* synthetic */ C38039KHq A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C24351hx(Context context, C63873iU r2, C38039KHq kHq, UserSession userSession, User user, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A04 = user;
        this.A07 = z2;
        this.A03 = userSession;
        this.A02 = kHq;
        this.A05 = z3;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A032 = C14030oh.A03(1646300082);
        this.A01.onFail(r4);
        Object obj = r4.A00;
        if (obj != null) {
            C63813iO.A01(this.A00, ((C22081Th) obj).A01);
        }
        C14030oh.A0A(-1882379464, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(695706840);
        int A033 = C14030oh.A03(-1522834943);
        this.A01.onSuccess(obj);
        C14030oh.A0A(-1824488556, A033);
        C14030oh.A0A(153591867, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(1229140944);
        int A033 = C14030oh.A03(5302338);
        boolean z = this.A06;
        if (z) {
            this.A04.A2S(true);
        }
        boolean z2 = this.A07;
        if (z2) {
            User user = this.A04;
            user.A2T(true);
            C19554AyF.A02();
            ReelStore.A02(this.A03).A0V(user, true);
        }
        this.A02.CWx(new BBR(this.A04, z, z2, this.A05));
        C14030oh.A0A(-2110622232, A033);
        C14030oh.A0A(30042813, A032);
    }
}
