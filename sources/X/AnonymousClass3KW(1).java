package X;

import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.3KW  reason: invalid class name */
public final class AnonymousClass3KW {
    public static StoryGroupMentionTappableData parseFromJson(MMo mMo) {
        return (StoryGroupMentionTappableData) AnonymousClass0wJ.A0f(mMo, 188);
    }

    public static void A00(MMp mMp, StoryGroupMentionTappableData storyGroupMentionTappableData) {
        mMp.A0J();
        String str = storyGroupMentionTappableData.A01;
        if (str != null) {
            mMp.A0d("custom_text_color", str);
        }
        mMp.A0d("id", storyGroupMentionTappableData.A02);
        Iterator A0t = C18190wL.A0t(mMp, "mentioned_users", storyGroupMentionTappableData.A04);
        while (A0t.hasNext()) {
            User A0c = C18220wO.A0c(A0t);
            if (A0c != null) {
                C19527Axo.A05(mMp, A0c);
            }
        }
        mMp.A0F();
        Integer num = storyGroupMentionTappableData.A00;
        if (num != null) {
            mMp.A0b("sticker_style_enum", num.intValue());
        }
        String str2 = storyGroupMentionTappableData.A03;
        if (str2 != null) {
            mMp.A0d("text", str2);
        }
        mMp.A0G();
    }
}
