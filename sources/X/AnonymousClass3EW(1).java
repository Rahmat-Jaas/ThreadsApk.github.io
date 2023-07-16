package X;

/* renamed from: X.3EW  reason: invalid class name */
public final class AnonymousClass3EW {
    public final /* synthetic */ C28451uI A00;

    public AnonymousClass3EW(C28451uI r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass3XX r43) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        C28451uI r2 = this.A00;
        AnonymousClass3HF r1 = r2.A04;
        if (r1 != null && r1.A00) {
            r1.A00();
        }
        String B85 = r2.A01.B85();
        int ARb = r2.A01.ARb();
        AnonymousClass3XX r3 = r43;
        Object obj = r3.A00;
        Integer num2 = null;
        if (AnonymousClass0wJ.A1W(obj)) {
            C22241Ty r12 = (C22241Ty) obj;
            if (!r12.isFeedbackRequired()) {
                if (!r12.hasErrorType("too_easy_password") || !r2.A05) {
                    AnonymousClass3SQ r0 = r12.A00;
                    if (r0 != null) {
                        str3 = r0.A00;
                    } else {
                        str3 = null;
                    }
                    r2.A04(str3, C32682Cu.A00(r12.mErrorSource));
                } else {
                    C25828Dsm A0W = C18190wL.A0W(r2.A00);
                    A0W.A0L(2131826851);
                    AnonymousClass3SQ r02 = r12.A00;
                    if (r02 != null) {
                        str4 = r02.A00;
                    } else {
                        str4 = null;
                    }
                    A0W.A0p(str4);
                    C18180wK.A1O(A0W, this, 145, 2131823209);
                    AnonymousClass0wJ.A1K(A0W);
                }
            }
            C07530bf r7 = r2.A07;
            String str5 = r2.A08.A00;
            AnonymousClass3SQ r03 = r12.A00;
            if (r03 != null) {
                str = r03.A01;
            } else {
                str = null;
            }
            if (r03 != null) {
                str2 = r03.A00;
            } else {
                str2 = null;
            }
            Boolean A0Y = C18180wK.A0Y();
            String status = r12.getStatus();
            if (ARb > -1) {
                num2 = Integer.valueOf(ARb);
            }
            C54262zA.A00(r7, A0Y, Boolean.valueOf(r12.isCheckpointRequired()), Boolean.valueOf(r12.isConsentRequired()), Boolean.valueOf(r12.isFeedbackRequired()), Boolean.valueOf(r12.isLoginRequired()), Boolean.valueOf(r12.isNoContent()), Boolean.valueOf(r12.isViolatingBrandedContentPolicy()), Boolean.valueOf(r12.A05), num2, Integer.valueOf(r12.mStatusCode), str5, str, str2, status, B85, r12.mErrorType, r12.getErrorMessage(), r2.A0A);
            return;
        }
        r2.A04(r2.A06.getString(2131831662), AnonymousClass006.A00);
        Throwable th = r3.A01;
        if (th != null) {
            String A0q = C18220wO.A0q(th);
            C07530bf r32 = r2.A07;
            String str6 = r2.A08.A00;
            if (ARb > -1) {
                num = Integer.valueOf(ARb);
            } else {
                num = null;
            }
            AnonymousClass0wJ.A1M(r32, 0, str6);
            C54262zA.A00(r32, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, num, (Integer) null, str6, (String) null, (String) null, A0q, B85, (String) null, (String) null, (String) null);
            C10450iM.A03("CreateAccountCallback", AnonymousClass00U.A0d("Exception ", A0q, ": ", th.getMessage()));
        }
    }
}
