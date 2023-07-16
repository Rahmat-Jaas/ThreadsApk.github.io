package X;

import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1hu  reason: invalid class name and case insensitive filesystem */
public final class C24321hu extends C63873iU {
    public final /* synthetic */ C63873iU A00;
    public final /* synthetic */ C38039KHq A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C24321hu(C63873iU r1, C38039KHq kHq, UserSession userSession, User user, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = user;
        this.A05 = z2;
        this.A02 = userSession;
        this.A01 = kHq;
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(-1977963970);
        this.A00.onFail(r3);
        C14030oh.A0A(2050707508, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(852395539);
        int A033 = C14030oh.A03(-941067518);
        this.A00.onSuccess(obj);
        C14030oh.A0A(1980475458, A033);
        C14030oh.A0A(609669923, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(1573893363);
        int A033 = C14030oh.A03(-1848319224);
        boolean z = this.A04;
        if (z) {
            this.A03.A2S(false);
        }
        boolean z2 = this.A05;
        if (z2) {
            User user = this.A03;
            user.A2T(false);
            C19554AyF.A02();
            ReelStore.A02(this.A02).A0V(user, false);
        }
        this.A01.CWx(new BBR(this.A03, z, z2, false));
        C14030oh.A0A(746324590, A033);
        C14030oh.A0A(-507233318, A032);
    }
}
