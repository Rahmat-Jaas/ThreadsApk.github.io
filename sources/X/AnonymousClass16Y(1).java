package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.16Y  reason: invalid class name */
public final class AnonymousClass16Y extends C58933Ih implements C34014Hyv {
    public final ImmutableList ARW() {
        return A02("assets", C89675Gh.class);
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

    public AnonymousClass16Y(JSONObject jSONObject) {
        super(jSONObject);
    }
}
