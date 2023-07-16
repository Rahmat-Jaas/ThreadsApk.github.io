package com.instagram.wellbeing.timespent.listeners;

import X.AnonymousClass4TP;
import android.os.Parcel;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;

public class InstagramTimeSpentLogger$TimeSpentReminderRunnable$7 extends IgBloksScreenRequestCallback {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass4TP A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public InstagramTimeSpentLogger$TimeSpentReminderRunnable$7(FragmentActivity fragmentActivity, AnonymousClass4TP r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }
}
