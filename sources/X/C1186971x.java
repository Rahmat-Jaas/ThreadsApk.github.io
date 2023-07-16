package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.71x  reason: invalid class name and case insensitive filesystem */
public final class C1186971x {
    public static final void A00(JsonReader jsonReader, C15680ri r4, C1186971x r5) {
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                JsonToken peek = jsonReader.peek();
                if (peek != null) {
                    int i = AnonymousClass6Z1.A00[peek.ordinal()];
                    if (i == 1) {
                        r4.A0B(nextName, Double.valueOf(jsonReader.nextDouble()));
                    } else if (i == 2) {
                        r4.A0D(nextName, jsonReader.nextString());
                    } else if (i == 3) {
                        r4.A0A(nextName, Boolean.valueOf(jsonReader.nextBoolean()));
                    } else if (i == 4) {
                        C15680ri r0 = new C15680ri();
                        A00(jsonReader, r0, r5);
                        r4.A07(r0, nextName);
                    }
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }
    }
}
