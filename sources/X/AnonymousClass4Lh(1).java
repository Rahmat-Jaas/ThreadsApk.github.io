package X;

import com.instagram.bugreporter.BugReportSevereSwitchView;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.4Lh  reason: invalid class name */
public final class AnonymousClass4Lh implements C21659By5 {
    public final /* synthetic */ BugReportSevereSwitchView A00;
    public final /* synthetic */ boolean A01;

    public final void Bmo() {
    }

    public AnonymousClass4Lh(BugReportSevereSwitchView bugReportSevereSwitchView, boolean z) {
        this.A01 = z;
        this.A00 = bugReportSevereSwitchView;
    }

    public final void Bmq() {
        IgSwitch igSwitch;
        if (this.A01 && (igSwitch = this.A00.A00) != null) {
            igSwitch.setChecked(false);
        }
    }
}
