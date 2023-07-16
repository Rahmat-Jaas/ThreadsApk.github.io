package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1cn  reason: invalid class name and case insensitive filesystem */
public final class C23221cn extends C34640IcN implements C82424pb, C21735BzM, C81884oY, C81854oV, C81844oU, C81414nk {
    public static final String __redex_internal_original_name = "IgBloksBottomSheetFragment";
    public View A00;
    public FrameLayout A01;
    public C63113bW A02 = null;
    public C66843yQ A03 = null;
    public C84684tg A04 = null;
    public LLF A05;
    public C130667qT A06;
    public C130667qT A07;
    public IgBloksScreenConfig A08;
    public C121247Ez A09;
    public C10300i6 A0A;
    public C19577Ayd A0B;
    public C37383Jqm A0C;
    public C25745DrH A0D = null;
    public Integer A0E;
    public boolean A0F = false;
    public int A0G;
    public int A0H;
    public C109326jp A0I;
    public C19577Ayd A0J;
    public C30938GbW A0K;

    public final void C8d(AnonymousClass4nQ r7, AnonymousClass3HX r8, C127397h3 r9) {
        C36311JPd jPd;
        C36311JPd jPd2 = null;
        AnonymousClass3TP A002 = C62863b2.A00((AnonymousClass4nQ) null, r8, r9);
        if (A002 != null) {
            List list = A002.A07;
            if (list == null || list.isEmpty()) {
                jPd = null;
            } else {
                if (list.size() > 1) {
                    C30967GcS.A02("invalid_screen", "Backing screens for bottom sheets only allow one navbar right button");
                }
                jPd = A00((C127397h3) list.get(0));
            }
            C127397h3 r0 = A002.A02;
            if (r0 != null) {
                jPd2 = A00(r0);
            }
            C37383Jqm jqm = this.A0C;
            if (jqm != null) {
                if (jPd != null) {
                    BottomSheetFragment bottomSheetFragment = jqm.A01;
                    BottomSheetFragment.A00(bottomSheetFragment).A0G = jPd;
                    bottomSheetFragment.A0K();
                    bottomSheetFragment.A0K();
                } else {
                    jqm.A0H(false);
                }
                BottomSheetFragment bottomSheetFragment2 = this.A0C.A01;
                C37032Jj9 A003 = BottomSheetFragment.A00(bottomSheetFragment2);
                if (jPd2 != null) {
                    A003.A0F = jPd2;
                } else {
                    A003.A01();
                }
                bottomSheetFragment2.A0K();
                bottomSheetFragment2.A0K();
                this.A0C.A0F(A002.A06);
            }
        }
    }

    public final String AwK() {
        C66843yQ r0;
        if (this.A08 == null || (r0 = this.A03) == null) {
            return "bloks_unknown_class";
        }
        String str = r0.A08;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "bloks_unknown_class";
    }

    public final void CFx(int i) {
        C63643hy.A04(new C73044Qs(this, i));
    }

    public final String getModuleName() {
        IgBloksScreenConfig igBloksScreenConfig = this.A08;
        if (igBloksScreenConfig != null) {
            String str = igBloksScreenConfig.A0P;
            C66843yQ r0 = this.A03;
            r0.getClass();
            String str2 = r0.A08;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (TextUtils.isEmpty(str2)) {
                return "bloks_unknown";
            }
            return str2;
        } else if (!TextUtils.isEmpty((CharSequence) null) || !TextUtils.isEmpty((CharSequence) null)) {
            return null;
        } else {
            return "bloks_unknown";
        }
    }

    public final C10300i6 getSession() {
        return this.A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isScrolledToTop() {
        /*
            r2 = this;
            X.7Ez r0 = r2.A09
            if (r0 != 0) goto L_0x0012
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A08
            if (r0 == 0) goto L_0x001f
            X.3bW r0 = r2.A02
            if (r0 == 0) goto L_0x0021
            X.44n r0 = r0.A04
            X.7Ez r0 = r0.A01
            if (r0 == 0) goto L_0x001f
        L_0x0012:
            X.3HX r0 = r0.A02()
            if (r0 == 0) goto L_0x001f
            boolean r1 = X.AnonymousClass2JR.A00(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        L_0x0021:
            java.lang.String r0 = "BloksSurfaceController is null, have you initialized it for Screens?"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23221cn.isScrolledToTop():boolean");
    }

    public final boolean onBackPressed() {
        C121997Jj r4;
        if (this.A0I == null) {
            return false;
        }
        if (this.A06 != null) {
            String str = null;
            if (this.A0E != null) {
                r4 = (C121997Jj) AnonymousClass49P.A00(this.A0A).A02(this.A0E.intValue());
            } else {
                r4 = null;
            }
            C109326jp r3 = this.A0I;
            C63893iY r2 = C63893iY.A01;
            C130667qT r1 = this.A06;
            if (r4 != null) {
                str = r4.A03;
            }
            return AnonymousClass3WF.A02(C122047Jt.A04(r1, r2, r3, str));
        } else if (this.mView == null) {
            return false;
        } else {
            C10450iM.A03(__redex_internal_original_name, "Bloks fragment has a view but no host");
            return false;
        }
    }

    public final void onBottomSheetClosed() {
        AnonymousClass3LY.A00(this.A0A).CWx(new AnonymousClass466());
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        if (this.A08 != null) {
            C63113bW r0 = this.A02;
            if (r0 != null) {
                C121247Ez r02 = r0.A04.A01;
                if (r02 != null) {
                    r02.A05();
                }
            } else {
                throw C18180wK.A0a("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        C121247Ez r03 = this.A09;
        if (r03 != null) {
            r03.A05();
        }
    }

    private C36311JPd A00(C127397h3 r11) {
        IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2;
        C109326jp A0V = C18230wP.A0V(r11);
        if (A0V != null) {
            iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(9, (Object) this, (Object) r11, (Object) A0V);
        } else {
            iDxCListenerShape41S0300000_1_I2 = null;
        }
        return M6q.A09(requireContext(), iDxCListenerShape41S0300000_1_I2, (AnonymousClass601) null, (C109326jp) null, r11.A0O(36, ""), r11.A0O(38, ""), r11.A0O(43, ""), r11.A0T(44, true));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-161205367);
        super.onCreate(bundle);
        C10300i6 A0S = C18190wL.A0S(requireArguments());
        this.A0A = A0S;
        C30938GbW A002 = C29781Fu1.A00();
        this.A0K = A002;
        SparseArray sparseArray = new SparseArray();
        Pair pair = new Pair[]{Pair.create(Integer.valueOf(R.id.bottom_sheet_id), this.A0C)}[0];
        sparseArray.put(AnonymousClass0wJ.A04(pair.first), pair.second);
        this.A06 = new C130667qT(sparseArray, this, (C82174pC) null, this, A0S, A002);
        IgBloksScreenConfig A003 = IgBloksScreenConfig.A00(this.mArguments, this.A0A);
        this.A08 = A003;
        if (A003 != null) {
            C130667qT r2 = this.A06;
            if (A003.A0Y) {
                r2.A00 = true;
            }
            this.A0I = A003.A0A;
            this.A0H = A003.A00;
            this.A0D = C18220wO.A0b(getActivity());
            if (bundle == null) {
                bundle = this.mArguments;
            }
            this.A03 = C63113bW.A01(bundle);
            Context requireContext = requireContext();
            C130667qT r6 = this.A06;
            C210718u A042 = this.A08.A04();
            C63113bW A004 = C63113bW.A00(requireContext, new SparseArray(), this.A03, this.A08.A08, r6, A042);
            this.A02 = A004;
            A004.A08(requireContext(), this);
            C84684tg r0 = this.A02.A00;
            r0.getClass();
            this.A04 = r0;
            i = -1435802658;
        } else {
            C130667qT r8 = this.A07;
            if (r8 != null) {
                C130667qT r7 = this.A06;
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = r8.A01;
                    if (i2 >= sparseArray2.size()) {
                        break;
                    }
                    r7.A01.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
                    i2++;
                }
                if (this.A07.A00) {
                    this.A06.A00 = true;
                }
            }
            Bundle requireArguments = requireArguments();
            this.A0E = C18210wN.A0T(requireArguments, "content_key");
            C121997Jj r62 = (C121997Jj) AnonymousClass49P.A00(this.A0A).A02(this.A0E.intValue());
            if (r62 == null) {
                C10450iM.A03(__redex_internal_original_name, "Bloks bottom sheet must pass in parse result");
                i = 19585950;
            } else {
                this.A0H = requireArguments.getInt("soft_input_mode");
                HashMap hashMap = null;
                if (requireArguments.containsKey("external_variables_key")) {
                    hashMap = (HashMap) AnonymousClass49P.A00(this.A0A).A02(requireArguments.getInt("external_variables_key"));
                }
                C58513Fy r02 = new C58513Fy(requireContext(), r62, this.A06);
                if (hashMap == null) {
                    hashMap = AnonymousClass0wJ.A0y();
                }
                r02.A01 = hashMap;
                this.A09 = r02.A00();
                requireArguments.getString(C28174Ezk.A00(222));
                if (requireArguments.containsKey("backpress_key")) {
                    this.A0I = (C109326jp) AnonymousClass49P.A00(this.A0A).A02(requireArguments.getInt("backpress_key"));
                }
                i = -891201565;
            }
        }
        C14030oh.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1687691054);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bloks_bottom_sheet_fragment);
        C14030oh.A09(-2058221264, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1311309452);
        super.onDestroy();
        if (C18240wQ.A1U(this) || !requireActivity().isChangingConfigurations()) {
            IgBloksScreenConfig igBloksScreenConfig = this.A08;
            if (igBloksScreenConfig != null) {
                igBloksScreenConfig.A05();
                C63113bW r0 = this.A02;
                if (r0 != null) {
                    r0.A06();
                } else {
                    throw C18180wK.A0a("BloksSurfaceController is null, have you initialized it for Screens?");
                }
            } else {
                AnonymousClass49P A002 = AnonymousClass49P.A00(this.A0A);
                Integer num = this.A0E;
                num.getClass();
                A002.A03(num.intValue());
            }
        }
        C121247Ez r02 = this.A09;
        if (r02 != null) {
            r02.A03();
            this.A09 = null;
        }
        C14030oh.A09(1867968740, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(316228893);
        super.onDestroyView();
        if (this.A08 != null) {
            C63113bW r0 = this.A02;
            if (r0 != null) {
                r0.A07();
            } else {
                throw C18180wK.A0a("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        C121247Ez r02 = this.A09;
        if (r02 != null) {
            r02.A04();
        }
        this.A01.removeAllViews();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        this.A0F = false;
        C14030oh.A09(1013085257, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(166143488);
        super.onPause();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(this.A0G);
        }
        C14030oh.A09(-1384833584, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1931901541);
        super.onResume();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            this.A0G = A0F2.getAttributes().softInputMode;
            A0F2.setSoftInputMode(this.A0H | 2);
        }
        C14030oh.A09(100906312, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.A08 != null) {
            boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, this.A0A, 36326524151998067L).booleanValue();
            C63113bW r0 = this.A02;
            if (r0 != null) {
                C66843yQ.A02(bundle, r0, booleanValue ? 1 : 0);
                return;
            }
            throw C18180wK.A0a("BloksSurfaceController is null, have you initialized it for Screens?");
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        LLF llf;
        super.onViewCreated(view, bundle);
        this.A01 = (FrameLayout) view.requireViewById(R.id.bloks_container);
        this.A0B = C18190wL.A0U(view, R.id.error_view_stub);
        this.A0J = C18190wL.A0U(view, R.id.debug_error_view_stub);
        this.A0K.A04(this.A01, C35004Ikn.A00(this));
        if (this.A08 != null) {
            C63113bW r1 = this.A02;
            if (r1 != null) {
                Object obj = r1.A04(requireContext()).first;
                obj.getClass();
                llf = (LLF) obj;
            } else {
                throw C18180wK.A0a("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        } else {
            llf = new LLF(requireContext());
        }
        this.A05 = llf;
        if (this.A0F) {
            llf.setVisibility(8);
        }
        this.A01.addView(this.A05);
        C121247Ez r12 = this.A09;
        if (r12 != null) {
            r12.A06(this.A05);
        }
    }
}
