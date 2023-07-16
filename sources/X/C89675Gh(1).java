package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import org.json.JSONObject;

/* renamed from: X.5Gh  reason: invalid class name and case insensitive filesystem */
public final class C89675Gh extends C58933Ih implements C34016Hyx {
    public final C966966i AYn() {
        return (C966966i) A04(TraceFieldType.CompressionType, C966966i.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final int AiL() {
        return this.A00.optInt("filesize_bytes");
    }

    public final String Ato() {
        return A05("md5_hash");
    }

    public final C148228qg AvW() {
        return (C148228qg) A00(C89665Gg.class, "metadata");
    }

    public final String BCs() {
        return A05("source_content_hash");
    }

    public final String getId() {
        return A05("id");
    }

    public final String getName() {
        return A05(FXPFAccessLibraryDebugFragment.NAME);
    }

    public final String getUrl() {
        return A05("url");
    }

    public C89675Gh(JSONObject jSONObject) {
        super(jSONObject);
    }
}
