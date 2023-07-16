package X;

import org.json.JSONObject;

/* renamed from: X.5Gz  reason: invalid class name and case insensitive filesystem */
public final class C89855Gz extends C58933Ih implements C148338qr {
    public final C34008Hyp A9W() {
        JSONObject jSONObject = this.A00;
        if (jSONObject.optString("__typename").hashCode() != -2082070663) {
            return null;
        }
        return new FE3(jSONObject);
    }

    public C89855Gz(JSONObject jSONObject) {
        super(jSONObject);
    }
}
