package X;

import android.content.Context;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.5yX  reason: invalid class name */
public final class AnonymousClass5yX extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AutofillData A01;
    public final /* synthetic */ C105446dR A02;
    public final /* synthetic */ UserSession A03;

    public AnonymousClass5yX(Context context, AutofillData autofillData, C105446dR r3, UserSession userSession) {
        this.A02 = r3;
        this.A01 = autofillData;
        this.A00 = context;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        Object obj2;
        int A032 = C14030oh.A03(770536352);
        AnonymousClass5z0 r7 = (AnonymousClass5z0) obj;
        int A033 = C14030oh.A03(526712286);
        if (!(r7 == null || (obj2 = r7.A01) == null)) {
            C148048qM r1 = (C148048qM) obj2;
            if (!(r1.Anz() == null || r1.Anz().Afv() == null)) {
                String Afv = r1.Anz().Afv();
                AutofillData autofillData = this.A01;
                Map map = autofillData.A00;
                if (Afv == null) {
                    map.remove("id");
                } else {
                    map.put("id", Afv);
                }
                C1201579a A002 = C1201579a.A00(this.A00, this.A03);
                String A0r = C18220wO.A0r("id", C86164wN.A0l(autofillData));
                if (A0r != null) {
                    C18180wK.A0v(A002.A01.edit(), A0r, autofillData.A01().toString());
                }
                C105446dR r12 = this.A02;
                if (r12 != null) {
                    C1189172u.A00(new C135517zc(r12));
                }
                i = -1331633262;
                C14030oh.A0A(i, A033);
                C14030oh.A0A(-1254031173, A032);
            }
        }
        C10450iM.A03("AutofillGraphQLRequest", "Error creating add-contact autofill response");
        C105446dR r13 = this.A02;
        if (r13 != null) {
            C1189172u.A00(new AnonymousClass81S(r13, "Error creating add-contact autofill response"));
        }
        i = -450262303;
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-1254031173, A032);
    }
}
