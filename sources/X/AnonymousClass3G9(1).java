package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3G9  reason: invalid class name */
public final class AnonymousClass3G9 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public AnonymousClass3G9(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A07 = A0v;
        this.A06 = str4;
        this.A01 = str3;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str5;
        this.A00 = str6;
        this.A02 = str7;
        A0v.addAll(list);
    }

    public final String toString() {
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("fullname", this.A01).put("email", this.A04).put("phone", this.A05).put("profile_pic_url", this.A06).put("account_type", this.A03).put("first_name", this.A00).put("last_name", this.A02).put("id_tokens", new JSONArray(this.A07));
            return A0y.toString();
        } catch (JSONException e) {
            return C18230wP.A0t("bad_sign_up_hint: ", e);
        }
    }
}
