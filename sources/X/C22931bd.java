package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1bd  reason: invalid class name and case insensitive filesystem */
public final class C22931bd extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "BugReportQuickOptionsFragment";
    public LinearLayout A00;
    public BugReport A01;
    public BugReportComposerViewModel A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        BugReportComposerViewModel bugReportComposerViewModel = this.A02;
        if (bugReportComposerViewModel == null) {
            C04220Ms.A0E("composerViewModel");
            throw null;
        } else {
            AnonymousClass4u2.A08(r2, bugReportComposerViewModel.A03);
        }
    }

    public final String getModuleName() {
        return "bug_report_quick_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BugReportComposerViewModel bugReportComposerViewModel = this.A02;
        if (bugReportComposerViewModel != null) {
            int[] iArr = bugReportComposerViewModel.A09;
            C04220Ms.A06(iArr);
            BugReportComposerViewModel bugReportComposerViewModel2 = this.A02;
            if (bugReportComposerViewModel2 != null) {
                String[] strArr = bugReportComposerViewModel2.A0A;
                C04220Ms.A06(strArr);
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    String str = strArr[i];
                    C04220Ms.A03(str);
                    IgdsListCell A0T = C18240wQ.A0T(requireContext());
                    A0T.A06(i2);
                    A0T.setTextCellType(AnonymousClass24V.TYPE_RADIO);
                    A0T.A0C(new C65673uY(this, str));
                    LinearLayout linearLayout = this.A00;
                    if (linearLayout != null) {
                        linearLayout.addView(A0T);
                    }
                }
                return;
            }
        }
        C04220Ms.A0E("composerViewModel");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final boolean onBackPressed() {
        String str;
        String string = requireArguments().getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string != null) {
            BugReport bugReport = this.A01;
            if (bugReport == null) {
                str = "bugReport";
            } else {
                BugReportComposerViewModel bugReportComposerViewModel = this.A02;
                if (bugReportComposerViewModel == null) {
                    str = "composerViewModel";
                } else {
                    AnonymousClass0wJ.A19(C34402Jk.A00(bugReport, bugReportComposerViewModel, string), requireActivity(), AnonymousClass0wJ.A0U(this.A03));
                    return true;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        IllegalArgumentException illegalArgumentException;
        int i;
        Object obj2;
        int A022 = C14030oh.A02(-874288420);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        int i2 = Build.VERSION.SDK_INT;
        Parcelable parcelable = null;
        if (i2 >= 33) {
            obj = requireArguments.getParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", BugReportComposerViewModel.class);
        } else {
            Parcelable parcelable2 = requireArguments.getParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL");
            if (!(parcelable2 instanceof BugReportComposerViewModel)) {
                parcelable2 = null;
            }
            obj = (BugReportComposerViewModel) parcelable2;
        }
        BugReportComposerViewModel bugReportComposerViewModel = (BugReportComposerViewModel) ((Parcelable) obj);
        if (bugReportComposerViewModel != null) {
            this.A02 = bugReportComposerViewModel;
            if (i2 >= 33) {
                obj2 = requireArguments.getParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", BugReport.class);
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT");
                if (parcelable3 instanceof BugReport) {
                    parcelable = parcelable3;
                }
                obj2 = (BugReport) parcelable;
            }
            BugReport bugReport = (BugReport) ((Parcelable) obj2);
            if (bugReport != null) {
                this.A01 = bugReport;
                C14030oh.A09(2077760799, A022);
                return;
            }
            illegalArgumentException = C18190wL.A0a("BugReport can't be null");
            i = -2039803837;
        } else {
            illegalArgumentException = C18190wL.A0a("BugReportComposerViewModel can't be null");
            i = -1892533983;
        }
        C14030oh.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1078730757);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bugreporter_quick_option_screen, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
        this.A00 = (LinearLayout) inflate.requireViewById(R.id.options_container);
        C14030oh.A09(1786428910, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1870642645);
        super.onDestroyView();
        this.A00 = null;
        C14030oh.A09(-1127563703, A022);
    }
}
