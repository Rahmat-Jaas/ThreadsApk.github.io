package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.7CY  reason: invalid class name */
public final class AnonymousClass7CY {
    public static final /* synthetic */ AnonymousClass7CY A00 = new AnonymousClass7CY();

    public static final C147068nL A00(BKU bku) {
        List list;
        C147068nL r0;
        if (bku.A44()) {
            BKN bkn = bku.A0f;
            String str = bkn.A4Y;
            C04220Ms.A06(str);
            int A1j = bku.A1j();
            int A1i = bku.A1i();
            String str2 = bkn.A46;
            C36483JXj BL2 = bku.BL2();
            C04220Ms.A06(BL2);
            r0 = new C90375Lt(bku.A22(), BL2, str, str2, A1j, A1i);
        } else {
            ImageInfo A2K = bku.A2K();
            if (A2K == null || (list = A2K.A05) == null || list.isEmpty()) {
                return null;
            }
            BKN bkn2 = bku.A0f;
            String str3 = bkn2.A4Y;
            C04220Ms.A06(str3);
            r0 = new C90365Ls(str3, bkn2.A46, list, bku.A1j(), bku.A1i());
        }
        return r0;
    }
}
