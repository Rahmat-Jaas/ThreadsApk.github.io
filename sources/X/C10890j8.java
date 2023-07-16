package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.0j8  reason: invalid class name and case insensitive filesystem */
public final class C10890j8 implements C10390iG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ C10830j1 A02;
    public final /* synthetic */ UserSession A03;

    public C10890j8(Context context, C13330nS r2, C10830j1 r3, UserSession userSession) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
        this.A03 = userSession;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(230937997);
        AnonymousClass0gN.A00().AKp(new C10900j9(this));
        C14030oh.A0A(153412948, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1500647429, C14030oh.A03(-609342083));
    }
}
