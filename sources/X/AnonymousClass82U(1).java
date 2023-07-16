package X;

import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;

/* renamed from: X.82U  reason: invalid class name */
public final class AnonymousClass82U implements Runnable {
    public final /* synthetic */ C91225fq A00;
    public final /* synthetic */ C125307cv A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82U(C91225fq r1, C125307cv r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A01.A00;
        instantExperiencesBrowserChrome.A06.setText(this.A00.getTitle());
        instantExperiencesBrowserChrome.A05.setText(this.A02);
        instantExperiencesBrowserChrome.A06.setVisibility(0);
        instantExperiencesBrowserChrome.A05.setVisibility(0);
        instantExperiencesBrowserChrome.A04.setVisibility(8);
    }
}
