package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6v8  reason: invalid class name and case insensitive filesystem */
public final class C115456v8 {
    public final C28161tl A00;

    public C115456v8(UserSession userSession) {
        this.A00 = AnonymousClass3WS.A01(userSession);
    }

    public final List A00() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String A06 = C28161tl.A06(this.A00, "ix_autofill_address", "");
        if (!TextUtils.isEmpty(A06)) {
            try {
                JSONArray jSONArray = new JSONArray(A06);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A0v.add(new AddressAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A0v;
    }

    public final List A01() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String A06 = C28161tl.A06(this.A00, "ix_autofill_email", "");
        if (!TextUtils.isEmpty(A06)) {
            try {
                JSONArray jSONArray = new JSONArray(A06);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A0v.add(new EmailAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A0v;
    }

    public final List A02() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String A06 = C28161tl.A06(this.A00, "ix_autofill_name", "");
        if (!TextUtils.isEmpty(A06)) {
            try {
                JSONArray jSONArray = new JSONArray(A06);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A0v.add(new NameAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A0v;
    }

    public final List A03() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String A06 = C28161tl.A06(this.A00, "ix_autofill_phone", "");
        if (!TextUtils.isEmpty(A06)) {
            try {
                JSONArray jSONArray = new JSONArray(A06);
                for (int i = 0; i < jSONArray.length(); i++) {
                    A0v.add(new TelephoneAutofillData(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("IgAutofillDataStore", e.toString(), e);
            }
        }
        return A0v;
    }
}
