package X;

import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4NC  reason: invalid class name */
public final class AnonymousClass4NC implements C83194qw {
    public final /* synthetic */ User A00;
    public final /* synthetic */ AnonymousClass1ae A01;

    public AnonymousClass4NC(User user, AnonymousClass1ae r2) {
        this.A01 = r2;
        this.A00 = user;
    }

    public final void CPB(long j) {
        AnonymousClass1ae r2 = this.A01;
        IgSwitch igSwitch = r2.A0C;
        if (igSwitch == null) {
            C04220Ms.A0E("quietModeToggle");
            throw null;
        }
        boolean isChecked = igSwitch.isChecked();
        UserSession A0X = AnonymousClass0wJ.A0X(r2.A0I);
        User user = this.A00;
        AnonymousClass1ae.A03(user, r2, j, C63823iP.A03(A0X, user), isChecked, true);
    }
}
