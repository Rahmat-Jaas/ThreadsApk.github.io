package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxSListenerShape455S0100000_2_I2;
import com.facebookpay.widget.navibar.NavigationBar;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

/* renamed from: X.5qq  reason: invalid class name */
public class AnonymousClass5qq extends AnonymousClass52J implements C147048nI {
    public static final /* synthetic */ AnonymousClass0A5[] A0V;
    public DialogInterface.OnDismissListener A00;
    public FrameLayout A01;
    public ImageView A02;
    public ProgressBar A03;
    public ConstraintLayout A04;
    public Fragment A05;
    public NavigationBar A06;
    public boolean A07;
    public Bundle A08;
    public ContextThemeWrapper A09;
    public String A0A = "";
    public final C86024w9 A0B;
    public final C86024w9 A0C = new IDxOPropertyShape881S0100000_2_I2(this, 16);
    public final C86024w9 A0D;
    public final C86024w9 A0E = new IDxOPropertyShape881S0100000_2_I2(this, 17);
    public final C86024w9 A0F;
    public final C86024w9 A0G;
    public final C86024w9 A0H;
    public final C86024w9 A0I;
    public final C86024w9 A0J;
    public final C86024w9 A0K;
    public final C86024w9 A0L;
    public final C86024w9 A0M;
    public final C86024w9 A0N;
    public final C86024w9 A0O;
    public final C86024w9 A0P;
    public final C86024w9 A0Q = new IDxOPropertyShape881S0100000_2_I2(this, 14);
    public final C86024w9 A0R;
    public final C86024w9 A0S;
    public final C86024w9 A0T;
    public final C86024w9 A0U;

    public Dialog A0C(Bundle bundle) {
        return A0D((AnonymousClass0ZU) null);
    }

    public final void CjM(Fragment fragment, boolean z, boolean z2) {
        C12560m7 childFragmentManager = getChildFragmentManager();
        C04220Ms.A06(childFragmentManager);
        if (z2 && childFragmentManager.A0I() > 0) {
            childFragmentManager.A0e(((AnonymousClass01J) ((AnonymousClass051) childFragmentManager.A0D.get(0))).A01);
        }
        fragment.setTargetFragment((Fragment) null, getTargetRequestCode());
        AnonymousClass01J r2 = new AnonymousClass01J(childFragmentManager);
        r2.A0G(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        if (z) {
            r2.A0K((String) null);
        }
        r2.A00();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        String str = this.A0A;
        if (str.length() > 0) {
            bundle.putString("SAVED_INSTANCE_FRAGMENT_ID_KEY", str);
        }
        Bundle bundle2 = this.A08;
        if (bundle2 != null) {
            bundle.putBundle("SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY", bundle2);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ff, code lost:
        if (r2.equals("loading_fragment") != false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r3 = 0
            X.C04220Ms.A0B(r7, r3)
            r0 = 2131297628(0x7f09055c, float:1.8213206E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r7, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            X.C04220Ms.A0B(r0, r3)
            r6.A04 = r0
            r0 = 2131297654(0x7f090576, float:1.821326E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r7, r0)
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            r6.A06 = r0
            r0 = 2131297639(0x7f090567, float:1.8213229E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A02 = r0
            r0 = 2131299025(0x7f090ad1, float:1.821604E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.A01 = r0
            r0 = 2131307338(0x7f092b4a, float:1.82329E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.A03 = r0
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x004e
            com.facebookpay.widget.navibar.NavigationBar r1 = r6.A06
            if (r1 == 0) goto L_0x0081
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
        L_0x004c:
            r6.A07 = r0
        L_0x004e:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.A04
            if (r5 == 0) goto L_0x007e
            X.AnonymousClass7Kz.A0G()
            r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231112(0x7f080188, float:1.8078296E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            X.7Ec r2 = X.AnonymousClass7Kz.A0G()
            r1 = 2
            android.content.Context r0 = r6.requireContext()
            int r0 = r2.A03(r0, r1)
            X.C86144wL.A19(r4, r5, r0)
            android.widget.ImageView r5 = r6.A02
            if (r5 != 0) goto L_0x0083
            java.lang.String r0 = "viewDragHandle"
        L_0x0079:
            X.C04220Ms.A0E(r0)
            r4 = 0
            throw r4
        L_0x007e:
            java.lang.String r0 = "viewContainer"
            goto L_0x0079
        L_0x0081:
            r0 = 1
            goto L_0x004c
        L_0x0083:
            X.AnonymousClass7Kz.A0G()
            r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231113(0x7f080189, float:1.8078298E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            X.7Ec r1 = X.AnonymousClass7Kz.A0G()
            r2 = 3
            android.content.Context r0 = r6.requireContext()
            X.C121097Ec.A00(r0, r4, r1, r2)
            r5.setBackground(r4)
            android.app.Dialog r1 = r6.A02
            boolean r0 = r1 instanceof X.AnonymousClass52I
            if (r0 == 0) goto L_0x00b6
            X.52I r1 = (X.AnonymousClass52I) r1
            X.AnonymousClass52I.A02(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A03
            X.C04220Ms.A06(r0)
            r0.A0I(r2)
        L_0x00b6:
            androidx.fragment.app.Fragment r0 = r6.A05
            r4 = 0
            if (r0 != 0) goto L_0x00ef
            if (r8 == 0) goto L_0x00c5
            java.lang.String r0 = "SAVED_INSTANCE_FRAGMENT_ID_KEY"
            java.lang.String r0 = r8.getString(r0)
            if (r0 != 0) goto L_0x00c7
        L_0x00c5:
            java.lang.String r0 = ""
        L_0x00c7:
            r6.A0A = r0
            if (r8 == 0) goto L_0x00d3
            java.lang.String r0 = "SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY"
            android.os.Bundle r0 = r8.getBundle(r0)
            if (r0 != 0) goto L_0x00d7
        L_0x00d3:
            android.os.Bundle r0 = X.C18180wK.A06()
        L_0x00d7:
            r6.A08 = r0
            X.7JJ r2 = X.AnonymousClass7Kz.A05()
            java.lang.String r1 = r6.A0A
            android.os.Bundle r0 = r6.A08
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "fragmentBundle"
        L_0x00e5:
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x00e9:
            androidx.fragment.app.Fragment r0 = r2.A06(r0, r1)
            r6.A05 = r0
        L_0x00ef:
            java.lang.String r2 = r6.A0A
            boolean r0 = r6 instanceof X.AnonymousClass5jB
            if (r0 == 0) goto L_0x0108
            r1 = 0
            X.C04220Ms.A0B(r2, r3)
            java.lang.String r0 = "loading_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0108
        L_0x0101:
            androidx.fragment.app.Fragment r0 = r6.A05
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "currentContentFragment"
            goto L_0x00e5
        L_0x0108:
            r1 = 1
            goto L_0x0101
        L_0x010a:
            r6.CjM(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5qq.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    static {
        Class<AnonymousClass5qq> cls = AnonymousClass5qq.class;
        A0V = new AnonymousClass0A5[]{C86134wK.A0x(cls, "headerTitle", "getHeaderTitle()Ljava/lang/String;"), C86134wK.A0x(cls, "headerIcon", "getHeaderIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "headerLeftIconButtonIcon", "getHeaderLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "isLeftProfileIcon", "isLeftProfileIcon()Z"), C86134wK.A0x(cls, "headerLeftTextButtonText", "getHeaderLeftTextButtonText()Ljava/lang/String;"), C86134wK.A0x(cls, "headerRightIconButtonIcon", "getHeaderRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "headerRightTextButtonText", "getHeaderRightTextButtonText()Ljava/lang/String;"), C86134wK.A0x(cls, "isRightProfileIcon", "isRightProfileIcon()Z"), C86134wK.A0x(cls, "headerLeftTextButtonTextEnable", "getHeaderLeftTextButtonTextEnable()Z"), C86134wK.A0x(cls, "headerRightTextButtonEnable", "getHeaderRightTextButtonEnable()Z"), C86134wK.A0x(cls, "progressIconShow", "getProgressIconShow()Z"), C86134wK.A0x(cls, "headerLeftIconButtonOnClickListener", "getHeaderLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "headerLeftTextButtonOnClickListener", "getHeaderLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "headerRightIconButtonOnClickListener", "getHeaderRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "headerRightTextButtonOnClickListener", "getHeaderRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "headerLeftTextButtonHint", "getHeaderLeftTextButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "headerLeftIconButtonHint", "getHeaderLeftIconButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "headerRightIconButtonHint", "getHeaderRightIconButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "headerRightTextButtonHint", "getHeaderRightTextButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "headerDividerVisible", "getHeaderDividerVisible()Z")};
    }

    public final void A06() {
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.A02);
        }
        super.A06();
    }

    public final void A0E(Bundle bundle, C12560m7 r5, String str, String str2) {
        this.A0A = str;
        this.A08 = bundle;
        AnonymousClass7JJ A052 = AnonymousClass7Kz.A05();
        String str3 = this.A0A;
        Bundle bundle2 = this.A08;
        if (bundle2 == null) {
            C04220Ms.A0E("fragmentBundle");
            throw null;
        }
        this.A05 = A052.A06(bundle2, str3);
        A0A(r5, str2);
    }

    public AnonymousClass5qq() {
        Boolean A0X = C18180wK.A0X();
        this.A0R = new IDxOPropertyShape881S0100000_2_I2(18, this, A0X);
        this.A0I = new IDxOPropertyShape881S0100000_2_I2(this, 19);
        this.A0K = new IDxOPropertyShape881S0100000_2_I2(this, 20);
        this.A0P = new IDxOPropertyShape881S0100000_2_I2(this, 21);
        this.A0S = new IDxOPropertyShape881S0100000_2_I2(22, this, A0X);
        this.A0U = new IDxOPropertyShape881S0100000_2_I2(23, this, A0X);
        this.A0M = new IDxOPropertyShape881S0100000_2_I2(4, this, A0X);
        this.A0T = new IDxOPropertyShape881S0100000_2_I2(5, this, A0X);
        this.A0F = new IDxOPropertyShape881S0100000_2_I2(this, 6);
        this.A0H = new IDxOPropertyShape881S0100000_2_I2(this, 7);
        this.A0L = new IDxOPropertyShape881S0100000_2_I2(this, 8);
        this.A0O = new IDxOPropertyShape881S0100000_2_I2(this, 9);
        this.A0G = new IDxOPropertyShape881S0100000_2_I2(this, 10);
        this.A0D = new IDxOPropertyShape881S0100000_2_I2(this, 11);
        this.A0J = new IDxOPropertyShape881S0100000_2_I2(this, 12);
        this.A0N = new IDxOPropertyShape881S0100000_2_I2(this, 13);
        this.A0B = new IDxOPropertyShape881S0100000_2_I2(15, this, A0X);
    }

    public final int A04() {
        if (requireArguments().containsKey("STYLE_RES")) {
            return requireArguments().getInt("STYLE_RES");
        }
        AnonymousClass7Kz.A0G();
        return 2131886577;
    }

    public final Dialog A0D(AnonymousClass0ZU r5) {
        AnonymousClass5qn r2 = new AnonymousClass5qn(requireContext(), this, r5, requireArguments().getInt("STYLE_RES"));
        r2.setOnShowListener(new IDxSListenerShape455S0100000_2_I2(this, 1));
        return r2;
    }

    public final boolean BfI() {
        String str;
        if (getChildFragmentManager().A0I() <= 1) {
            return false;
        }
        List A042 = getChildFragmentManager().A0T.A04();
        C04220Ms.A06(A042);
        Fragment fragment = (Fragment) AnonymousClass00J.A0E(A042);
        if (!(fragment instanceof AnonymousClass567)) {
            return true;
        }
        AnonymousClass567 r4 = (AnonymousClass567) fragment;
        if (r4 instanceof AnonymousClass5j3) {
            AnonymousClass5j3 r42 = (AnonymousClass5j3) r4;
            View view = r42.A02;
            if (view == null) {
                str = "loadingOverlay";
            } else if (view.getVisibility() == 0) {
                return true;
            } else {
                AnonymousClass58G r0 = r42.A0C;
                if (r0 == null) {
                    str = "formFragmentViewModel";
                } else if (!r0.A05().A03()) {
                    AnonymousClass5j3.A04(r42, true);
                } else {
                    ContextThemeWrapper contextThemeWrapper = r42.A00;
                    if (contextThemeWrapper == null) {
                        str = "viewContext";
                    } else {
                        AnonymousClass7GC.A01(contextThemeWrapper, new KtLambdaShape26S0100000_I2_6(r42, 18), r42.A0J);
                        return true;
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        getChildFragmentManager().A16();
        return true;
    }

    public boolean Brt() {
        if (getChildFragmentManager().A0I() <= 1) {
            return false;
        }
        getChildFragmentManager().A16();
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1301915478);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C18240wQ.A0A(this, layoutInflater, 0), A04());
        this.A09 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_bottom_sheet_fragment, viewGroup, false);
        C14030oh.A09(1967154109, A022);
        return inflate;
    }
}
