package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.5Go  reason: invalid class name and case insensitive filesystem */
public final class C89745Go extends C58933Ih implements C41865MfE {
    public final ImmutableList ARW() {
        return A02("assets", C89725Gm.class);
    }

    public final ImmutableList B4v() {
        return A02("properties", C89735Gn.class);
    }

    public final boolean BOm() {
        return !this.A00.isNull(ClientCookie.VERSION_ATTR);
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public final int getVersion() {
        return this.A00.optInt(ClientCookie.VERSION_ATTR);
    }

    public C89745Go(JSONObject jSONObject) {
        super(jSONObject);
    }
}
