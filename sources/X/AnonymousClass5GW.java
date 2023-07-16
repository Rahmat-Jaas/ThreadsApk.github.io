package X;

import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.5GW  reason: invalid class name */
public final class AnonymousClass5GW extends C58933Ih implements C148518rD {
    public final String AOT() {
        return A05("account_id");
    }

    public final AnonymousClass8qY ASN() {
        return (AnonymousClass8qY) A00(AnonymousClass5GU.class, "autofill_address");
    }

    public final ImmutableList Aan() {
        return A02("credentials", AnonymousClass5GV.class);
    }

    public final String AfO() {
        return A05("email");
    }

    public final String B4X() {
        return A05("profile_url");
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public AnonymousClass5GW(JSONObject jSONObject) {
        super(jSONObject);
    }
}
