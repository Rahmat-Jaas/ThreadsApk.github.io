package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape461S0100000_1_I2;
import com.google.common.collect.ImmutableMap;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.bloks.hosting.intf.IgBloksScreenExitCallback;
import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.1c8  reason: invalid class name */
public final class AnonymousClass1c8 extends C34640IcN implements C82424pb, C82034oy, C81884oY, C81854oV, C11510kK, C81844oU, C144598il, C21452BuZ, C83084ql {
    public static final ImmutableMap A0S;
    public static final String __redex_internal_original_name = "IgBloksScreenFragment";
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FragmentActivity A03;
    public C63113bW A04 = null;
    public C66843yQ A05;
    public C84684tg A06 = null;
    public LLE A07;
    public LLF A08;
    public C130667qT A09;
    public IgBloksScreenConfig A0A;
    public IgBloksScreenRequestCallback A0B;
    public C121247Ez A0C;
    public C19577Ayd A0D;
    public C19577Ayd A0E;
    public UserSession A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I = true;
    public int A0J;
    public int A0K;
    public C83374rH A0L;
    public C10300i6 A0M;
    public C84464tB A0N;
    public C30938GbW A0O;
    public final List A0P = AnonymousClass0wJ.A0v();
    public final C82394pY A0Q = C18220wO.A0P(this, 6);
    public final C144658ir A0R = new IDxCListenerShape461S0100000_1_I2(this, 0);

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(1, "bind_initial_content_start");
        builder.put(2, "bind_initial_content_end");
        builder.put(3, "bind_initial_data_on_mount");
        builder.put(4, "receive_additional");
        builder.put(6, "bind_network_content_start");
        builder.put(8, "bind_network_content_pending");
        builder.put(7, "bind_network_content_end");
        builder.put(9, "bind_data_on_mount");
        builder.put(10, "bind_network_content_on_attach");
        builder.put(11, "bind_network_content_action_attach");
        A0S = builder.build();
    }

    public static String A00(C127397h3 r2) {
        String A0O2 = r2.A0O(43, "");
        if (TextUtils.isEmpty(A0O2)) {
            return null;
        }
        return A0O2;
    }

    private void A01() {
        List<C72364Nt> list = this.A0P;
        if (list != null && !list.isEmpty()) {
            for (C72364Nt r3 : list) {
                UserSession userSession = this.A0F;
                if (userSession != null) {
                    AnonymousClass3LY.A00(userSession).A02(r3.A02, BBE.class);
                }
                r3.A00 = null;
            }
        }
    }

    public static void A02(AnonymousClass3TP r2, AnonymousClass1c8 r3) {
        C121247Ez r0 = r3.A0C;
        if (r0 != null) {
            r0.A03();
            r3.A0C = null;
        }
        FrameLayout frameLayout = r3.A02;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            r3.A02 = null;
            r3.A08 = null;
            r3.A07 = null;
        }
        r3.A0A.A06(r2);
        if (r3.getContext() != null && r3.isAdded()) {
            FragmentActivity fragmentActivity = r3.A03;
            if (fragmentActivity instanceof BaseFragmentActivity) {
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
                baseFragmentActivity.A09();
                baseFragmentActivity.A0C();
                return;
            }
            E2V.A0G(E2V.A03(fragmentActivity));
        }
    }

    public static void A03(AnonymousClass1c8 r3, C127397h3 r4, C109326jp r5) {
        String str;
        String str2;
        C121247Ez r0;
        AnonymousClass3HX A022;
        C63113bW r02 = r3.A04;
        if (r02 == null || (r0 = r02.A04.A01) == null || (A022 = r0.A02()) == null) {
            str = __redex_internal_original_name;
            str2 = "Cannot run navbar expression without valid context";
        } else {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(r4, 0);
            C63893iY A042 = C63893iY.A04(A002, A022, 1);
            C63113bW r03 = r3.A04;
            if (r03 != null) {
                C121247Ez r04 = r03.A04.A01;
                if (r04 != null) {
                    C122047Jt.A03(r04.A02(), r4, A042, r5);
                    return;
                } else if (r3.mView != null) {
                    str = __redex_internal_original_name;
                    str2 = "runExpression failed on Surface Core.";
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C30967GcS.A02(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r0.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass1c8 r3, X.C109326jp r4) {
        /*
            if (r4 == 0) goto L_0x0032
            X.3bW r0 = r3.A04
            if (r0 == 0) goto L_0x0032
            X.44n r0 = r0.A04
            X.7Ez r0 = r0.A01
            if (r0 == 0) goto L_0x0033
            X.3HX r2 = r0.A02()
            if (r2 == 0) goto L_0x0033
            X.3VO r1 = X.AnonymousClass3VO.A00()
            r0 = 0
            X.3iY r2 = X.C63893iY.A04(r1, r2, r0)
            X.3bW r0 = r3.A04
            X.44n r0 = r0.A04
            X.7Ez r0 = r0.A01
            if (r0 == 0) goto L_0x0038
            X.3HX r1 = r0.A02()
            X.7HV r0 = X.AnonymousClass7K7.A01(r1)
            if (r0 == 0) goto L_0x0038
            X.7h3 r0 = r0.A04
            X.C122047Jt.A03(r1, r0, r2, r4)
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r1 = "IgBloksScreenFragment"
            java.lang.String r0 = "Cannot run expression on root model without valid context"
            goto L_0x0040
        L_0x0038:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = "IgBloksScreenFragment"
            java.lang.String r0 = "runExpressionOnRootModel failed on Surface Core."
        L_0x0040:
            X.C30967GcS.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c8.A04(X.1c8, X.6jp):void");
    }

    public final void A06(AnonymousClass3TP r3) {
        View view = this.mView;
        if (view == null) {
            return;
        }
        if (view.isInLayout()) {
            view.post(new C73054Qt(r3, this));
        } else {
            A02(r3, this);
        }
    }

    public final String AwK() {
        String str = this.A0G;
        if (TextUtils.isEmpty(str)) {
            return "bloks_unknown_class";
        }
        return str;
    }

    public final void CFx(int i) {
        Runnable r0;
        ImmutableMap immutableMap = A0S;
        Integer valueOf = Integer.valueOf(i);
        if (immutableMap.containsKey(valueOf)) {
            String str = (String) immutableMap.get(valueOf);
            C84684tg r02 = this.A06;
            if (r02 != null) {
                r02.Bex(str);
            }
            C63113bW r2 = this.A04;
            r2.getClass();
            C555933v r03 = (C555933v) Pair.create(r2.A0A.get(), r2.A03).first;
            if (r03 == null) {
                C84684tg r04 = this.A06;
                if (r04 != null) {
                    r04.Beu("response_source", "UNKNOWN");
                }
            } else {
                boolean A1W = C18180wK.A1W(r03.A00.A00);
                C84684tg r05 = this.A06;
                if (r05 != null) {
                    r05.Bes("prefetched_data_exists", A1W ? 1 : 0);
                }
            }
            if (i == 4) {
                C84684tg r06 = this.A06;
                if (r06 != null) {
                    r06.Bex("request_end");
                }
                r0 = new AnonymousClass4OM(this);
                C63643hy.A04(r0);
            }
        }
        if (i != 0) {
            if (i != 4) {
                if (i == 5) {
                    r0 = new AnonymousClass4OK(this);
                } else if (i == 6) {
                    r0 = new AnonymousClass4ON(this);
                } else if (i == 7) {
                    r0 = new AnonymousClass4OJ(this);
                } else {
                    return;
                }
            }
            r0 = new AnonymousClass4OM(this);
        } else {
            r0 = new AnonymousClass4OL(this);
        }
        C63643hy.A04(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r18) {
        /*
            r17 = this;
            r5 = r17
            boolean r0 = r5.BYn()
            if (r0 == 0) goto L_0x0020
            boolean r0 = X.C31164GhX.A08()
            if (r0 != 0) goto L_0x0020
            android.app.Activity r2 = r5.getRootActivity()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131099941(0x7f060125, float:1.781225E38)
            int r0 = r1.getColor(r0)
            X.C31164GhX.A02(r2, r0)
        L_0x0020:
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r5.A0A
            X.4w5 r0 = r1.A05
            r4 = r18
            if (r0 == 0) goto L_0x0057
            X.4rH r1 = r5.A0L
            if (r1 != 0) goto L_0x0032
            X.4rH r1 = r0.AF4(r5)
            r5.A0L = r1
        L_0x0032:
            android.content.Context r0 = r5.requireContext()
            r1.AE0(r0, r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.4w5 r0 = r0.A05
            boolean r0 = r0.BWf()
            if (r0 == 0) goto L_0x004f
            X.4rH r0 = r5.A0L
            r0.onDestroy()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r5.A0A
            r0 = 0
            r1.A05 = r0
            r5.A0L = r0
        L_0x004f:
            java.util.List r0 = r5.A0P
            if (r0 == 0) goto L_0x0056
            r5.A01()
        L_0x0056:
            return
        L_0x0057:
            boolean r0 = r1.A0g
            r4.CtO(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r5.A0A
            boolean r0 = r1.A0g
            if (r0 == 0) goto L_0x0056
            X.7h3 r6 = r1.A09
            r3 = 1
            r2 = 0
            if (r6 == 0) goto L_0x023b
            r0 = 15
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r7 = X.C18200wM.A0R(r6, r5, r0)
            r0 = 40
            java.lang.String r10 = ""
            java.lang.String r1 = r6.A0O(r0, r10)
            java.lang.String r0 = "regular"
            boolean r9 = r1.equals(r0)
            r8 = 36
            java.lang.String r0 = r6.A0N(r8)
            if (r0 == 0) goto L_0x0201
            X.Drc r1 = X.C18240wQ.A0K()
            java.lang.String r0 = r6.A0O(r8, r10)
            r1.A0F = r0
            r0 = 0
            if (r9 == 0) goto L_0x0094
            r0 = 2131886090(0x7f12000a, float:1.940675E38)
        L_0x0094:
            r1.A0A = r0
            r1.A0C = r7
            java.lang.String r0 = A00(r6)
            r1.A0G = r0
            X.DlZ r0 = new X.DlZ
            r0.<init>(r1)
            r4.A6M(r0)
        L_0x00a6:
            r5.A0I = r2
        L_0x00a8:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.util.List r0 = r0.A0V
            if (r0 == 0) goto L_0x0262
            r9 = 0
        L_0x00af:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.util.List r0 = r0.A0V
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x0262
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.util.List r0 = r0.A0V
            java.lang.Object r8 = r0.get(r9)
            X.7h3 r8 = (X.C127397h3) r8
            r0 = 16
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r7 = X.C18200wM.A0R(r8, r5, r0)
            r13 = 40
            java.lang.String r1 = ""
            java.lang.String r6 = r8.A0O(r13, r1)
            java.lang.String r0 = "regular"
            boolean r16 = r6.equals(r0)
            r6 = 36
            java.lang.String r0 = r8.A0N(r6)
            if (r0 == 0) goto L_0x010d
            X.Drc r11 = X.C18240wQ.A0K()
            java.lang.String r0 = r8.A0O(r6, r1)
            r11.A0F = r0
            r0 = 0
            if (r16 == 0) goto L_0x00ef
            r0 = 2131886090(0x7f12000a, float:1.940675E38)
        L_0x00ef:
            r11.A0A = r0
            r11.A0C = r7
            java.lang.String r0 = A00(r8)
            r11.A0G = r0
        L_0x00f9:
            X.DlZ r0 = new X.DlZ
            r0.<init>(r11)
            r4.A7Q(r0)
        L_0x0101:
            r0 = 44
            boolean r0 = r8.A0T(r0, r3)
            r4.AJh(r9, r0)
            int r9 = r9 + 1
            goto L_0x00af
        L_0x010d:
            r14 = 38
            java.lang.String r0 = r8.A0N(r14)
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = r8.A0O(r14, r1)
            java.lang.Integer r15 = X.C62863b2.A03(r0)
            if (r15 == 0) goto L_0x0101
            int r10 = X.AnonymousClass3JR.A01(r15)
            r12 = 41
            X.7h3 r1 = r8.A0K(r12)
            if (r1 == 0) goto L_0x01fe
            int r11 = r1.A03
            r0 = 14145(0x3741, float:1.9821E-41)
            if (r11 != r0) goto L_0x01fe
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.String r0 = X.C18220wO.A0o(r1)
            X.C62863b2.A04(r0)
            java.lang.String r0 = r1.A0N(r14)
            X.C62863b2.A04(r0)
            java.lang.String r0 = r1.A0N(r6)
            X.C62863b2.A04(r0)
            java.lang.String r6 = r1.A0N(r13)
            r0 = -1
            int r0 = r1.A0H(r12, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.39j r1 = new X.39j
            r1.<init>(r11, r0, r6)
        L_0x015c:
            X.Drc r11 = X.C18240wQ.A0K()
            r11.A05 = r10
            int r0 = X.AnonymousClass3JR.A00(r15)
            r11.A04 = r0
            r11.A0C = r7
            r0 = 0
            if (r16 == 0) goto L_0x0170
            r0 = 2131886090(0x7f12000a, float:1.940675E38)
        L_0x0170:
            r11.A0A = r0
            java.lang.String r0 = A00(r8)
            r11.A0G = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.4Ni r0 = r0.A03
            if (r0 == 0) goto L_0x00f9
            if (r1 == 0) goto L_0x00f9
            java.lang.String r6 = r1.A02
            if (r6 == 0) goto L_0x00f9
            java.lang.String r0 = "shop_cart_data"
            boolean r0 = X.AnonymousClass8bP.A0j(r6, r0, r2)
            if (r0 == 0) goto L_0x00f9
            X.4Nt r7 = new X.4Nt
            r7.<init>()
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x00f9
            android.content.Context r12 = r5.requireContext()
            com.instagram.service.session.UserSession r13 = r5.A0F
            r7.A01 = r1
            java.lang.String r0 = "cart"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x01f3
            if (r13 == 0) goto L_0x01f3
            java.lang.Integer r10 = r1.A00
            int r6 = r10.intValue()
            r1 = -1
            r0 = 0
            if (r6 == r1) goto L_0x01b4
            r0 = 1
        L_0x01b4:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 != 0) goto L_0x01cd
            X.BEk r0 = X.C19884BEk.A01(r13)
            java.lang.Integer r10 = r0.A07()
            X.KHq r6 = X.AnonymousClass3LY.A00(r13)
            java.lang.Class<X.BBE> r1 = X.BBE.class
            X.4pY r0 = r7.A02
            r6.A01(r0, r1)
        L_0x01cd:
            X.39j r0 = r7.A01
            if (r0 == 0) goto L_0x01fa
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x01fa
            int r1 = r0.intValue()
        L_0x01d9:
            X.4yA r0 = new X.4yA
            r0.<init>(r12, r1)
            r0.A01()
            r11.A0B = r0
            X.DlZ r0 = new X.DlZ
            r0.<init>(r11)
            android.view.View r0 = r4.A7Q(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A00 = r0
            X.C72364Nt.A00(r7, r10)
        L_0x01f3:
            java.util.List r0 = r5.A0P
            r0.add(r7)
            goto L_0x0101
        L_0x01fa:
            r1 = 2131232996(0x7f0808e4, float:1.8082117E38)
            goto L_0x01d9
        L_0x01fe:
            r1 = 0
            goto L_0x015c
        L_0x0201:
            r1 = 38
            java.lang.String r0 = r6.A0N(r1)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r6.A0O(r1, r10)
            java.lang.Integer r0 = X.C62863b2.A03(r0)
            if (r0 == 0) goto L_0x00a8
            X.Drc r1 = X.C18240wQ.A0K()
            int r0 = X.AnonymousClass3JR.A01(r0)
            r1.A04(r0)
            r1.A0C = r7
            java.lang.String r0 = A00(r6)
            r1.A0G = r0
            X.AnonymousClass4u2.A03(r1, r4)
            r0 = 44
            boolean r1 = r6.A0T(r0, r3)
            r0 = r4
            X.E2V r0 = (X.E2V) r0
            android.widget.ImageView r0 = r0.A0P
            r0.setEnabled(r1)
            r5.A0I = r3
            goto L_0x00a8
        L_0x023b:
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x00a6
            X.6jp r0 = r1.A0A
            if (r0 == 0) goto L_0x0259
            X.Drc r1 = X.C18240wQ.A0K()
            r0 = 2131232268(0x7f08060c, float:1.808064E38)
            r1.A00 = r0
            r0 = 47
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r5, r0)
            r1.A0C = r0
        L_0x0254:
            X.AnonymousClass4u2.A03(r1, r4)
            goto L_0x00a8
        L_0x0259:
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x00a8
            X.Drc r1 = X.C18190wL.A0K()
            goto L_0x0254
        L_0x0262:
            boolean r0 = r5.A0I
            r4.CtT(r0)
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x0389
            android.content.res.Resources r0 = X.AnonymousClass0wJ.A0B(r5)
            int r8 = X.C18220wO.A03(r0)
        L_0x0273:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.4nQ r0 = r0.A02
            r7 = -1
            r6 = -2
            if (r0 == 0) goto L_0x0314
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0314
            X.LLE r0 = r5.A07
            if (r0 != 0) goto L_0x02b3
            android.content.Context r1 = r5.getContext()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r5.A02 = r0
            android.content.Context r0 = r5.getContext()
            X.LLE r1 = new X.LLE
            r1.<init>(r0)
            r5.A07 = r1
            android.widget.FrameLayout r0 = r5.A02
            r0.addView(r1)
            X.LLE r1 = r5.A07
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r7)
            r1.setLayoutParams(r0)
            X.LLE r1 = r5.A07
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.4nQ r0 = r0.A02
            r1.setLazyRenderTreeProvider(r0)
        L_0x02b3:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x02ba
            r4.Cjs(r0, r8, r2, r2)
        L_0x02ba:
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0312
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.C34822La.A00(r0)
            if (r0 == 0) goto L_0x0312
        L_0x02ca:
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r5.A0A
            java.lang.Integer r0 = r1.A0D
            if (r0 == 0) goto L_0x030b
            if (r3 == 0) goto L_0x030b
        L_0x02d2:
            int r0 = r0.intValue()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r0)
            r0 = r4
            X.E2V r0 = (X.E2V) r0
            android.view.ViewGroup r0 = r0.A0K
            r0.setBackground(r1)
        L_0x02e3:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.util.HashMap r0 = r0.A0U
            if (r0 == 0) goto L_0x038c
            java.util.Iterator r3 = X.C18190wL.A0u(r0)
        L_0x02ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x038c
            java.util.Map$Entry r2 = X.C18180wK.A0o(r3)
            java.lang.Object r0 = r2.getKey()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r2.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r4.AJh(r1, r0)
            goto L_0x02ed
        L_0x030b:
            java.lang.Integer r0 = r1.A0E
            if (r0 == 0) goto L_0x02e3
            if (r3 != 0) goto L_0x02e3
            goto L_0x02d2
        L_0x0312:
            r3 = 0
            goto L_0x02ca
        L_0x0314:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.7Jj r0 = r0.A07
            if (r0 == 0) goto L_0x036c
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x036c
            X.LLF r0 = r5.A08
            if (r0 != 0) goto L_0x0349
            android.content.Context r1 = r5.getContext()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r5.A02 = r0
            android.content.Context r0 = r5.getContext()
            X.LLF r1 = new X.LLF
            r1.<init>(r0)
            r5.A08 = r1
            android.widget.FrameLayout r0 = r5.A02
            r0.addView(r1)
            X.LLF r1 = r5.A08
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r7)
            r1.setLayoutParams(r0)
        L_0x0349:
            X.7Ez r0 = r5.A0C
            if (r0 == 0) goto L_0x0350
            r0.A03()
        L_0x0350:
            android.content.Context r7 = r5.getContext()
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            X.7Jj r6 = r0.A07
            X.7qT r1 = r5.A09
            X.3Fy r0 = new X.3Fy
            r0.<init>(r7, r6, r1)
            X.7Ez r1 = r0.A00()
            r5.A0C = r1
            X.LLF r0 = r5.A08
            r1.A06(r0)
            goto L_0x02b3
        L_0x036c:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.lang.String r1 = r0.A0S
            if (r1 == 0) goto L_0x0380
            java.lang.String r0 = r0.A0R
            if (r0 == 0) goto L_0x037b
            r4.Cnm(r1, r0)
            goto L_0x02ba
        L_0x037b:
            r4.setTitle(r1)
            goto L_0x02ba
        L_0x0380:
            java.lang.String r1 = "BLOKS"
            java.lang.String r0 = "Screen showing action bar without a title!"
            X.C10450iM.A03(r1, r0)
            goto L_0x02ba
        L_0x0389:
            r8 = 0
            goto L_0x0273
        L_0x038c:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            java.util.HashMap r0 = r0.A0T
            if (r0 == 0) goto L_0x0056
            java.util.Iterator r3 = X.C18190wL.A0u(r0)
        L_0x0396:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0056
            java.util.Map$Entry r2 = X.C18180wK.A0o(r3)
            java.lang.Object r0 = r2.getKey()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r2.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r4.AJa(r1, r0)
            goto L_0x0396
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c8.configureActionBar(X.4u2):void");
    }

    public final String getModuleName() {
        String str;
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig != null) {
            str = igBloksScreenConfig.A0P;
        } else {
            str = null;
        }
        String str2 = this.A0G;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "bloks_unknown";
    }

    public final C10300i6 getSession() {
        return this.A0M;
    }

    public final String getUrl() {
        String str = this.A0G;
        if (str == null) {
            return null;
        }
        return C18180wK.A0j("instagram://bloks/?app_id=%s", new Object[]{str});
    }

    public final boolean isScrolledToTop() {
        AnonymousClass3HX A022;
        C63113bW r0 = this.A04;
        r0.getClass();
        C121247Ez r02 = r0.A04.A01;
        if (r02 == null || (A022 = r02.A02()) == null || AnonymousClass2JR.A00(A022)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        C109326jp r1;
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig == null || (r1 = igBloksScreenConfig.A0A) == null || this.A0H) {
            return false;
        }
        this.A0H = true;
        A04(this, r1);
        this.A0H = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.AnonymousClass1c8 r1) {
        /*
            android.app.Activity r0 = r1.getRootActivity()
            boolean r0 = r0 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0024
            android.app.Activity r1 = r1.getRootActivity()
            com.instagram.modal.ModalActivity r1 = (com.instagram.modal.ModalActivity) r1
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x001d
            r0 = 2131302404(0x7f091804, float:1.8222893E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.A00 = r0
            if (r0 == 0) goto L_0x0024
        L_0x001d:
            boolean r1 = r0.getFitsSystemWindows()
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c8.A05(X.1c8):boolean");
    }

    public final boolean BNN(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean BYn() {
        if (!isAdded() || !C09860go.A0m(getRootActivity()) || A05(this) || C09960hR.A04()) {
            return false;
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig.A0b || igBloksScreenConfig.A0d) {
            return true;
        }
        return false;
    }

    public final void C8d(AnonymousClass4nQ r2, AnonymousClass3HX r3, C127397h3 r4) {
        AnonymousClass3TP A002 = C62863b2.A00(r2, r3, r4);
        if (A002 != null) {
            A06(A002);
        }
    }

    public final AnonymousClass24C getStatusBarType() {
        if (BYn()) {
            return AnonymousClass24C.TRANSPARENT;
        }
        return AnonymousClass24C.DEFAULT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = -1891871661(0xffffffff8f3c5453, float:-9.285356E-30)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r11)
            android.os.Bundle r0 = r10.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r0)
            r10.A0M = r0
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A03(r0)
            r10.A0F = r0
            X.3S3 r0 = X.AnonymousClass3S3.A01
            X.4AO r2 = r0.A00
            X.2yo r1 = new X.2yo
            r1.<init>()
            X.GbW r0 = new X.GbW
            r0.<init>(r2, r1)
            r10.A0O = r0
            android.os.Bundle r1 = r10.mArguments
            X.0i6 r0 = r10.A0M
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = com.instagram.bloks.hosting.IgBloksScreenConfig.A00(r1, r0)
            r0.getClass()
            r10.A0A = r0
            if (r11 != 0) goto L_0x003d
            android.os.Bundle r11 = r10.requireArguments()
        L_0x003d:
            X.3yQ r0 = X.C63113bW.A01(r11)
            r10.A05 = r0
            java.lang.String r0 = r0.A08
            r10.A0G = r0
            X.0i6 r1 = r10.A0M
            X.GbW r0 = r10.A0O
            X.7qT r0 = X.C130667qT.A01(r10, r10, r1, r0)
            r10.A09 = r0
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            r10.A03 = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = r10.A0A
            com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback r0 = r2.A06
            r10.A0B = r0
            X.7qT r1 = r10.A09
            boolean r0 = r2.A0Y
            if (r0 == 0) goto L_0x0066
            r0 = 1
            r1.A00 = r0
        L_0x0066:
            android.content.Context r4 = r10.requireContext()
            X.7qT r8 = r10.A09
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r10.A0A
            X.18u r9 = r0.A04()
            X.3yQ r6 = r10.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r10.A0A
            X.7Jj r7 = r0.A08
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            X.3bW r1 = X.C63113bW.A00(r4, r5, r6, r7, r8, r9)
            r10.A04 = r1
            android.content.Context r0 = r10.requireContext()
            boolean r0 = r1.A08(r0, r10)
            if (r0 == 0) goto L_0x00ac
            java.lang.String r1 = "request_start"
            X.4tg r0 = r10.A06
            if (r0 == 0) goto L_0x0096
            r0.Bex(r1)
        L_0x0096:
            com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback r1 = r10.A0B
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1 instanceof com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1
            if (r0 == 0) goto L_0x00ac
            com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1 r1 = (com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1) r1
            X.3ad r1 = r1.A00
            X.Lcc r0 = X.C40322Lcc.FETCHING_START
            X.C62743ad.A00(r0, r1)
            X.3If r0 = r1.A08
            r0.A02()
        L_0x00ac:
            X.3bW r0 = r10.A04
            X.4tg r1 = r0.A00
            r1.getClass()
            r10.A06 = r1
            java.lang.String r0 = "fragment_create"
            r1.Bex(r0)
            java.lang.String r0 = r10.A0G
            if (r0 == 0) goto L_0x00c9
            X.0IB r2 = X.C10450iM.A00()
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "bloks_app_id"
            r2.CYW(r0, r1)
        L_0x00c9:
            com.instagram.service.session.UserSession r4 = X.C18230wP.A0Z()     // Catch:{ RuntimeException -> 0x00e0 }
            if (r4 == 0) goto L_0x00e0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167798199165610(0x20810d34000522aa, double:4.06964653367911E-152)
            boolean r1 = X.C63803iN.A0E(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            r0 = 0
            X.4tB r0 = X.C25711DqZ.A01(r10, r0, r1)
            r10.A0N = r0
            com.instagram.service.session.UserSession r0 = r10.A0F
            if (r0 == 0) goto L_0x00f9
            X.KHq r4 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.45a> r2 = X.C686745a.class
            X.4pY r1 = r10.A0Q
            java.lang.String r0 = "support_personalized_ads_sticker_shared_event"
            r4.A03(r1, r2, r0)
        L_0x00f9:
            android.app.Activity r0 = r10.getRootActivity()
            int r0 = X.AnonymousClass7IE.A00(r0)
            r10.A0J = r0
            java.lang.String r2 = r10.getModuleName()
            java.lang.String r1 = "analytics_module"
            X.4tg r0 = r10.A06
            if (r0 == 0) goto L_0x0110
            r0.Beu(r1, r2)
        L_0x0110:
            java.lang.String r2 = r10.A0G
            if (r2 == 0) goto L_0x011d
            java.lang.String r1 = "app_id"
            X.4tg r0 = r10.A06
            if (r0 == 0) goto L_0x011d
            r0.Beu(r1, r2)
        L_0x011d:
            r0 = -820291927(0xffffffffcf1b56a9, float:-2.60614784E9)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c8.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-146108340);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bloks_fragment);
        C14030oh.A09(-972454627, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-420573117);
        super.onDestroy();
        C63113bW r0 = this.A04;
        r0.getClass();
        r0.A06();
        this.A09 = null;
        C83374rH r02 = this.A0L;
        if (r02 != null) {
            r02.onDestroy();
        }
        if (this.A0P != null) {
            A01();
        }
        IgBloksScreenExitCallback igBloksScreenExitCallback = this.A0A.A04;
        if (igBloksScreenExitCallback != null) {
            igBloksScreenExitCallback.A00(this.A0F);
        }
        if (C18240wQ.A1U(this) || !requireActivity().isChangingConfigurations()) {
            this.A0A.A05();
        }
        C14030oh.A09(858753766, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(204769635);
        super.onDestroyView();
        C63113bW r0 = this.A04;
        r0.getClass();
        r0.A07();
        this.A01 = null;
        this.A0E = null;
        this.A00 = null;
        C121247Ez r02 = this.A0C;
        if (r02 != null) {
            r02.A03();
            this.A0C = null;
        }
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        UserSession userSession = this.A0F;
        if (userSession != null) {
            AnonymousClass3LY.A00(userSession).A02(this.A0Q, C686745a.class);
        }
        C14030oh.A09(-319279992, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1323028920);
        super.onPause();
        if (C18190wL.A0F(this) != null) {
            C18190wL.A0F(this).setSoftInputMode(this.A0K);
        }
        if (!this.A0A.A0X) {
            E2V.A03(this.A03).A08.remove(this);
        }
        boolean A1U = C18240wQ.A1U(this);
        C84684tg r0 = this.A06;
        if (r0 != null) {
            r0.Bes("is_finishing", A1U ? 1 : 0);
        }
        boolean z = this.mRemoving;
        C84684tg r02 = this.A06;
        if (r02 != null) {
            r02.Bes("is_removing", z ? 1 : 0);
        }
        IgBloksScreenRequestCallback igBloksScreenRequestCallback = this.A0B;
        if (igBloksScreenRequestCallback != null) {
            igBloksScreenRequestCallback.A00();
        }
        AnonymousClass7IE.A03(getRootActivity(), this.A0J);
        C63113bW r03 = this.A04;
        r03.getClass();
        C84684tg r1 = r03.A00;
        if (r1 != null) {
            r1.BaZ("BloksSurfaceController_onPause");
        }
        C14030oh.A09(476915104, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1925495189);
        super.onResume();
        if (C18190wL.A0F(this) != null) {
            this.A0K = C18190wL.A0F(this).getAttributes().softInputMode;
            C18190wL.A0F(this).setSoftInputMode(this.A0A.A00 | 2);
        }
        if (!this.A0A.A0X) {
            C18230wP.A0R(this).A08.put(this, (Object) null);
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if ((igBloksScreenConfig.A0b || igBloksScreenConfig.A0c) && !A05(this)) {
            AnonymousClass7IE.A03(getRootActivity(), getRootActivity().getColor(R.color.fds_transparent));
        }
        C14030oh.A09(604721443, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, this.A0M, 36326524151998067L).booleanValue();
        C63113bW r0 = this.A04;
        r0.getClass();
        C66843yQ.A02(bundle, r0, booleanValue ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            r0 = -177808060(0xfffffffff566dd44, float:-2.926553E32)
            int r4 = X.C14030oh.A02(r0)
            super.onStart()
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r5.A0A
            boolean r0 = r0.A0h
            if (r0 != 0) goto L_0x0013
            r5.getRootActivity()
        L_0x0013:
            X.4tB r1 = r5.A0N
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "IgBloksScreenFragment"
            java.lang.String r0 = "KHCD should already be initialized"
            X.C10450iM.A03(r1, r0)
            com.instagram.service.session.UserSession r3 = X.C18230wP.A0Z()     // Catch:{ RuntimeException -> 0x0035 }
            if (r3 == 0) goto L_0x0035
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2342167798199165610(0x20810d34000522aa, double:4.06964653367911E-152)
            boolean r1 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            r0 = 0
            X.4tB r1 = X.C25711DqZ.A01(r5, r0, r1)
            r5.A0N = r1
        L_0x003d:
            android.app.Activity r0 = r5.getRootActivity()
            r1.CLs(r0)
            X.4tB r1 = r5.A0N
            X.8ir r0 = r5.A0R
            r1.A6s(r0)
            r0 = -2122557893(0xffffffff817c563b, float:-4.6346957E-38)
            X.C14030oh.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c8.onStart():void");
    }

    public final void onStop() {
        int i;
        int A022 = C14030oh.A02(1082412251);
        super.onStop();
        getRootActivity();
        C84464tB r1 = this.A0N;
        if (r1 == null) {
            C10450iM.A03(__redex_internal_original_name, "KHCD should have been initialized");
            i = -1579484603;
        } else {
            r1.Cc8(this.A0R);
            this.A0N.onStop();
            i = -1031934192;
        }
        C14030oh.A09(i, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = (FrameLayout) view.requireViewById(R.id.bloks_container);
        this.A0E = C18190wL.A0U(view, R.id.error_view_stub);
        this.A0D = C18190wL.A0U(view, R.id.debug_error_view_stub);
        FrameLayout frameLayout = this.A01;
        C63113bW r1 = this.A04;
        r1.getClass();
        frameLayout.addView((View) r1.A04(requireContext()).first);
        View findViewById = getRootActivity().findViewById(R.id.layout_container_center_right_coordinator_layout);
        if (findViewById == null) {
            findViewById = this.A01;
        }
        this.A0O.A04(findViewById, C35004Ikn.A00(this));
        if (AnonymousClass0wJ.A1V(C09120et.A02().A18)) {
            C25111lp r12 = new C25111lp(requireContext());
            r12.setTitle("Bloks");
            ((ViewGroup) view).addView(r12);
        }
    }
}
