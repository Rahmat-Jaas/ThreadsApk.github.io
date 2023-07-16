package X;

import org.json.JSONObject;

/* renamed from: X.15t  reason: invalid class name and case insensitive filesystem */
public final class C207015t extends C58933Ih implements C85694vc {
    public final boolean AVp() {
        return this.A00.optBoolean("can_see_fxim");
    }

    public final boolean AVq() {
        return this.A00.optBoolean("can_see_native_reminders");
    }

    public final C85224ui AnY() {
        return (C85224ui) A00(C206715q.class, "identities");
    }

    public final C85514vJ B4J() {
        return (C85514vJ) A00(C206815r.class, "profile_photo_reminder_info");
    }

    public final C85724vf B92() {
        return (C85724vf) A00(C206915s.class, "screen_resources");
    }

    public C207015t(JSONObject jSONObject) {
        super(jSONObject);
    }
}
