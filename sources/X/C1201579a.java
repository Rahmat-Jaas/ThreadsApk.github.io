package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.79a  reason: invalid class name and case insensitive filesystem */
public final class C1201579a {
    public boolean A00 = true;
    public final SharedPreferences A01;
    public final UserSession A02;

    public final AutofillData A01(AutofillData autofillData) {
        Map map = autofillData.A00;
        String A0r = C18220wO.A0r("id", Collections.unmodifiableMap(map));
        SharedPreferences sharedPreferences = this.A01;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (A0r == null) {
            if (!sharedPreferences.getAll().isEmpty()) {
                edit.clear();
            }
            HashMap A0j = C86164wN.A0j(Collections.unmodifiableMap(map));
            A0r = C18180wK.A0e();
            A0j.put("id", A0r);
            autofillData = new AutofillData((Map) A0j);
        }
        C18180wK.A0v(edit, A0r, autofillData.A01().toString());
        return autofillData;
    }

    public C1201579a(SharedPreferences sharedPreferences, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = sharedPreferences;
    }

    public static C1201579a A00(Context context, UserSession userSession) {
        return (C1201579a) C86144wL.A0i(userSession, C1201579a.class, context.getApplicationContext(), 5);
    }

    public final ArrayList A02() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A01.getAll());
        while (A0z.hasNext()) {
            A0v.add(C18180wK.A0o(A0z).getValue());
        }
        return A0v;
    }

    public final void A03(AutofillData autofillData) {
        AutofillData A012 = A01(autofillData);
        UserSession userSession = this.A02;
        try {
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0F("", "sensitive_string_value");
            A002.A0B(A003, "access_token");
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            Map A0l = C86164wN.A0l(A012);
            A004.A0F(C18220wO.A0r("given-name", A0l), "given_name");
            C121307Fk.A02(C121307Fk.A00(new C67473zc(C86104wH.A0M(A004, A002, C18220wO.A0r("family-name", A0l), A0l), AnonymousClass5Fn.class, "IABAutofillSaveData"), userSession));
        } catch (IOException e) {
            C10450iM.A06("AutofillGraphQLRequest", "Error creating save autofill request", e);
        }
    }
}
