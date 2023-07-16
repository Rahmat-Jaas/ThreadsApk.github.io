package X;

import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1s3  reason: invalid class name and case insensitive filesystem */
public final class C27151s3 extends AnonymousClass4EM {
    public static final Map A07 = new C73984Vi();
    public final String A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();
    public final AtomicReference A02 = new AtomicReference(AnonymousClass21L.PENDING);
    public final ImageUrl A03;
    public final AnonymousClass23T A04;
    public final String A05;
    public final String A06;

    public final String AOZ() {
        return C18240wQ.A0g("PENDING");
    }

    public final int ARi() {
        int ordinal = this.A04.ordinal();
        if (ordinal == 0) {
            return R.drawable.instagram_facebook_circle_filled_12;
        }
        if (ordinal != 1) {
            return 0;
        }
        return R.drawable.google_glyph_gray;
    }

    public final String AfO() {
        return "";
    }

    public final String Ak1() {
        return this.A05;
    }

    public final ImageUrl AoT() {
        return this.A03;
    }

    public final String B1L() {
        return "";
    }

    public final String BK2() {
        return "";
    }

    public final String BK7() {
        return this.A06;
    }

    public final boolean CeI() {
        return false;
    }

    public C27151s3(ImageUrl imageUrl, AnonymousClass23T r4, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2 == null ? "" : str2;
        this.A03 = imageUrl;
        this.A00 = str3;
        this.A04 = r4;
    }
}
