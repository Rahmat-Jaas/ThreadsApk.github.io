package X;

import android.widget.CompoundButton;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;

/* renamed from: X.3uY  reason: invalid class name and case insensitive filesystem */
public final class C65673uY implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C22931bd A00;
    public final /* synthetic */ String A01;

    public C65673uY(C22931bd r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            C22931bd r5 = this.A00;
            AnonymousClass3IL r2 = new AnonymousClass3IL();
            BugReport bugReport = r5.A01;
            String str = "bugReport";
            if (bugReport != null) {
                r2.A01(bugReport);
                r2.A02 = this.A01;
                r5.A01 = r2.A00();
                C04530Oa r4 = r5.A03;
                String str2 = AnonymousClass0wJ.A0X(r4).token;
                BugReport bugReport2 = r5.A01;
                if (bugReport2 != null) {
                    BugReportComposerViewModel bugReportComposerViewModel = r5.A02;
                    if (bugReportComposerViewModel == null) {
                        str = "composerViewModel";
                    } else {
                        AnonymousClass0wJ.A19(AnonymousClass1c2.A01(bugReport2, bugReportComposerViewModel, C18180wK.A0Y(), str2), r5.requireActivity(), AnonymousClass0wJ.A0U(r4));
                        return;
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }
}
