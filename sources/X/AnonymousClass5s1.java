package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.5s1  reason: invalid class name */
public final class AnonymousClass5s1 extends TypeAdapter {
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        throw C86134wK.A0s("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw C86134wK.A0s(AnonymousClass00U.A0V("Attempted to serialize java.lang.Class: ", ((Class) obj).getName(), ". Forgot to register a type adapter?"));
    }
}
