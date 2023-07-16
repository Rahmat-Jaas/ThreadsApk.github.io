package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;

/* renamed from: X.1bU  reason: invalid class name */
public final class AnonymousClass1bU extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "InauthenticActivityFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "inauthentic_activity";
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 12 && i2 == -1) {
            C18190wL.A1A(this);
            C63813iO.A00(getContext(), 2131823209);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.Cqb(2131829010);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-573060630);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1710970849, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1582808076);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.challenge_inauthentic_activity_layout);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.inauthentic_activity_paragraph);
        String string = getString(2131824226);
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, C121907Is.A00(getContext(), R.attr.textColorRegularLink), 9);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, string, 2131829011));
        AnonymousClass3Zw.A01(A0E, A002, string);
        C18180wK.A0z(A0L);
        A0L.setText(A0E);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(A0H, R.id.inauthentic_activity_bottom_buttons);
        A0W.setPrimaryAction(AnonymousClass0wJ.A0B(this).getString(2131823209), C18190wL.A0H(this, 222));
        A0W.setSecondaryAction(getString(2131830113), C18190wL.A0H(this, 223));
        C14030oh.A09(153059521, A02);
        return A0H;
    }
}
