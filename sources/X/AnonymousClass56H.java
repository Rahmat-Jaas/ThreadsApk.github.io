package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.IDxSListenerShape59S0100000_2_I2;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.56H  reason: invalid class name */
public class AnonymousClass56H extends Fragment implements C143648h5, C143618h2, C143678h8 {
    public static final SparseArray A06;
    public Dialog A00;
    public Context A01;
    public View A02;
    public AnonymousClass5A9 A03;
    public C882957m A04;
    public boolean A05;

    public final C113986sV BH4() {
        boolean z;
        String str;
        if (this.A04.A01() != 0) {
            z = true;
            str = requireContext().getString(this.A04.A01());
        } else {
            z = false;
            str = null;
        }
        if (this.A04 instanceof C92865jz) {
            AnonymousClass7Kz.A0K().A08();
        }
        return new C113986sV((Drawable) null, (View.OnClickListener) null, (String) null, str, 0, 0, false, false, z);
    }

    public void A00() {
        M5J m5j;
        C882957m r1 = this.A04;
        if (r1 instanceof C92815ju) {
            m5j = ((C92815ju) r1).A01;
        } else if (r1 instanceof C92845jx) {
            m5j = ((C92845jx) r1).A04;
        } else if (r1 instanceof C92865jz) {
            m5j = ((C92865jz) r1).A06;
        } else if (r1 instanceof C92765jp) {
            m5j = ((C92765jp) r1).A01;
        } else if (r1 instanceof C92835jw) {
            m5j = ((C92835jw) r1).A01;
        } else if (r1 instanceof C92855jy) {
            m5j = ((C92855jy) r1).A03;
        } else if (r1 instanceof C92825jv) {
            m5j = ((C92825jv) r1).A03;
        } else if (r1 instanceof C92775jq) {
            m5j = ((C92775jq) r1).A01;
        } else if (r1 instanceof C92795js) {
            m5j = ((C92795js) r1).A01;
        } else if (r1 instanceof C92785jr) {
            m5j = ((C92785jr) r1).A01;
        } else if (r1 instanceof AnonymousClass5k0) {
            m5j = ((AnonymousClass5k0) r1).A02;
        } else {
            m5j = ((C92805jt) r1).A02;
        }
        C86104wH.A1F(this, m5j, 257);
        if (!this.A05) {
            C86104wH.A1F(this, this.A04.A03, 258);
        }
        C86104wH.A1F(this, this.A04.A06, 259);
        C86104wH.A1F(this, this.A04.A07, 260);
        C86104wH.A1F(this, this.A04.A09, 261);
        C86104wH.A1F(this, this.A04.A05, 262);
        C86104wH.A1F(this, this.A04.A04, 263);
        C86114wI.A1A(this, this.A04.A0A, C86114wI.A0Q(this, 264), 275);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r3.mParentFragment == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.mArguments
            r1.getClass()
            java.lang.String r0 = "viewmodel_class"
            java.io.Serializable r2 = r1.getSerializable(r0)
            r2.getClass()
            java.lang.Class r2 = (java.lang.Class) r2
            android.os.Bundle r1 = r3.mArguments
            java.lang.String r0 = "has_container_fragment"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x001f
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r3.A05 = r0
            if (r0 == 0) goto L_0x0043
            androidx.fragment.app.Fragment r0 = r3.requireParentFragment()
        L_0x0028:
            X.7IU r0 = X.C121817Ig.A00(r0)
            X.3ak r1 = r0.A01(r2)
            boolean r0 = r1 instanceof X.C882957m
            X.AnonymousClass7Ko.A0B(r0)
            X.57m r1 = (X.C882957m) r1
            r3.A04 = r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0042
            android.os.Bundle r0 = r3.mArguments
            r1.A03(r0)
        L_0x0042:
            return
        L_0x0043:
            r0 = r3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56H.A01():void");
    }

    public boolean Bzy(Bundle bundle, int i, boolean z) {
        return this.A04.A02(bundle, i, z);
    }

    public final boolean onBackPressed() {
        C882957m r1 = this.A04;
        if (!(r1 instanceof C92825jv)) {
            return false;
        }
        C92825jv r12 = (C92825jv) r1;
        Map A062 = C122037Js.A06(r12.A02);
        C86164wN.A1J(AnonymousClass0wJ.A0d(r12.A01.A00), A062);
        r12.A05.Bb8("fbpay_edit_paypal_cancel", A062);
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.A03 = new AnonymousClass5A9(A06);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.list);
        recyclerView.setAdapter(this.A03);
        C18190wL.A1D(recyclerView);
        recyclerView.setOverScrollMode(2);
        recyclerView.A11(new IDxSListenerShape59S0100000_2_I2(this, 1));
        this.A02 = view.requireViewById(R.id.progress_bar);
        A00();
    }

    static {
        SparseArray A0D = C86154wM.A0D();
        A06 = A0D;
        AnonymousClass7Kz.A0K();
        A0D.put(0, new C128787kN(new C128807kP(), 2131886679));
        AnonymousClass7Kz.A0K();
        A0D.put(1, new AnonymousClass7kM(R.style.Ig4aFbPay));
        AnonymousClass7Kz.A0K();
        A0D.put(14, new AnonymousClass7kM(2131886673));
        AnonymousClass7Kz.A0K();
        A0D.put(15, new AnonymousClass7kM(2131886671));
        A0D.put(2, new C128797kO());
        AnonymousClass7Kz.A0K();
        A0D.put(12, new C128797kO(2131886680));
        AnonymousClass7Kz.A0K();
        A0D.put(13, new C128797kO(2131886681));
        A0D.put(3, new C128767kK());
        A0D.put(9, new C128747kH());
        AnonymousClass7Kz.A0K();
        A0D.put(10, new C128777kL(2131886674));
        AnonymousClass7Kz.A0K();
        A0D.put(11, new C128777kL(2131886675));
        AnonymousClass7Kz.A0K();
        A0D.put(4, new C128787kN(new C128807kP(), 2131886678));
        A0D.put(5, new AnonymousClass7kJ());
        A0D.put(7, new C128757kI());
        AnonymousClass7Kz.A0K();
        A0D.put(6, new C128787kN(new C128827kR(), 2131886682));
        AnonymousClass7Kz.A0K();
        A0D.put(8, new C128787kN(new C128817kQ(), 2131886683));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        C882957m r2 = this.A04;
        boolean A1T = AnonymousClass0wJ.A1T(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        r2.A02(extras, i, A1T);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(620876420);
        super.onCreate(bundle);
        A01();
        if (bundle == null) {
            C882957m r1 = this.A04;
            if (r1 instanceof C92865jz) {
                C92865jz r12 = (C92865jz) r1;
                if (!r12.A04) {
                    r12.A09.Bb8("client_load_paymentactivity_init", C122037Js.A06(r12.A02));
                }
            }
        }
        C14030oh.A09(-714945341, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1227001454);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0K();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A01 = contextThemeWrapper;
        View A0H = AnonymousClass0wJ.A0H(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_section);
        C14030oh.A09(-678201396, A022);
        return A0H;
    }

    public void onDestroyView() {
        int A022 = C14030oh.A02(1640811665);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C882957m r1 = this.A04;
        if (r1 instanceof C92845jx) {
            C92845jx r12 = (C92845jx) r1;
            if (!r12.A03) {
                C92845jx.A00(r12);
            }
        }
        C14030oh.A09(-249630717, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1006619521);
        super.onResume();
        C882957m r7 = this.A04;
        if (r7 instanceof C92865jz) {
            C92865jz r72 = (C92865jz) r7;
            C880756q r6 = r72.A07;
            C107396gg r4 = r72.A08;
            boolean z = r72.A04;
            C880856r.A05(AnonymousClass5k7.A00(new AnonymousClass7SJ(r4, (String) null, z), r4.A00), r6, r72, 268);
        } else if (r7 instanceof C92785jr) {
            C109796kd r42 = ((C92785jr) r7).A02;
            C880856r.A05(AnonymousClass5k7.A00(new IDxFunctionShape326S0100000_2_I2((Object) r42, 42), r42.A02), r42.A01, r42, 220);
        } else if (r7 instanceof AnonymousClass5k0) {
            C109796kd r43 = ((AnonymousClass5k0) r7).A00;
            C880856r.A05(AnonymousClass5k7.A00(new IDxFunctionShape326S0100000_2_I2((Object) r43, 41), r43.A02), r43.A00, r43, 219);
        } else if (r7 instanceof C92805jt) {
            C108916jA r44 = ((C92805jt) r7).A03;
            C880856r.A05(AnonymousClass5k7.A00(new IDxFunctionShape326S0100000_2_I2((Object) r44, 40), r44.A01), r44.A00, r44, 217);
        }
        C14030oh.A09(717294946, A022);
    }
}
