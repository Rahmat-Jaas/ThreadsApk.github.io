package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.7qw  reason: invalid class name and case insensitive filesystem */
public final class C130887qw implements C146328m3 {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public final boolean AAu() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw C86154wM.A0V(C18200wM.A0m(this.A02, C18190wL.A0s("type mis matching")));
    }

    public final boolean BWX() {
        return C18180wK.A1Z(this.A02, JsonToken.NULL);
    }

    public final long BeP() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw C86154wM.A0V(C18200wM.A0m(this.A02, C18190wL.A0s("type mis matching")));
    }

    public final Number BiQ() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            throw C86154wM.A0V(C18200wM.A0m(this.A02, C18190wL.A0s("type mis matching")));
        }
    }

    public final String CwM() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw C86154wM.A0V(C18200wM.A0m(this.A02, C18190wL.A0s("type mis matching")));
    }

    public C130887qw(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int i = AnonymousClass6YM.A00[peek.ordinal()];
        if (i == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (i == 2) {
            jsonReader.nextNull();
        } else if (i == 3 || i == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw C18180wK.A0a("can't read value");
        }
    }
}
