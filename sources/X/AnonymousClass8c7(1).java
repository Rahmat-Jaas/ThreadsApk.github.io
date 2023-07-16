package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.8c7  reason: invalid class name */
public final class AnonymousClass8c7 extends C39235Kq2 {
    public int A00 = -1;
    public final JsonArray A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8c7(C36975Ji8 ji8, JsonArray jsonArray) {
        super(ji8, jsonArray);
        C04220Ms.A0B(jsonArray, 2);
        this.A01 = jsonArray;
        this.A02 = jsonArray.size();
    }

    public final /* bridge */ /* synthetic */ JsonElement A0C() {
        return this.A01;
    }

    public final JsonElement A0D(String str) {
        JsonArray jsonArray = this.A01;
        return (JsonElement) jsonArray.A00.get(Integer.parseInt(str));
    }

    public final int AGx(SerialDescriptor serialDescriptor) {
        int i = this.A00;
        if (i >= this.A02 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.A00 = i2;
        return i2;
    }

    public final String A0B(SerialDescriptor serialDescriptor, int i) {
        return String.valueOf(i);
    }
}
