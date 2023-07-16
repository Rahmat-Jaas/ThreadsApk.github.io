package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass19e;
import X.AnonymousClass2CI;
import X.AnonymousClass4u2;
import X.C03790Kt;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C18230wP;
import X.C23411dm;
import X.C25828Dsm;
import X.C63063bP;
import X.C63293hC;
import X.C63613hu;
import X.C63803iN;
import X.C64533mV;
import X.C67603zp;
import X.C82034oy;
import X.C83064qj;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentImportFromTaskFragment extends C23411dm implements DialogInterface.OnClickListener, C82034oy {
    public final C83064qj mEditDelegate = QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda2.INSTANCE;
    public final TextView.OnEditorActionListener mTextDelegate = QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda1.INSTANCE;
    public UserSession mUserSession;

    public static /* synthetic */ boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public static /* synthetic */ void lambda$new$1(String str) {
    }

    public String getModuleName() {
        return "QuickExperimentImportFromTaskFragment";
    }

    private View.OnClickListener getImportOverridesFromTaskClickListener(C64533mV r2) {
        return new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda0(this, r2);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        r2.setTitle("Import overrides from task");
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$getImportOverridesFromTaskClickListener$2$com-instagram-debug-quickexperiment-QuickExperimentImportFromTaskFragment  reason: not valid java name */
    public /* synthetic */ void m17lambda$getImportOverridesFromTaskClickListener$2$cominstagramdebugquickexperimentQuickExperimentImportFromTaskFragment(C64533mV r5, View view) {
        String str;
        String str2 = r5.A00;
        C67603zp A00 = AnonymousClass2CI.A00(C63803iN.A04(this.mUserSession, 0));
        if (A00 != null) {
            MobileConfigManagerHolderImpl A002 = AnonymousClass19e.A00(A00.A06());
            if (A002 != null) {
                str = new MobileConfigOverridesWriterHolder(A002).importOverridesFromTask(str2);
                if (str.isEmpty()) {
                    showRefreshAppDialog(str2);
                    return;
                }
            } else {
                str = "";
            }
        } else {
            str = "Skip importing, MobileConfig xplat runtime is not ready yet.";
        }
        if (str.contains("ErrorDomain")) {
            str = AnonymousClass00U.A0L(str, ". Possible workaround: set sandbox to 'Intern' or 'None' in internal settings, and make sure we connected to CorpNet/VPN. WWW no longer supports to load task attachment from non intern tiers");
        }
        showErrorDialog(str2, str);
    }

    private List getImportOverridesFromTaskMenu() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu r4 = new C63613hu((CharSequence) "Import overrides");
        C63293hC r3 = new C63293hC(2131828977);
        C64533mV r6 = new C64533mV(this.mTextDelegate, this.mEditDelegate, 2, "Task# (e.g: 1234567)", "", true);
        C63063bP r0 = new C63063bP(new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda0(this, r6), 2131828976);
        A0v.add(r4);
        A0v.add(r3);
        A0v.add(r6);
        A0v.add(r0);
        return A0v;
    }

    private void launchHomeActivity() {
        Intent A0B = C18230wP.A0B();
        A0B.setClassName(requireContext(), "com.instagram.mainactivity.MainActivity");
        A0B.setFlags(268468224);
        C18230wP.A0O().A09(requireContext(), A0B);
    }

    private void showErrorDialog(String str, String str2) {
        C25828Dsm A0V = AnonymousClass0wJ.A0V(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to import overrides from task T%s. Error: %s", str, str2);
        A0V.A0q(true);
        A0V.A0p(formatStrLocaleSafe);
        A0V.A0b((DialogInterface.OnClickListener) null, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL);
        AnonymousClass0wJ.A1K(A0V);
    }

    private void showRefreshAppDialog(String str) {
        C25828Dsm A0V = AnonymousClass0wJ.A0V(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Successfully imported overrides from task T%s. Restart app now?", (Object) str);
        A0V.A02 = "Restart app";
        A0V.A0q(true);
        A0V.A0p(formatStrLocaleSafe);
        A0V.A0c(this, "Restart");
        A0V.A0b((DialogInterface.OnClickListener) null, "Later");
        AnonymousClass0wJ.A1K(A0V);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        launchHomeActivity();
        C03790Kt.A01("Intentional app restart after successfully importing QE overrides from task.");
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-365316749);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(1144568192, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setItems(C18200wM.A0s(getImportOverridesFromTaskMenu()));
    }
}
