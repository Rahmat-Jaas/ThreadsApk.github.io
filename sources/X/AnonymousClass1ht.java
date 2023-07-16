package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.1ht  reason: invalid class name */
public final class AnonymousClass1ht extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C63873iU A01;
    public final /* synthetic */ C38039KHq A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass1ht(Context context, C63873iU r2, C38039KHq kHq, User user, boolean z) {
        this.A03 = user;
        this.A04 = z;
        this.A02 = kHq;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A032 = C14030oh.A03(705108834);
        this.A01.onFail(r4);
        Object obj = r4.A00;
        if (obj != null) {
            C63813iO.A01(this.A00, ((C22081Th) obj).A01);
        }
        C14030oh.A0A(1298052166, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1888745662);
        int A033 = C14030oh.A03(-182654126);
        this.A01.onSuccess(obj);
        C14030oh.A0A(-103867579, A033);
        C14030oh.A0A(256475226, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = C14030oh.A03(-510345780);
        int A033 = C14030oh.A03(1902080534);
        User user = this.A03;
        user.A2R(this.A04);
        this.A02.CWx(new BBR(user, false, false, false));
        C14030oh.A0A(67559718, A033);
        C14030oh.A0A(1222424936, A032);
    }
}
