package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.service.session.UserSession;

/* renamed from: X.2TD  reason: invalid class name */
public final class AnonymousClass2TD {
    public static final void A00(FragmentActivity fragmentActivity, C18068AYk aYk, UserSession userSession, String str, String str2, AnonymousClass0ZU r15, boolean z) {
        C307522u r1;
        UserSession userSession2 = userSession;
        int A02 = C18200wM.A02(1, userSession, str);
        String str3 = str2;
        C04220Ms.A0B(str2, 3);
        ChatStickerStickerType chatStickerStickerType = ChatStickerStickerType.JOIN_CHAT_STICKER;
        C04220Ms.A0B(chatStickerStickerType, A02);
        Bundle A06 = C18180wK.A06();
        A06.putString("GroupPreviewFragment.STORY_ID_KEY", str);
        int ordinal = chatStickerStickerType.ordinal();
        boolean z2 = z;
        if (ordinal != A02) {
            if (ordinal != 3) {
                r1 = C307522u.UNSPECIFIED;
            } else {
                r1 = C307522u.MESSAGE_SHARE_STICKER;
            }
        } else if (z) {
            r1 = C307522u.CLIPS_CHAT_STICKER;
        } else {
            r1 = C307522u.CHAT_STICKER;
        }
        A06.putSerializable("GroupPreviewFragment.JOINING_SURFACE", r1);
        A06.putString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE", str2);
        AnonymousClass1dV r0 = new AnonymousClass1dV();
        r0.setArguments(A06);
        r0.A09 = null;
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0J = r0;
        C37383Jqm A00 = A0L.A00();
        r0.A08 = new C19951BHj(A00, A0L, aYk, userSession2, str3, r15, z2);
        C37383Jqm.A00(fragmentActivity, r0, A00);
    }
}
