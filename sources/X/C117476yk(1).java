package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6yk  reason: invalid class name and case insensitive filesystem */
public final class C117476yk {
    public static TrackData parseFromJson(MMo mMo) {
        return (TrackData) C86104wH.A0d(mMo, 137);
    }

    public static void A00(MMp mMp, TrackData trackData) {
        mMp.A0J();
        mMp.A0e("allows_saving", trackData.A0L);
        String str = trackData.A04;
        if (str != null) {
            mMp.A0d("artist_id", str);
        }
        String str2 = trackData.A05;
        if (str2 != null) {
            mMp.A0d("audio_asset_id", str2);
        }
        String str3 = trackData.A06;
        if (str3 != null) {
            mMp.A0d("audio_cluster_id", str3);
        }
        ImageUrl imageUrl = trackData.A00;
        if (imageUrl != null) {
            mMp.A0U("cover_artwork_thumbnail_uri");
            C59533Le.A01(mMp, imageUrl);
        }
        ImageUrl imageUrl2 = trackData.A01;
        mMp.A0U("cover_artwork_uri");
        C59533Le.A01(mMp, imageUrl2);
        String str4 = trackData.A07;
        if (str4 != null) {
            mMp.A0d("dark_message", str4);
        }
        String str5 = trackData.A08;
        if (str5 != null) {
            mMp.A0d("dash_manifest", str5);
        }
        String str6 = trackData.A09;
        if (str6 != null) {
            mMp.A0d("display_artist", str6);
        }
        Integer num = trackData.A03;
        if (num != null) {
            mMp.A0b("duration_in_ms", num.intValue());
        }
        String str7 = trackData.A0A;
        if (str7 != null) {
            mMp.A0d("fast_start_progressive_download_url", str7);
        }
        Boolean bool = trackData.A02;
        if (bool != null) {
            mMp.A0e("has_lyrics", bool.booleanValue());
        }
        Iterator A0t = C18190wL.A0t(mMp, "highlight_start_times_in_ms", trackData.A0K);
        while (A0t.hasNext()) {
            Number number = (Number) A0t.next();
            if (number != null) {
                mMp.A0N(number.intValue());
            }
        }
        mMp.A0F();
        mMp.A0d("id", trackData.A0B);
        String str8 = trackData.A0C;
        if (str8 != null) {
            mMp.A0d("ig_username", str8);
        }
        mMp.A0e("is_explicit", trackData.A0M);
        String str9 = trackData.A0D;
        if (str9 != null) {
            mMp.A0d("progressive_download_url", str9);
        }
        String str10 = trackData.A0E;
        if (str10 != null) {
            mMp.A0d(AnonymousClass000.A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION), str10);
        }
        String str11 = trackData.A0F;
        if (str11 != null) {
            mMp.A0d(AnonymousClass000.A00(208), str11);
        }
        String str12 = trackData.A0G;
        if (str12 != null) {
            mMp.A0d("subtitle", str12);
        }
        HashMap hashMap = trackData.A0J;
        if (hashMap != null) {
            mMp.A0U(AnonymousClass000.A00(1148));
            mMp.A0J();
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(mMp, A0o) == null) {
                    mMp.A0H();
                } else {
                    mMp.A0O(C18190wL.A08(A0o.getValue()));
                }
            }
            mMp.A0G();
        }
        String str13 = trackData.A0H;
        if (str13 != null) {
            mMp.A0d(DialogModule.KEY_TITLE, str13);
        }
        String str14 = trackData.A0I;
        if (str14 != null) {
            mMp.A0d("web_30s_preview_download_url", str14);
        }
        mMp.A0G();
    }
}
