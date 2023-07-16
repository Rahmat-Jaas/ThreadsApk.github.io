package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1YA  reason: invalid class name */
public final class AnonymousClass1YA extends C34640IcN {
    public static final String __redex_internal_original_name = "RollCallNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "roll_call_nux";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1025590683);
        super.onCreate(bundle);
        requireArguments();
        C14030oh.A09(-919988587, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-1192965833);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_rollcall_nux_bottomsheet, viewGroup, false);
        if (inflate != null) {
            Context context = getContext();
            if (context != null) {
                C18190wL.A18(inflate, R.id.rollcall_nux_icon, 0);
                C18200wM.A15(context, AnonymousClass0wJ.A0L(inflate, R.id.rollcall_nux_header_text), 2131835008);
                C18200wM.A15(context, AnonymousClass0wJ.A0L(inflate, R.id.rollcall_nux_body_text), 2131835007);
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener != null) {
                    AnonymousClass0wJ.A0K(inflate, R.id.rollcall_nux_try_it_button).setOnClickListener(onClickListener);
                }
                View.OnClickListener onClickListener2 = this.A01;
                if (onClickListener2 != null) {
                    AnonymousClass0wJ.A0K(inflate, R.id.rollcall_nux_learn_more_button).setOnClickListener(onClickListener2);
                }
                C14030oh.A09(1666768178, A022);
                return inflate;
            }
            illegalStateException = C18180wK.A0a("Cannot find context");
            i = 1279427548;
        } else {
            illegalStateException = C18180wK.A0a("Root View Not initialized");
            i = -1329579458;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }
}
