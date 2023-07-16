package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

/* renamed from: X.4VA  reason: invalid class name */
public final class AnonymousClass4VA implements C83234r0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C22820Cgl A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C18330wh A03;
    public final /* synthetic */ String A04;

    public AnonymousClass4VA(FragmentActivity fragmentActivity, C22820Cgl cgl, UserSession userSession, C18330wh r4, String str) {
        this.A03 = r4;
        this.A01 = cgl;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r7) {
        C62903b6 r6 = (C62903b6) obj;
        if (r6 instanceof AnonymousClass1jA) {
            Object A05 = C62903b6.A05(r6);
            C04220Ms.A06(A05);
            this.A03.dismiss();
            C22820Cgl cgl = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            String str = this.A04;
            AnonymousClass0wJ.A1N(fragmentActivity, userSession);
            C22820Cgl.A01(fragmentActivity, (C24619DTc) A05, cgl, userSession, str);
        } else if (r6 instanceof AnonymousClass1jB) {
            this.A03.dismiss();
            C63813iO.A06(this.A00.getApplicationContext());
        }
        return Unit.A00;
    }
}
