package X;

import com.instagram.clips.model.metadata.ClipsFanClubMetadata;

/* renamed from: X.3LN  reason: invalid class name */
public final class AnonymousClass3LN {
    public static ClipsFanClubMetadata parseFromJson(MMo mMo) {
        return (ClipsFanClubMetadata) AnonymousClass0wJ.A0e(mMo, 83);
    }

    public static void A00(MMp mMp, ClipsFanClubMetadata clipsFanClubMetadata) {
        mMp.A0J();
        mMp.A0d("fan_club_id", clipsFanClubMetadata.A01);
        mMp.A0d("video_type", clipsFanClubMetadata.A00.A00);
        mMp.A0G();
    }
}
