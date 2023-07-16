package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape1S1310000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1aS  reason: invalid class name */
public final class AnonymousClass1aS extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "MultipleAccountRecoveryFragment";
    public C70224Dh A00;
    public AnonymousClass1fM A01;
    public C07530bf A02;
    public String A03;
    public String A04;
    public List A05;
    public AnonymousClass3V1 A06;
    public ProgressButton A07;
    public String A08;
    public List A09;

    public static void A00(DialogInterface.OnDismissListener onDismissListener, AnonymousClass1aS r11, UserSession userSession, String str, String str2, boolean z) {
        AnonymousClass1aS r4 = r11;
        FragmentActivity activity = r11.getActivity();
        if (activity != null) {
            Integer num = AnonymousClass006.A05;
            C25828Dsm A0W = C18190wL.A0W(activity);
            A0W.A0L(2131834566);
            Resources resources = activity.getResources();
            int i = 2131834565;
            boolean z2 = z;
            if (z) {
                i = 2131834563;
            }
            A0W.A0p(C18220wO.A0i(resources, str, i));
            A0W.A0P(new IDxCListenerShape1S1310000_1_I2(r4, userSession, num, str2, 0, z2), 2131834557);
            A0W.A0O((DialogInterface.OnClickListener) null, 2131831869);
            A0W.A0e(onDismissListener);
            A0W.A0I(R.drawable.instagram_lock_outline_96);
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public final void A03(C72144Mm r13) {
        Context requireContext = requireContext();
        C07530bf r0 = this.A02;
        String str = this.A03;
        String A012 = r13.A01();
        String str2 = this.A04;
        H1T A0N = AnonymousClass0wJ.A0N(r0);
        A0N.A0J("accounts/account_recovery_nonce_login/");
        C63213h0.A04(A0N, C09140ev.A00(requireContext));
        A0N.A0O("login_nonce", str);
        C18250wR.A17(A0N, A012);
        A0N.A0O("recovery_handle_type", str2);
        C32165H8c A0S = C18180wK.A0S(A0N);
        A0S.A00 = new C26671r1(this, this, this.A00, this, this.A02, AnonymousClass265.A0v);
        schedule(A0S);
    }

    public final String getModuleName() {
        return "multiple_account_recovery";
    }

    public static void A01(AnonymousClass1aS r8) {
        int i;
        String[] strArr;
        String num;
        ProgressButton progressButton;
        int i2;
        AnonymousClass1fM r3 = r8.A01;
        r3.getClass();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : r3.A07) {
            if (r3.A03.contains(next)) {
                A0v.add(next);
            }
        }
        int size = A0v.size() + ImmutableList.copyOf((Collection) r8.A01.A06).size();
        ProgressButton progressButton2 = r8.A07;
        progressButton2.getClass();
        progressButton2.setEnabled(C18180wK.A1V(size));
        if (size == 0) {
            progressButton = r8.A07;
            i2 = 2131830107;
        } else if (A0v.isEmpty()) {
            progressButton = r8.A07;
            i2 = 2131831737;
        } else {
            ProgressButton progressButton3 = r8.A07;
            Resources A0B = AnonymousClass0wJ.A0B(r8);
            if (size == 1) {
                i = 2131830108;
                strArr = new String[1];
                num = ((C72144Mm) A0v.get(0)).A02();
            } else {
                i = 2131830106;
                strArr = new String[1];
                num = Integer.toString(size);
            }
            strArr[0] = num;
            progressButton3.setText((CharSequence) C16370sw.A01(A0B, strArr, i));
            return;
        }
        progressButton.setText(i2);
    }

    private boolean A02() {
        AnonymousClass4C9 r6 = AnonymousClass4C9.A00;
        C83214qy r1 = AnonymousClass4C9.A01;
        AnonymousClass0A5[] r2 = AnonymousClass4C9.A03;
        if (!AnonymousClass0wJ.A1X(C62073Xa.A01((C62073Xa) r1.BKJ(r6, r2[0])))) {
            return false;
        }
        C07530bf r0 = this.A02;
        C04220Ms.A0B(r0, 0);
        if (AnonymousClass0wJ.A1X(C62073Xa.A00(r0, (C62073Xa) AnonymousClass4C9.A02.BKJ(r6, r2[1])))) {
            if (new JSP(requireContext(), this.A02).A00(new C212419p(this, C63173fJ.A05(AnonymousClass0TJ.A06, 2324146613641089105L)), true) == 1) {
                return true;
            }
            return false;
        }
        AnonymousClass4C7 r22 = AnonymousClass4C7.A00;
        C07530bf r02 = this.A02;
        C04220Ms.A0B(r02, 0);
        return AnonymousClass0wJ.A1X(C62073Xa.A00(r02, (C62073Xa) AnonymousClass4C7.A01.BKJ(r22, AnonymousClass4C7.A02[0])));
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i = 2131831480;
        if (A02()) {
            i = 2131831481;
        }
        AnonymousClass4u2.A07(r3, i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1213763255);
        super.onCreate(bundle);
        this.A02 = C18210wN.A0N(this);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("lookup_users");
        if (parcelableArrayList == null) {
            parcelableArrayList = AnonymousClass0wJ.A0v();
        }
        this.A09 = C50492t5.A00(parcelableArrayList);
        this.A03 = requireArguments().getString("login_nonce", "");
        this.A04 = requireArguments().getString("recovery_handle_type", "");
        this.A08 = requireArguments().getString("recovery_handle", "");
        this.A00 = new C70224Dh(getActivity());
        AnonymousClass3YT.A00.A02(this.A02, "multiple_users_recover");
        this.A06 = AnonymousClass3V1.A00(this.mArguments);
        C14030oh.A09(-1609641360, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A022 = C14030oh.A02(1931520013);
        if (A02()) {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery_legacy, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery, viewGroup, false);
            TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.choose_accounts_text);
            Resources A0B = AnonymousClass0wJ.A0B(this);
            int i = 2131823279;
            if (C63213h0.A01(94, 12, 11).equals(this.A04)) {
                i = 2131823280;
            }
            C18200wM.A19(A0B, A0L, this.A08, i);
        }
        TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.help_center);
        String string = getString(2131828280);
        AnonymousClass3Zw.A03(new C18720xk(A0L2.getCurrentTextColor()), A0L2, string, AnonymousClass0wJ.A0o(this, string, 2131828279));
        AnonymousClass0wJ.A17(A0L2, 12, this);
        if (A02()) {
            AnonymousClass1fD r5 = new AnonymousClass1fD(this, this);
            List list = this.A09;
            List<Object> list2 = r5.A01;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
                r5.A03();
                for (Object A052 : list2) {
                    r5.A05(r5.A00, A052);
                }
                r5.A04();
            }
            ((AbsListView) inflate.requireViewById(16908298)).setAdapter(r5);
        } else {
            AnonymousClass1fM r6 = new AnonymousClass1fM(requireContext(), this, this, this.A02);
            this.A01 = r6;
            List<C72144Mm> list3 = this.A09;
            List list4 = r6.A07;
            list4.clear();
            List list5 = r6.A06;
            list5.clear();
            if (list3 != null) {
                for (C72144Mm r8 : list3) {
                    if (!r6.A02.A0O(r8.A01())) {
                        C62353Yv r4 = r6.A01;
                        String A012 = r8.A01();
                        if (!r4.A01.containsKey(A012) && !r4.A00.containsKey(A012)) {
                            list4.add(r8);
                        }
                    }
                    list5.add(r8);
                }
                r6.A03 = C18200wM.A0u();
                if (!list4.isEmpty()) {
                    r6.A03.add(list4.get(0));
                }
                AnonymousClass1fM.A00(r6);
            }
            ((AbsListView) inflate.requireViewById(16908298)).setAdapter(this.A01);
            this.A07 = C18210wN.A0O(inflate);
            A01(this);
            AnonymousClass0wJ.A17(this.A07, 13, this);
        }
        C14030oh.A09(-700889618, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass01V.A0p.markerEnd(725095506, 2);
    }
}
