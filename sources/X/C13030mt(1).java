package X;

import android.util.Pair;

/* renamed from: X.0mt  reason: invalid class name and case insensitive filesystem */
public final class C13030mt extends Pair implements C18110wB {
    public static C13030mt A01 = new C13030mt("", "", Long.MAX_VALUE);
    public final long A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13030mt(String str, String str2, long j) {
        super(str == null ? "" : str, str2 == null ? "" : str2);
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttDeviceIdAndSecret{id=");
        sb.append((String) this.first);
        sb.append("secret=");
        sb.append((String) this.second);
        sb.append("mTimestamp=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
