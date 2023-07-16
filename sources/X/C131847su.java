package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7su  reason: invalid class name and case insensitive filesystem */
public final class C131847su implements C41882MfV {
    public final long A00;
    public final C107926hX A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C131847su r3 = (C131847su) obj;
        String str2 = this.A03;
        if (r3 != null) {
            str = r3.A03;
        } else {
            str = null;
        }
        return C04220Ms.A0I(str2, str);
    }

    public C131847su(C107926hX r1, ImageUrl imageUrl, String str, String str2, long j) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A04 = str2;
        this.A00 = j;
        this.A01 = r1;
    }
}
