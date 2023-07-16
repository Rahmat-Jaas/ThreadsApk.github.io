package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.4W6  reason: invalid class name */
public final class AnonymousClass4W6 extends HashMap<String, String> {
    public final /* synthetic */ AnonymousClass4VF A00;
    public final /* synthetic */ JSONObject A01;

    public AnonymousClass4W6(AnonymousClass4VF r3, JSONObject jSONObject) {
        this.A00 = r3;
        this.A01 = jSONObject;
        put(FXPFAccessLibraryDebugFragment.NAME, jSONObject.getString(FXPFAccessLibraryDebugFragment.NAME));
        put("profile_pic_url", jSONObject.getString("profile_pic_url"));
        put("resolver_type", "content_provider");
    }
}
