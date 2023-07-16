package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.1hq  reason: invalid class name and case insensitive filesystem */
public final class C24291hq extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ AnonymousClass3HG A02;
    public final /* synthetic */ User A03;

    public C24291hq(Context context, AnonymousClass3HG r2, User user, boolean z) {
        this.A02 = r2;
        this.A03 = user;
        this.A01 = z;
        this.A00 = context;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(-1944458306);
        C62973bE.A02(this.A00, r3);
        C14030oh.A0A(1876904331, A032);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A032 = C14030oh.A03(1404111477);
        this.A03.A2I(this.A01);
        C14030oh.A0A(1355543502, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(230095359);
        int A033 = C14030oh.A03(-1001280178);
        C37088JkK.A00(this.A02.A01).A0A(((C22081Th) obj).A00, this.A03, (String) null);
        C14030oh.A0A(-1750943505, A033);
        C14030oh.A0A(22320050, A032);
    }
}
