package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape5S1300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.1dU  reason: invalid class name */
public final class AnonymousClass1dU extends C34640IcN implements C21659By5 {
    public static final String __redex_internal_original_name = "BroadcastFollowStepBottomSheetFragment";
    public AnonymousClass49Y A00;
    public AnonymousClass34H A01;
    public boolean A02;
    public String A03;
    public final C04530Oa A04 = C80644m9.A00(this);

    public final void Bmo() {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C25550Dnj A002 = AnonymousClass6VR.A00(AnonymousClass0wJ.A0X(this.A04));
        String string = requireArguments().getString("arg_key_creator_user_id");
        String string2 = requireArguments().getString("arg_key_creator_user_id");
        User A032 = A002.A03(string);
        if (A032 != null) {
            View A0K = AnonymousClass0wJ.A0K(view, R.id.follow_sheet_button);
            C18220wO.A1L(this, (IgImageView) AnonymousClass0wJ.A0J(view, R.id.follow_sheet_avatar), A032);
            ((TextView) AnonymousClass0wJ.A0J(view, R.id.follow_sheet_title)).setText(AnonymousClass0wJ.A0o(this, A032.BK7(), 2131822656));
            ((TextView) AnonymousClass0wJ.A0J(view, R.id.follow_sheet_subtitle)).setText(AnonymousClass0wJ.A0o(this, A032.BK7(), 2131822655));
            A0K.setOnClickListener(new IDxCListenerShape5S1300000_1_I2(A032, A0K, this, string2, 2));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void Bmq() {
        String str;
        boolean z = this.A02;
        if (!z) {
            AnonymousClass49Y r3 = this.A00;
            if (r3 == null) {
                str = "broadcastLogger";
            } else {
                C307522u r1 = C307522u.UNSPECIFIED;
                String str2 = this.A03;
                if (str2 == null) {
                    str = "threadId";
                } else {
                    r3.A07(r1, str2, 0, z);
                    return;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1432256371);
        super.onCreate(bundle);
        String string = requireArguments().getString("arg_key_creator_user_id");
        if (string != null) {
            this.A03 = string;
            this.A00 = AnonymousClass3Zh.A01(AnonymousClass0wJ.A0X(this.A04));
            C14030oh.A09(-444886494, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-1981117614, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1164867906);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.broadcast_follow_step_fragment, viewGroup, false);
        C14030oh.A09(-379269237, A022);
        return inflate;
    }
}
