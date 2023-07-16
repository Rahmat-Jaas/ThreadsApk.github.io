package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.Iterator;

/* renamed from: X.1Y9  reason: invalid class name */
public final class AnonymousClass1Y9 extends C34640IcN {
    public static final String __redex_internal_original_name = "AutoConfBottomSheetFragment";
    public String A00;
    public String A01;
    public final C04530Oa A02 = C18190wL.A0x(this, 40);

    public final String getModuleName() {
        return "auto_conf_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-723194285);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.auto_conf_bottom_sheet_fragment, viewGroup, false);
        String string = requireArguments().getString("AUTO_CONF_SCREEN_TYPE", (String) null);
        if (string != null) {
            this.A00 = string;
            C04220Ms.A06(inflate);
            ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.bottom_sheet_text_list);
            String str = this.A00;
            String str2 = "autoConfScreenType";
            if (str != null) {
                if (str.equals("OPT_OUT")) {
                    this.A01 = C18180wK.A0g(this, 2131821661);
                    i = 2131821662;
                } else {
                    int i2 = 2131821649;
                    if (str.equals("CONSENT")) {
                        i2 = 2131821650;
                    }
                    this.A01 = C18180wK.A0g(this, i2);
                    i = 2131821648;
                }
                String A0g = C18180wK.A0g(this, i);
                String str3 = this.A01;
                if (str3 == null) {
                    str2 = "descriptionParagraph1";
                } else {
                    Iterator it = C06750aI.A17(str3, A0g).iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        View A0D = C18180wK.A0D(layoutInflater, viewGroup2, R.layout.auto_conf_bulleted_list, false);
                        View findViewById = A0D.findViewById(R.id.description_text);
                        if (findViewById != null) {
                            ((TextView) findViewById).setText(C16370sw.A03(A0k));
                            viewGroup2.addView(A0D);
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                    C14030oh.A09(1636072094, A022);
                    return inflate;
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1397608471, A022);
        throw A0b;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1988305982);
        super.onResume();
        C14030oh.A09(1300166305, A022);
    }
}
