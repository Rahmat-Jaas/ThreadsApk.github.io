package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.1Y6  reason: invalid class name */
public final class AnonymousClass1Y6 extends C34640IcN {
    public static final String __redex_internal_original_name = "ConnectContactsFragment";
    public C82844qM A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "find_friends_addressbook";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        C82844qM r1;
        int A02 = C14030oh.A02(732374856);
        requireArguments();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C82844qM) {
            r1 = (C82844qM) requireActivity;
        } else {
            r1 = null;
        }
        this.A00 = r1;
        super.onCreate(bundle);
        C14030oh.A09(1406625270, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1592144017);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.connect_contacts_fragment, viewGroup, false);
        AnonymousClass0wJ.A16(AnonymousClass0wJ.A0K(inflate, R.id.skip_button), 602, this);
        AnonymousClass0wJ.A16(AnonymousClass0wJ.A0K(inflate, R.id.connect_contacts_sync_button), 603, this);
        String A0g = C18180wK.A0g(this, 2131829579);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, A0g, 2131824264));
        AnonymousClass3Zw.A02(A0E, this, A0g, 11);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.connect_contacts_footer);
        C18180wK.A0z(textView);
        textView.setText(A0E);
        AnonymousClass3YT.A00(AnonymousClass0wJ.A0U(this.A01), (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "find_friends_addressbook", (String) null);
        C14030oh.A09(-1991745452, A02);
        return inflate;
    }
}
