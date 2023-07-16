package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.16I  reason: invalid class name */
public final class AnonymousClass16I extends C58933Ih implements C85704vd {
    public final String B4V() {
        return A05("profile_picture_url");
    }

    public final AnonymousClass20B BIn() {
        return (AnonymousClass20B) A04("type", AnonymousClass20B.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String BK3() {
        return A05("user_obid");
    }

    public final String getId() {
        return A05("id");
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public AnonymousClass16I(JSONObject jSONObject) {
        super(jSONObject);
    }
}
