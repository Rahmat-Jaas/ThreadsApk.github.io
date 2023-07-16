package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2zN  reason: invalid class name and case insensitive filesystem */
public final class C54392zN {
    public static void A00(Map map) {
        String A0h = C18200wM.A0h(C18200wM.A0C(), "live_chat_nonce");
        if (A0h != null && A0h.length() != 0) {
            C39237Kq4 kq4 = C36975Ji8.A03;
            Iterator it = ((LiveChatNonceList) C18240wQ.A0a(LiveChatNonceList.class, A0h, kq4, kq4.A02)).A00.iterator();
            while (it.hasNext()) {
                LiveChatNonce liveChatNonce = (LiveChatNonce) it.next();
                map.put(liveChatNonce.A02, liveChatNonce);
            }
        }
    }
}
