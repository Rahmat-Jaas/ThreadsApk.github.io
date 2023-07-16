package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.1Xi  reason: invalid class name */
public final class AnonymousClass1Xi extends C34640IcN {
    public static final String __redex_internal_original_name = "EncryptedBackupsCardEducationFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "encrypted_backups_card_education";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(543789287);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_card_education_layout, viewGroup, false);
        ((IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.bottom_buttons)).setPrimaryActionOnClickListener(C18190wL.A0H(this, 324));
        C14030oh.A09(383666751, A02);
        return inflate;
    }
}
