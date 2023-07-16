package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Ow  reason: invalid class name and case insensitive filesystem */
public final class C100846Ow {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        C171759zv r2;
        AnonymousClass601 r1 = r19;
        C63893iY r0 = r20;
        boolean A1Y = AnonymousClass0wJ.A1Y(r0, r1);
        C127397h3 A03 = C63893iY.A03(r0, A1Y ? 1 : 0);
        String A0F = C127397h3.A0F(A03, "", 43);
        String A0F2 = C127397h3.A0F(A03, "", 45);
        String A0O = A03.A0O(46, (String) null);
        int A0H = A03.A0H(44, A1Y);
        boolean A1X = C86144wL.A1X(A03.A0O(35, ""), "ENABLED");
        int i = A1X ? 1 : 0;
        PromptStickerModel promptStickerModel = new PromptStickerModel((User) null, (Integer) null, A0F2, A0F, A0O, A03.A0O(140, (String) null), (List) null, A0H, i, 2091784, AnonymousClass2LL.A00(C127397h3.A0A(A03, 38), A1Y), AnonymousClass2LL.A00(C127397h3.A0A(A03, 40), A1Y), A1Y, AnonymousClass2LL.A00(C127397h3.A0A(A03, 42), A1Y), A1Y, A1Y);
        if (promptStickerModel.A02 == 0) {
            C10300i6 A0F3 = C63913ic.A0F(r1);
            C18200wM.A1R(A0F3);
            FragmentActivity A05 = C63913ic.A05(r1);
            Class<ModalActivity> cls = ModalActivity.class;
            AnonymousClass3LM.A01();
            if (promptStickerModel.A08) {
                r2 = C171759zv.A0C;
            } else {
                r2 = C171759zv.A08;
            }
            C04220Ms.A0B(r2, 2);
            Bundle A06 = C18180wK.A06();
            A06.putString("arg_media_id", A0F);
            A06.putParcelable(AnonymousClass000.A00(HttpStatus.SC_NOT_MODIFIED), promptStickerModel.A00);
            A06.putSerializable(AnonymousClass000.A00(HttpStatus.SC_SEE_OTHER), r2);
            new C63863iT(A05, A06, A0F3, cls, AnonymousClass000.A00(319)).A0I(A05);
        }
        return null;
    }
}
