package X;

import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.5Gm  reason: invalid class name and case insensitive filesystem */
public final class C89725Gm extends C58933Ih implements C41866MfF {
    public final String ARR() {
        return A05("asset_handle");
    }

    public final String AUt() {
        return A05("cache_key");
    }

    public final String Aac() {
        return A05("creation_time");
    }

    public final ImmutableList Aco() {
        return A02("delta_cache", C89705Gk.class);
    }

    public final String Ato() {
        return A05("md5_hash");
    }

    public final C148258qj AvX() {
        return (C148258qj) A00(C89715Gl.class, "metadata");
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public final String getUrl() {
        return A05("url");
    }

    public C89725Gm(JSONObject jSONObject) {
        super(jSONObject);
    }
}
