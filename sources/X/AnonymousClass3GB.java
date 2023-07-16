package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2;
import com.facebook.redex.IDxEListenerShape509S0100000_1_I2;
import com.facebook.redex.IDxProviderShape104S0200000_1_I2;
import com.facebook.redex.IDxProviderShape244S0100000_1_I2;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.3GB  reason: invalid class name */
public final class AnonymousClass3GB {
    public final FragmentActivity A00;
    public final GX6 A01;
    public final C684643x A02;
    public final AnonymousClass37O A03;
    public final EditAvatarProfilePictureRepository A04;
    public final EA4 A05;
    public final UserSession A06;
    public final C04560Oe A07;
    public final C04560Oe A08;
    public final C83224qz A09;

    public final M5J A00(AnonymousClass24Z r10) {
        C04220Ms.A0B(r10, 0);
        GX6 gx6 = this.A01;
        if (gx6.A02()) {
            C100976Pk r1 = (C100976Pk) this.A04.A0F.getValue();
            if ((r1 instanceof AnonymousClass5z2) && ((KtCSuperShape0S0020000_I2) ((AnonymousClass5z2) r1).A00).A00) {
                this.A03.A00.markerStart(1049695352);
                this.A08.get();
                C60113Ns.A00();
                throw null;
            }
        }
        if (!gx6.A02()) {
            return null;
        }
        UserSession userSession = this.A06;
        AnonymousClass30L.A00.A00(this.A00, new IDxEListenerShape509S0100000_1_I2(this, 0), userSession, "ig_edit_profile", "ig_edit_profile_picture", (String) null, (List) null, false);
        return C29110FiC.A00((C27952Ew2) null, this.A04.A0E, 3);
    }

    public /* synthetic */ AnonymousClass3GB(FragmentActivity fragmentActivity, UserSession userSession) {
        GX6 gx6 = new GX6(userSession);
        EditAvatarProfilePictureRepository editAvatarProfilePictureRepository = (EditAvatarProfilePictureRepository) userSession.A01(EditAvatarProfilePictureRepository.class, new KtLambdaShape29S0100000_I2_9(userSession, 17));
        C684643x r6 = (C684643x) userSession.A01(C684643x.class, new KtLambdaShape29S0100000_I2_9(userSession, 18));
        AnonymousClass37O r5 = new AnonymousClass37O(userSession);
        EA4 A002 = C100026Lr.A00(userSession);
        IDxProviderShape104S0200000_1_I2 iDxProviderShape104S0200000_1_I2 = new IDxProviderShape104S0200000_1_I2(1, fragmentActivity, userSession);
        IDxProviderShape244S0100000_1_I2 iDxProviderShape244S0100000_1_I2 = new IDxProviderShape244S0100000_1_I2(userSession, 1);
        C83224qz A032 = AnonymousClass7Ja.A03(C25235DiG.A01(C18250wR.A0J((AnonymousClass0gW) null, 3).A03, new AnonymousClass8bb((C148838sG) null)));
        C04220Ms.A0B(editAvatarProfilePictureRepository, 6);
        C18240wQ.A1J(r6, 7, A002);
        this.A00 = fragmentActivity;
        this.A06 = userSession;
        this.A01 = gx6;
        this.A04 = editAvatarProfilePictureRepository;
        this.A02 = r6;
        this.A03 = r5;
        this.A05 = A002;
        this.A08 = iDxProviderShape104S0200000_1_I2;
        this.A07 = iDxProviderShape244S0100000_1_I2;
        this.A09 = A032;
    }
}
