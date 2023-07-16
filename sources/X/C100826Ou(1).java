package X;

import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.6Ou  reason: invalid class name and case insensitive filesystem */
public final class C100826Ou {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        C63893iY r0 = r16;
        AnonymousClass601 r1 = r15;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r15);
        String A0D = C63893iY.A0D(r0, A1Z ? 1 : 0);
        FragmentActivity A05 = C63913ic.A05(r15);
        UserSession A0Y = C86104wH.A0Y(r15);
        User A0Y2 = AnonymousClass0wJ.A0Y(A0Y);
        if (A0Y2.A0A() == null) {
            A0Y2.A1k(new AnonymousClass5KP(ActionButtonPartnerType.SMB, "0", (String) null, "", SMBPartnerType.GET_QUOTE.A00, (String) null, AnonymousClass000.A00(655), ""));
            C18210wN.A1J(A0Y, A0Y2);
        }
        Locale locale = Locale.ROOT;
        String A0r = C18190wL.A0r(locale, A0D);
        if (A0r.equals(C18190wL.A0r(locale, "STICKER"))) {
            A05.finish();
            return null;
        }
        if (A0r.equals(C18190wL.A0r(locale, "PROFILE"))) {
            C12560m7 A07 = C63913ic.A07(r1);
            if (A07 == null || A07.A0I() <= 0 || A07.A0F) {
                A05.onBackPressed();
            } else {
                A07.A0d();
            }
            C04220Ms.A0B(A05, 0);
            C04220Ms.A0B(A0Y, A1Z);
            if (C121527Go.A01(A05)) {
                C18180wK.A0Q(A05, A0Y).A0D(SupportLinksFragment.A06, A1Z);
                C63813iO.A02(A05, C25795Ds9.A01(A05, AnonymousClass0wJ.A0k(A05, 2131829527)), (String) null, 0);
                return null;
            }
        } else if (!A0r.equals(C18190wL.A0r(locale, "FLAGGED_FORM"))) {
            return null;
        }
        C04220Ms.A0B(A05, 0);
        C10650ih.A02(A05, C62333Yi.A00(A05));
        SpannableStringBuilder A01 = C25795Ds9.A01(A05, AnonymousClass0wJ.A0k(A05, 2131829527));
        C63733iD r02 = new C63733iD();
        r02.A0A = A01;
        C63733iD.A0A(r02);
        return null;
    }
}
