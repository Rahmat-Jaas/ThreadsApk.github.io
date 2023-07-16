package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.16J  reason: invalid class name */
public final class AnonymousClass16J extends C58933Ih implements C85714ve {
    public final String B1p() {
        return A05("plain_page_token");
    }

    public final String B4V() {
        return A05("profile_picture_url");
    }

    public final AnonymousClass20B BIn() {
        return (AnonymousClass20B) A04("type", AnonymousClass20B.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String getId() {
        return A05("id");
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public AnonymousClass16J(JSONObject jSONObject) {
        super(jSONObject);
    }
}
