package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.3hB  reason: invalid class name and case insensitive filesystem */
public final class C63283hB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Uri A04;
    public Uri A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;

    public C63283hB(String str, List list) {
        this.A09 = str;
        this.A0A = list;
    }

    public static C63283hB A00(Context context) {
        return new C63283hB(AnonymousClass006.A01, context.getString(2131827960), context.getString(2131829571), R.drawable.instagram_insights_pano_outline_24, R.drawable.ig_illustrations_illo_user_insights);
    }

    public C63283hB(Uri uri, String str, String str2) {
        this.A09 = str;
        this.A07 = str2;
        this.A05 = uri;
        this.A03 = R.drawable.professional_conversion_full_insights_video_screenshot;
        this.A02 = R.drawable.instagram_insights_pano_outline_24;
        this.A0B = true;
    }

    public C63283hB(Uri uri, String str, String str2, String str3) {
        this.A00 = R.drawable.rounded_corners_card;
        this.A09 = str;
        this.A07 = str2;
        this.A02 = R.drawable.instagram_promote_pano_outline_24;
        this.A08 = str3;
        this.A04 = uri;
    }

    public C63283hB(Integer num, String str, String str2, int i, int i2) {
        this.A09 = str;
        this.A07 = str2;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = num;
    }

    public C63283hB(String str, String str2, int i) {
        this.A09 = str;
        this.A07 = str2;
        this.A02 = i;
        this.A01 = -1;
    }
}
