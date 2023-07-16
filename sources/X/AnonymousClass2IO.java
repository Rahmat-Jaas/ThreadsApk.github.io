package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

/* renamed from: X.2IO  reason: invalid class name */
public final class AnonymousClass2IO {
    public static final Object A00(AnonymousClass601 r6) {
        C04220Ms.A0B(r6, 1);
        FragmentActivity A05 = C63913ic.A05(r6);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        C18190wL.A10();
        DirectMessagesOptionsFragment directMessagesOptionsFragment = new DirectMessagesOptionsFragment();
        Bundle bundle = directMessagesOptionsFragment.mArguments;
        if (bundle == null) {
            bundle = C18180wK.A06();
        }
        bundle.putString("entry_point", "ig_settings");
        bundle.putSerializable("reachability_settings_upsell", AnonymousClass282.PRIVACY_SETTINGS);
        directMessagesOptionsFragment.setArguments(bundle);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(A05, A0F);
        A0Q.A03 = directMessagesOptionsFragment;
        A0Q.A05();
        return null;
    }
}
