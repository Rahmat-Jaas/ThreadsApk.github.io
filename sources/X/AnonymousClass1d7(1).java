package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.Locale;

/* renamed from: X.1d7  reason: invalid class name */
public final class AnonymousClass1d7 extends C34640IcN implements C34 {
    public static final String __redex_internal_original_name = "GalleryGridFormatAttributionSheetFragment";
    public String A00;
    public String A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Resources resources = requireContext.getResources();
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.action_sheet_header_text_view);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.action_sheet_row_text_view);
        C18180wK.A0r(requireContext, (ImageView) AnonymousClass0wJ.A0J(view, R.id.action_sheet_header_picture), R.drawable.ig_illustrations_illo_supersync_attribution);
        textView.setText(new SpannableString(resources.getString(2131827838)));
        textView.setTypeface((Typeface) null, 1);
        String string = resources.getString(2131821574);
        string.getClass();
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.action_sheet_subheader_text_view)).setText(String.format((Locale) null, string, new Object[]{resources.getString(R.string.f0nameremoved)}));
        C18210wN.A0y(A0K);
        AnonymousClass0wJ.A17(A0K, 64, this);
    }

    public final Integer B6F() {
        return AnonymousClass006.A15;
    }

    public final String getModuleName() {
        String str = this.A01;
        if (str != null) {
            return ACE.A00(this, str);
        }
        C04220Ms.A0E("previousModuleName");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(623313842);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_previous_module_name");
        if (string != null) {
            this.A01 = string;
            String string2 = requireArguments.getString(C28174Ezk.A00(112));
            if (string2 != null) {
                this.A00 = string2;
                C14030oh.A09(-1665825710, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1728372683;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1074644332;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-992491445);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.capture_format_attribution_sheet_fragment, false);
        C14030oh.A09(146872188, A022);
        return A0D;
    }
}
