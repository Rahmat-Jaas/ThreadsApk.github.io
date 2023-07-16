package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.model.upcomingevents.UpcomingEvent;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.4Ab  reason: invalid class name and case insensitive filesystem */
public final class C69764Ab implements C33645Hrr {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C171799zz A02;
    public final /* synthetic */ UpcomingEvent A03;
    public final /* synthetic */ UserSession A04;

    public C69764Ab(Activity activity, Fragment fragment, C171799zz r3, UpcomingEvent upcomingEvent, UserSession userSession) {
        this.A02 = r3;
        this.A03 = upcomingEvent;
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    public final void ByD(Exception exc) {
        C63643hy.A04(new C72804Pu(this.A00));
    }

    public final void CNI(File file) {
        C63643hy.A04(new AnonymousClass4TA(this.A00, this.A01, this.A02, this.A03, this.A04, file));
    }
}
