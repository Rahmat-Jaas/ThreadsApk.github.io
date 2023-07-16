package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.4Ls  reason: invalid class name and case insensitive filesystem */
public final class C72014Ls implements C21660By6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C25691of A01;
    public final /* synthetic */ User A02;

    public final void BuI() {
    }

    public C72014Ls(FragmentActivity fragmentActivity, C25691of r2, User user) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A02 = user;
    }

    public final void BuH() {
        FragmentActivity fragmentActivity = this.A00;
        C25745DrH A0b = C18220wO.A0b(fragmentActivity);
        if (A0b != null) {
            A0b.A09((C21660By6) null);
        }
        C25691of r1 = this.A01;
        String id = this.A02.getId();
        C04530Oa r5 = r1.A06;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        String A0q = C18200wM.A0q(r1.A01);
        AnonymousClass34H r3 = new AnonymousClass34H(r1);
        AnonymousClass0wJ.A1N(A0U, id);
        C04220Ms.A0B(A0q, 2);
        Bundle A06 = C18180wK.A06();
        C05050Qq.A00(A06, A0U);
        A06.putString("arg_key_creator_user_id", id);
        A06.putString("arg_key_thread_id", A0q);
        AnonymousClass1dU r2 = new AnonymousClass1dU();
        r2.setArguments(A06);
        r2.A01 = r3;
        C37032Jj9 A0L = C18210wN.A0L(AnonymousClass0wJ.A0U(r5));
        A0L.A0Y = true;
        A0L.A0J = r2;
        C18200wM.A16(fragmentActivity, r2, A0L);
    }
}
