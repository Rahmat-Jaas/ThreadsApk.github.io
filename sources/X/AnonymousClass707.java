package X;

import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.707  reason: invalid class name */
public final class AnonymousClass707 {
    public static AnonymousClass5M7 parseFromJson(MMo mMo) {
        return (AnonymousClass5M7) C86104wH.A0e(mMo, 3);
    }

    public static void A00(MMp mMp, AnonymousClass5M7 r5) {
        mMp.A0J();
        mMp.A0e("can_toggle_mashups_allowed", r5.A06);
        String str = r5.A05;
        if (str != null) {
            mMp.A0d("formatted_mashups_count", str);
        }
        mMp.A0e("has_been_mashed_up", r5.A07);
        Boolean bool = r5.A02;
        if (bool != null) {
            mMp.A0e("has_nonmimicable_additional_audio", bool.booleanValue());
        }
        mMp.A0e("is_creator_requesting_mashup", r5.A08);
        ClipsMashupType clipsMashupType = r5.A00;
        if (clipsMashupType != null) {
            mMp.A0d("mashup_type", clipsMashupType.A00);
        }
        mMp.A0e("mashups_allowed", r5.A09);
        Integer num = r5.A03;
        if (num != null) {
            mMp.A0b("non_privacy_filtered_mashups_media_count", num.intValue());
        }
        AnonymousClass5MC r2 = r5.A01;
        if (r2 != null) {
            mMp.A0U("original_media");
            mMp.A0J();
            String str2 = r2.A04;
            if (str2 != null) {
                mMp.A0d("formatted_mashups_count", str2);
            }
            Boolean bool2 = r2.A01;
            if (bool2 != null) {
                mMp.A0e("mashups_allowed", bool2.booleanValue());
            }
            String str3 = r2.A05;
            if (str3 != null) {
                mMp.A0d("media_type", str3);
            }
            Integer num2 = r2.A02;
            if (num2 != null) {
                mMp.A0b("non_privacy_filtered_mashups_media_count", num2.intValue());
            }
            mMp.A0d("pk", r2.A06);
            Integer num3 = r2.A03;
            if (num3 != null) {
                mMp.A0b("privacy_filtered_mashups_media_count", num3.intValue());
            }
            String str4 = r2.A07;
            if (str4 != null) {
                mMp.A0d("product_type", str4);
            }
            List list = r2.A08;
            if (list != null) {
                Iterator A0t = C18190wL.A0t(mMp, "sidecar_child_media_ids", list);
                while (A0t.hasNext()) {
                    C86134wK.A1K(mMp, A0t);
                }
                mMp.A0F();
            }
            User user = r2.A00;
            mMp.A0U("user");
            C19527Axo.A05(mMp, user);
            mMp.A0G();
        }
        Integer num4 = r5.A04;
        if (num4 != null) {
            mMp.A0b("privacy_filtered_mashups_media_count", num4.intValue());
        }
        mMp.A0G();
    }
}
