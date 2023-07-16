package androidx.biometric;

import X.AnonymousClass099;
import X.AnonymousClass0wJ;
import X.AnonymousClass586;
import X.AnonymousClass7IU;
import X.C109576kE;
import X.C135027yl;
import X.C14030oh;
import X.C18180wK;
import X.C41026Luf;
import X.C86104wH;
import X.C86154wM;
import X.C880856r;
import X.L7u;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

public final class FingerprintDialogFragment extends AnonymousClass099 {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public AnonymousClass586 A04;
    public final Handler A05 = AnonymousClass0wJ.A0F();
    public final Runnable A06 = new C135027yl(this);

    private int A00(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(C86104wH.A0G(context, i).data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final Dialog A0C(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        C41026Luf luf = new C41026Luf(requireContext());
        C109576kE r0 = this.A04.A06;
        if (r0 != null) {
            charSequence = r0.A03;
        } else {
            charSequence = null;
        }
        luf.A08(charSequence);
        View inflate = LayoutInflater.from(luf.A01.A0L).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView A0G = C18180wK.A0G(inflate, R.id.fingerprint_subtitle);
        if (A0G != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                A0G.setVisibility(8);
            } else {
                A0G.setVisibility(0);
                A0G.setText((CharSequence) null);
            }
        }
        TextView A0G2 = C18180wK.A0G(inflate, R.id.fingerprint_description);
        if (A0G2 != null) {
            C109576kE r02 = this.A04.A06;
            if (r02 != null) {
                charSequence3 = r02.A01;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                A0G2.setVisibility(8);
            } else {
                A0G2.setVisibility(0);
                A0G2.setText(charSequence3);
            }
        }
        this.A02 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.A03 = C18180wK.A0G(inflate, R.id.fingerprint_error);
        AnonymousClass586 r2 = this.A04;
        if ((r2.A01() & 32768) != 0) {
            charSequence2 = getString(2131824239);
        } else {
            charSequence2 = r2.A0G;
            if (charSequence2 == null) {
                C109576kE r03 = r2.A06;
                if (r03 != null) {
                    charSequence2 = r03.A02;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                } else {
                    charSequence2 = null;
                }
            }
        }
        luf.A04(C86154wM.A0N(this, 0), charSequence2);
        luf.A07(inflate);
        L7u A002 = luf.A00();
        A002.setCanceledOnTouchOutside(false);
        return A002;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass586 r2 = this.A04;
        C880856r r1 = r2.A0E;
        if (r1 == null) {
            r1 = C880856r.A03();
            r2.A0E = r1;
        }
        AnonymousClass586.A00(r1, true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1792436741);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass586 r0 = (AnonymousClass586) new AnonymousClass7IU(activity).A01(AnonymousClass586.class);
            this.A04 = r0;
            C880856r r1 = r0.A0C;
            if (r1 == null) {
                r1 = C880856r.A03();
                r0.A0C = r1;
            }
            C86104wH.A1F(this, r1, 6);
            AnonymousClass586 r02 = this.A04;
            C880856r r12 = r02.A0B;
            if (r12 == null) {
                r12 = C880856r.A03();
                r02.A0B = r12;
            }
            C86104wH.A1F(this, r12, 7);
        }
        this.A00 = A00(R.attr.colorError);
        this.A01 = A00(16842808);
        C14030oh.A09(-1212182408, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-227822491);
        super.onPause();
        this.A05.removeCallbacksAndMessages((Object) null);
        C14030oh.A09(1872654175, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-267701365);
        super.onResume();
        AnonymousClass586 r1 = this.A04;
        r1.A01 = 0;
        r1.A02(1);
        this.A04.A03(getString(2131827508));
        C14030oh.A09(2131559532, A022);
    }
}
