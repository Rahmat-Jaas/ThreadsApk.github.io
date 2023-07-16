package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.math.BigInteger;

/* renamed from: X.1uW  reason: invalid class name and case insensitive filesystem */
public final class C28521uW extends AnonymousClass9UH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28521uW(Context context, C12560m7 r2, UserSession userSession, Integer num) {
        super(r2);
        this.A01 = context;
        this.A02 = num;
        this.A00 = userSession;
    }

    public final void onFail(AnonymousClass3XX r11) {
        int A03 = C14030oh.A03(-1303878266);
        Context context = this.A01;
        String A0k = AnonymousClass0wJ.A0k(context, 2131829217);
        User A012 = C06810aP.A01.A01(this.A00);
        Integer num = this.A02;
        String BK7 = A012.BK7();
        Uri A0F = C18220wO.A0F(C18220wO.A0E("https://www.instagram.com/invites/contact/").appendQueryParameter("utm_source", "ig_contact_invite").appendQueryParameter("utm_medium", C36892Tb.A00(num)), "utm_content", new BigInteger(A012.getId()).toString(36));
        C04220Ms.A06(A0F);
        String A0h = C18220wO.A0h(context, BK7, A0F.toString(), 2131829216);
        C04220Ms.A06(A0h);
        AnonymousClass3PW.A00(context, num, A0k, A0h);
        C14030oh.A0A(1317008134, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1837570417);
        AnonymousClass1TC r7 = (AnonymousClass1TC) obj;
        int A002 = AnonymousClass0wJ.A00(1094563465, r7);
        AnonymousClass3PW.A00(this.A01, this.A02, r7.A01, r7.A00);
        C14030oh.A0A(227386932, A002);
        C14030oh.A0A(-233783785, A03);
    }
}
