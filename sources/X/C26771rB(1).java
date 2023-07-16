package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1rB  reason: invalid class name and case insensitive filesystem */
public final class C26771rB extends C24431ij {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62353Yv A01;
    public final /* synthetic */ AnonymousClass1jJ A02;
    public final /* synthetic */ AnonymousClass3FU A03;
    public final /* synthetic */ C07530bf A04;
    public final /* synthetic */ List A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26771rB(Activity activity, Uri uri, C62353Yv r13, C11630kW r14, C84634tZ r15, AnonymousClass1jJ r16, AnonymousClass3FU r17, C07530bf r18, C07530bf r19, AnonymousClass265 r20, Integer num, String str, List list, int i) {
        super(activity, uri, r14, r15, r18, r20, num, str);
        this.A02 = r16;
        this.A04 = r19;
        this.A03 = r17;
        this.A00 = i;
        this.A05 = list;
        this.A01 = r13;
    }

    public final void A03(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        if (this.A03.A02) {
            C63533hk.A02(userSession).A0B(this.A02.A02, userSession2, AnonymousClass006.A05, user.getId(), true);
        }
        super.A03(userSession, user);
    }

    public final void A02(C26641qy r5) {
        int A032 = C14030oh.A03(1704887475);
        C07530bf r2 = this.A04;
        C63533hk.A02(r2).A0E(r2, this.A03.A00());
        super.A02(r5);
        C14030oh.A0A(1319247802, A032);
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(1637972391);
        AnonymousClass1jJ r3 = this.A02;
        C15730rn A002 = C15730rn.A00(r3, "deferred_recovered_account_skipped");
        A002.A0D("account_id", this.A03.A00());
        C18180wK.A1K(A002, this.A04);
        int i = this.A00 + 1;
        if (i < this.A05.size()) {
            AnonymousClass1jJ.A00(this.A01, r3, i);
        } else {
            AnonymousClass1jJ.A01(r3);
        }
        C14030oh.A0A(-675638924, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(-1019860114, C63873iU.A04(this, obj, -1955627093));
    }
}
