package X;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.3aH  reason: invalid class name and case insensitive filesystem */
public final class C62553aH {
    public Pattern A00;
    public boolean A01;

    public static C62553aH A00(Object obj) {
        Pattern compile = Pattern.compile("");
        boolean z = false;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("pattern")) {
                compile = Pattern.compile(jSONObject.getString("pattern"), 32);
                if (jSONObject.has("negation") && jSONObject.getString("negation").equalsIgnoreCase("true")) {
                    z = true;
                }
            }
        } else if (obj instanceof String) {
            compile = Pattern.compile((String) obj, 32);
        }
        return new C62553aH(compile, z);
    }

    public static boolean A01(C62553aH r2, CharSequence charSequence) {
        return r2.A00.matcher(charSequence).matches() ^ r2.A01;
    }

    public C62553aH(Pattern pattern, boolean z) {
        this.A00 = pattern;
        this.A01 = z;
    }

    public C62553aH() {
        this(Pattern.compile(""), false);
    }
}
