package X;

import org.json.JSONException;

/* renamed from: X.2zv  reason: invalid class name and case insensitive filesystem */
public final class C54732zv {
    public static boolean A00(Integer num, String str, String str2) {
        String str3;
        try {
            return C18250wR.A0j(str).getJSONObject(String.valueOf(num.intValue())).has(String.valueOf(((C313925w) C313925w.A02.get(str2)).A00));
        } catch (NullPointerException e) {
            e = e;
            str3 = "NullPointerException";
            AnonymousClass0LU.A0E("AccessControlRuleV2", str3, e);
            return false;
        } catch (JSONException e2) {
            e = e2;
            str3 = "JSONException";
            AnonymousClass0LU.A0E("AccessControlRuleV2", str3, e);
            return false;
        } catch (Exception e3) {
            e = e3;
            str3 = "Exception";
            AnonymousClass0LU.A0E("AccessControlRuleV2", str3, e);
            return false;
        }
    }
}
