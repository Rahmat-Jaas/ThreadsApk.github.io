package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.upcomingevents.UpcomingEvent;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4TA  reason: invalid class name */
public final class AnonymousClass4TA implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C171799zz A02;
    public final /* synthetic */ UpcomingEvent A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ File A05;

    public AnonymousClass4TA(Activity activity, Fragment fragment, C171799zz r3, UpcomingEvent upcomingEvent, UserSession userSession, File file) {
        this.A05 = file;
        this.A02 = r3;
        this.A03 = upcomingEvent;
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    public final void run() {
        try {
            Bundle A06 = C18180wK.A06();
            A06.putString("ReelUpcomingEventConstants.ARG_KEY_FILE_PATH", this.A05.getCanonicalPath());
            A06.putSerializable("ReelUpcomingEventConstants.ARG_KEY_CAMERA_ENTRY_POINT", this.A02);
            A06.putParcelable("ReelUpcomingEventConstants.ARG_KEY_UPCOMING_EVENT", this.A03);
            C63863iT.A06(this.A00, A06, this.A04, TransparentModalActivity.class, "reel_upcoming_event").A0J(this.A01, HttpStatus.SC_SWITCHING_PROTOCOLS);
        } catch (IOException unused) {
            C10450iM.A03("canonicalization_failed", "File path failed to canonicalize");
        }
    }
}
