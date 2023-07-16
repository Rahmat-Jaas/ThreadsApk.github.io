package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C07940cT;
import X.C09120et;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C23411dm;
import X.C305221q;
import X.C61823Vx;
import X.C63063bP;
import X.C63293hC;
import X.C63813iO;
import X.C64533mV;
import X.C82034oy;
import X.C83064qj;
import X.C84544tO;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFServiceCacheDebugFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public class QuickExperimentBisectFragment extends C23411dm implements C82034oy {
    public static final String TAG = "QuickExperimentBisectFragment";
    public C84544tO mBisectState = null;
    public final C83064qj mEditDelegate = QuickExperimentBisectFragment$$ExternalSyntheticLambda7.INSTANCE;
    public final TextView.OnEditorActionListener mTextDelegate = QuickExperimentBisectFragment$$ExternalSyntheticLambda5.INSTANCE;
    public UserSession mUserSession = null;
    public final C61823Vx qeFactory = C61823Vx.A01;

    public static /* synthetic */ boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public static /* synthetic */ void lambda$new$1(String str) {
    }

    public String getModuleName() {
        return TAG;
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$1  reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        static {
            int[] iArr = new int[C305221q.values().length];
            $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void forceSyncStartBisect(C64533mV r3, C10300i6 r4, C61823Vx r5) {
        r5.A02(r4, C07940cT.User).A00(new QuickExperimentBisectFragment$$ExternalSyntheticLambda6(this, r3));
    }

    private C64533mV getBisectIdEditText(String str) {
        return new C64533mV(this.mTextDelegate, this.mEditDelegate, 2, "Enter user's IGID to start bisect on", str, false);
    }

    private List getBisectResponseButtons(boolean z) {
        QuickExperimentBisectFragment$$ExternalSyntheticLambda0 quickExperimentBisectFragment$$ExternalSyntheticLambda0 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda0(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda1 quickExperimentBisectFragment$$ExternalSyntheticLambda1 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda1(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda2 quickExperimentBisectFragment$$ExternalSyntheticLambda2 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda2(this);
        QuickExperimentBisectFragment$$ExternalSyntheticLambda3 quickExperimentBisectFragment$$ExternalSyntheticLambda3 = new QuickExperimentBisectFragment$$ExternalSyntheticLambda3(this);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new C63063bP((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda3, 0.8f, 2131822329, (int) R.color.igds_primary_button));
        if (!z) {
            A0v.add(new C63063bP((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda0, 0.8f, 2131822327, (int) R.color.igds_primary_button));
            A0v.add(new C63063bP((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda1, 0.8f, 2131822325, (int) R.color.igds_primary_button));
        }
        A0v.add(new C63063bP((View.OnClickListener) quickExperimentBisectFragment$$ExternalSyntheticLambda2, 0.8f, 2131822326, (int) R.color.igds_primary_button));
        return A0v;
    }

    public static C63293hC getBisectionStatusItem(int i, int i2, boolean z) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(FXPFServiceCacheDebugFragment.STATUS);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        if (!z) {
            spannableStringBuilder.append("Bisecting on ");
            spannableStringBuilder.append(Integer.toString(i));
            spannableStringBuilder.append("/");
            spannableStringBuilder.append(Integer.toString(i2));
            str = " experiments.";
        } else {
            str = "Culprit has been found.";
        }
        spannableStringBuilder.append(str);
        return new C63293hC(spannableStringBuilder);
    }

    public static C63293hC getNoBisectionStatusItem() {
        return new C63293hC((CharSequence) "QE Bisect Status: Not bisecting right now");
    }

    private C63063bP getStartBisectButton(C64533mV r6) {
        return new C63063bP((View.OnClickListener) new QuickExperimentBisectFragment$$ExternalSyntheticLambda4(this, r6), 0.8f, 2131822328, (int) R.color.igds_primary_button);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        r2.setTitle("QE Bisect");
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$forceSyncStartBisect$7$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m11lambda$forceSyncStartBisect$7$cominstagramdebugquickexperimentQuickExperimentBisectFragment(C64533mV r4, C305221q r5) {
        int ordinal;
        String str = "Failed to start Bisect due to a sync error.";
        if (!(r5 == null || (ordinal = r5.ordinal()) == 1 || ordinal == 0)) {
            if (ordinal == 3 || ordinal == 2) {
                String str2 = r4.A00;
                if (!MobileConfigBisection.startBisect(requireContext(), str2, this.mUserSession)) {
                    str = "Failed to start QE Bisect";
                    AnonymousClass0LU.A0B(TAG, str);
                } else {
                    C18240wQ.A1D(C09120et.A02().A1v, str2);
                    this.mBisectState = MobileConfigBisection.getBisectState();
                    setContent();
                    displayRestartMessage();
                    return;
                }
            } else {
                return;
            }
        }
        displayError(str);
    }

    private void displayError(String str) {
        C63813iO.A01(getContext(), str);
    }

    private void displayRestartMessage() {
        C63813iO.A01(getContext(), "Relaunch the application for the changes to take effect. ");
    }

    private List getBisectionStateSummaryItems(int i, int i2) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("# of steps made: ");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(Integer.toString(i));
        C23411dm.A01(spannableStringBuilder, A0v);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append("# of steps left: ");
        spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append(Integer.toString(i2));
        C23411dm.A01(spannableStringBuilder2, A0v);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append("Culprit:\n");
        spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 33);
        C84544tO r0 = this.mBisectState;
        if (r0 != null) {
            spannableStringBuilder3.append(r0.getCulprit());
        }
        C23411dm.A01(spannableStringBuilder3, A0v);
        return A0v;
    }

    private void setContent() {
        C84544tO r0;
        int i;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String str = "";
        if (!C09120et.A02().A0O() || (r0 = this.mBisectState) == null || !r0.isRunning()) {
            C64533mV bisectIdEditText = getBisectIdEditText(str);
            C63293hC.A02("QE Bisect Status: Not bisecting right now", A0v);
            A0v.add(bisectIdEditText);
            A0v.add(getStartBisectButton(bisectIdEditText));
        } else {
            String A0j = C18200wM.A0j(C09120et.A02().A1v);
            if (A0j != null) {
                str = A0j;
            }
            C64533mV bisectIdEditText2 = getBisectIdEditText(str);
            boolean z = !this.mBisectState.getCulprit().isEmpty();
            int size = this.mBisectState.getSize();
            int right = (this.mBisectState.getRight() - this.mBisectState.getLeft()) + 1;
            if (this.mBisectState.getCulprit().isEmpty()) {
                i = this.mBisectState.getNumberOfStepsRemaining();
            } else {
                i = 0;
            }
            int numberOfStepsMade = this.mBisectState.getNumberOfStepsMade();
            A0v.add(getBisectionStatusItem(right, size, z));
            A0v.addAll(getBisectionStateSummaryItems(numberOfStepsMade, i));
            A0v.add(bisectIdEditText2);
            A0v.addAll(getBisectResponseButtons(z));
        }
        setItems(A0v);
    }

    /* renamed from: lambda$getBisectResponseButtons$2$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m12lambda$getBisectResponseButtons$2$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.userDidNotReproduceBug()) {
            C84544tO bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$3$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m13lambda$getBisectResponseButtons$3$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.userDidReproduceBug()) {
            C84544tO bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$4$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m14lambda$getBisectResponseButtons$4$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (!MobileConfigBisection.stopBisection()) {
            displayError("Could not stop bisection. Please restart the application and try again.");
            return;
        }
        C18180wK.A0u(C09120et.A02().A00.edit(), "qe_user_bisect_id");
        C18240wQ.A1D(C09120et.A02().A0B, (Object) null);
        this.mBisectState = MobileConfigBisection.getBisectState();
        if (getActivity() != null) {
            setContent();
            displayRestartMessage();
        }
    }

    /* renamed from: lambda$getBisectResponseButtons$5$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m15lambda$getBisectResponseButtons$5$cominstagramdebugquickexperimentQuickExperimentBisectFragment(View view) {
        if (MobileConfigBisection.goBackOneStep()) {
            C84544tO bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getStartBisectButton$6$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment  reason: not valid java name */
    public /* synthetic */ void m16lambda$getStartBisectButton$6$cominstagramdebugquickexperimentQuickExperimentBisectFragment(C64533mV r3, View view) {
        if (!C09120et.A02().A0O() && this.qeFactory != null && this.mUserSession != null) {
            C63813iO.A01(getContext(), "Syncing configs and starting bisection, please wait.");
            forceSyncStartBisect(r3, this.mUserSession, this.qeFactory);
        } else if (C09120et.A02().A0O()) {
            displayError(AnonymousClass00U.A0L("Already started bisect on", C18200wM.A0j(C09120et.A02().A1v)));
        } else {
            AnonymousClass0LU.A0B(TAG, "Tried to bisect but QuickExperimentManagerFactory is null");
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(897907974);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.mUserSession = C18180wK.A0V(bundle2);
        }
        C14030oh.A09(-395985024, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C09120et.A02().A0O() && this.mUserSession != null) {
            String A0j = C18200wM.A0j(C09120et.A02().A1v);
            Context requireContext = requireContext();
            if (A0j == null) {
                A0j = "";
            }
            MobileConfigBisection.initialize(requireContext, A0j, this.mUserSession);
            this.mBisectState = MobileConfigBisection.getBisectState();
        }
        setContent();
    }
}
