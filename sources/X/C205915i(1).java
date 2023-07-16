package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.15i  reason: invalid class name and case insensitive filesystem */
public final class C205915i extends C58933Ih implements C85684vb {
    public final ImmutableList AOc() {
        return A01("accounts_to_sync");
    }

    public final String ATn() {
        return A05("body");
    }

    public final C85614vU AWT() {
        return (C85614vU) A00(C205715g.class, "card_content");
    }

    public final C85674va AjP() {
        return (C85674va) A00(C205815h.class, "footer_content");
    }

    public final String BH2() {
        return A05(DialogModule.KEY_TITLE);
    }

    public C205915i(JSONObject jSONObject) {
        super(jSONObject);
    }
}
