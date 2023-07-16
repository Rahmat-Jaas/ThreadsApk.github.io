package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.47o  reason: invalid class name and case insensitive filesystem */
public final class C692547o implements C10390iG, AnonymousClass0i4 {
    public Context A00;
    public UserSession A01;

    private void A00(String str) {
        UserSession userSession = this.A01;
        C15730rn A0T = C18230wP.A0T("continuous_contact_upload_job_scheduled");
        A0T.A0D("source", str);
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        if (A0N != null) {
            A0T.A0D("phone_id", A0N.A01);
        }
        C18180wK.A1K(A0T, userSession);
        C25666Dpn.A00(this.A00).A01(new C25425DlP(new DYW(L69.class, R.id.ccu_job_scheduler_id)));
    }

    public final void onSessionWillEnd() {
        A00("user_switch");
        C691847d.A03(this);
    }

    public C692547o(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onAppBackgrounded() {
        int i;
        int A03 = C14030oh.A03(-478459038);
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313050839581966L)) {
            C15730rn A0T = C18230wP.A0T("continuous_contact_upload_job_scheduled");
            AnonymousClass3FH A0N = C18220wO.A0N(userSession);
            if (A0N != null) {
                A0T.A0D("phone_id", A0N.A01);
            }
            C18180wK.A1K(A0T, userSession);
            C25666Dpn.A00(this.A00).A02(new C25425DlP(L69.class, R.id.ccu_job_scheduler_id, 0, 0, 500, false, false));
            i = -1709967773;
        } else {
            C126197ek r1 = C61063Rt.A00(userSession).A00.A00;
            synchronized (r1) {
            }
            synchronized (r1) {
            }
            if (System.currentTimeMillis() - C28161tl.A04(userSession).getLong("last_ccu_timestamp_with_jobscheduler", 0) < 86400000) {
                synchronized (C61063Rt.A00(userSession).A00.A00) {
                }
                synchronized (C61063Rt.A00(userSession).A00.A00) {
                }
                i = 692654858;
            } else if (!C28161tl.A04(userSession).getBoolean("allow_contacts_sync", false)) {
                synchronized (C61063Rt.A00(userSession).A00.A00) {
                }
                synchronized (C61063Rt.A00(userSession).A00.A00) {
                }
                i = 801816520;
            } else {
                Context context = this.A00;
                if (!C34832Lb.A00(context, userSession)) {
                    synchronized (C61063Rt.A00(userSession).A00.A00) {
                    }
                    synchronized (C61063Rt.A00(userSession).A00.A00) {
                    }
                    i = 1233289960;
                } else {
                    C28161tl A012 = AnonymousClass3WS.A01(userSession);
                    AnonymousClass0wJ.A12(C28161tl.A02(A012), "last_ccu_timestamp_with_jobscheduler", System.currentTimeMillis());
                    C15730rn A0T2 = C18230wP.A0T("continuous_contact_upload_job_scheduled");
                    AnonymousClass3FH A0N2 = C18220wO.A0N(userSession);
                    if (A0N2 != null) {
                        A0T2.A0D("phone_id", A0N2.A01);
                    }
                    C18180wK.A1K(A0T2, userSession);
                    synchronized (C61063Rt.A00(userSession).A00.A00) {
                    }
                    C25666Dpn.A00(context).A02(new C25425DlP(L69.class, R.id.ccu_job_scheduler_id, 0, 0, 500, false, false));
                    i = 1658942203;
                }
            }
        }
        C14030oh.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(1042005621);
        A00("app_foregrounded");
        C14030oh.A0A(-799065619, A03);
    }
}
