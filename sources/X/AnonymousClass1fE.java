package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.barcelona.R;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.service.session.UserSession;

/* renamed from: X.1fE  reason: invalid class name */
public final class AnonymousClass1fE extends I4A {
    public LocationPageInfo A00;
    public final C24141gx A01;
    public final C24091gs A02;
    public final C24151gy A03;

    public AnonymousClass1fE(Context context, C11630kW r13, UserSession userSession) {
        C24151gy r3 = new C24151gy(context, r13);
        this.A03 = r3;
        C24091gs r4 = new C24091gs(context, context.getString(2131823308), context.getString(2131823303));
        this.A02 = r4;
        String string = context.getString(2131836646);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, string, 2131823307));
        String A012 = AnonymousClass3W8.A01(context, "https://www.facebook.com/page_guidelines.php");
        int color = context.getColor(R.color.blue_8);
        AnonymousClass0wJ.A1Q(userSession, A012);
        AnonymousClass3Zw.A01(A0E, new C29401xz(context, userSession, (AnonymousClass36D) null, A012, color), string);
        C24141gx r0 = new C24141gx(context, A0E);
        this.A01 = r0;
        A08(r3, r4, r0);
    }
}
