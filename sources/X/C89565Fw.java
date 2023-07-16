package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.5Fw  reason: invalid class name and case insensitive filesystem */
public final class C89565Fw extends C58933Ih implements C34010Hyr {
    public final ImmutableList ARW() {
        return A02("assets", FDi.class);
    }

    public final C40306LcC BIo() {
        return (C40306LcC) A04("type", C40306LcC.A01);
    }

    public final int getVersion() {
        return this.A00.optInt(ClientCookie.VERSION_ATTR);
    }

    public C89565Fw(JSONObject jSONObject) {
        super(jSONObject);
    }
}
