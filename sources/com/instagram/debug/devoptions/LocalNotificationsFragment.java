package com.instagram.debug.devoptions;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C25512Dmz;
import X.C27903EvE;
import X.C34640IcN;
import X.C82034oy;
import X.FET;
import android.app.job.JobParameters;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public final class LocalNotificationsFragment extends C34640IcN implements C27903EvE, C82034oy {
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new LocalNotificationsFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Local Notifications");
    }

    public String getModuleName() {
        return "local_notifications";
    }

    public void onJobCancelled() {
    }

    public void onJobFinished(boolean z, JobParameters jobParameters) {
    }

    public void onNotificationSend(FET fet, C25512Dmz dmz, boolean z) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0K(view, R.id.fetch_button).setOnClickListener(new LocalNotificationsFragment$onViewCreated$1(this));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-214954323);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_local_notifications, viewGroup, false);
        C14030oh.A09(-2115198275, A02);
        return inflate;
    }
}
