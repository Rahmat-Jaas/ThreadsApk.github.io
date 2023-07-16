package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7Fk  reason: invalid class name and case insensitive filesystem */
public final class C121307Fk {
    public static C32165H8c A00(C146418mD r2, UserSession userSession) {
        C31082GfJ gfJ = new C31082GfJ((C10300i6) userSession);
        gfJ.A06(r2);
        gfJ.A08 = C18170wI.A00(796);
        return gfJ.A05(AnonymousClass006.A01);
    }

    public static void A01(Context context, AutofillData autofillData, C105446dR r7, UserSession userSession) {
        try {
            GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
            Map map = autofillData.A00;
            A00.A0F(C18220wO.A0r("id", map), "ent_id");
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            Map unmodifiableMap = Collections.unmodifiableMap(map);
            A002.A0F(C18220wO.A0r("given-name", unmodifiableMap), "given_name");
            C32165H8c A003 = A00(new C67473zc(C86104wH.A0M(A002, A00, C18220wO.A0r("family-name", unmodifiableMap), unmodifiableMap), AnonymousClass5GB.class, "IABAutofillSaveDataEntries"), userSession);
            A003.A00 = new AnonymousClass5yX(context, autofillData, r7, userSession);
            A02(A003);
        } catch (IOException e) {
            C10450iM.A06("AutofillGraphQLRequest", "Error creating save autofill request", e);
            if (r7 != null) {
                C1189172u.A00(new AnonymousClass81S(r7, "Error creating save autofill request"));
            }
        }
    }

    public static void A02(C32165H8c h8c) {
        AnonymousClass0gN.A00().AKp(new AnonymousClass610(h8c));
    }

    public static void A03(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
